package com.mobile.automation.objectrepository;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.amazonaws.services.kms.model.transform.GenerateRandomResultJsonUnmarshaller;

import com.mobile.automation.accelerators.MobileActionLibrary;
import com.mobile.automation.accelerators.MobileLocator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class InitalPaymentspage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public InitalPaymentspage(AppiumDriver appiumDriver) {
		super((AppiumDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(accessibility = "cashPaymentDoneButton")
	public MobileElement DONE;

	@iOSFindBy(accessibility = "Enter your associate PIN")
	public MobileElement PIN;

	@iOSFindBy(accessibility = "OK")
	public MobileElement OK;

	@iOSFindBy(accessibility = "payWithCashButtonText")
	public MobileElement CASH;
	
	@iOSFindBy(accessibility = "payWithCashButtonText")
	public List<MobileElement> Cash;

	@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio idle\"])[2]")
	public List<MobileElement> radiobtnsecond;
	
	@iOSFindBy(accessibility = "payWithCreditButtonText")
	public MobileElement Header;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   		
	@iOSXCUITFindBy(accessibility = "What's the expiration date?")
	@iOSXCUITFindBy(accessibility = "¿Cuál es la fecha de vencimiento?")
	public MobileElement Headeraccount;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   		
	@iOSXCUITFindBy(accessibility = "What's the security code?")
	@iOSXCUITFindBy(accessibility = "¿Cuál es el código de seguridad?")
	public MobileElement Headersecu;
	
	@iOSFindBy(accessibility = "What's your bank routing number?")
	public MobileElement typeaccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Checking']")
	public MobileElement Checking;

	@iOSFindBy(accessibility = "bankAccountTypeSavings")
	public MobileElement Savings;

	@iOSFindBy(accessibility = "newBankAccount")
	public MobileElement BANKACCOUNT;
	
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='radio idle'])[2]")
	public List<MobileElement> firstradiobt;
	
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='radio idle'])[1]")
	public List<MobileElement> firstradiobtn;
	
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='radio idle'])[2]")
	public MobileElement Secondradiobtn;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   	
	@iOSXCUITFindBy(accessibility = "payWithCreditButtonText")
	@iOSXCUITFindBy(accessibility = "ePayUnmannedCreditCardButtonText")	
	public MobileElement CREDITDEBITCARD;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSXCUITFindBy(accessibility = "payWithCreditButtonText")
	@iOSXCUITFindBy(accessibility = "ePayUnmannedCreditCardButtonText")
	@iOSXCUITFindBy(accessibility = "ePayUnmannedCreditCardButtonText")	
	public MobileElement ePayUnmannedCreditCardButton;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSXCUITFindBy(accessibility = "payWithCreditButtonText")
	@iOSXCUITFindBy(accessibility = "ePayUnmannedCreditCardButtonText")
	@iOSXCUITFindBy(accessibility = "payWithCreditButtonText")
	public List<MobileElement> Creditdebitcardbtn;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSXCUITFindBy(accessibility = "payWithCreditButtonText")
	@iOSXCUITFindBy(accessibility = "ePayUnmannedCreditCardButtonText")	
	public List<MobileElement> ePayUnmannedCreditCardButtonText;
	
	
	@iOSFindBy(accessibility = "OK")	
	public List<MobileElement> OKbtn;
	
	@iOSFindBy(accessibility = "SET UP AUTOPAY")
	public List<MobileElement> Setupautopay;
	
	@iOSFindBy(accessibility = "newBankAccount")
	public List<MobileElement> Bankaccount;
	
	@iOSFindBy(accessibility = "payWithCashButtonText")
	public List<MobileElement> Cashbtn;
	
	@iOSFindBy(accessibility = "ANOW PROMO")
	public MobileElement ANOWPROMO;

	@iOSXCUITBy(iOSNsPredicate = "label contains '$'")
	public MobileElement initialamt;
	
	@iOSFindBy(accessibility = "epayUserName")
	public MobileElement enterusername;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='SELECT DELIVERY DATE']")
	public MobileElement SELECTDELIVERYDATE;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Password']")
	public MobileElement Password;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Security question answer']")
	public MobileElement Securityquestionanswer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Verify Password']")
	public MobileElement VerifyPassword;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='User Name']")
	public MobileElement username;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='BACK']")
	public MobileElement Back;

	@iOSFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[3]")
	public MobileElement clickdelbtn;

	@iOSFindBy(accessibility = "passwordField")
	public MobileElement pwd;

	@iOSFindBy(accessibility = "securityAnswerField")
	public MobileElement Securityquestionans;

	@iOSFindBy(accessibility = "bankAccountNumber")
	public MobileElement bankAccountNumber;

	@iOSFindBy(accessibility = "bankRoutingNumber")
	public MobileElement bankRoutingNumber;
	
	@iOSFindBy(accessibility = "bankRoutingNumber")
	public List<MobileElement> Bankaccountheader;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   	
	@iOSFindBy(accessibility = "MANUALLY ENTER CARD INFO")
	@iOSFindBy(accessibility = "INTRODUZCA MANUALMENTE LA INFORMACIÓN DE LA TARJETA")
	public MobileElement ENTERMYINFO;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   	
	@iOSFindBy(accessibility = "Enter your debit/credit card information")
	@iOSFindBy(accessibility = "Ingrese la información de su tarjeta de crédito o débito")
	public MobileElement debitcreditcardinforma;

	@iOSFindBy(accessibility = "ccn1")
	public MobileElement ccn1;

	@iOSFindBy(accessibility = "securityCodeField")
	public MobileElement securityCodeField;

	@iOSFindBy(accessibility = "ccExpirationDate")
	public MobileElement Date;

	@iOSFindBy(accessibility = "ccn2")
	public MobileElement ccn2;

	@iOSFindBy(accessibility = "ccn3")
	public MobileElement ccn3;

	@iOSFindBy(accessibility = "ccn4")
	public MobileElement ccn4;

	//*[@accessibilityLabel='verifyPasswordField']
	@iOSFindBy(accessibility = "verifyPasswordField")
	public MobileElement Confirmpwd;

	@iOSFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[10]")
	public MobileElement Delet;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSFindBy(accessibility = "Join E-pay today!")
	@iOSFindBy(accessibility = "¡ Inscríbase a e-Pay!")
	public MobileElement Joinepayheader;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSFindBy(accessibility = "Please review your initial payment information.")
	@iOSFindBy(accessibility = "Por favor revise su información inicial de pago.")
	public MobileElement Reviewinitial;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='skip Autopay']")
	public MobileElement skipAutopay;

	@iOSFindBy(accessibility = "setupAutoPayButton")
	public MobileElement SETUPAUTOPAY;
	
	@iOSFindBy(accessibility = "setupAutoPayButton")
	public List<MobileElement> Setupautopaybtn;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Please review your AutoPay information']")
	public MobileElement AutoPayinformation;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter your associate password.']")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='What account would you like to use?']")
	public MobileElement whataccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Credit/Debit Card']")
	public MobileElement CreditDebitCard;

	@iOSFindBy(accessibility = "What account would you like to use?")
	public MobileElement accountlike;

	@iOSFindBy(accessibility = "existingBankAccount")
	public MobileElement Bankaccountending;

	@iOSFindBy(accessibility = "newCreditCard")
	public MobileElement CreditDebitac;

	@iOSFindBy(accessibility = "otherBankAccount")
	public MobileElement otherBankAccount;
	
	@iOSFindBy(accessibility = "setupPaymentButtonText")
	public MobileElement SETUPPAYMENT;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement AssociateLogin;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement LOGIN;

	@iOSFindBy(accessibility = "continueButtonText")
	public MobileElement CONTINUE;
	

	@iOSFindBy(accessibility = "Continue")
	public MobileElement Continue;
	
	@iOSFindBy(accessibility = "continueButtonText")
	public MobileElement CONTINUEbu;

	
	@iOSFindBy(accessibility = "EXIT")
	public MobileElement EXIT;
	
	@iOSFindBy(accessibility = "Hide keyboard")
	public MobileElement Hidekeyboard;

	@iOSFindBy(accessibility = "continueButtonText")
	public MobileElement CONTINUEbutton;

	@iOSFindBy(accessibility = "submitButtonText")
	public MobileElement SUBMIT;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)	   
	@iOSFindBy(accessibility = "skip Autopay")
	@iOSFindBy(accessibility = "saltar AutoPay")
	public MobileElement skipautopay;
	
	@iOSFindBy(accessibility = "OK")
	public MobileElement Ok;

	@iOSFindBy(accessibility = "See your sales associate to complete your payment.")
	public MobileElement PopupPrompt;

	@iOSFindBy(accessibility = "Accept Cash Payment")
	public MobileElement AcceptcashPayment;

	@iOSXCUITBy(iOSNsPredicate = "label contains '$'")
	public MobileElement Initialpayment;
	//XCUIElementTypeStaticText[starts-with(@name,’$’)]
	@iOSFindBy(accessibility = "Now, choose how you would like to make your monthly payment.")
	public MobileElement makeyourmonthlypaymenttxt;



	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement UIFieldEditor;

	@iOSFindBy(accessibility = "ACCEPT")
	public MobileElement ACCEPT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Now, choose how you would like to make your monthly payment.']")
	public MobileElement choosemonthlypayment;

	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName InitalPayment
	 * @return
	 * @throws
	 */
	public boolean InitalPayment() throws Exception {

		boolean status = false;
		// part 4
		// initial Payment with CASH
		wait(20);
		new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("payWithCashButtonText")));			
		
		if (isElementPresent(Cash,100)){
			isElementPresent(Cash.get(0), "Let's set up your initial payment");
			ele = waitForElementPresent(CASH, 60);
			click(ele, "CASH");
			wait(5);
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			
			ele = waitForElementPresent(PIN, 60);
			type(ele, "1515", "Enter your associate PIN");
			click(ACCEPT, "ACCEPT");
			// Accept CASH payment
			waitForElementPresent(AcceptcashPayment, 60);
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				/*String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");*/
				Enterdata("100000");
				click(DONE, "DONE");
				// Associate pin (5661)
				wait(5);
				/*ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");*/
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail("Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			wait(15);
		//	waitForElement(SETUPAUTOPAY, 60, "SET UP AUTOPAY");
			wait(5);
		/*	ele = waitForElementPresent(skipAutopay, 60);	
			click(ele, "skip Autopay");*/
			/*isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");*/
			
			//sdriver.context("NATIVE_APP");
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("skip Autopay"))).click();;						
			//sdriver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='skip Autopay']")).click();
			//click(element, elementName);
			extentLogs.pass("Verify skip Autopay Button",
					"skip Autopay button is  Clicked successfylly");
		//	sdriver.context("NATIVE_APP_INSTRUMENTED");

			wait(5);

			extentLogs.pass("Verify Initial payments ",
					"Initial payments should accepted Succesfully");
			status = true;
			return status;
		} else {
			extentLogs
			.fail( "Verify Initial payments ",
					"Initial payments should not accepted Succesfully");
			return false;
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName InitialPaymentThroughBankAccountAutoPay_Same_Bank_Account
	 * @return
	 * @throws
	 */
	public void InitialPaymentThroughBankAccountAutoPay_Same_Bank_Account()
			throws Exception {
		try {
			wait(20);	
			if(isElementPresent(Creditdebitcardbtn, 100)){
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Creditdebitcardbtn.get(0), "Let's set up your initial payment");
			// initial Payment with CASH
			click(BANKACCOUNT, "BANKACCOUNT");
			Verify_Joineapaytoday();
			// bank Routing number
			
			isElementPresent(bankRoutingNumber,"What's your bank routing number?");
			wait(2);
			Enterdata("123456780");
			//type(bankRoutingNumber, "123456780", "Enter Bank Routing number");
			click(CONTINUE, "CONTINUE");

			// account number
			isElementPresent(bankAccountNumber, "What's your bank account number?");
			//type(bankAccountNumber, "1235432", "Enter bank account number");
			Enterdata("1235432");
			click(CONTINUEbutton, "CONTINUE");
		
			// type of account
		//	waitForElementPresent(typeaccount, 60);
		//	isElementPresent(typeaccount, "What type of account is this?");
			click(Savings, "Savings");
			click(CONTINUEbutton, "CONTINUE");
			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");

			// setupautopay
			waitForElementPresent(SETUPAUTOPAY, 60);
			click(SETUPAUTOPAY, "SET UP AUTOPAY");
			
         //  System.out.println(sdriver.getPageSource());
			// setup payment
			waitForElementPresent(accountlike, 60);
			isElementPresent(accountlike, "What account would you like to use?");
			click(Bankaccountending, "Bank Account Ending In 5432");
			click(SETUPPAYMENT, "SET UP PAYMENT");
			wait(3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName 
	 *             Initial_payment_through_credit_card_Autopay_through_bank_account
	 * @return
	 * @throws
	 */
	public void Initial_payment_through_credit_card_Autopay_through_bank_account()
			throws Exception {
		try {
			wait(20);
			//waitForElementPresent(CREDITDEBITCARD, 60);
			if(isElementPresent(Creditdebitcardbtn, 30)){
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			ecreditcardinfo();
			
			
			// part 4
			/*wait(25);
		//	System.out.println(sdriver.getPageSource());
			//waitForElementPresent(Creditdebitcardbtn);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("payWithCreditButtonText")));			
			if(isElementPresent(Creditdebitcardbtn, 100)){
			//waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			wait(4);
			// initial Payment with CASH
			//ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(CREDITDEBITCARD, "CREDIT/DEBIT CARD");
			
			if(isElementPresent(OKbtn, 2)){
				click(OKbtn.get(0), "CREDIT/DEBIT CARD");
				
			}
			Verify_Joineapaytoday();
			// Credit card payment
			//waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(ENTERMYINFO, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			click(ccn1, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn2, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn3, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn4, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continue, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			click(Date, "Enter expiration date");
			Enterdata("1226");
			//type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			isElementPresent(Headersecu, "What's the security code?");
			click(securityCodeField, "Enter security code");
			Enterdata("1234");
			//type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");*/
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("skip Autopay")));						
			click(skipautopay, "skip Autopay");
			extentLogs.pass("Verify skip Autopay Button",
					"skip Autopay button is  Clicked successfylly");
			}
			
			wait(3);
			wait(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName 
	 *             Initial_payment_through_credit_card_Autopay_through_bank_account
	 * @return
	 * @throws
	 */
	public void Initial_payment_through_credit_card_Autopay_through_bank_account_Unmanned()
			throws Exception {
		try {
			
			// part 4
			wait(25);
		//	System.out.println(sdriver.getPageSource());
			//waitForElementPresent(Creditdebitcardbtn);
			//new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("ePayUnmannedCreditCardButtonText")));			
			if(isElementPresent(ePayUnmannedCreditCardButtonText, 100)){
			//waitForElementPresent(CREDITDEBITCARD, 60);
			//isElementPresent(Header, "Let's set up your initial payment");
			wait(4);
			ecreditcardinfo();
			// initial Payment with CASH
			//ele = waitForElementPresent(CREDITDEBITCARD, 60);
			/*click(ePayUnmannedCreditCardButtonText.get(0), "CREDIT/DEBIT CARD");
			
			if(isElementPresent(OKbtn, 1)){
				click(OKbtn.get(0), "CREDIT/DEBIT CARD");
				
			}
			Verify_Joineapaytoday();
			// Credit card payment
			//waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(ENTERMYINFO, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			click(ccn1, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn2, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn3, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			click(ccn4, "Enter CREDIT/DEBIT CARD data");
			Enterdata("5454");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continue, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			click(Date, "Enter expiration date");
			Enterdata("1226");
			//type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			isElementPresent(Headersecu, "What's the security code?");
			click(securityCodeField, "Enter security code");
			Enterdata("1234");
			//type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");*/
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("skip Autopay")));						
			click(skipautopay, "skip Autopay");
			extentLogs.pass("Verify skip Autopay Button",
					"skip Autopay button is  Clicked successfylly");
			}
			
			wait(3);
			wait(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	public void ecreditcardinfo() throws Exception {
		try {
		click(ePayUnmannedCreditCardButtonText.get(0), "CREDIT/DEBIT CARD");
		
		if(isElementPresent(OKbtn, 1)){
			click(OKbtn.get(0), "OK");
			
		}
		Verify_Joineapaytoday();
		// Credit card payment
		//waitForElementPresent(ENTERMYINFO, 60);
		isElementPresent(ENTERMYINFO, "Your initial payment");
		click(ENTERMYINFO, "ENTER MY INFO");
		// credit card information
		//isElementPresent(debitcreditcardinforma,"Enter your debit/credit card information");
		click(ccn1, "Enter CREDIT/DEBIT CARD data");
		Enterdata("5454");
		click(ccn2, "Enter CREDIT/DEBIT CARD data");
		Enterdata("5454");
		click(ccn3, "Enter CREDIT/DEBIT CARD data");
		Enterdata("5454");
		click(ccn4, "Enter CREDIT/DEBIT CARD data");
		Enterdata("5454");
		/*type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
		type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
		type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
		type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");*/
		click(Continue, "CONTINUE");
		// expire date
		
		isElementPresent(Headeraccount, "What's the expiration date?");
		click(Date, "Enter expiration date");
		Enterdata("1226");
		//type(Date, "1226", "Enter expiration date");
		click(CONTINUEbu, "CONTINUE");

		// security code
		isElementPresent(Headersecu, "What's the security code?");
		click(securityCodeField, "Enter security code");
		Enterdata("1234");
		//type(securityCodeField, "1234", "Enter security code");
		click(CONTINUEbutton, "CONTINUE");
		waitForElementPresent(Reviewinitial, 60);
		isElementPresent(Reviewinitial,
				"Please review your initial payment information");
		click(SUBMIT, "SUBMIT");
		wait(10);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName 
	 *             Initial_payment_through_credit_card_Autopay_through_bank_account
	 * @return
	 * @throws
	 */
	public void Initial_payment_through_credit_card_Autopay_through_bank_accountformarketserver()
			throws Exception {
		try {
			// part 4
			wait(30);
			waitForElementPresent(CREDITDEBITCARD, 60);
			if(isElementPresent(Creditdebitcardbtn, 30)){
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			ecreditcardinfo();
			// initial Payment with CASH
			/*ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(ele, "CREDIT/DEBIT CARD");
			Verify_Joineapaytoday();
			// Credit card payment
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(CONTINUE, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");*/
			wait(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_Take_a_Card_Payment_SkipAutPay_Schedule_Delivery
	 * @return
	 * @throws
	 */
	public void Verify_Take_a_Card_Payment_SkipAutPay_Schedule_DeliveryforPRstore()
			throws Exception {
		try {
			// part 4
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.name("Vamos a crear sus pagos.")));			
			
			//waitForElementPresent(CREDITDEBITCARD, 60);
			if(isElementPresent(Creditdebitcardbtn, 30)){
			//waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(CREDITDEBITCARD, "Let's set up your initial payment");
			ecreditcardinfo();
			/*ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(ele, "CREDIT/DEBIT CARD");
			Verify_Joineapaytoday();
			// Credit card payment
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(CONTINUE, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");*/

			// setupautopay
			if(isElementPresent(Setupautopaybtn, 5)){
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("saltar AutoPay")));						
			click(skipautopay, "skip Autopay");
			wait(3);
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_Take_a_Card_Payment_SkipAutPay_Schedule_Delivery
	 * @return
	 * @throws
	 */
	public void Verify_Take_a_Card_Payment_SkipAutPay_Schedule_Delivery()
			throws Exception {
		try {
			// part 4
			wait(20);	
			if(isElementPresent(Creditdebitcardbtn, 100)){
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Creditdebitcardbtn.get(0), "Let's set up your initial payment");
			// initial Payment with CASH
			if(isElementPresent(firstradiobtn, 2)){
			click(firstradiobtn.get(0), "First Radio Button");
			}
		/*	click(Secondradiobtn, "Second Radio Button");*/
			ecreditcardinfo();
			/*ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(ele, "CREDIT/DEBIT CARD");
			Verify_Joineapaytoday();
			// Credit card payment
			waitForElementPresent(ENTERMYINFO, 60);
			//isElementPresent(Headeraccount, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(CONTINUE, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			//isElementPresent(Headeraccount, "What's the security code?");
			type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");*/

			// setupautopay
			//System.out.println(sdriver.getPageSource());
			if(isElementPresent(Setupautopaybtn, 5)){
			waitForElementPresent(SETUPAUTOPAY, 60);
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("skip Autopay")));						
			click(skipautopay, "skip Autopay");
			wait(3);
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_TakeCashPayment_SetUpAutoPay_ScheduleDelivery
	 * @return
	 * @throws
	 */
	public void Verify_TakeCashPayment_SetUpAutoPay_ScheduleDelivery()
			throws Exception {

		try {
			// part 4
			// initial Payment with CASH
			wait(20);
			if(isElementPresent(Cash, 100)){
			ele = waitForElementPresent(CASH, 60);
			//isElementPresent(Header, "Let's set up your initial payment");
			if(isElementPresent(radiobtnsecond, 1)){
				click(radiobtnsecond.get(0), "This option requires that you contact the store or make your payments online each month.");
			}
			wait(2);
			click(CASH, "CASH");
			
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			// Accept CASH payment
			//waitForElementPresent(AcceptcashPayment, 60);
			/*if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");
				click(DONE, "DONE");*/
				// Associate pin (5661)
				ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				/*String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");*/
				Enterdata("100000");
				click(DONE, "DONE");
				// Associate pin (5661)
				/*ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");*/
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail( "Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			waitForElementPresent(SETUPAUTOPAY, 60);
			isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");
			wait(3);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("skip Autopay")));						
			sdriver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='skip Autopay']")).click();
			extentLogs.pass("Verify skip Autopay Button",
					"skip Autopay button is Diaplayed");
			wait(6);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_SelectPaymentDateBeforeQuote
	 * @return
	 * @throws
	 */
	public void Verify_SelectPaymentDateBeforeQuote() throws Exception {

		try {
			wait(30);
			// part 4
			// initial Payment with CASH
			if(isElementPresent(Cashbtn, 100)){
			ele = waitForElementPresent(CASH, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			click(ele, "CASH");
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			// Accept CASH payment
			waitForElementPresent(AcceptcashPayment, 60);
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");
				click(DONE, "DONE");
				// Associate pin (5661)
				ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail( "Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			waitForElementPresent(SETUPAUTOPAY, 60);
			isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");
			sdriver.context("NATIVE_APP");
			sdriver.findElement(
					By.xpath("//*[@class='UIAStaticText' and ./parent::*[@text]]"))
					.click();
			extentLogs.pass("Verify skip Autopay Button",
					"skip Autopay button is Diaplayed");
			// isElementPresent(skipAutopay, "skip Autopay");
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			wait(2);
			click(SETUPAUTOPAY, "SET UP AUTOPAY");
			Verify_Joineapaytoday();
			// what account
			Verify_creditcard();
			// submit
			waitForElementPresent(AutoPayinformation, 60);
			isElementPresent(AutoPayinformation,
					"Please review your Auto Pay information");
			click(SUBMIT, "SUBMIT");
			wait(3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Verify_Joineapaytoday() throws Exception {

		try {
			isElementPresent(Joinepayheader, "Join E-Pay today!");
			type(enterusername, getRandomStringsmallletters(6),
					"Enter username");

			click(pwd, "pwd");

			wait(2);
			type(pwd, "Computer12", "Enter Password");

			type(Confirmpwd, "Computer12", "Enter Password");

			wait(2);
			// security question
			type(Securityquestionans, getRandomStringsmallletters(6),
					"Enter Security question");
			//sdriver.closeKeyboard();
			click(Hidekeyboard, "Hide keyboard");
			click(CONTINUE, "CONTINUE");
			wait(10);
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("continueButtonText")));						
			
			//waitForElementPresent(CONTINUEbu, 60);
			click(CONTINUEbu, "CONTINUE");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void Verify_creditcard() throws Exception {
		try {
			
			isElementPresent(whataccount, "What account would you like to use");
			click(CreditDebitCard, "Credit/Debit Card");
			click(SETUPPAYMENT, "SET UP PAYMENT");

			// enter credit card info
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Enter your info");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(CONTINUE, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(Date, "1226", "Enter expiration date");
			click(CONTINUEbu, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(securityCodeField, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}