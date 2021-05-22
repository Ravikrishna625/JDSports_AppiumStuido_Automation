package com.mobile.automation.scripts;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mobile.automation.accelerators.MobileLocator;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;
import com.mobile.automation.accelerators.MobileActionLibrary;


import com.mobile.automation.objectrepository.Getapprovedpage;
import com.mobile.automation.objectrepository.InitalPaymentspage;
import com.mobile.automation.objectrepository.JDHomePage;


public class JDendtoendflowwithAppiumGrid extends TestEngineWeb {
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "CustomerInfo";
	protected String orderInfo = "OrderInfo";
	Map<String, List<String>> testdata = null;
	private ExtentLogs extenLogs = new ExtentLogs();
	List<Map<String, String>> testdata1 = null;

	@SuppressWarnings("raws")
	public static AndroidDriver asdriver;
	public static AppiumDriver driver;
	// private static IOSDriver driver;

	private static MobileActionLibrary mob_actionLib;

	public String appName = "test1.apk";

	@org.testng.annotations.AfterMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void afterMethod() {
		mob_actionLib.ShutDownDriver();
	}

	@org.testng.annotations.BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		testdata = ExcelReader.getStoredDataFromSelectedRows(this.sheetPath, "MobileInfo", 44, 45);
		mob_actionLib = new MobileActionLibrary(asdriver);
	}

	/**
	 * Method Name: CA_specialrules_Kiosk Purpose: This method - CA special rules
	 * Kiosk
	 */

	@SuppressWarnings({ "static-access", "unchecked" })
	@org.testng.annotations.Test(priority = 5)
	@Parameters({"platformVersion", "deviceName", "port"})
	//@Parameters({"deviceName", "port"})
	public void JDEndtoendFlowPath(String platformVersion, String deviceName, String port) {
		//public void JDEndtoendFlowPath( String deviceName, String port) {

		boolean passflag = true;

		try {

			mob_actionLib.DriverNoResetFlag = true;
			this.driver = mob_actionLib.startGridTest(platformVersion,deviceName,port);
			JDHomePage jd = new JDHomePage(this.driver);
			jd.EndtoEndFlowJDAppium();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (passflag == false) {

			Assert.fail();

		}

	}

	/**
	 * Method Name: CA_specialrules_Kiosk Purpose: This method - CA special rules
	 * Kiosk
	 *//*
		 * 
		 * @SuppressWarnings({ "static-access", "unchecked" })
		 * 
		 * @org.testng.annotations.Test(priority = 1)
		 * 
		 * public void JDEndtoendFlowPath1() {
		 * 
		 * boolean passflag = true;
		 * 
		 * try {
		 * 
		 * mob_actionLib.DriverNoResetFlag = true; this.asdriver =
		 * mob_actionLib.StartAppiumDriverAndriod(appName); JDHomePage jd = new
		 * JDHomePage(this.asdriver); jd.EndtoEndFlowJDAppium(); } catch (Exception e) {
		 * e.printStackTrace(); } if (passflag == false) {
		 * 
		 * Assert.fail();
		 * 
		 * }
		 * 
		 * }
		 */

}