package com.mobile.automation.objectrepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDeviceActionShortcuts;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import java.lang.annotation.Repeatable;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.mobile.automation.accelerators.MobileActionLibrary;
import com.mobile.automation.accelerators.MobileLocator;
import com.web.automation.accelerators.GmailAPI;


public class JDHomePageappium extends MobileActionLibrary {

	public JDHomePageappium(AndroidDriver  appiumDriver) {
		super((AndroidDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}


	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "GET APPROVED")
	@iOSXCUITFindBy(accessibility = "SEA APROBADO")
	
	public MobileElement GETAPPROVED;


	@iOSXCUITFindBy(xpath = "(//*[@accessibilityLabel='GET APPROVED' or @accessibilityLabel='SEA APROBADO'])[1]")
	public MobileElement SEAAPROBADO;


	@iOSXCUITFindBy(accessibility = "CREATE AN ORDER")
	public MobileElement CREATEANORDER;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@contentDescription='Open navigation drawer']")
	@FindBy(id = "MENU")
	public MobileElement Menu;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "Open navigation drawer")
	@FindBy(id = "MENU")
	public MobileElement Menubtn;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Men']")	
	public MobileElement Men;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Clothing']")	
	public MobileElement Clothing;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Jackets']")	
	public MobileElement Jackets;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Quick Buy']")	
	public MobileElement QuickBuy;
	
		
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "(//*[@id='chip_cloud']/*[@class='com.jd.jdsports.ui.productdetail.materialsizedialog.c'])[2]")	
	public MobileElement Sizes;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Secure checkout']")	
	public MobileElement Securecheckout;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@id='basket_detail_total_value']")	
	public MobileElement Totalvalue;
	
	@iOSXCUITFindBy(xpath = "//*[@class='VNHeadline1Label']")
	public MobileElement Header;

	//*[@accessibilityLabel='CONTINUE MY PROGRESS' or @accessibilityLabel='CONTINUAR MI APLICACIÓN']

	@iOSXCUITFindBy(xpath = "(//*[@class='VNBlueBodyLabel'])[1]")
	public MobileElement Headererrorvalue;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Consent and Notice Regarding Electronic Agreements']")
	public MobileElement ConsentandnoticeRegardingElectronicAgreements;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Your Rental-Purchase Agreement']")
	public MobileElement YourRentalPurchaseAgreement;

	@iOSXCUITFindBy(xpath = "//*[@text='AGREE' or (@text='ACKNOWLEDGE')]")
	public MobileElement AGREEorACKNOWLEDGE;

	@iOSXCUITFindBy(accessibility = "firstName")
	public MobileElement firstName;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='First' and @text='First']")
	public MobileElement first;

	@iOSXCUITFindBy(accessibility = "firstName")
	public MobileElement Firstname;

	@iOSXCUITFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Firstnametxt;

	@iOSXCUITFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='numberButtonBackspace']]")
	public MobileElement Backspacebtn;

	@iOSXCUITFindBy(xpath = "//*[@class='UITextFieldBorderView' and ./parent::*[@accessibilityLabel='verifySSN1']]")
	public MobileElement enterssn;

	@iOSXCUITFindBy(accessibility = "lastName")
	public MobileElement lastName;

	@iOSXCUITFindBy(accessibility = "Last")
	public MobileElement last;

	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement contactNumber;
	
	

	//*[@accessibilityLabel='NO APLICA']
	//*[@text='NOT APPLICABLE' or @accessibilityLabel='NO APLICA']
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "NOT APPLICABLE")
	@iOSXCUITFindBy(accessibility = "NO APLICA")
	public MobileElement NOTAPPLICABLE;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "referenceOneContactNumber")
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement phone;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "referenceOneContactNumber")
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement referenceOneCNumber;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "referenceTwoContactNumber")
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement referenceTwoCNumber;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "referenceThreeContactNumber")
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement referenceThreeCNumber;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "referenceFourContactNumber")
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement referenceFourCNumber;
	
	

	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click Create an order
	 * @return
	 * @throws
	 */
	public boolean clickCreateanorder() throws Exception {

		if (isElementPresent(CREATEANORDER, "CREATE AN ORDER")) {
			click(CREATEANORDER, "CREATE AN ORDER");
			return true;
		} else {
			return false;
		}
	}

	

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName  Create an End to End Flow JDSports
	 * @return
	 * @throws
	 */
	public boolean EndtoEndFlowJDold() throws Exception {

		if (isElementPresent(Menu, "Menu")) {	
			click(Menu, "Menu");
			 new TouchAction(driver).press(575, 281).waitAction(Duration.ofMillis(449)).moveTo(459, 1703).release().perform();
			waitforelementpresent(Men);
			click(Men, "Men");
			click(Clothing, "Clothing");
			click(Jackets, "Jackets");
			waitforelementpresent(QuickBuy);
			click(QuickBuy, "Quick Buy");
			waitforelementpresent(Sizes);
			click(Sizes, "Select Size");
			click(Securecheckout, "Secure checkout");			
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName  Create an End to End Flow JDSports
	 * @return
	 * @throws
	 */
	public boolean EndtoEndFlowJD() throws Exception {

		wait(5);
		if (isElementPresent(Menu, "Menu")) {	
			click(Menu, "Menu");
			wait(2);
			new TouchAction(asdriver).press(575, 281).waitAction(Duration.ofMillis(449)).moveTo(459, 1703).release().perform();
			waitforelementpresent(Men);
			click(Men, "Men");
			click(Clothing, "Clothing");
			click(Jackets, "Jackets");
			waitforelementpresent(QuickBuy);
			click(QuickBuy, "Quick Buy");
			waitforelementpresent(Sizes);
			wait(5);
			click(Sizes, "Select Size");
			wait(5);
			click(Securecheckout, "Secure checkout");
			wait(5);
				
			String Totalamount = getText(Totalvalue, "Total Amount");

			if ((Totalamount != null)) {
				extentLogs.pass("Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);

			} else {
				extentLogs.fail( "Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName  Create an End to End Flow JDSports
	 * @return
	 * @throws
	 */
	public boolean EndtoEndFlowJDChrome() throws Exception {
		
		
		

		if (isElementPresent(Menu, "Menu")) {	
			/*
			 * click(Menu, "Menu"); wait(2); new TouchAction(asdriver).press(575,
			 * 281).waitAction(Duration.ofMillis(449)).moveTo(459,
			 * 1703).release().perform(); waitforelementpresent(Men); click(Men, "Men");
			 * click(Clothing, "Clothing"); click(Jackets, "Jackets");
			 * waitforelementpresent(QuickBuy); click(QuickBuy, "Quick Buy");
			 * waitforelementpresent(Sizes); wait(5); click(Sizes, "Select Size"); wait(5);
			 * click(Securecheckout, "Secure checkout"); wait(5);
			 * 
			 * String Totalamount = getText(Totalvalue, "Total Amount");
			 * 
			 * if ((Totalamount != null)) { extentLogs.pass("Verify Total Approval Amount",
			 * "Total Approval Amount:" + Totalamount);
			 * 
			 * } else { extentLogs.fail( "Verify Total Approval Amount",
			 * "Total Approval Amount:" + Totalamount); }
			 */
			
				click(Menu, "Menu");
			
			
			
			return true;
		} else {
			return false;
		}
	}
}