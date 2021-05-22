/*
 * package com.mobile.automation.pages;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.util.List;
 * import java.util.Map;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.support.events.EventFiringWebDriver; import
 * org.testng.annotations.Parameters;
 * 
 * import com.beust.jcommander.Parameter; import
 * com.experitest.appium.SeeTestIOSDriver; import
 * com.experitest.appium.SeeTestIOSElement; import
 * com.google.common.base.Optional; import com.web.automation.logs.ExtentLogs;
 * import com.web.automation.objectrepository.Login_OR; import
 * com.web.automation.utilities.CommonVariables;
 * 
 * public class LoginPage extends BasePage {
 * 
 * public LoginPage(SeeTestIOSDriver<SeeTestIOSElement> sdriver) {
 * super(sdriver); // TODO Auto-generated constructor stub }
 * 
 * private DbConnection connection; public EventFiringWebDriver driver; public
 * ExtentLogs extentLogs = new ExtentLogs(); Optional<Long> timeoutInSecond =
 * Optional.of(Long.parseLong("0"));
 * 
 * public LoginPage(WebDriver driver) { // super(driver);
 * 
 * if (!actionLib.GetURl().contains("RAC Web Portal | Login")) {
 * //System.out.println("Url is verfied"); throw new
 * IllegalStateException("This is not the 'Login' page."); }
 * 
 * }
 * 
 *//**
	 * This method 'verifyPhoneNumber' verifies Phone Number exists in Forgot
	 * Passphrase conformation message
	 * 
	 * @param strPhoneNumber - Phone number to be verified
	 * @author Udaya Kumar Anem(Cigniti)
	 */
/*
 * 
 * public void verifyPhoneNumber(String strPhoneNumber) { try { String
 * strConformationMsg=actionLib.getElementText(Login_OR.div_ConformationMsg,
 * "Forgot passphrase conformation Message");
 * if(strConformationMsg.contains(strPhoneNumber)) extentLogs.
 * pass("Verify phone number exists in Forgot Phonepass conformation message",
 * "Phone number "
 * +strPhoneNumber+" exists in Forgot Phonepass conformation message"); else
 * extentLogs.
 * fail("Verify phone number exists in Forgot Phonepass conformation message",
 * "Phone number "
 * +strPhoneNumber+" not found in Forgot Phonepass conformation message"); }
 * catch (Throwable e) { e.printStackTrace(); } }
 * 
 *//**
	 * This method 'clickForgotPassphrase' clicks on the Forgot Passphrase on the
	 * login page
	 * 
	 * @author Udaya Kumar Anem(Cigniti)
	 */
/*
 * 
 * public void clickForgotPassphrase() { try {
 * actionLib.waitForVisibilityOfElement(Login_OR.link_ForgotPassphrase,
 * "Forgot Passphrase", 25);
 * 
 * actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * link_ForgotPassphrase), "Forgot Passphrase");
 * extentLogs.pass("Click on Forgot Passphrase",
 * "Clicked on Forgot Passphrase link"); } catch (Throwable e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } }
 * 
 *//**
	 * This is the combine method of clicking on Forgot Passphrase and verify phone
	 * number exists in conformation message
	 * 
	 * @param strPhoneNumber
	 */
/*
 * public void clickForgotPassphraseAndVerifyPhoneNumber(String strPhoneNumber)
 * { clickForgotPassphrase(); verifyPhoneNumber(strPhoneNumber); }
 * 
 * public String getStore(Map<String, List<String>> testdata) throws Throwable
 * 
 * { String url = actionLib.GetURl();
 * 
 * if (url.equals("https://uat-awp.acceptancenow.com/#/login/") ||
 * url.equals("https://uat-awp.acceptancenow.com/#/login")) { String storeNumber
 * = null; storeNumber = testdata.get("UAT_StoreNumber").get(0); // -String //
 * verionNumber=actionLib.getElementText(Dashboard_OR.txt_versionNumber, // "");
 * extentLogs.info("Env ", "Env:UAT"); return storeNumber;
 * 
 * } else { String storeNumber = null; storeNumber =
 * testdata.get("QA_StoreNumber").get(0);
 * 
 * return storeNumber;
 * 
 * }
 * 
 * } public String getMultiStore(Map<String, List<String>> testdata,int i)
 * throws Throwable
 * 
 * { String url = actionLib.GetURl();
 * 
 * if (url.equals("https://uat-awp.acceptancenow.com/#/login/") ||
 * url.equals("https://uat-awp.acceptancenow.com/#/login")) { String storeNumber
 * = null; storeNumber = testdata.get("UAT_StoreNumber").get(i); // -String //
 * verionNumber=actionLib.getElementText(Dashboard_OR.txt_versionNumber, // "");
 * extentLogs.info("Env ", "Env:UAT"); return storeNumber;
 * 
 * } else { String storeNumber = null; storeNumber =
 * testdata.get("QA_StoreNumber").get(i);
 * 
 * return storeNumber;
 * 
 * }
 * 
 * }
 * 
 *//**
	 * This function gets the store number based on the query specified
	 * 
	 * @param strQuery
	 */
/*
 * public String getStore(String strQuery) { String strStoreNumber="";
 * connection=new DbConnection();
 * 
 * try { Connection con=connection.getConnection(); ResultSet
 * rs=connection.executeQuery(strQuery); while(rs.next()) { strStoreNumber=
 * rs.getString("STOREID"); } con.close(); rs.close(); } catch (SQLException e)
 * { // TODO Auto-generated catch block e.printStackTrace(); } return
 * strStoreNumber; }
 * 
 * public void loginStore(String storeNumber, String storeType) throws Throwable
 * { try { String Passphrase = null;
 * 
 * //Trying to Store type in DB
 * 
 * if (actionLib.IsElementVisible(Login_OR.PASSPHRASE)) { String url =
 * actionLib.GetURl(); if
 * (url.equals("https://uat-awp.acceptancenow.com/#/login")) {
 * 
 * if (storeType.equalsIgnoreCase("Hybrid")) { StringBuffer sb = new
 * StringBuffer("U"); sb.append(storeNumber); sb.append("xanow"); Passphrase =
 * sb.toString(); } else { StringBuffer sb = new StringBuffer("U");
 * sb.append(storeNumber); sb.append("xteam"); Passphrase = sb.toString(); }
 * 
 * } else { if (storeType.equalsIgnoreCase("Hybrid")) { StringBuffer sb = new
 * StringBuffer("t"); sb.append(storeNumber); sb.append("xanow"); Passphrase =
 * sb.toString(); } else { //StringBuffer sb = new StringBuffer("t");
 * StringBuffer sb = new StringBuffer("U"); sb.append(storeNumber);
 * sb.append("xteam"); Passphrase = sb.toString(); } }
 * CommonVariables.CommonDriver.get().navigate().refresh();
 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * PASSPHRASE), Passphrase); //
 * actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(
 * Login_OR.PASSPHRASE), // Passphrase); //
 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * PASSWORD), // password);
 * CommonVariables.CommonDriver.get().findElement(By.xpath(
 * "//button[@type='submit']")).click(); //
 * actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(
 * Login_OR.SUBMIT)); extentLogs.pass("SIGNIN",
 * "Clicked on SIGNIN Button successfully.");
 * 
 * // actionLib.IsElementVisible(Login_OR.LOGOUT);
 * 
 * } else { extentLogs.fail("PASSPHRASE",
 * "'Invalid PASSPHRASE or Invalid Store number"); } } catch (Exception e) {
 * throw e; } }
 * 
 * public void verifyLogin(String Passphrase) {
 * 
 * try { actionLib.type(actionLib.FindElement(Login_OR.PASSPHRASE,
 * Optional.absent()), Passphrase);
 * actionLib.Click(actionLib.FindElement(Login_OR.SUBMIT, Optional.absent()));
 * if (actionLib.IsElementVisible(Login_OR.txt_errorMessage)) {
 * extentLogs.pass("Enter incorrect passphrase",
 * "Prompt message as Invalid Passphras"); } else {
 * extentLogs.fail("Enter incorrect passphrase", "login Sucessfully"); } } catch
 * (Throwable e) { // TODO Auto-generated catch block e.printStackTrace(); } }
 * 
 * public String getEnv() { String strEnvironment=""; String url =
 * actionLib.GetURl(); if (url.contains("uat-awp.acceptancenow.com"))
 * strEnvironment= "UAT"; else if(url.contains("qa-awp.acceptancenow.com"))
 * strEnvironment= "QA";
 * 
 * return strEnvironment; }
 * 
 * public void loginStore(String storeNumber) throws Throwable { try { String
 * Passphrase = null; if (actionLib.IsElementVisible(Login_OR.PASSPHRASE)) {
 * String url = actionLib.GetURl(); if
 * (url.equals("https://uat-awp.acceptancenow.com/#/login/") ||
 * url.equals("https://uat-awp.acceptancenow.com/#/login")) {
 * 
 * StringBuffer sb = new StringBuffer("U"); sb.append(storeNumber);
 * sb.append("xteam"); Passphrase = sb.toString();
 * 
 * } else {
 * 
 * StringBuffer sb = new StringBuffer("t"); sb.append(storeNumber);
 * sb.append("xteam"); Passphrase = sb.toString();
 * 
 * } CommonVariables.CommonDriver.get().navigate().refresh();
 * Thread.sleep(1000);
 * CommonVariables.CommonDriver.get().findElement(By.id("login-passphrase")).
 * sendKeys(Passphrase); //
 * actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(
 * Login_OR.PASSPHRASE), // Passphrase); //
 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * PASSPHRASE), // Passphrase); //
 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * PASSWORD), // password);
 * 
 * CommonVariables.CommonDriver.get().findElement(By.xpath(
 * "//button[@type='submit']")).click(); //
 * actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.
 * SUBMIT), // "SIGNIN BUTTON"); extentLogs.pass("SIGNIN",
 * "Clicked on SIGNIN Button successfully.");
 * 
 * // actionLib.IsElementVisible(Login_OR.LOGOUT);
 * 
 * } else { extentLogs.fail("PASSPHRASE",
 * "'Invalid PASSPHRASE or Invalid Store number"); } } catch (Exception e) {
 * throw e; } }
 * 
 *//**
	 * This method sets the DB values in DB
	 * 
	 * @param strStoreType
	 * @param strStoreNumber
	 * @param strQuery       For this function specify either strStoreType and
	 *                       strStoreNumber or specify the strQuery
	 *//*
		 * public void setStoreInDB(String strStoreType,String strStoreNumber,String
		 * strQuery,String strEnvironment) { if(strQuery.equals("")) {
		 * if(!strStoreType.equals("")) { if(strStoreType.equalsIgnoreCase("unmanned"))
		 * { if(CommonVariables.Environment.get().equalsIgnoreCase("qa"))
		 * strQuery="UPDATE ODSTADM.VANSTOREINFO SET MannedLocation = 0 WHERE STOREID = '"
		 * +strStoreNumber+"'"; else
		 * if(CommonVariables.Environment.get().equalsIgnoreCase("uat"))
		 * strQuery="UPDATE ODSUADM.VANSTOREINFO SET MannedLocation = 0 WHERE STOREID = '"
		 * +strStoreNumber+"'"; }else if(strStoreType.equalsIgnoreCase("manned")) {
		 * if(CommonVariables.Environment.get().equalsIgnoreCase("qa"))
		 * strQuery="UPDATE ODSTADM.VANSTOREINFO SET MannedLocation = 1 WHERE STOREID = '"
		 * +strStoreNumber+"'"; else
		 * if(CommonVariables.Environment.get().equalsIgnoreCase("uat"))
		 * strQuery="UPDATE ODSUADM.VANSTOREINFO SET MannedLocation = 1 WHERE STOREID = '"
		 * +strStoreNumber+"'"; } } }
		 * 
		 * connection=new DbConnection(); ResultSet rs=null; try { Connection
		 * con=connection.getConnection(strEnvironment); PreparedStatement
		 * statement1=con.prepareStatement(strQuery); PreparedStatement
		 * statement2=con.prepareStatement("commit"); rs=statement1.executeQuery();
		 * rs=statement2.executeQuery(); con.close(); rs.close(); } catch (SQLException
		 * e) { e.printStackTrace(); } } }
		 */