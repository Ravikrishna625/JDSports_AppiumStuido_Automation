package com.mobile.automation.objectrepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
import io.appium.java_client.touch.offset.PointOption;

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
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;
import com.web.automation.accelerators.GmailAPI;


public class JDHomePage extends MobileActionLibrary {

	public JDHomePage(AppiumDriver  driver) {
		super((AppiumDriver) driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	//	@AndroidFindBy(xpath = "//*[@contentDescription='Open navigation drawer']")	
	//	@AndroidFindBy(accessibility = "Open navigation drawer")
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
	public MobileElement cMenu;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@contentDescription='Open navigation drawer']")
	@FindBy(id = "MENU")


	public MobileElement Menu;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "Search")
	@FindBy(id = "MENU")
	public MobileElement Searchbtn;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/search_src_text")
	@FindBy(id = "MENU")
	public MobileElement Searchbtntxt;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "menu_shop")
	@FindBy(id = "MENU")
	public MobileElement Shop;
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "Open navigation drawer")
	@FindBy(id = "MENU")
	public MobileElement Menubtn;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Men']")	
	public MobileElement Menbtn;

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
	@AndroidFindBy(xpath = "//*[@text='Shorts']")	
	public MobileElement Shorts;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Latest']")	
	public MobileElement Latest;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Shop All']")	
	public MobileElement ShopAll;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Quick Buy']")	
	public MobileElement QuickBuy;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@resource-id='com.jd.jdsports:id/product_quick_buy_button']")	
	public List<MobileElement> QuickBuydown;
	//public List<MobileElement> squarecheckboxlist;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "(//*[@id='chip_cloud']/*[@class='com.jd.jdsports.ui.productdetail.materialsizedialog.SizeButton'])[1]")	
	public MobileElement Sizes;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='M']")	
	public MobileElement Sizesvalue;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@text='Secure checkout']")	
	public MobileElement Securecheckout;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_detail_total_value")	
	public MobileElement Totalvalue;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_list_item_product_title")	
	public MobileElement item_product_title;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "checkout_toolbar_title")	
	public MobileElement toolbar_title;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_detail_list_item_quantity")	
	public MobileElement list_item_quantity;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_item_oos_status")	
	public MobileElement item_oos_status;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_detail_basket_total_value")	
	public MobileElement basket_total_value;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_detail_delivery_method_value")	
	public MobileElement detail_delivery_method_value;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "basket_continue")	
	public MobileElement Checkoutcontinue;
	

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_login_email_address_value")
	
	@AndroidFindBy(xpath = "(//*[@text='Email address'])[1]")	
	public MobileElement Email;
	
	

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_login_password_value")	
	public MobileElement Password;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_login_login_button")	
	public MobileElement Login;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "customer_login_title")	
	public MobileElement customer_login_title;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_new_firstname")	
	public MobileElement customer_new_firstname;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_new_lastname")	
	public MobileElement customer_new_lastname;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id = "com.jd.jdsports:id/customer_new_email_address")	
	public MobileElement customer_new_email_address;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id ="com.jd.jdsports:id/customer_new_phone_number")	
	public MobileElement customer_new_phone_number;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@AndroidFindBy(id ="com.jd.jdsports:id/customer_login_no_account_continue_button")	
	public MobileElement customer_login_no_account_continue_button;
	
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
		//	new TouchAction(driver).press(575, 281).waitAction(Duration.ofMillis(449)).moveTo(459, 1703).release().perform();
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

		if (isElementPresent(Shop, "Shop")) {	
			click(Shop, "Shop");
			wait(2);
			waitforelementpresent(Menbtn);
			click(Menbtn, "Men");
			click(Clothing, "Clothing");
			click(ShopAll, "ShopAll");	
			waitforelementpresent(QuickBuy);
			click(QuickBuy, "Quick Buy");
			waitforelementpresent(Sizes); wait(5); 
			click(Sizes,"Select Size"); 
			wait(4); 
			click(Securecheckout, "Secure checkout"); wait(5);
			wait(5);
			String Totalamount = getText(Totalvalue, "Total Amount");

			if ((Totalamount != null)) { extentLogs.pass("Verify Total  Amount",
					"Total  Amount:" + Totalamount);

			} else { extentLogs.fail( "Verify Total  Amount",
					"Total  Amount:" + Totalamount); }


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

		wait(2);
		MobileElement el1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\\\"Open navigation drawer\\\"]"));
		el1.click();

		if (isElementPresent(cMenu, "Menu")) {	

			click(Menu, "Menu"); wait(2); 
			/*
			 * new TouchAction(driver).press(575,
			 * 281).waitAction(Duration.ofMillis(449)).moveTo(459,
			 * 1703).release().perform(); waitforelementpresent(Men);
			 */ click(Men, "Men");
							click(Clothing, "Clothing"); click(Jackets, "Jackets");
							waitforelementpresent(QuickBuy); click(QuickBuy, "Quick Buy");
							waitforelementpresent(Sizes); wait(5); click(Sizes, "Select Size"); wait(5);
							click(Securecheckout, "Secure checkout"); wait(5);

							String Totalamount = getText(Totalvalue, "Total Amount");

							if ((Totalamount != null)) { extentLogs.pass("Verify Total Approval Amount",
									"Total Approval Amount:" + Totalamount);

							} else { extentLogs.fail( "Verify Total Approval Amount",
									"Total Approval Amount:" + Totalamount); }


							click(cMenu, "Menu");



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
	public boolean EndtoEndFlowJDAppium() throws Exception {

		if (isElementPresent(Shop, "Shop")) {	
			click(Shop, "Shop");
			wait(2);
			waitforelementpresent(Menbtn);
			click(Menbtn, "Men");
			click(Clothing, "Clothing");
			//swiptToBottom();
			scrollToElement(By.xpath("//*[@text='Jackets']"));
			click(Jackets, "Jackets");		
			//waitforelementpresent(QuickBuy);
			wait(2);
			swiptToBottom();
			scrollToElement(By.xpath("//*[@resource-id='com.jd.jdsports:id/product_quick_buy_button']"));			
			click(QuickBuydown.get(0), "Quick Buy");
			wait(5);  
			click(Sizesvalue,"Select Size"); 
			wait(5); 
			click(Securecheckout, "Secure checkout"); 
			wait(1); 
			//Titile

			assertElementExists(toolbar_title, "Title Page Basket") ;
			wait(2);

			String product_title = getText(item_product_title, "item_product_title");

			if ((product_title != null)) { 
				extentLogs.pass("Verify item_product_title", "Item_product_title:" + product_title);

			} else { extentLogs.fail( "Verify item_product_title","Item_product_title:" + product_title); 

			}


			String item_quantity = getText(list_item_quantity, "Item Quantity");

			if ((item_quantity != null)) { 
				extentLogs.pass("Verify Item Quantity", "Item Quantity:" + item_quantity);

			} else { extentLogs.fail( "Verify Item Quantity","Item Quantity:" + item_quantity); 

			}



			String oos_status = getText(item_oos_status, "Oos status");

			if ((oos_status != null)) { 
				extentLogs.pass("Verify Item oos status", "Item oos:" + oos_status);

			} else { extentLogs.fail( "Verify Item oos status","Item oos:" + oos_status); 

			}


			String Btotal_value = getText(basket_total_value, "Basket_total_value");

			if ((Btotal_value != null)) { 
				extentLogs.pass("Verify Basket_total_value", "Basket_total_value:" + Btotal_value);

			} else { extentLogs.fail( "Verify Basket_total_value","Basket_total_value:" + Btotal_value); 

			}

			wait(2);
			swiptToBottom();

			String deliveryvalue = getText(detail_delivery_method_value, "Detail_delivery_method_value");

			if ((deliveryvalue != null)) { 
				extentLogs.pass("Verify Detail_delivery_method_value", "Detail_delivery_method_value:" + deliveryvalue);

			} else { extentLogs.fail( "Verify Detail_delivery_method_value","Detail_delivery_method_value:" + deliveryvalue); 

			}
			//total
			String Totalamount = getText(Totalvalue, "Total Amount");

			if ((Totalamount != null)) { 
				extentLogs.pass("Verify Total  Amount", "Total  Amount:" + Totalamount);

			} else { extentLogs.fail( "Verify Total  Amount","Total  Amount:" + Totalamount);

			}

			swiptToBottom();

			
			click(Checkoutcontinue, "Checkout Continue"); 

			
			// login 
			wait(2);
			assertElementExists(customer_login_title, "Customer login title") ;
			wait(2);
			// Login
			//driver.getKeyboard();
//			type(Email, "Chandra.Mathala@jdplc.com","Enter Email");
//			type(Password, "jdplc12345@","Enter Password"); 
//			click(Login, "Login");
			
			SetValue(customer_new_firstname, "Chandra","customer_new_firstname");
			driver.hideKeyboard();
			type(customer_new_lastname, "Mathala","customer_new_firstname");
			type(customer_new_email_address, "Chandra.Mathala@jdplc.com","customer_new_firstname");
			type(customer_new_phone_number, "9945988988","customer_new_firstname");
			swiptToBottom();
			click(customer_login_no_account_continue_button, "customer_login_no_account_continue_button");
			return true;
		} else {
			return false;
		}
	}




	public static void swipeDown(int howManySwipes) {
		org.openqa.selenium.Dimension size = asdriver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		try {
			for (int i = 1; i <= howManySwipes; i++) {
				new TouchAction<>(asdriver).press(point(startVerticalX, endVerticalY))
				.waitAction(waitOptions(ofSeconds(2))).moveTo(point(startVerticalX, startVerticalY))
				.release().perform();
			}
		} catch (Exception e) {
			//print error or something
		}
	}

	public void swiptToBottom()
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int top_y = (int)(height*0.80);
		int bottom_y = (int)(height*0.20);
		System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
		TouchAction ts = new TouchAction(driver);
		ts.press(x, top_y).moveTo(x, bottom_y).release().perform();
	}

	public static void scrollUp(int howManySwipes) {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		try {
			for (int i = 1; i <= howManySwipes; i++) {
				new TouchAction<>(driver).press(point(startVerticalX, startVerticalY))
				.waitAction(waitOptions(ofSeconds(2))).moveTo(point(startVerticalX, endVerticalY)).release()
				.perform();
			}
		} catch (Exception e) {
			//print error or something
		}
	}


	private static WaitOptions waitOptions(Object ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}


	private static Object ofSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	private static PointOption point(int startVerticalX, int startVerticalY) {
		// TODO Auto-generated method stub
		return null;
	}





	public static boolean scrollToElement (By by) throws Exception {
		boolean isFoundTheElement = driver.findElements(by).size() > 0;
		while (isFoundTheElement == false) {
			swipeVertical(0.8, 0.1, 0.5, 2000);
			isFoundTheElement = driver.findElements(by).size() > 0;
		}

		return isFoundTheElement;
	}

	public static void swipeVertical (
			double startPercentage, double finalPercentage, double anchorPercentage, int duration)
					throws Exception {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		getTouchAction().press(PointOption.point(anchor, startPoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
		.moveTo(PointOption.point(anchor, endPoint)).release().perform();
	}

	public static TouchAction getTouchAction () {
		return new TouchAction(driver);
	}
	//Swipe by elements
	public void swipeByElements (AndroidElement startElement, AndroidElement endElement) {
		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
		int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

		int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
		int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

		//new TouchAction(asdriver).press(ElementOption.element(startX,startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endX, endY)).release().perform();



	}
}