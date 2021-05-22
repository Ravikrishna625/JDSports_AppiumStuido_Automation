package com.mobile.automation.pages;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.ConfigManager;

public class DbConnection_old {

	public ExtentLogs extentLogs = new ExtentLogs();
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	String date = null;
	Date dbDate = null;
	String dateString = null;
	String eEnv = null;
	String db_UAT_connect_string ;
	String db_QA_connect_string ;
	String db_UAT_Server_Name ;
	String db_QA_Server_Name ;
	String db_Port ;
	String db_userid;
	String db_password;
	List<String> resultSet;


	public DbConnection_old(String mEnv){
		this.eEnv = mEnv;
		updateProperty();
	}
	
	
	private void updateProperty(){
		try {
			if(!ConfigManager.ArePropertiesSet.get()){
				ConfigManager.setProperties();
			}
			if(!ConfigManager.ArePropertiesUpdated.get()){
				ConfigManager.UpdateProperties();
			}
		} 
		catch (Exception e) {
			System.out.println("Failed to load/update Properties file");
		}
		db_UAT_connect_string = ConfigManager.getProperties().getProperty("dbUATconnectionURL").trim();
		db_UAT_Server_Name = ConfigManager.getProperties().getProperty("dbUATServerName").trim();
		db_userid = ConfigManager.getProperties().getProperty("dbUserName").trim();
		db_password = ConfigManager.getProperties().getProperty("dbPassword").trim();
		db_Port = ConfigManager.getProperties().getProperty("dbPort").trim();
		
		db_QA_connect_string = ConfigManager.getProperties().getProperty("dbQAconnectionURL").trim();
		db_QA_Server_Name = ConfigManager.getProperties().getProperty("dbQAServerName").trim();
		db_userid = ConfigManager.getProperties().getProperty("dbUserName").trim();
		db_password = ConfigManager.getProperties().getProperty("dbPassword").trim();
		db_Port = ConfigManager.getProperties().getProperty("dbPort").trim();
	}

	public String retrieveData(String tableName, String fieldName, String storeID)
			throws SQLException, ClassNotFoundException, ParseException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		if(eEnv.equalsIgnoreCase("UAT")){
			
			con = DriverManager.getConnection("jdbc:oracle:thin:"+db_userid+"/"+db_password+"@//"+db_UAT_connect_string+":"+db_Port+"/"+db_UAT_Server_Name+"");

			stmt = con.createStatement();
			System.out.println("select " + fieldName + " from ODSUADM." + tableName + " where storeid='" + storeID + "'");
			rs = stmt.executeQuery(
					"select " + fieldName + " from ODSUADM." + tableName + " where storeid='" + storeID + "'");

			if (rs.next()) {
				date = rs.getString(1);			
				extentLogs.pass("Getting Data from the Database", "Successfully get the data from the DB");
			} else {
				extentLogs.fail("Getting Data from the Database", "No record found with thus query");

			}
			con.commit();
			con.close();
		}
		else{
			
			con = DriverManager.getConnection("jdbc:oracle:thin:"+db_userid+"/"+db_password+"@//"+db_QA_connect_string+":"+db_Port+"/"+db_QA_Server_Name+"");
			
			//con = DriverManager.getConnection("jdbc:oracle:thin:munran/August_2017@//thpracdbs01.renters-choice-inc.com:1521/odstdb01");

			stmt = con.createStatement();
			System.out.println("select " + fieldName + " from ODSTADM." + tableName + " where storeid='" + storeID + "'");
			rs = stmt.executeQuery(
					"select " + fieldName + " from ODSTADM." + tableName + " where storeid='" + storeID + "'");

			if (rs.next()) {
				date = rs.getString(1);			
				extentLogs.pass("Getting Data from the Database", "Successfully get the data from the DB");
			} else {
				extentLogs.fail("Getting Data from the Database", "No record found with thus query");

			}
			con.commit();
			con.close();
		}

		if (fieldName.equalsIgnoreCase("PHONENUMBER")){
			dateString = date;
			System.out.println(dateString);
			return dateString;
		}
		else if (fieldName.equalsIgnoreCase("MANUALOVERRIDE")){
			dateString = date;
			System.out.println(dateString);
			return dateString;
		}
		else{
			SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			java.util.Date dbdate = sdfr.parse(date);
			SimpleDateFormat sdfr1 = new SimpleDateFormat("MM/dd/yyyy");
			dateString = sdfr1.format( dbdate );
			System.out.println(dateString);
			return dateString;
		}

	}

	public void updateTable(String tableName, String fieldName, String fieldData, String storeID)
			throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/Testing_123@uhpsimdbs-scan:1521/odsudb01");

		stmt = con.createStatement();
		System.out.println("Query is:+ update" + tableName + "set" + fieldName + "='" + fieldData + "' where storeid ='"
				+ storeID + "'");
		int i = stmt.executeUpdate(
				"update " + tableName + " set " + fieldName + "='" + fieldData + "' where storeid ='" + storeID + "'");

		if (i > 0) {
			extentLogs.pass("Update the Table",
					"'" + fieldName + "' field updated successfully in '" + tableName + "' in table");
		} else {
			extentLogs.fail("Update the Table", "Sorry We are unable to update the table");
		}

		con.commit();
		con.close();

	}

	
	public Connection getConnection()
    {
          Connection con=null;
          try
          {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:jamaju/August_2017@thpracdbs01:1521/odstdb01");
          } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
          }
          return con;
    }
	
	 public ResultSet executeQuery(String strQuery)
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
     }
	 
	 public String getdate() throws ParseException{
		 

		 SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			java.util.Date dbdate = sdfr.parse(date+3);
			SimpleDateFormat sdfr1 = new SimpleDateFormat("MM/dd/yyyy");
			dateString = sdfr1.format( dbdate );
			System.out.println(dateString);
			return dateString;
	 }
	 
}
