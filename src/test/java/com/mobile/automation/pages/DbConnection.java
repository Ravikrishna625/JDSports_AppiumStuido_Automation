package com.mobile.automation.pages;

import java.sql.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.amazonaws.services.codecommit.model.Commit;
import com.google.common.base.Optional;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class DbConnection {

	public ExtentLogs extentLogs = new ExtentLogs();
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public void updateTable(String tableName, String fieldName, String fieldData, String storeID)
			throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		//con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/Testing_123@uhpsimdbs-scan:1521/odsudb01");
		con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/August_2017@thpracdbs01:1521/odstdb01");

		

		stmt = con.createStatement();
		System.out.println("Query is:+ update"   +  tableName  +  "set" + fieldName + "='" + fieldData + "' where storeid ='"
				+ storeID + "'");
		int i=stmt.executeUpdate("update "+tableName+" set "+fieldName+"='"+fieldData+"' where storeid ='"+storeID+"'");
			
		
		if(i>0)
		{
			extentLogs.pass("Update the Table", "'"+fieldName+"' field updated successfully in '"+tableName+"' in table");
		}
		else
		{
			extentLogs.fail("Update the Table", "Sorry We are unable to update the table");
		}
		
		con.commit();
		//con.close();

	}
	
	public Connection getConnection(String strEnvironment)
	{
		Connection con=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			if(strEnvironment.equalsIgnoreCase("qa"))
				con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/August_2017@thpracdbs01:1521/odstdb01");
			else
				con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/August_2017@uhpsimdbs-scan:1521/odsudb01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	
	/*public ResultSet executeQuery(String strQuery)
	{
		ResultSet resultSet = null;
		Connection connection=null;
		Statement statement=null;
		try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(strQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return resultSet;
	}*/
	
	
	public ResultSet returnValueOfTheQuery(String strQuery)
	{
		String strReturnValue="";
		ResultSet rs=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/Testing_123@uhpsimdbs-scan:1521/odsudb01");
		con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/August_2017@thpracdbs01:1521/odstdb01");

		

		stmt = con.createStatement();
		rs=stmt.executeQuery(strQuery);
		if(rs!=null)
		{
			System.out.println("Specified query is '"+strQuery+"'");
			extentLogs.pass("Execute Query","Successfully executed the query '"+strQuery+"'");
		}
		else
		{
			extentLogs.fail("Execute Query","Failed to execute the query '"+strQuery+"'");
		}

		con.commit();
		con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	/**
	 * This method sets the DB values in DB
	 * @param strStoreType
	 * @param strStoreNumber
	 * @param strQuery
	 * For this function specify either strStoreType and strStoreNumber or specify the strQuery
	 */
	/*public void setStoreInDB(String strStoreType,String strStoreNumber,String strQuery,String strEnvironment)
	{
		if(strQuery.equals(""))
		{
			if(!strStoreType.equals(""))
			{
				if(strStoreType.equalsIgnoreCase("unmanned"))
				{
					if(CommonVariables.Environment.get().equalsIgnoreCase("qa"))
						strQuery="UPDATE ODSTADM.VANSTOREINFO SET MannedLocation = 0 WHERE STOREID = '"+strStoreNumber+"'";
					else if(CommonVariables.Environment.get().equalsIgnoreCase("uat"))
						strQuery="UPDATE ODSUADM.VANSTOREINFO SET MannedLocation = 0 WHERE STOREID = '"+strStoreNumber+"'";
				}else if(strStoreType.equalsIgnoreCase("manned"))
				{
					if(CommonVariables.Environment.get().equalsIgnoreCase("qa"))
						strQuery="UPDATE ODSTADM.VANSTOREINFO SET MannedLocation = 1 WHERE STOREID = '"+strStoreNumber+"'";
					else if(CommonVariables.Environment.get().equalsIgnoreCase("uat"))
						strQuery="UPDATE ODSUADM.VANSTOREINFO SET MannedLocation = 1 WHERE STOREID = '"+strStoreNumber+"'";
				}
			}
		}
		
		
		connection=new DbConnection();
		ResultSet rs=null;
		try {
			Connection con=connection.getConnection(strEnvironment);
			PreparedStatement statement1=con.prepareStatement(strQuery);
			PreparedStatement statement2=con.prepareStatement("commit");
			rs=statement1.executeQuery();
			rs=statement2.executeQuery();
			con.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
}
