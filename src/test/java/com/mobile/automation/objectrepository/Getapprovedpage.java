package com.mobile.automation.objectrepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;
import io.appium.java_client.ios.IOSDeviceActionShortcuts;
import io.appium.java_client.ios.IOSDriver;
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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.mobile.automation.accelerators.MobileActionLibrary;
import com.mobile.automation.accelerators.MobileLocator;
import com.web.automation.accelerators.GmailAPI;


public class Getapprovedpage extends MobileActionLibrary {

	public Getapprovedpage(AppiumDriver  appiumDriver) {
		super((AppiumDriver) appiumDriver);
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
	@iOSXCUITFindBy(accessibility = "CONTINUE MY PROGRESS")
	@iOSXCUITFindBy(accessibility = "CONTINUAR MI APLICACIÓN")
	public MobileElement CONTINUEMYPROGRESS;

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
	
	
	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement phonenub;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityIdentifier='mainCTA' and @onScreen='true']")
	public MobileElement continueButton;


	@iOSXCUITFindBy(xpath = "//*[@accessibilityIdentifier='mainCTA' and @onScreen='true']")
	public MobileElement continueButton1;


	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"security_dropdown\"])[1]")
	public MobileElement referenceOne;


	//*[@accessibilityLabel='Teléfono']
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Home")
	@iOSXCUITFindBy(accessibility = "Teléfono")
	public MobileElement Home;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Home")
	@iOSXCUITFindBy(accessibility = "Teléfono")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Teléfono\"])[2]")
	public MobileElement Mobilebtn;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Home")
	@iOSXCUITFindBy(accessibility = "Celular")
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Home' or @accessibilityLabel='Celular']")
	public MobileElement Home1;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Home")
	@iOSXCUITFindBy(accessibility = "Celular")
	@iOSXCUITFindBy(xpath = "(//*[@accessibilityLabel='Home' or @accessibilityLabel='Celular'])[2]")
	public MobileElement Mobile;		

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"security_dropdown\"])[2]")
	public MobileElement referenceTwo;


	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\\\"security_dropdown\\\"])[4]")
	public MobileElement Selectparent;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\\\"security_dropdown\\\"])[5]")
	public MobileElement Selecthome;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Friend")
	@iOSXCUITFindBy(accessibility = "Amigo(a)")	
	public MobileElement Friend;

	//*[@accessibilityLabel='Padre o Suegro(a)']
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "My Parent/In-law")
	@iOSXCUITFindBy(accessibility = "Padre o Suegro(a)")	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='My Parent/In-law' or @accessibilityLabel='Padre o Suegro(a)']")
	public MobileElement Myparent;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Aunt/Uncle")
	@iOSXCUITFindBy(accessibility = "Tía/Tío")		
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Aunt/Uncle'or @accessibilityLabel='Tía/Tío']")
	public MobileElement Aunt;

	@iOSXCUITFindBy(accessibility = "referenceOneAddress")
	public MobileElement referenceOneAddress;


	@iOSXCUITFindBy(accessibility = "referenceTwoAddress")
	public MobileElement referenceTwoAddress;

	@iOSXCUITFindBy(accessibility = "referenceThreeAddress")
	public MobileElement referenceThreeAddress;

	@iOSXCUITFindBy(accessibility = "referenceFourAddress")
	public MobileElement referenceFourAddress;

	//(//*[@accessibilityIdentifier='security_dropdown'])[3]
	//(//XCUIElementTypeStaticText[@name="Select"])[1]
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"security_dropdown\"])[3]")
	public MobileElement referenceThree;

	
	@iOSXCUITFindBy(xpath = " (//XCUIElementTypeImage[@name=\"security_dropdown\"])[4]")
	public MobileElement referencefour;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"security_dropdown\"])[2]")
	public MobileElement referencetwo;

	/*@iOSXCUITFindBy(xpath = "//*[@text='CONTINUE' or @text='CONTINUAR' and @visible='true']")
	public MobileElement Continue;*/
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	@iOSXCUITFindBy(accessibility = "CONTINUAR")
	public MobileElement CONTINUE;
	
	@iOSXCUITFindBy(accessibility = "Continue")
	public MobileElement Continue;
	
	@iOSXCUITFindBy(accessibility = "continueButtonText")
	public MobileElement continueText;
	
	//*[@accessibilityIdentifier='mainCTA' and @onScreen='true']


	@iOSXCUITFindBy(xpath = "//*[@accessibilityIdentifier='mainCTA' and @onScreen='true']")
	public MobileElement Continuedate;

	@iOSXCUITFindBy(xpath = "(//*[@accessibilityIdentifier='mainCTA' and @onScreen='true'])[2]")
	public MobileElement Continueincome;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Relationship'])[1]")
	public MobileElement referenceOneRelationfirst;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Relationship']")
	public MobileElement referenceOneRelationthree;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Relationship'])[1]")
	public MobileElement referenceOneRelationtwo;

	@iOSXCUITFindBy(accessibility = "Friend")
	public MobileElement referenceOneRelationFriend;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Aunt/Uncle']")
	public MobileElement referenceOneRelationAunt;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Cousin")
	@iOSXCUITFindBy(accessibility = "Primo(a)")
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Cousin' or @accessibilityLabel='Primo(a)']")
	public MobileElement Cousin;

	@iOSXCUITFindBy(accessibility = "email")
	public MobileElement email;
	
	@iOSXCUITFindBy(xpath = "//*[@findElementByAccessibilityId='email']")
	public MobileElement emailAddress;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Confirm email address")
	@iOSXCUITFindBy(accessibility = "confirmEmail")
	public MobileElement confirmEmail;

	
	@iOSXCUITFindBy(accessibility = "EXIT")
	public MobileElement EXIT;
	
	@iOSXCUITFindBy(accessibility = "Hidekeyboard")
	public MobileElement Hidekeyboard;
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "AGREE & CONTINUE")	
	@iOSXCUITFindBy(accessibility = "DE ACUERDO Y CONTINUAR")
	public MobileElement AGREECONTINUEbtn;
	
	@iOSXCUITFindBy(accessibility = "Hide keyboard")
	public MobileElement hidekeyboard;
	//
	@iOSXCUITFindBy(accessibility = "continueButtonText")
	public MobileElement continueButtonText;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "continueOnCustomerNamePage")
	@iOSXCUITFindBy(accessibility = "Confirmar el correo")
	public MobileElement continueOnCustomerNamePage;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Confirm email address")
	@iOSXCUITFindBy(accessibility = "Confirmar el correo")
	public MobileElement Confirmemailaddress;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "street1")
	public MobileElement street1;
	
	
	
//	@iOSXCUITFindBy(accessibility = "licenseNumber")
//	public MobileElement licenseNumber;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='apartmentComplexname']")
	public MobileElement apartmentComplexname;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='rentingLandlordName']")
	public MobileElement rentingLandlordName;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='rentingLandLordPhone']")
	public MobileElement rentingLandLordPhone;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Seleccione']")
	public MobileElement Seleccione;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Mensual']")
	public MobileElement Mensual;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='rentingLeaseEndDate']")
	public MobileElement rentingLeaseEndDate;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='rentingMonthlyUtility']")
	public MobileElement rentingMonthlyUtility;
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='rentingCustomerPayment']")
	public MobileElement rentingCustomerPayment;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "ZIP Code")	
	@iOSXCUITFindBy(accessibility = "Código Postal")
	public MobileElement postalCode;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "ownText")
	@iOSXCUITFindBy(accessibility = "Propia")
	public MobileElement Own;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Rent")
	@iOSXCUITFindBy(accessibility = "Alquilada")
	public MobileElement Rent;

	@iOSXCUITFindBy(accessibility = "moveInDate")
	public MobileElement Date;

	@iOSXCUITFindBy(accessibility = "mortgageCompanyName")
	public MobileElement mortgageCompanyName;

	@iOSXCUITFindBy(accessibility = "mortgageCompanyPhone")
	public MobileElement mortgageCompanyPhone;

	@iOSXCUITFindBy(accessibility = "mortgageMonthlyUtility")
	public MobileElement mortgageMonthlyUtility;

	@iOSXCUITFindBy(accessibility = "mortgageCustomerPayment")
	public MobileElement mortgageCustomerPayment;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Address, City, State, and Zip")
	@iOSXCUITFindBy(accessibility = "Dirección, Ciudad, Código Postal")
	public MobileElement AddressCity;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Name")
	@iOSXCUITFindBy(accessibility = "Nombre")
	public MobileElement Name;


	@iOSXCUITFindBy(accessibility = "landLordPhone")
	public MobileElement landLordPhone;

	@iOSXCUITFindBy(accessibility = "make")
	public MobileElement Make;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "model")	
	@iOSXCUITFindBy(accessibility = "Modelo")
	//Modelo
	public MobileElement Model;


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "color")	
	@iOSXCUITFindBy(accessibility = "Modelo")
	public MobileElement Color;

	@iOSXCUITFindBy(accessibility = "licenseNumberPlate")
	public MobileElement licenseNumberPlate;

	//*[@accessibilityLabel='Nombre']

	@iOSXCUITFindBy(accessibility = "coApplicantFirstName")
	public MobileElement FirstName;

	@iOSXCUITFindBy(accessibility = "coApplicantLastName")
	public MobileElement LastName;

	@iOSXCUITFindBy(accessibility = "MM/DD/YYYY")
	public MobileElement Monthdate;

	@iOSXCUITFindBy(accessibility = "###-##-####")
	public MobileElement ssn;

	@iOSXCUITFindBy(accessibility = "avgMonthlyUtility")
	public MobileElement avgMonthlyUtility;

	@iOSXCUITFindBy(accessibility = "contactNumber")
	public MobileElement contactNumberbtn;

	@iOSXCUITFindBy(accessibility = "EDIT")
	public MobileElement EDIT;

	@iOSXCUITFindBy(xpath = "//*[@placeholder='ZIP Code']")
	public MobileElement Zipcodeedit;

	@iOSXCUITFindBy(xpath = "//*[@accessibility='electronicAgreementCheckboxLabel']")
	public MobileElement squarecheckbox;

	@iOSXCUITFindBy(xpath = "//*[@accessibility='electronicAgreementCheckboxLabel']")
	public List<MobileElement> squarecheckboxlist;


	@iOSXCUITFindBy(accessibility = "welcomeNeedsScreenLetsGetStated")
	public MobileElement STARTMYAPPLICATION;

	@iOSXCUITFindBy(accessibility = "welcomeNeedsScreenLetsGetStated")
	public List<MobileElement> Startmyapplicationbtn;

	@iOSXCUITFindBy(accessibility = "City")
	public MobileElement City;

	@iOSXCUITFindBy(accessibility = "ST")
	public MobileElement ST;

	@iOSXCUITFindBy(accessibility = "Please enter a valid zip code")
	public MobileElement plzzipCodetxt;

	@iOSXCUITFindBy(xpath = "//*[@class='VNBlueBodyLabel']")
	public MobileElement errorheader;

	@iOSXCUITFindBy(accessibility = "ssn1")
	public MobileElement ssn1;

	@iOSXCUITFindBy(accessibility = "ssn2")
	public MobileElement ssn2;

	@iOSXCUITFindBy(accessibility = "ssn3")
	public MobileElement ssn3;

	@iOSXCUITFindBy(accessibility = "verifySSN1")
	public MobileElement verifySSN1;

	@iOSXCUITFindBy(accessibility = "verifySSN2")
	public MobileElement verifySSN2;

	@iOSXCUITFindBy(accessibility = "verifySSN3")
	public MobileElement verifySSN3;

	
	@iOSXCUITFindBy(accessibility = "TENGO UN ITIN")
	public MobileElement ITIN;
	
	@iOSXCUITFindBy(accessibility = "itin1")
	public MobileElement itin1;

	@iOSXCUITFindBy(accessibility = "itin2")
	public MobileElement itin2;

	@iOSXCUITFindBy(accessibility = "itin3")
	public MobileElement itin3;

	@iOSXCUITFindBy(accessibility = "verifyItin1")
	public MobileElement verifyItin1;

	@iOSXCUITFindBy(accessibility = "verifyItin2")
	public MobileElement verifyItin2;

	@iOSXCUITFindBy(accessibility = "verifyItin3")
	public MobileElement verifyItin3;
	
	

	@iOSXCUITFindBy(xpath = "//*[starts-with(., 'Your session')]")
	public MobileElement Yoursessiontxt;

	@iOSXCUITFindBy(accessibility = "licenseNumber")
	public MobileElement licenseNumber;
	
	@iOSXCUITFindBy(accessibility = "Licencia de conducir")
	public MobileElement Licence;

	@iOSXCUITFindBy(accessibility = "security_dropdown")
	public MobileElement security_dropdown;
	
	@iOSFindBy(accessibility = "Pasaporte")
	public MobileElement Passport;
	
	@iOSXCUITFindBy(accessibility = "Matrícula")
	public MobileElement matriculation;

	@iOSXCUITFindBy(accessibility = "licenseState")
	public MobileElement licenseState;

	@iOSXCUITFindBy(accessibility = "idTypeDriverLicenseCheckbox")
	public MobileElement idTypeDriverLicenseCheckbox;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='TAKE PHOTO' or @accessibilityLabel='TOMAR FOTO']")
	public MobileElement takePhoto;


	@iOSXCUITFindBy(accessibility = "takePhoto")
	public List<MobileElement> TakePhoto;

	@iOSXCUITFindBy(xpath = "//*[@text='TAKE PHOTO' and ./parent::*[./parent::*[./parent::*[@class='VNTakePhotoButtonCell']]]]")
	public MobileElement takePhoto1;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "TAKE PHOTO")
	@iOSXCUITFindBy(accessibility = "takePhoto")	
	public List<MobileElement> TakePhoto1;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "bestTimeToCallMorning")
	@iOSXCUITFindBy(accessibility = "Mañana (9am-12pm)")
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Morning (9am - 12pm)' or @accessibilityLabel='Mañana (9am-12pm)' ]")
	public MobileElement Morning;

	@iOSXCUITFindBy(accessibility = "dateOfBirth")
	public MobileElement dateOfBirth;

	@iOSXCUITFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement edateOfBirth;

	@iOSXCUITFindBy(accessibility = "bestTimeToCallMorning")
	public MobileElement bestTimeToCallMorning;

	@iOSXCUITFindBy(accessibility = "//*[contains(@text,'HAVE AN ALTERNATE CONTACT NUMBER')]")
	public MobileElement Skipalternativecontactnumber;

	@iOSXCUITFindBy(accessibility = "contactNumberIsMobile")
	public MobileElement contactNumberIsMobile;

	@iOSXCUITFindBy(accessibility = "contactNumber2")
	public MobileElement contactNumber2;


	@iOSXCUITFindBy(xpath = "(//*[@accessibilityLabel='Self Employment'])[2]")
	public MobileElement SelfEmploymentdp;

	@iOSXCUITFindBy(accessibility = "My Job")
	public MobileElement myJobIncome;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='(222) 222-2224' and @class='UITextFieldLabel']")
	public MobileElement ClickRetirement;

	@iOSXCUITFindBy(xpath = "(//*[@class='VNAnimatableDropDownCell'])[1]")
	public MobileElement clickMyjob;

	@iOSXCUITFindBy(accessibility = "Información de Ingresos")
	public MobileElement Infromationtxt;
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Select")
	@iOSXCUITFindBy(accessibility = "Seleccione")
	public MobileElement Select;
	
	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Monthly")
	//@iOSXCUITFindBy(accessibility = "Mensual")
	@iOSXCUITFindBy(accessibility = "Semanal")
	public MobileElement Monthly;

	@iOSXCUITFindBy(accessibility = "pretaxIncome")
	public MobileElement pretaxIncome;

	//*[@accessibilityLabel='Su cargo']

	@iOSXCUITFindBy(accessibility = "companyName")
	public MobileElement companyName;

	@iOSXCUITFindBy(xpath = "bankRoutingNumber")
	public MobileElement bankRoutingNumber;

	@iOSXCUITFindBy(accessibility = "bankRoutingNumber")
	public List<MobileElement>  BankRoutingNumber;

	@iOSXCUITFindBy(accessibility = "bankAccountNumber")
	public MobileElement bankAccountNumber;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Self Employment")
	@iOSXCUITFindBy(accessibility = "Empleado por cuenta propia")
	public MobileElement SelfEmployment;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Social Security']")
	public MobileElement SocialSecurity;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Retirement']")
	public MobileElement Retirement;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Pension']")
	public MobileElement Pension;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Disability']")
	public MobileElement Disability;

	@iOSXCUITFindBy(accessibility = "Less than 6 months")
	public MobileElement lessThan6;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='$']")
	public MobileElement income;

	@iOSXCUITFindBy(xpath = "//*[@placeholder='$']")
	public MobileElement incomeclear;

	@iOSXCUITFindBy(accessibility = "BACK")
	public MobileElement BACK;

	@iOSXCUITFindBy(accessibility = "Please enter an amount greater than $0")
	public MobileElement amountgreaterthan$0;

	@iOSXCUITFindBy(accessibility = "CANCEL")
	public MobileElement CANCEL;

	@iOSXCUITFindBy(accessibility = "Please review your personal information.")
	public List<MobileElement> personalinformation;
	
	@iOSXCUITFindBy(accessibility = "referenceOneFirstName")
	public List<MobileElement> referenceOneFirstname;
	@iOSXCUITFindBy(accessibility = "referenceOneFirstName")
	public MobileElement referenceOneFirstName;

	@iOSXCUITFindBy(accessibility = "referenceOneLastName")
	public MobileElement referenceOneLastName;

	@iOSXCUITFindBy(accessibility = "referenceOneContactNumber")
	public MobileElement referenceOneContactNumber;
	
	@iOSXCUITFindBy(accessibility = "referenceThreeContactNumber")
	public MobileElement referenceThreeContactNumber;
	
	@iOSXCUITFindBy(accessibility = "referenceTwoContactNumber")
	public MobileElement referenceTwoContactNumber;
	
	@iOSXCUITFindBy(accessibility = "referenceOneRelationParent")
	public MobileElement referenceOneRelationParent;

	@iOSXCUITFindBy(accessibility = "referenceTwoFirstName")
	public MobileElement referenceTwoFirstName;

	@iOSXCUITFindBy(accessibility = "referenceTwoRelationFriend")
	public MobileElement referenceTwoRelationFriend;

	@iOSXCUITFindBy(accessibility = "My Grandparent")
	public MobileElement referenceThreeRelationAunt;

	@iOSXCUITFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='confirmationcodeSecondaryemail']]")
	public MobileElement confirmationcodeSecondaryemail;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='ANOW COWORKER OVERRIDE']")
	public MobileElement ANOWCOWORKEROVERRIDE;

	@iOSXCUITFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Empname;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Enter Employee Id']")
	public MobileElement EmpID;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Enter reasons for overriding']")
	public MobileElement Comments;

	@iOSXCUITFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[3]")
	public MobileElement deletevalue;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Friend'])[2]")
	public MobileElement referenceTwoRelationFriendselect;

	@iOSXCUITFindBy(accessibility = "referenceTwoLastName")
	public MobileElement referenceTwoLastName;

	@iOSXCUITFindBy(accessibility = "referenceThreeFirstName")
	public MobileElement referenceThreeFirstName;

	@iOSXCUITFindBy(accessibility = "referenceThreeLastName")
	public MobileElement referenceThreeLastName;

	@iOSXCUITFindBy(accessibility = "referenceThreeRelationParent")
	public MobileElement referenceThreeRelationParent;

	@iOSXCUITFindBy(accessibility = "referenceFourFirstName")
	public MobileElement referenceFourFirstName;

	@iOSXCUITFindBy(accessibility = "referenceFourLastName")
	public MobileElement referenceFourLastName;


	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='referenceFourContactNumber']")
	public MobileElement referenceFourContactNumber;


	@iOSXCUITFindBy(accessibility = "employerName")
	public MobileElement CompanyName;

	@iOSXCUITFindBy(accessibility = "employerPhoneNumber")
	public MobileElement employerPhoneNumber;
	
	
	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel=' ']")
	public MobileElement Company;

	@iOSXCUITFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement CompanyNamechange;

	@iOSXCUITFindBy(accessibility = "codeEntryTextField")
	public MobileElement Codetxt;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='The code entered was incorrect. Please try again.']")
	public MobileElement incorrectmsg;

	@iOSXCUITFindBy(accessibility = "firstName")
	public MobileElement Headeraccount;

	@iOSXCUITFindBy(accessibility = "We are not able to approve your application at this time.")
	public MobileElement headerverifcations;
	
	@iOSXCUITFindBy(xpath = "//*[@class='VNWhiteBodyLabel']")
	public MobileElement heardermsg;

	@iOSXCUITFindBy(accessibility = "Test HeartBeat")
	public MobileElement TestHeartBeat;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[starts-with(@name,’{’)]")
	
	//@iOSXCUITBy(iOSNsPredicate = "label contains '{'")
	public MobileElement TestHeartBeatresponse;


	@iOSXCUITFindBy(accessibility = "createMyOrderButtonText")
	public MobileElement CREATEMYORDER;


	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Your approval expires in 3 days.']")
	public MobileElement expires3days;

	
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "CANCELAR")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	public MobileElement CANCELbtn;


	@iOSXCUITFindBy(accessibility = "OK")
	public MobileElement OK;

	@iOSXCUITFindBy(accessibility = "confirmationcodeSecondaryemail")
	public MobileElement Email;

	@iOSXCUITFindBy(accessibility = "confirmationcodeSecondaryemail")
	public List<MobileElement>  Emailbt;

	@iOSXCUITFindBy(xpath = "(//*[@class='VNHeadline1Label'])[1]")
	public MobileElement Welcomeacn;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='START MY APPLICATION']")
	public MobileElement Startmyapplication;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Help Idle\"])[1]")
	public MobileElement Helpbtn;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Help Idle\"])[2]")
	public MobileElement HelpbtnName;

	@iOSXCUITFindBy(xpath = "//*[@text='YES']")
	public MobileElement YES;

	@iOSXCUITFindBy(xpath = "//*[@class='VNHTMLAlertMessageView']")
	public MobileElement Alertpopup;

	@iOSXCUITFindBy(accessibility = "UPDATE")
	public List<MobileElement> Update;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Outdoors' and @class='UILabel']")
	public MobileElement Outdoors;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Appliances' and @class='UILabel']")
	public MobileElement Appliances;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='Continue Shopping']")
	public MobileElement ContinueShopping;

	@iOSXCUITFindBy(accessibility = "Help Idle")
	public MobileElement Helpbtnyourinfm;

	@iOSXCUITFindBy(accessibility = "contact")
	public MobileElement contactbtn;

	@iOSXCUITFindBy(accessibility = "ESPAÑOL")
	public MobileElement ESPANOLbtn;

	@iOSXCUITFindBy(accessibility = "EXIT")
	public MobileElement EXITbtn;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='EXIT' and ./parent::*[@accessibilityLabel='exitButtonText']]")
	public MobileElement Exitapplicationbtn;

	@iOSXCUITFindBy(xpath = "//*[@nodeName='DIV']")
	public MobileElement helpmsg;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Order']")
	public MobileElement Order;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Estimate']")
	public MobileElement Estimate;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Apply']")
	public MobileElement Apply;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Agreements']")
	public MobileElement Agreements;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Payment']")
	public MobileElement Payment;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='See Associate or call AcceptanceNow 1-866-317-2011']")
	public MobileElement SeeAssociate;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='ESPAÑOL']")
	public MobileElement Espanol;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='EXIT']")
	public MobileElement Exit;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='OK']")
	public MobileElement Okbtn;

	@iOSXCUITFindBy(accessibility = "Enter your associate password.")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(className = "XCUIElementTypeSecureTextField")
	public MobileElement Enteryourassociatepasswordtxt;
	
	
	//@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='Enter your associate login']")
	@iOSXCUITFindBy(className = "XCUIElementTypeSecureTextField")
	public MobileElement Enteryourassociatelogin;

	@iOSXCUITFindBy(accessibility = "Enter your associate login")
	public List<MobileElement> associatelogin;

	@iOSXCUITFindBy(accessibility = "Enter your associate password.")
	public List<MobileElement> associatepassword;

	
	@iOSXCUITFindBy(xpath = "//*[@class='_UITextFieldContentView']")
	public List<MobileElement> Login;
	
	@iOSXCUITFindBy(xpath = "//*[@text='LOGIN']")
	public MobileElement LOGIN;

	@iOSXCUITFindBy(accessibility = "CONFIRM")
	public List<MobileElement> CONFIRMbtn;

	@iOSXCUITFindBy(xpath = "//*[@accessibilityLabel='CONFIRM']")
	public MobileElement CONFIRM;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "SUBMIT")
	@iOSXCUITFindBy(accessibility = "submitButtonText")
	@iOSXCUITFindBy(accessibility = "EMPEZAR")
	public MobileElement SUBMIT;
	
	@iOSXCUITFindBy(accessibility = "submitButtonText")
	public MobileElement SUBMIT1;

	@iOSXCUITFindBy(xpath = "//*[@text and @accessibilityLabel='SUBMIT' and ./parent::*[@accessibilityLabel='SUBMIT']]")
	public MobileElement SUBMITvalue;

	@iOSXCUITFindBy(accessibility = "Enter the services password.")
	public MobileElement Entertheservicespassword;

	////@iOSXCUITFindBy(xpath = "//*[@placeholder='Search']")
	
	@iOSXCUITFindBy(accessibility = "Search")
	public MobileElement Search;

	@iOSXCUITFindBy(iOSNsPredicate = "label contains 'Buscar'")
	public MobileElement Busar;

	@iOSXCUITFindBy(accessibility = "Hide keyboard")
	public MobileElement Hidekey;
	
	@iOSXCUITFindBy(accessibility = "Associate Dashboard")
	public MobileElement AssociateDashboard;

	@iOSXCUITFindBy(accessibility = "Pantalla de resumen")
	public MobileElement Pantalladashboard;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\\\"Kiosk\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
	public MobileElement Servicepwd;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Store Identifier\"]/following-sibling::XCUIElementTypeTextField[1]")
	public MobileElement StoreIdentifier;

	@iOSXCUITFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement enterData;

	//XCUIElementTypeStaticText[@name="Store Identifier"]/following-sibling::XCUIElementTypeTextField[1]
	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldBorderView'])[3]")
	public MobileElement settime;

	@iOSXCUITFindBy(accessibility = "DONE")
	public MobileElement DONE;

	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldLabel'])[2]")
	public MobileElement ServicesUser;

	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldLabel'])[3]")
	public MobileElement Screentimeout;

	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldLabel'])[4]")
	public MobileElement Associatepassword;

	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldLabel'])[5]")
	public MobileElement Servicespassword;

	@iOSXCUITFindBy(xpath = "(//*[@class='UITextFieldLabel'])[6]")
	public MobileElement Environment;

	@iOSXCUITFindBy(accessibility = "LOGOUT")
	public MobileElement LOGOUT;
	@iOSXCUITFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[4]")
	public MobileElement clickSearch;

	@iOSXCUITFindBy(xpath = "(//*[@accessibilityLabel='Agreement Declined'])[1]")
	public MobileElement AgreementDeclined;

	@iOSXCUITFindBy(accessibility = "Pending Delivery Confirmation")
	public MobileElement orderpendingdeliverydate;

	@iOSXCUITFindBy(accessibility = "arrow_closed")
	public MobileElement orderExpand;
	
	@iOSXCUITFindBy(accessibility = "arrow_unverifiend_close")
	public MobileElement orderExpand1;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='edit button'])[1]")
	public MobileElement editorder;

	
	
	@iOSXCUITFindBy(xpath = "//*[@class='VNBlueBodyLabel']")
	public MobileElement Bodyerror;

	@iOSXCUITFindBy(accessibility = "edit_button")
	public MobileElement Editorder;

	@iOSXCUITFindBy(accessibility = "email button")
	public MobileElement Emailbtn;
	
	
	@iOSXCUITFindBy(iOSNsPredicate = "label contains 'Total Approval Amount'")
	//@iOSXCUITFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Total')]")
	public MobileElement Totalamt;

	@iOSXCUITFindBy(iOSNsPredicate = "label contains 'Currently Available'")
	//@iOSXCUITFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Currently')]")
	public MobileElement CurrentlyAvailable;

	@iOSXCUITFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Current on Rent')]")
	public MobileElement CurrentonRent;

	@iOSXCUITFindBy(accessibility = "Email Agreement")
	public MobileElement EmailAgreementtxt;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"squarecheckbox\"])[2]")
	public MobileElement Customer;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"squarecheckbox\"])[1]")
	public MobileElement Agreementnumber;

	@iOSXCUITFindBy(accessibility = "Store")
	public MobileElement Store;

	@iOSXCUITFindBy(accessibility = "sendButtonText")
	public MobileElement SEND;

	@iOSXCUITFindBy(accessibility = "DECLINE")
	public MobileElement DECLINE;

	@iOSXCUITFindBy(accessibility = "Please enter your phone number, including area code. Please enter a valid email address. Please confirm the email address.")
	public MobileElement phonenumbemailerror;

	// docusign
	@iOSXCUITFindBy(xpath = "//span[text()='Adopt Your Signature']")
	public MobileElement AdoptYourSignature;

	@iOSXCUITFindBy(xpath = "//*[@id='action-bar-btn-continue']")
	public MobileElement btn_DS_Continue;

	@iOSXCUITFindBy(xpath = "//*[@id='action-bar-btn-finish-mobile']")
	public MobileElement Startbtn;

	@iOSXCUITFindBy(xpath = "//span[text()='Adopt Your Signature']")
	public MobileElement span_AdoptYourSignature;

	@iOSXCUITFindBy(xpath = "//button[text()='Adopt and Sign']']")
	public MobileElement btn_AdoptAndSign;

	@iOSXCUITFindBy(xpath = "//*[@id='action-bar-btn-finish-mobile']")
	public MobileElement Finish;

	@iOSXCUITFindBy(accessibility = "COTIZACIÓN RÁPIDA")
	public MobileElement Quickquote;


	@iOSXCUITFindBy(className = "XCUIElementTypeTextField")
	public MobileElement entertotalamt;


	@iOSXCUITFindBy(accessibility = "order_pending_deliverydate")
	public MobileElement Pendingdeleverydate;


	@iOSXCUITFindBy(accessibility = "16")
	public MobileElement clickdate;

	@iOSXCUITFindBy(accessibility = "arrow_expanded")
	public MobileElement arrowexpanded;
	
	@iOSXCUITFindBy(accessibility = "dashboard bg")
	public MobileElement selectproduct;
	
	@iOSXCUITFindBy(accessibility = "Electronicos")
	public MobileElement Electronicos;



	@iOSXCUITFindBy(accessibility = "Calcular")
	public MobileElement Calcular;

	@iOSXCUITFindBy(accessibility = "Sea Aprobado")
	public MobileElement SeaAprobado;
	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName get approved
	 * @return
	 * @throws
	 */
	public boolean getapproved() throws Exception {
		try {
			if (isElementPresent(GETAPPROVED, "GET APPROVED")) {

				click(GETAPPROVED, "GET APPROVED");
				type(firstName, genrateRandomUser(), "firstName");
				type(lastName, "Tester", "lastName");
				// type(lastName, testdata.get("EMAIL"), "lastName");
				// enter mobile no
				type(phone, "9789893333", "Phone");
				// click(continueB, "continue Button");
				Thread.sleep(1000);
				type(email, "ravi.munigeri@Rentcenter.com", "email");
				type(confirmEmail, "ravi.munigeri@Rentcenter.com",
						"confirmEmail");
				sdriver.hideKeyboard();
				continueButton();
				Thread.sleep(1000);
				// mailing
				ele = waitForElementPresent(street1, 60, "street Name");
				type(ele, "alexander", "street Name");
				ele = waitForElementPresent(postalCode, 60, "Postal Code");
				clear(ele, "Postal Code");
				// 85282
				type(ele, "85282", "Postal Code");
				wait(1);
				continueButton();
				// enter SSN
				type(ssn1, "789", "SSN");
				type(ssn2, "22", "SSN");
				type(ssn3, "9222", "SSN");
				click(verifySSN1, "SSN");
				type(verifySSN1, "789", "SSN");
				type(verifySSN2, "22", "SSN");
				type(verifySSN3, "9222", "SSN");
				click(Continue, "Continue");
				ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
				type(ele, "513615415", "licenseNumber");
				type(licenseState, "GA", "licenseState");
				click(idTypeDriverLicenseCheckbox, "DriverLicenseCheckbox");
				click(Continue, "continue Button");
				wait(3);
				click(takePhoto, "Take Photo");
				// click(takePhoto, "takePhoto");
				click(Continue, "Continue");
				ele = waitForElementPresent(dateOfBirth, 60, "dateOfBirth");
				click(ele, "dateOfBirth");
				type(edateOfBirth, "08201987", "Enter Date Of Birth ");
				click(Continue, "continue Button");
				Thread.sleep(1000);
				click(bestTimeToCallMorning, "BestTime To CallMorning");
				continueButton();
				type(phone, "9889890700", "Phone");
				click(contactNumberIsMobile, "Contact Number Is Mobile");
				click(contactNumber2, "contactNumber");
				click(Continue, "continue Button");
				// takePhoto
				ele = waitForElementPresent(takePhoto1, 60, "takePhoto1");
				click(ele, "Take Photo");
				click(takePhoto1, "Take Photo");
				ele = waitForElementPresent(Continue, 60, "CONTINUE");
				click(ele, "CONTINUE");
				ele = waitForElementPresent(myJobIncome, 60, "MyJobIncome");
				click(ele, "MyJobIncome");
				continueButton();
				ele = waitForElementPresent(CompanyName, 60, "Current job");
				type(ele, "Nokia", "Current job");
				continueButton();
				type(phone, "9889890701", "Phone");
				click(Continue, "continue Button");
				click(lessThan6, "LessThan6");
				click(Continue, "continue Button");
				// enter income
				type(income, "40000", "Income");
				continueButton();
				// first reference
				type(referenceOneFirstName, genrateRandomUser(),
						"referenceOneFirstName");
				type(referenceOneLastName, "tester", "referenceOneLastName");
				// phone number
				type(phone, "9789893344", "Phone");
				click(referenceOneRelationfirst, "Relationship");
				click(referenceOneRelationFriend,
						"Reference One Relation Friend");
				// first reference

				type(referenceTwoFirstName, genrateRandomUser(),
						"ReferenceTwo FirstName");
				type(referenceTwoLastName, "tester", "ReferenceTwo LastName");

				// phone number
				type(phone, "9889890055", "Phone");
				// related to you
				click(referenceOneRelationtwo, "Relationship");
				click(referenceTwoRelationFriendselect,
						"referenceTwoRelationFriend");
				type(referenceThreeFirstName, genrateRandomUser(),
						"ReferenceThree FirstName");
				type(referenceThreeLastName, "tester",
						"ReferenceThree LastName");
				// phone number
				type(phone, "9339840054", "Phone");
				click(referenceOneRelationthree, "Relationship");
				click(referenceThreeRelationAunt,
						"ReferenceThree Relation Aunt/Uncle");
				continueButton();
				continueButton();
				continueButton();
				continueButton();
				Thread.sleep(3000);
				// click(CREATEMYORDER, "CREATE MY ORDER");

				// Associate Login
				/*
				 * ele = waitForElementPresent(AssociateLogin, 60);
				 * type(AssociateLogin, "u5661xteam", "Associate Login");
				 * click(SUBMIT, "continue Button");
				 */

				ele = waitForElementPresent(CREATEMYORDER, 60,
						"CREATE MY ORDER");

				click(ele, "Create MyOrder Button");

				ele = waitForElementPresent(CREATEMYORDER, 60);

				click(ele, "create MyOrder Button");
				extentLogs.pass("Verify complete Create MyOrder",
						"Completed Create MyOrder");
				return true;
			} else {
				extentLogs.fail("Verify complete Create MyOrder",
						" Create MyOrder Failed");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

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

	

	public boolean Logintodashboard(String EfirstName) throws Exception {
		try {
			if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
				//sdriver.swipe(51, 31, 753, 54, 450);
				wait(1);
				type(Enteryourassociatepassword, "test",
						"Enter your associate password");
				click(SUBMIT, " SUBMIT");
				// enter search
				wait(3);
				isElementPresent(AssociateDashboard, "AssociateDashboard");
				waitForElement(Search, 60, "Search");
				click(Search, "Search");
				waitForElement(Search, 60, "Search");
				type(Search, EfirstName, "Enter name");
				click(clickSearch, "Search");
				isElementPresent(AgreementDeclined, "Agreement Declined");
				extentLogs.pass("Verify Supplement Agreement Decline",
						"Agreement Declined");
				return true;
			} else {
				extentLogs.fail( "Verify Supplement Agreement Decline",
						" Agreement not Declined");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	/**
	 * @author @Cigniti
	 * @parameter Strore number
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboardchangestorenumber(String Strorenumber)
			throws Exception {


		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			wait(2);
			//sdriver.swipe(51, 31, 753, 54, 450);
			MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
		   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
		          Dimension size = remoteelem.getSize();   
		        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
		       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
		                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
		       	   Thread.sleep(100);
		              swipe.perform();
			if(isElementPresent(associatelogin, 2)){
				type(associatelogin.get(0), "testxanow",
						"Enter your associate Login");
				click(SUBMIT, "SUBMIT");
			}else{
				isElementPresent(associatepassword, 2);
				type(Enteryourassociatepassword, "test",
						"Enter your associate password");
				click(SUBMIT, "SUBMIT");
			}
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			wait(2);
			
			// enter search
						wait(10);
						//MobileElement logout=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeButton[@name='LOGOUT']"));
						MobileElement logout=(MobileElement) sdriver.findElementByAccessibilityId("LOGOUT");	
						Dimension size1 = logout.getSize();
				            TouchAction swipe1 = new TouchAction(sdriver).press(ElementOption.element(logout, size1.width / 2, size1.height - 20))
				                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				                    .moveTo(ElementOption.element(logout, size1.width / 2, size1.height / 2 + 50)).release();
				            Thread.sleep(100);
				            swipe1.perform();         
			
			//sdriver.swipe(1942, 68, 2013, 466, 270);
			waitForElement(Servicepwd, 60, "Enter The Services Password");
			type(Servicepwd, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");
			click(StoreIdentifier, "StoreIdentifier");
			wait(2);
			clear(StoreIdentifier, "");
			sdriver.getKeyboard().sendKeys(Strorenumber);

			click(DONE, "DONE");
			wait(10);
			waitForElementPresent(LOGOUT, 60);
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(
					"Verify Login to Dashboard change storenumber",
					" storenumber not Updated");
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter Strore number
	 * @MethodName Verify Set time
	 * @return
	 * @throws
	 */
	public boolean VerifySetTime(String Strorenumber,String time)
			throws Exception {
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			wait(2);
			//sdriver.swipe(51, 31, 753, 54, 450);
			if(isElementPresent(associatelogin, 1)){
				type(Enteryourassociatelogin, "testxanow",
						"Enter your associate Login");
				click(Enteryourassociatelogin, "Enteryourassociatelogin");
				wait(2);
				//clear(StoreIdentifier, "");
				sdriver.getKeyboard().sendKeys("testxanow");


				click(SUBMIT, "SUBMIT");
			}else{
				isElementPresent(associatepassword, 1);
				type(Enteryourassociatepassword, "test",
						"Enter your associate password");
				click(SUBMIT, "SUBMIT");
			}
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			wait(2);
		//	sdriver.swipe(1942, 68, 2013, 466, 270);
			waitForElement(Servicepwd, 60, "Enter The Services Password");
			type(Servicepwd, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");

			click(StoreIdentifier, "StoreIdentifier");
			wait(2);
			clear(StoreIdentifier, "");
			sdriver.getKeyboard().sendKeys(Strorenumber);

			//type(enterData, Strorenumber, "Store Identifier");
			extentLogs.pass("Login as a Store", "Login as a Store<font color='Yellow'> " + Strorenumber+"</font>");
			click(DONE, "DONE");
			wait(10);
			waitForElementPresent(LOGOUT, 60);
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(
					"Verify Login to Dashboard change store number",
					" store number not Updated");
			Assert.fail();
			return false;
		}
	}
	/**
	 * @author @Cigniti
	 * @parameter Strore number
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboardchangestorenumberunmanned(
			String Strorenumber, String associatemannedlogin) throws Exception {
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
		MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
          Dimension size = remoteelem.getSize();   
        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
       	   Thread.sleep(100);
              swipe.perform();
             
              if(isElementPresent(associatelogin, 1)){
  				type(Enteryourassociatelogin, "testxanow",
  						"Enter your associate Login");
  				click(SUBMIT, "SUBMIT");
  			}else{
  				isElementPresent(associatepassword, 1);
  				type(Enteryourassociatepassword, "test",
  						"Enter your associate password");
  				click(SUBMIT, "SUBMIT");
  			}
          
			// enter search
			wait(10);
			//MobileElement logout=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeButton[@name='LOGOUT']"));
			MobileElement logout=(MobileElement) sdriver.findElementByAccessibilityId("LOGOUT");	
			Dimension size1 = logout.getSize();
	            TouchAction swipe1 = new TouchAction(sdriver).press(ElementOption.element(logout, size1.width / 2, size1.height - 20))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(ElementOption.element(logout, size1.width / 2, size1.height / 2 + 50)).release();
	            Thread.sleep(100);
	            swipe1.perform();
	           
	            //type(Entertheservicespassword, "test", "Enter The Services Password");  
			type(Entertheservicespassword, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			//isElementPresent(StoreIdentifier, "Store Identifier");

			click(StoreIdentifier, "StoreIdentifier");
			//wait(2);
			clear(StoreIdentifier, "Clear Store Number");
			type(StoreIdentifier, Strorenumber, "Store Identifier");
			extentLogs.pass("Login as a Store", "Login as a Store<font color='Yellow'> " + Strorenumber+"</font>");
			click(DONE, "DONE");
			new WebDriverWait(sdriver,90).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("LOGOUT")));									
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
	
		} else {
			extentLogs.fail(
					"Verify Login to Dashboard change store number",
					" store number not Updated");
			Assert.fail();
			return false;
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter Strore number
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboardchangestorenumberPR(
			String Strorenumber, String associatemannedlogin) throws Exception {


		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			wait(2);
			//sdriver.swipe(68, 25, 682, 76, 713);

			//sdriver.swipe(51, 31, 753, 54, 450);
			if(isElementPresent(associatelogin, 1)){
				type(Enteryourassociatelogin, "testxanow",
						"Enter your associate Login");
				click(SUBMIT, "SUBMIT");
			}else{
				isElementPresent(Login, 1);
				click(Login.get(0),"Enter your associate password");
				sdriver.getKeyboard().sendKeys("test");
				/*type(Login.get(0), "test",
						"Enter your associate password");*/
				click(SUBMIT, "SUBMIT");
			}
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			wait(2);
			//sdriver.swipe(1942, 68, 2013, 466, 270);
			waitForElement(Servicepwd, 60, "Enter The Services Password");
			type(Servicepwd, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");

			click(StoreIdentifier, "StoreIdentifier");
			wait(2);
			clear(StoreIdentifier, "");
			sdriver.getKeyboard().sendKeys(Strorenumber);

			//type(enterData, Strorenumber, "Store Identifier");
			extentLogs.pass("Login as a Store", "Login as a Store<font color='Yellow'> " + Strorenumber+"</font>");
			click(DONE, "DONE");
			wait(10);
			waitForElementPresent(LOGOUT, 60);
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(
					"Verify Login to Dashboard change store number",
					" store number not Updated");
			Assert.fail();
			return false;
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter Strore number,AssociateMannedlogin
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboardchangestorenumber(String Strorenumber,
			String AssociateMannedlogin) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			//sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			if(isElementPresent(associatelogin, 2)){
				type(Enteryourassociatelogin, "testxanow",
						"Enter your associate Login");
				click(SUBMIT, "SUBMIT");
			}else{
				isElementPresent(associatepassword, 2);
				type(Enteryourassociatepassword, "test",
						"Enter your associate password");
				click(SUBMIT, "SUBMIT");
			}
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			//sdriver.swipe(1942, 68, 2013, 466, 270);

			waitForElement(Firstnametxt, 60, "Enter The Services Password");
			type(Firstnametxt, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");
			wait(2);
			click(StoreIdentifier, "StoreIdentifier");
			wait(2);
			clear(StoreIdentifier, "");
			sdriver.getKeyboard().sendKeys(Strorenumber);

			click(DONE, "DONE");
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(
					"Verify Login to Dashboard change storenumber",
					" storenumber not Updated");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify Login to dash board
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboard(String EfirstName) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			//sdriver.swipe(51, 31, 753, 54, 450);
				MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
		   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
		          Dimension size = remoteelem.getSize();   
		        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
		       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
		                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
		       	   Thread.sleep(100);
		              swipe.perform();
		             
		              if(isElementPresent(associatelogin, 1)){
		  				type(Enteryourassociatelogin, "testxanow",
		  						"Enter your associate Login");
		  				click(SUBMIT, "SUBMIT");
		  			}else{
		  				isElementPresent(associatepassword, 1);
		  				type(Enteryourassociatepassword, "test",
		  						"Enter your associate password");
		  				click(SUBMIT, "SUBMIT");
		  			}
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");		
			click(Hidekey, "Hide keyboard");
			/*isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");*/
			wait(2);
			click(orderExpand, "order Expand");
			wait(2);
			
			click(editorder, "Edit order");	
			wait(2);
			extentLogs.pass("Verify Login to dashboard",
					"Login to Dashboard Succesfully");
			return true;
		} else {
			extentLogs.fail( "Verify Login to dashboard",
					" Login to Dashboard Failed");
			return false;
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify Login to dash board
	 * @return
	 * @throws
	 */
	public boolean VerifyLogintodashboard_PR(String EfirstName) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			//sdriver.swipe(51, 31, 753, 54, 450);
				MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
		   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
		          Dimension size = remoteelem.getSize();   
		        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
		       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
		                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
		       	   Thread.sleep(100);
		              swipe.perform();
		             
		              type(Enteryourassociatepasswordtxt, "test",
		  					"Enter your associate password");
		  		
		  				click(SUBMIT, "SUBMIT");
		              /*if(isElementPresent(associatelogin, 1)){
		  				type(Enteryourassociatelogin, "testxanow",
		  						"Enter your associate Login");
		  				click(SUBMIT, "SUBMIT");
		  			}else{
		  				isElementPresent(associatepassword, 1);
		  				type(Enteryourassociatepassword, "test",
		  						"Enter your associate password");
		  				click(SUBMIT, "SUBMIT");
		  			}*/
			// enter search
			wait(3);
			isElementPresent(Pantalladashboard, "AssociateDashboard");
			//waitForElement(Busar, 60, "Search");
			click(Busar, "Search");
			//waitForElement(Busar, 60, "Search");
			type(Busar, EfirstName, "Enter name");		
			click(Hidekey, "Hide keyboard");
			/*isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");*/
			wait(4);
			click(orderExpand1, "order Expand");
			wait(2);
			
			//click(editorder, "Edit order");
			
			wait(2);
			extentLogs.pass("Verify Login to dashboard",
					"Login to Dashboard Succesfully");
			return true;
		} else {
			extentLogs.fail( "Verify Login to dashboard",
					" Login to Dashboard Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Agreement
	 * @return
	 * @throws
	 */
	public boolean Verify_DashBoard_Agreement(String EfirstName)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
	   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
	          Dimension size = remoteelem.getSize();   
	        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
	       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
	                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
	       	   Thread.sleep(100);
	              swipe.perform();
	             
	              if(isElementPresent(associatelogin, 1)){
	  				type(Enteryourassociatelogin, "testxanow",
	  						"Enter your associate Login");
	  				click(SUBMIT, "SUBMIT");
	  			}else{
	  				isElementPresent(associatepassword, 1);
	  				type(Enteryourassociatepassword, "test",
	  						"Enter your associate password");
	  				click(SUBMIT, "SUBMIT");
	  			}
	          
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			//waitForElement(Search, 60, "Search");
			click(Search, "Search");
			//waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			//click(clickSearch, "Search");
			isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");
			click(orderExpand, "order Expand");
			click(Emailbtn, "Email");
			isElementPresent(EmailAgreementtxt, "Email Agreement");			
			click(Agreementnumber, "Agreement number");
			click(Customer, "Customer");
			click(SEND, "SEND");
			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Application
	 * @return
	 * @throws
	 */
	public boolean Verify_DashBoard_Application(String EfirstName)
			throws Exception {
	if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
				MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
		   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
		          Dimension size = remoteelem.getSize();   
		        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
		       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
		                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
		       	   Thread.sleep(100);
		              swipe.perform();
		             
		              if(isElementPresent(associatelogin, 1)){
		  				type(Enteryourassociatelogin, "testxanow",
		  						"Enter your associate Login");
		  				click(SUBMIT, "SUBMIT");
		  			}else{
		  				isElementPresent(associatepassword, 1);
		  				type(Enteryourassociatepassword, "test",
		  						"Enter your associate password");
		  				click(SUBMIT, "SUBMIT");
		  			}
		
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			// sdriver.findElement(By.xpath("//*[@class='UISearchBarTextFieldLabel']")).sendKeys("Rantffdohnnqit");

			waitForElement(Search, 60, "Search");
			//click(Search, "Search");
			//waitForElement(Search, 60, "Search");
			
			//sdriver.getKeyboard().sendKeys(EfirstName);
			type(Search, EfirstName, "Enter name");
			//click(clickSearch, "Search");
			wait(2);
			click(orderExpand, "order Expand");
			wait(2);
			System.out.println(sdriver.getPageSource());
			String Totalamount = getText(Totalamt, "Total Approval Amount");

			if ((Totalamount != null)) {
				extentLogs.pass("Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);

			} else {
				extentLogs.fail( "Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);
			}

			String CurrentlyAvailablebal = getText(CurrentlyAvailable,
					"Currently Available");

			if ((CurrentlyAvailablebal != null)) {
				extentLogs.pass("Verify Currently Available",
						"Currently Available :" + CurrentlyAvailablebal);

			} else {
				extentLogs.fail( "Verify Currently Available",
						"Currently Available:" + CurrentlyAvailablebal);
			}

			/*String CurrentonRentvalue = getText(CurrentonRent,
					"Current on Rent");

			if ((CurrentonRentvalue != null)) {
				extentLogs.pass("Verify Current on Rent", "Current on Rent :"
						+ CurrentonRentvalue);

			} else {
				extentLogs.fail( "Verify Current on Rent",
						"Current on Rent:" + CurrentonRentvalue);
			}*/

			click(LOGOUT, "Logout");
			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Application Click on Order
	 * @return
	 * @throws
	 */
	public boolean Verify_DashBoard_ApplicationClickonOrder(String EfirstName)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
		   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
		          Dimension size = remoteelem.getSize();   
		        //	XCUIElementTypeCell[@name='Help Idle']/following-sibling:: XCUIElementTypeTextField
		       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
		                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
		       	   Thread.sleep(100);
		              swipe.perform();
		             
		              if(isElementPresent(associatelogin, 1)){
		  				type(Enteryourassociatelogin, "testxanow",
		  						"Enter your associate Login");
		  				click(SUBMIT, "SUBMIT");
		  			}else{
		  				isElementPresent(associatepassword, 1);
		  				type(Enteryourassociatepassword, "test",
		  						"Enter your associate password");
		  				click(SUBMIT, "SUBMIT");
		  			}
		
			// enter search
		              waitForElement(Search, 60, "Search");
		  			//click(Search, "Search");
		  			//waitForElement(Search, 60, "Search");
		  			
		  			//sdriver.getKeyboard().sendKeys(EfirstName);
		  			type(Search, EfirstName, "Enter name");
		  			//click(clickSearch, "Search");
		  			wait(2);
		  			click(orderExpand, "order Expand");

			wait(2);
			//System.out.println(sdriver.getPageSource());
			//click(Hidekeyboard, "Close keyboard");
			//
			//isElementPresent(editorder, "Edit order");
			click(editorder, "Edit order");
			wait(2);
			//click(DECLINE, "DECLINE");
			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click Get approved
	 * @return
	 * @throws
	 */
	public boolean clickGetapproved() throws Exception {
			
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			click(GETAPPROVED, "GET APPROVED");
			return true;
		} else {
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click Get approved
	 * @return
	 * @throws
	 */
	public boolean clickQuickquote() throws Exception {

		if (isElementPresent(Quickquote, "Quick Quote")) {
			click(Quickquote, "Quick Quote");
			type(entertotalamt, "3000", "Enter Merchandise Total");
			click(Pendingdeleverydate, "Pending deleverydate");
			//date			
			click(clickdate, "Date");
			click(arrowexpanded, "selectproduct");
			click(Electronicos, "Electronicos");
			click(Calcular, "Calcular");
			wait(5);
			waitforelementpresent(SeaAprobado);
			click(SeaAprobado, "Sea Aprobado");
			return true;
		} else {
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click Get approved
	 * @return
	 * @throws
	 */
	public boolean clickGetapprovedSpanish() throws Exception {

		if (isElementPresent(GETAPPROVED, "SEA APROBADO")) {
			click(GETAPPROVED, "SEA APROBADO");
			sdriver.findElement(By.xpath("(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[10]")).click();
			sdriver.findElement(By.xpath("//*[@text='ENGLISH']")).click();

			return true;
		} else {
			return false;
		}
	}
	/**
	 * @author @Cigniti
	 * @parameter 
	 *            EfirstName,LastName,primaryPhno,ssnnumber1,ssnnumber2,ssnnumber3
	 * @MethodName click on Continue my Progress
	 * @return
	 * @throws
	 */
	public boolean clickonContinuemyProgress(String EfirstName,
			String LastName, String primaryPhno, String ssnnumber1,
			String ssnnumber2, String ssnnumber3) throws Exception {
		wait(2);
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			click(CONTINUEMYPROGRESS, "Continue my Progress");
			wait(2);
			isElementPresent(Firstname,
					"Enter your information to continue your progress");
			type(Firstname, EfirstName, "firstName");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phonenub, primaryPhno, "Phone");

			click(continueText, "CONTINUE");
			waitForElementPresent(ssn1, 60);
			isElementPresent(ssn1,
					"Enter your Social Security number to continue.");
			// enter SSN
			waitForElementPresent(ssn1, 60);
//			type(ssn1, ssnnumber1, "SSN");
//			type(ssn2, ssnnumber2, "SSN");
//			type(ssn3, ssnnumber3, "SSN");
			
		//	waitForElementPresent(Continue, 60);
			click(Continue, "Continue");
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter 
	 *            EfirstName,LastName,primaryPhno,ssnnumber1,ssnnumber2,ssnnumber3
	 * @MethodName click on Continue my Progress
	 * @return
	 * @throws
	 */
	public boolean clickonContinuemyProgress(String EfirstName,
			String LastName, String primaryPhno,String num) throws Exception {
		wait(10);
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			click(CONTINUEMYPROGRESS, "Continue my Progress");
			wait(2);
			isElementPresent(Firstname,
					"Enter your information to continue your progress");
			type(Firstname, EfirstName, "firstName");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phonenub, primaryPhno, "Phone");

			click(continueText, "CONTINUE");
			waitForElementPresent(ssn1, 60);
			isElementPresent(ssn1,
					"Enter your Social Security number to continue.");
			// enter SSN
			waitForElementPresent(ssn1, 60);
//			type(ssn1, ssnnumber1, "SSN");
//			type(ssn2, ssnnumber2, "SSN");
//			type(ssn3, ssnnumber3, "SSN");
			Enterdata(num);
			waitForElementPresent(Continue, 60);
			click(Continue, "Continue");
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify Let the session timeout
	 * @return
	 * @throws
	 */
	public void VerifyLetthesessiontimeout() throws Exception {

		waitForElement(Yoursessiontxt, 60, "wait for the session time out");		
		extentLogs
		.pass("Verify message Let the session time out.",
				"Application session time out.");
		System.out.println("");
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click CREATE MY ORDER
	 * @return
	 * @throws
	 */
	public boolean clickCREATEMYORDER() throws Exception {

		if (isElementPresent(Welcomeacn, "Welcome to AcceptanceNOW!")) {
			click(CREATEMYORDER, "Create MyOrder Button");
			return true;
		} else {
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click CREATE MY ORDER
	 * @return
	 * @throws
	 */
	public boolean Verifyyourapprovalexpires() throws Exception {

		if (isElementPresent(Welcomeacn, "Congratulations ")) {

			isElementPresent(expires3days, "Your approval expires in 3 days.");
			String helpmessage = getText(expires3days, "Your approval expires in 3 days.");
			System.out.println(helpmessage);

			if(helpmessage!=null){
				wait(2);
				click(CREATEMYORDER, "Create MyOrder Button");
				extentLogs
				.pass("Verify On Your approval expires in 3 days.",
						"Application should display the following message:"
								+ helpmessage);
				return true;
			} else {
				extentLogs
				.fail(
						"Verify Your approval expires in 3 days.",
						" Application not displayed  message");
				return false;					
			}
		}
		return true;




	}
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName click Start my appication
	 * @return
	 * @throws
	 */
	public boolean clickStartmyappication() throws Exception {

		if (isElementPresent(Startmyapplication, "START MY APPLICATION")) {
			click(Startmyapplication, "START MY APPLICATION");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Bank account information
	 * @return
	 * @throws
	 */
	public boolean Bankaccountinformation() throws Exception {
		//System.out.println(sdriver.getPageSource());
		if (isElementPresent(BankRoutingNumber, 2)) {
			wait(5);
			//sdriver.get
			click(BankRoutingNumber.get(0), "BankRoutingNumber");
			type(bankRoutingNumber, "123456878", "bank Routing Number");
			type(bankAccountNumber, "12345687811", "bank Account Number");
			continueButton();
			click(SUBMIT, "SUBMIT");
			click(CONFIRM, "CONFIRM");



			if(isElementPresent(associatelogin, 2)){
				type(Enteryourassociatelogin, "test",
						"Enter your associate Login");
				click(SUBMITvalue, "SUBMIT");
			}
			if(isElementPresent(associatepassword, 2)){
				type(Enteryourassociatepassword, "test",
						"Enter your associate password");
				click(SUBMITvalue, "SUBMIT");
			}
			wait(5);
			if(isElementPresent(Emailbt, 1)){
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				Thread.sleep(30000);
				waitForElementPresent(CompanyNamechange, 60);
				GmailAPI ga = new GmailAPI();
				String code = ga.verificationCode();
				wait(6);
				System.out.println("gmail:" + code);
				type(Codetxt, code, "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
			}

			/*ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");*/
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName clickOnhelpbtn
	 * @return
	 * @throws
	 */
	public boolean clickOnhelpbtn() throws Exception {

		if (isElementPresent(Helpbtn, "")) {
			click(Helpbtn, "tap icon i alongside What's your name?");
			sdriver.context("WEB");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.xpath("//*[@nodeName='DIV']")).getText();
			System.out.println(helpmessage);
			wait(2);
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(Okbtn, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside What's your name?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(
					"Verify On What's your name page, tap icon i alongside What's your name?",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName clickOnhelpbtnYourinformation
	 * @return
	 * @throws
	 */
	public boolean clickOnhelpbtnYourinformation() throws Exception {

		if (isElementPresent(Helpbtnyourinfm, "On What's your name page")) {
			click(Helpbtn, " tap icon i alongside Is my information safe?");
			//sdriver.context("WEB");
			wait(2);
			//System.out.println(sdriver.getPageSource());
			String helpmessage = sdriver.findElement(By.className("XCUIElementTypeWebView")).getText();
			System.out.println(helpmessage);
			wait(2);
			//sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(OK, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside Is my information safe?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(
					"Verify On What's your name page, tap icon i alongside Is my information safe?",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify button all pages
	 * @return
	 * @throws
	 */
	public boolean Verifybuttonallpages() throws Exception {

		if (isElementPresent(contactbtn, "? Contact button on page")) {
			isElementPresent(ESPANOLbtn, "ESPANOL button on page");
			isElementPresent(EXITbtn, "? EXIT button on page");

			extentLogs.pass("Verify On page buttons ? ,Espanol,EXIT ",
					"Application should displayed ? ,Espanol,EXIT Buttons");
			return true;
		} else {
			extentLogs.fail( "Verify On page buttons ? ,Espanol,EXIT",
					"Application should not displayed ? ,Espanol,EXIT Buttons");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify buttons all pages
	 * @return
	 * @throws
	 */
	public boolean Verifybuttonsallpages() throws Exception {

		if (isElementPresent(contactbtn, "? Contact button on page")) {
			isElementPresent(ESPANOLbtn, "ESPANOL button on page");
			isElementPresent(EXITbtn, "? EXIT button on page");
			isElementPresent(BACK, "? BACK button on page");
			extentLogs.pass("Verify On page buttons ? ,Espanol,EXIT ",
					"Application should displayed ? ,Espanol,EXIT Buttons");
			return true;
		} else {
			extentLogs.fail( "Verify On page buttons ? ,Espanol,EXIT",
					"Application should not displayed ? ,Espanol,EXIT Buttons");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify fields
	 * @return
	 * @throws
	 */
	public boolean Verifyfields() throws Exception {

		if (isElementPresent(HelpbtnName, "Help btn Name")) {
			click(HelpbtnName, " tap icon i alongside What's your name?");
			//sdriver.context("WEB");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.className("XCUIElementTypeWebView")).getText();
			System.out.println(helpmessage);
			wait(2);
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(OK, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside What's your name?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(
					"Verify On What's your name page, tap icon i alongside What's your name?",
					" Application not displayed  message");
			return false;
		}
	}

	public String  Enterdata(String value) throws WebDriverException, Exception{
		//System.out.println("Value="+value);
		//System.out.println("Length:"+value.length());
		waitForElementPresent((MobileElement) sdriver.findElementByAccessibilityId("numberButton1"), 200);
		char[] chars4 = value.toCharArray();
		//long millis1 = System.currentTimeMillis();
		for (int i = 0, n = chars4.length; i < n; i++) {
			sdriver.findElementByAccessibilityId("numberButton"+chars4[i]).click();
		}
		//long millis2 = System.currentTimeMillis();
		//System.out.println(millis2 -millis1);
		return value;
	}	


	/**
	 * @author @Cigniti
	 * @parameter EfirstName, LastName, primaryPhno, Email, cnfEmail
	 * @MethodName YourInformation
	 * @return
	 * @throws
	 */
	public boolean YourInformation(String EfirstName, String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {
		if (isElementPresent(Headeraccount, "Your Information")) {
			//String msg=getText(Headeraccount, "");
			type(firstName, EfirstName, "firstName");
			System.out.println(EfirstName);
			type(lastName, LastName, "lastName");
			
			type(contactNumber, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, Email, "Confirm Email Address");
			click(Hidekey, "Hide keyboard");			
			click(continueOnCustomerNamePage, "continue Button");
			//continueButton();
			wait(20);
			

			MobileElement pdf = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeScrollView");

			Dimension size2 = pdf.getSize();
	            TouchAction swipe12= new TouchAction(sdriver).press(ElementOption.element(pdf, size2.width / 2, size2.height - 20))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(ElementOption.element(pdf, size2.width / 2, size2.height / 2 + 50)).release();
	            Thread.sleep(100);
	            swipe12.perform();
			
	            MobileElement pdf1 = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeScrollView");

				Dimension size3 = pdf1.getSize();
		            TouchAction swipe13= new TouchAction(sdriver).press(ElementOption.element(pdf1, size3.width / 2, size3.height - 20))
		                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                    .moveTo(ElementOption.element(pdf, size3.width / 2, size3.height / 2 + 50)).release();
		            Thread.sleep(100);
		            swipe13.perform();   
	            
			click(AGREECONTINUEbtn, "AGREE CONTINUE");
			//click(EXIT, "Hide keyboard");
			/*MobileElement el1 = (MobileElement) sdriver.findElementByAccessibilityId("electronicAgreementCheckboxLabel");
			el1.click();
			click(EXIT, "Hide keyboard");*/
			//click(squarecheckbox, "Agree checkbox");
			//continueButton();
			
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			
			return true;
		} else {
			extentLogs.fail( "Verify Your Information",
					" Your Information Failed");
			Assert.fail();
			return false;

		}
	}


	/**
	 * @author @Cigniti
	 * @parameter EfirstName, LastName, primaryPhno, Email, cnfEmail
	 * @MethodName YourInformation
	 * @return
	 * @throws
	 */
	public boolean VerifyYourInformation(String EfirstName, String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {
		if (isElementPresent(Headeraccount, "Your Information")) {
			//String msg=getText(Headeraccount, "");
			type(firstName, EfirstName, "firstName");
			System.out.println(EfirstName);
			type(lastName, LastName, "lastName");
			
			type(contactNumber, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, Email, "Confirm Email Address");
			click(EXIT, "Hide keyboard");
			//continueButton();
			click(continueOnCustomerNamePage, "continueButton");
			wait(3);
			

			/*MobileElement pdf = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeScrollView");

			Dimension size2 = pdf.getSize();
	            TouchAction swipe12= new TouchAction(sdriver).press(ElementOption.element(pdf, size2.width / 2, size2.height - 20))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                    .moveTo(ElementOption.element(pdf, size2.width / 2, size2.height / 2 + 50)).release();
	            Thread.sleep(100);
	            swipe12.perform();
			
			click(AGREECONTINUEbtn, "AGREE CONTINUE");*/
			//click(EXIT, "Hide keyboard");
			/*MobileElement el1 = (MobileElement) sdriver.findElementByAccessibilityId("electronicAgreementCheckboxLabel");
			el1.click();
			click(EXIT, "Hide keyboard");*/
			//click(squarecheckbox, "Agree checkbox");
			//continueButton();
			
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			
			return true;
		} else {
			extentLogs.fail( "Verify Your Information",
					" Your Information Failed");
			Assert.fail();
			return false;

		}
	}

	
	
	/**
	 * @author @Cigniti
	 * @parameter EfirstName, LastName, primaryPhno, Email, cnfEmail
	 * @MethodName YourInformation
	 * @return
	 * @throws
	 */
	public boolean YourInformation_Spanishpr(String EfirstName, String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			click(first, "first");
			type(first, EfirstName, "firstName");
			type(last, LastName, "lastName");
			// enter mobile no
			type(contactNumber, primaryPhno, "Phone");
			type(emailAddress, Email, "Email Address");
			type(Confirmemailaddress, Email, "Confirm Email Address");
			sdriver.hideKeyboard();
			continueButton();
			wait(4);
			if (isElementPresent(squarecheckboxlist,10)) {
				sdriver.hideKeyboard();
				waitforelementpresent(squarecheckbox) ;
				waitForElement(squarecheckbox, 100, "checkbox");
				click(squarecheckbox, "Agree checkbox");
				wait(1);
				sdriver.hideKeyboard();
				wait(1);
				//continueButton();
				sdriver.findElement(By.xpath("(//*[@accessibilityLabel='CONTINUE'])[2]")).click();
			}
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail( "Verify Your Information",
					" Your Information Failed");
			Assert.fail();
			return false;

		}
	}


	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName HeartBeat
	 * @return
	 * @throws
	 */
	public boolean HeartBeat() throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			MobileElement remoteelem=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeImage[@name='BGGradient.jpg']/following-sibling:: XCUIElementTypeButton"));
	   	 //  MobileElement slider = driver.findElementByAccessibilityId(remoteelem);
	          Dimension size = remoteelem.getSize();   
	         
	       	   TouchAction swipe = new TouchAction(sdriver).press(ElementOption.element(remoteelem, size.width / 2, size.height - 20))
	                      .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	                      .moveTo(ElementOption.element(remoteelem, size.width / 2, size.height / 2 + 50)).release();
	       	   Thread.sleep(100);
	              swipe.perform();
	             
	              if(isElementPresent(associatelogin, 1)){
	  				type(Enteryourassociatelogin, "testxanow",
	  						"Enter your associate Login");
	  				click(SUBMIT, "SUBMIT");
	  			}else{
	  				isElementPresent(associatepassword, 1);
	  				type(Enteryourassociatepassword, "test",
	  						"Enter your associate password");
	  				click(SUBMIT, "SUBMIT");
	  			}
	          
				// enter search
				wait(10);
				MobileElement logout=(MobileElement) sdriver.findElement(By.xpath("//XCUIElementTypeButton[@name='LOGOUT']"));
		        Dimension size1 = logout.getSize();
		            TouchAction swipe1 = new TouchAction(sdriver).press(ElementOption.element(logout, size1.width / 2, size1.height - 20))
		                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		                    .moveTo(ElementOption.element(logout, size1.width / 2, size1.height / 2 + 50)).release();
		            Thread.sleep(100);
		            swipe1.perform();
		           
				type(Entertheservicespassword, "test", "Enter The Services Password");
				click(SUBMIT, "SUBMIT");

			wait(10);
			//isElementPresent(StoreIdentifier, "Store Identifier");
			isElementPresent(TestHeartBeat, "Test HeartBeat");
			click(TestHeartBeat, "Test HeartBeat");
			//XCUIElementTypeStaticText[starts-with(@name,’{’)]
			//XCUIElementTypeStaticText[@name=\"Test HeartBeat\"]/following-sibling::XCUIElementTypeStaticText[1]
			//isElementPresent(TestHeartBeatresponse, "Test Heart Beat response");
			/*List<MobileElement> els1 = (List<MobileElement>) sdriver.findElementsByClassName("XCUIElementTypeStaticText");
			for (MobileElement x:els1)
	        {
	            System.out.println(x);
	        }
	 
			System.out.println(els1.get(6));*/
//			List<MobileElement> els2 = (List<MobileElement>) sdriver.findElementsByIosNsPredicate("label contains 'longitude'");
//			for (MobileElement x:els2)
//	        {
//	            System.out.println(x);
//	        }
			//String validemailactmsg = getText(TestHeartBeatresponse,"HeartBeat response should appear on the right of the button with below values,");
		//	extentLogs.pass("Verify HeartBeat response", "HeartBeat response:"+ validemailactmsg);
			return true;
		} else {
			extentLogs.fail( "Verify HeartBeat response",
					" Your HeartBeat response Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName, LastName, primaryPhno, Email,
	 *            cnfEmail,InvalideEmail
	 * @MethodName YourInformation
	 * @return
	 * @throws
	 */
	public boolean VerifyEmailverification(String EfirstName, String LastName,
			String primaryPhno, String Email, String cnfEmail, String iEmail)
					throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			type(firstName, EfirstName, "firstName");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phone, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, iEmail, "Confirm Email Address");
			sdriver.hideKeyboard();
			continueButton();

			String validemailactmsg = getText(errorheader,
					"Please confirm the email address.");
			if (validemailactmsg
					.equalsIgnoreCase("Please confirm the email address.")) {
				extentLogs.pass("Verify Customer Email Error message",
						"Error message showed error Message:"
								+ validemailactmsg);
			} else {
				extentLogs.fail(
						"Verify Customer Zip Code cannot be 00000 - Kiosk",
						"User should  allowed Zip Code error Message:"
								+ validemailactmsg);
			}
			type(confirmEmail, cnfEmail, "Confirm Email Address");
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail( "Verify Your Information",
					" Your Information Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Please select a product
	 * @return
	 * @throws
	 */
	public boolean Pleaseselectaproduct() throws Exception {
		wait(3);
		if (isElementPresent(Headeraccount, "Please select a Product")) {
			click(Outdoors, "Outdoors");
			click(Appliances, "Appliances");
			click(ContinueShopping, "Continue Shopping");
			extentLogs.pass("Verify Please select a Product",
					"Completed  selected a Products");
			return true;
		} else {
			extentLogs.fail( "Verify Please select a Product",
					" Products  selection Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter LastName, primaryPhno, Email, cnfEmail
	 * @MethodName YourInformationValidations
	 * @return
	 * @throws
	 */
	public boolean YourInformationValidations(String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {

		if (isElementPresent(firstName, "Your Information")) {
			String EfirstName = getRandomString(25);
			type(firstName, EfirstName,
					" Employer name field should allow maximum 25 alpha numeric characters");
			type(lastName, LastName, "lastName");
			type(contactNumber, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, Email, "Confirm Email Address");
			click(EXIT, "Hide keyboard");
			continueButton();
			wait(15);
			click(EXIT, "Hide keyboard");
			MobileElement el1 = (MobileElement) sdriver.findElementByAccessibilityId("electronicAgreementCheckboxLabel");
			el1.click();
			click(EXIT, "Hide keyboard");
			//click(squarecheckbox, "Agree checkbox");
			continueButton();
				extentLogs.pass("Verify Your Information",
						"Completed Your Information");
				return true;
			} else {
				extentLogs.fail( "Verify Your Information",
						" Your Information Failed");
				Assert.fail();
				return false;

			}
			
			
			}

	/**
	 * @author @Cigniti
	 * @parameter LastName, primaryPhno, Email, cnfEmail
	 * @MethodName Verify Your Information
	 * @return
	 * @throws
	 */
	public boolean VerifyYourInformation(String LastName, String primaryPhno,
			String Email, String cnfEmail) throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			type(firstName, genrateRandomUser(), "firstName");
			type(lastName, LastName, "lastName");
			sdriver.hideKeyboard();
			continueButton();

			String phoneandemailmsg = getText(Bodyerror,
					"'Please enter your phone number, including area code");
			if (phoneandemailmsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phoneandemailmsg);
			} else {
				extentLogs
				.fail(
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}

			type(email, Email, "Email Address");
			type(confirmEmail, cnfEmail, "Confirm Email Address");
			sdriver.hideKeyboard();
			continueButton();
			//
			String phonemsg = getText(Bodyerror,
					"'Please enter your phone number, including area code");
			if (phonemsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phonemsg);
			} else {
				extentLogs
				.fail(
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}

			type(phone, primaryPhno, "Phone");
			sdriver.hideKeyboard();
			continueButton();

			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail( "Verify Your Information",
					" Your Information Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName mailing address
	 * @return
	 * @throws
	 */
	public boolean mailingaddress(String addrLine1, String zipCode)
			throws Exception {

	if (isElementPresent(Startmyapplicationbtn,1)) {
			click(STARTMYAPPLICATION, "START MY APPLICATION");
		}
		waitForElementPresent(street1, 60);
		if (isElementPresent(street1, "What is your mailing address?")) {
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, addrLine1, "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, zipCode, "Postal Code");
			continueButtoninHome();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify mailing address",
					"Mailing address? Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName mailing address
	 * @return
	 * @throws
	 */
	public boolean mailingaddressforspanish(String addrLine1, String zipCode)
			throws Exception {

		if (isElementPresent(Startmyapplicationbtn,1)) {

			click(STARTMYAPPLICATION, "START MY APPLICATION");
		}
		waitForElementPresent(street1, 60);
		if (isElementPresent(street1, "What is your mailing address?")) {
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, addrLine1, "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, zipCode, "Postal Code");
			wait(2);
			//System.out.println(sdriver.getPageSource());
			click(Own, "Own");
			type(Date, "01/2018", "Date");
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify mailing address",
					"Mailing address? Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName mailing address
	 * @return
	 * @throws
	 */
	public boolean MortgageInformation()
			throws Exception {
		if (isElementPresent(mortgageCompanyName, "Mortgage Information")) {
			// mailing
			type(mortgageCompanyName, "Cigniti", "mortgageCompanyName");
			type(mortgageCompanyPhone, "8888888888", "mortgageCompanyPhone");
			type(mortgageMonthlyUtility, "5000", "mortgageMonthlyUtility");
			type(mortgageCustomerPayment, "4555665454", "mortgageCustomerPayment");
			continueButton();		  
			extentLogs.pass("Verify Mortgage Information",
					"Completed Mortgage Information Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Mortgage Information",
					"Mortgage Information Failed");
			Assert.fail();
			return false;
		}
	}



	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName mailing address
	 * @return
	 * @throws
	 */
	public boolean PreviousAddressInformastion()throws Exception {
		//System.out.println(sdriver.getPageSource());
		
//		if (isElementPresent(AddressCity, "Previous Address Informastion")) {
//			// mailing
//			type(AddressCity, "8888 AIRLINE HIGHWAY", "Address, City, State, and Zip");
//			type(Name, "South east", "Name");
//			type(landLordPhone, "2525252525", "landLordPhone");
//			continueButton();		  
//			extentLogs.pass("Verify PreviousAddressInformastion",
//					"Completed Previous Address Informastion Successfully");
			return true;
//		} else {
//			extentLogs.fail( "Verify Previous Address Informastion",
//					"Previous Address Informastion Failed");
//			Assert.fail();
//			return false;
//		}
	}

	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName VehicleInformation
	 * @return
	 * @throws
	 */
	public boolean VehicleInformation()
			throws Exception {
		if (isElementPresent(Make, "Vehicle Information")) {
			// mailing
			type(Make, "India", "Make");
			//System.out.println(sdriver.getPageSource());
			type(Model, "God", "Model");
			type(Color, "Black", "Color");
			type(licenseNumberPlate, "Sample", "licenseNumberPlate");
			type(avgMonthlyUtility, "44848444", "avgMonthlyUtility");		  
			//click(continueButton, "continue");
			continueButton();
			extentLogs.pass("Verify Vehicle Information",
					"Completed Vehicle Information Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Vehicle Information",
					"Vehicle Information Failed");
			Assert.fail();
			return false;
		}
	}




	/**
	 * @author @Cigniti
	 * @parameter addrLine1, zipCode
	 * @MethodName verify mailing address error
	 * @return
	 * @throws
	 */
	public boolean verifymailingaddresserror(String addrLine1, String zipCode)
			throws Exception {
		waitForElementPresent(street1, 60);
		if (isElementPresent(Headeraccount, "What is your mailing address?")) {
			continueButton();
			String phonemsg = getText(
					Bodyerror,
					"'Please enter your address. Please enter your 5 digit ZIP code Please enter your city. Please enter the two letter abbreviation for your state.");
			if (phonemsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phonemsg);
			} else {
				extentLogs
				.fail(
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, addrLine1, "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, zipCode, "Postal Code");
			wait(1);
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify mailing address",
					"Mailing address? Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify Tap Edit and modify the address of the Customer
	 * @return
	 * @throws
	 */
	public boolean VerifyTapEditandmodifytheaddressoftheCustomer(String zipCode)
			throws Exception {
		//System.out.println(sdriver.getPageSource());
		//continueButton();
		if (isElementPresent(postalCode, "Alert pop up")) {
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, zipCode, "Postal Code");
			continueButtoninHome();
			wait(4);
		//	continueButtoninHome();
			//state id
			wait(2);
			click(Continue, "continue Button");	
			// Date
			wait(5);
			continueButtoninHome();
			// Take Photo 
			/*wait(5);
			ele = waitForElementPresent(takePhoto, 60, "takePhoto");
			click(takePhoto, "takePhoto Button");
			wait(5);*/
			//date of birth
			ele = waitForElementPresent(continueText, 60, "continueText");
			
			click(continueText, "continue Button");
			//Alternate contact
			ele = waitForElementPresent(continueText, 60, "continueText");
			click(continueText, "continue Button");

			/*ele = waitForElementPresent(CONTINUE, 60, "CONTINUE");			
			click(ele, "CONTINUE Button");
			wait(5);
			continueButtoninHome();
			
			// alternate contact
			wait(5);
			continueButtoninHome();
			
			// Take Photo 
						//wait(5);
						ele = waitForElementPresent(takePhoto, 60, "takePhoto");
				
						click(takePhoto, "takePhoto Button");
						//wait(5);
						ele = waitForElementPresent(CONTINUE, 60, "CONTINUE");
						click(CONTINUE, "CONTINUE Button");
						wait(5);
						continueButtoninHome();
						wait(2);*/
			// Income
						//exit
			sdriver.hideKeyboard();			
			wait(2);
			continueButton();
			
			// alternate contact
			
			// refrences
			sdriver.hideKeyboard();
			continueButton();			
			//
			wait(5);
			System.out.println(sdriver.getPageSource());
			ele = waitForElementPresent(SUBMIT1, 60, "SUBMIT");	
			click(ele, "SUBMIT");
			wait(5);
			//	click(CONFIRM, "CONFIRM");


			extentLogs.pass("Verify On Prompt the message",
					"Application should display the following message:");
			return true;
		} else {
			extentLogs.fail( "Verify On Prompt the message",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify Tap Edit and modify the address of the Customer address
	 * @return
	 * @throws
	 */
	public boolean VerifyTapEditandmodifytheaddressoftheCustomeraddress()
			throws Exception {
		wait(10);

		if (isElementPresent(Update,3)) {
			/*isElementPresent(Alertpopup, "Alert pop up");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.xpath("//*[@class='UIWebBrowserView']")).getText();
			wait(5);*/
			
			click(Update.get(0),  "Update");
			wait(2);
			extentLogs.pass("Verify On Prompt the message",
					"Application should display the following message:"
							);
			return true;
		} else {
			extentLogs.fail( "Verify On Prompt the message",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter ssnnumber1, ssnnumber2, ssnnumber3, verifySsn1, verifySsn2,
	 *            verifySsn3
	 * @MethodName Social Security number
	 * @return
	 * @throws
	 */
	public boolean SocialSecuritynumber(String ssnnumber1, String ssnnumber2,
			String ssnnumber3, String verifySsn1, String verifySsn2,
			String verifySsn3) throws Exception {
		waitForElementPresent(ssn1, 60);
		//System.out.println(sdriver.getPageSource());
		if (isElementPresent(ssn1,
				"What is your Social Security number?")) {
			// enter SSN
		String nub=	getRandomnumbers(9);
		System.out.println(nub);
		//type(ssn1, ssnnumber1, "SSN");
		wait(2);
			Enterdata(nub);
			click(verifySSN1,  "SSN");
			wait(2);
			Enterdata(nub);

//			click(Continue,  "Continue");
//			type(ssn1, ssnnumber1, "SSN");
//			type(ssn2, ssnnumber2, "SSN");
//			type(ssn3, ssnnumber3, "SSN");
//			click(verifySSN1, "SSN");
//			type(verifySSN1, verifySsn1, "SSN");
//			type(verifySSN2, verifySsn2, "SSN");
//			type(verifySSN3, verifySsn3, "SSN");	
			click(Continue, "Continue");
			extentLogs.pass("Verify Social Security number",
					"Completed Social Security number Successfully :" +nub);
			return true;
		} else {
			extentLogs.fail( "Verify Social Security number",
					"Social Security number Failed");
			Assert.fail();
			return false;
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter ssnnumber1, ssnnumber2, ssnnumber3, verifySsn1, verifySsn2,
	 *            verifySsn3
	 * @MethodName Social Security number
	 * @return
	 * @throws
	 */
	public String SocialSecuritynumber() throws Exception {
		waitForElementPresent(ssn1, 60);
		//System.out.println(sdriver.getPageSource());
		if (isElementPresent(ssn1,
				"What is your Social Security number?")) {
			// enter SSN
		String nub=	getRandomnumbers(9);
		System.out.println(nub);
		//type(ssn1, ssnnumber1, "SSN");
			Enterdata(nub);
			click(verifySSN1,  "SSN");
			Enterdata(nub);

//			click(Continue,  "Continue");
//			type(ssn1, ssnnumber1, "SSN");
//			type(ssn2, ssnnumber2, "SSN");
//			type(ssn3, ssnnumber3, "SSN");
//			click(verifySSN1, "SSN");
//			type(verifySSN1, verifySsn1, "SSN");
//			type(verifySSN2, verifySsn2, "SSN");
//			type(verifySSN3, verifySsn3, "SSN");	
			click(Continue, "Continue");
			extentLogs.pass("Verify Social Security number",
					"Completed Social Security number Successfully"+nub);
			return nub;
		} else {
			extentLogs.fail( "Verify Social Security number",
					"Social Security number Failed");
			Assert.fail();
			
		}
		return null;
	}
	
	/**
	 * @author @Cigniti
	 * @parameter ssnnumber1, ssnnumber2, ssnnumber3, verifySsn1, verifySsn2,
	 *            verifySsn3
	 * @MethodName Social Security number
	 * @return
	 * @throws
	 */
	public boolean ITIN(String ssnnumber1, String ssnnumber2,
			String ssnnumber3, String verifySsn1, String verifySsn2,
			String verifySsn3) throws Exception {
		waitForElementPresent(ssn1, 60);
		click(ITIN, "ITIN");
		if (isElementPresent(itin1,
				"What is your ITIN ?")) {
			// enter SSN
			Enterdata(ssnnumber1);
			Enterdata(ssnnumber2);
			Enterdata(ssnnumber3);
			/*type(itin1, ssnnumber1, "SSN");
			type(itin2, ssnnumber2, "SSN");
			type(itin3, ssnnumber3, "SSN");*/
			click(verifyItin1, "SSN");
			Enterdata(verifySsn1);
			Enterdata(verifySsn2);
			Enterdata(verifySsn3);
			/*type(verifyItin1, verifySsn1, "SSN");
			type(verifyItin2, verifySsn2, "SSN");
			type(verifyItin3, verifySsn3, "SSN");*/
			click(Continue, "Continue");
			extentLogs.pass("Verify ITIN",
					"Completed ITIN Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify ITIN",
					"ITIN Failed");
			Assert.fail();
			return false;
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter ssnnumber1, ssnnumber2, ssnnumber3, verifySsn1, verifySsn2,
	 *            verifySsn3
	 * @MethodName SocialSecuritynumber
	 * @return
	 * @throws
	 */
	public boolean SocialSecuritynumberenter(String num) throws Exception {
		//waitForElementPresent(ssn1, 60);
		
		if (isElementPresent(ssn1,
				"What is your Social Security number?")) {
			// enter SSN
			/*type(ssn1, ssnnumber1, "SSN");
			type(ssn2, ssnnumber2, "SSN");
			type(ssn3, ssnnumber3, "SSN");*/
			Enterdata(num);
			click(Continue, "Continue");
			extentLogs.pass("Verify Social Security number",
					"Completed Social Security number Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Social Security number",
					"Social Security number Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter ssnnumber1, ssnnumber2, ssnnumber3, verifySsn1, verifySsn2,
	 *            verifySsn3
	 * @MethodName SocialSecuritynumberValidations
	 * @return
	 * @throws
	 */
	public boolean SocialSecuritynumberValidations(String Inssn,
			String ssnnumber2, String ssnnumber3, String verifySsn1,
			String verifySsn2, String verifySsn3, String ssnnumber1)
					throws Exception {
		waitForElementPresent(ssn1, 60);
		if (isElementPresent(Headeraccount,
				"What is your Social Security number")) {
			// enter SSN
			type(ssn1, Inssn, "SSN");
			type(ssn2, ssnnumber2, "SSN");
			type(ssn3, ssnnumber3, "SSN");
			click(verifySSN1, "SSN");
			type(verifySSN1, Inssn, "SSN");
			type(verifySSN2, verifySsn2, "SSN");
			type(verifySSN3, verifySsn3, "SSN");
			click(Continue, "Continue");
			String actvalue = getText(Headererrorvalue, "");
			if ((actvalue != null)) {
				extentLogs.pass("Verify Social Security number",
						"must begin with 0 - 8.  SSN should NOT allow number beginning with 9 :"
								+ actvalue);

			} else {
				extentLogs.fail( "Verify Social Security number",
						"SSN should allow number beginning with 9");
			}
			// click(BACK, "BACK");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			clear(ssn1, "SSN");
			type(ssn1, ssnnumber1, "SSN");
			click(verifySSN1, "Verify ssn");

			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			type(verifySSN1, ssnnumber1, "SSN");

			click(Continue, "Continue");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter drivingLicense, idState
	 * @MethodName StateIDnumber
	 * @return
	 * @throws
	 */
	public boolean StateIDnumber(String drivingLicense, String idState)
			throws Exception {
		waitForElementPresent(licenseNumber, 60);
		if (isElementPresent(licenseNumber, "What’s your state ID number?  ")) {
			ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
			type(ele, drivingLicense, "licenseNumber");
			type(licenseState, idState, "licenseState");
			click(continueText, "continue Button");
			wait(3);
			extentLogs.pass("Verify state ID number",
					"Completed Driver's License number Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify state ID number",
					"State ID number Failed");
			Assert.fail();
			return false;		
		}
	}
	
	
	

	
	/**
	 * @author @Cigniti
	 * @parameter Matriculation
	 * @MethodName matriculation
	 * @return
	 * @throws
	 */
	public boolean matriculation(String Matriculation)
			throws Exception {
		waitForElementPresent(licenseNumber, 60);
		if (isElementPresent(licenseNumber, "What’s your state ID number?  ")) {
			//ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
			click(security_dropdown, "license Number Button");
			wait(10);
			click(matriculation, "matriculation Number Button");
			wait(5);
			type(licenseNumber, Matriculation, "licenseNumber");
			wait(5);
			click(continueText, "continue Button");
			wait(3);
			extentLogs.pass("Verify matriculation",
					"Completed matriculation Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify matriculation number",
					"Matriculation Failed");
			Assert.fail();
			return false;		
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter passport
	 * @MethodName Passport
	 * @return
	 * @throws
	 */
	public boolean Passport(String passport)
			throws Exception {
		waitForElementPresent(licenseNumber, 60);
		if (isElementPresent(licenseNumber, "What’s your state ID number?  ")) {
			//ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
			click(Licence, "license Number Button");
			click(Passport, "Passport Number Button");
			type(ele, passport, "licenseNumber");			
			click(continueText, "continue Button");
			wait(3);
			extentLogs.pass("Verify Passport",
					"Completed Passport Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Passport number",
					"Passport Failed");
			Assert.fail();
			return false;		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter dateofbirth, SPhone
	 * @MethodName Takephoto
	 * @return
	 * @throws
	 */
	public boolean Takephoto(String dateofbirth, String SPhone)
			throws Exception {
		if(isElementPresent(TakePhoto, 1)){
			click(TakePhoto.get(0), "Take Photo");
			//System.out.println(sdriver.getPageSource());
			
			click(CONTINUE, "Continue");
			wait(2);
		}
		wait(2);
		if (isElementPresent(dateOfBirth, "Date Of Birth")){
			//ele = waitForElementPresent(dateOfBirth, 60, "dateOfBirth");
			click(dateOfBirth, "dateOfBirth");
			wait(2);
			Enterdata(dateofbirth);
			//type(dateOfBirth, dateofbirth, "Enter Date Of Birth ");
			click(continueText, "continue Button");

			//
			/*
			 * click(bestTimeToCallMorning, "BestTime To CallMorning");
			 * continueButton();
			 */
			wait(2);
			Enterdata(SPhone);
			//type(phone, SPhone, "Phone");
			click(contactNumberIsMobile, "Contact Number Is Mobile");
			click(contactNumber2, "contactNumber");
			click(continueText, "continue Button");

			// takePhoto
			if(isElementPresent(TakePhoto, 1)){
				ele = waitForElementPresent(TakePhoto.get(0), 60, "takePhoto1");
				click(ele, "Take Photo");
				click(ele, "Take Photo");
				ele = waitForElementPresent(CONTINUE, 60, "CONTINUE");
				click(ele, "CONTINUE");
			}
			// extentLogs.pass("Verify state ID number",
			// "Completed Driver's License number Successfully");

			return true;
		} else {
			// extentLogs.fail("Verify state ID number",
			// "State ID number Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter dateofbirth, SPhone
	 * @MethodName Takephoto
	 * @return
	 * @throws
	 */
	public boolean UnmanedTakephoto(String dateofbirth, String SPhone)
			throws Exception {

		if (isElementPresent(takePhoto, "Take Photo ")) {
			click(takePhoto, "Take Photo");
			// click(takePhoto, "takePhoto");
			click(Continue, "Continue");
			ele = waitForElementPresent(dateOfBirth, 60, "dateOfBirth");
			click(ele, "dateOfBirth");
			type(dateOfBirth, dateofbirth, "Enter Date Of Birth ");
			click(Continue, "continue Button");
			type(phone, SPhone, "Phone");
			click(contactNumberIsMobile, "Contact Number Is Mobile");
			click(contactNumber2, "contactNumber");
			click(Continue, "continue Button");
			// takePhoto
			ele = waitForElementPresent(takePhoto1, 60, "takePhoto1");
			click(ele, "Take Photo");
			click(takePhoto1, "Take Photo");
			ele = waitForElementPresent(Continue, 60, "CONTINUE");
			click(ele, "CONTINUE");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter dateofbirth, SPhone
	 * @MethodName Takephoto
	 * @return
	 * @throws
	 */
	public boolean Whenisthebesttimetocall()
			throws Exception {

		if (isElementPresent(Morning, "When is the best time to call?")) {

			click(Morning, "Morning");		
			continueButton();
			// takePhoto
			if(isElementPresent(TakePhoto1, 1)){
				ele = waitForElementPresent(TakePhoto1.get(0), 60, "takePhoto1");
				click(ele, "Take Photo");
				click(TakePhoto1.get(0), "Take Photo");
				ele = waitForElementPresent(CONTINUE, 60, "CONTINUE");
				click(ele, "CONTINUE");
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName changedworkingcompany
	 * @return
	 * @throws
	 */
	public boolean changedworkingcompany(String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber)
					throws Exception {

		if (isElementPresent(myJobIncome, "MyJobIncome")) {
			ele = waitForElementPresent(myJobIncome, 60, "MyJobIncome");
			click(ele, "MyJobIncome");
			continueButton();
			ele = waitForElementPresent(CompanyName, 60, "Current job");
			type(ele, CurrentEmployer, "Current job");
			continueButton();
			type(phone, EmployerPhoneNumber, "Phone");
			click(Continue, "continue Button");
			click(lessThan6, "LessThan6");
			click(Continue, "continue Button");
			// enter income
			type(income, MonthlyTakeHomeIncome, "Income");
			continueButton();
			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName workingcompany
	 * @return
	 * @throws
	 */
	public boolean workingcompany(String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber)
					throws Exception {
		wait(2);
		if (isElementPresent(continueText, "Income Information")) {
			wait(2);
			sdriver.findElementByAccessibilityId("Select").click();;
			//sdriver.findElement(By.id("Select")).sendKeys("My Job");
//		MobileElement el4 = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeButton");
//			el4.click();  
			/*ele = waitForElementPresent(Select, 60, "Select Income");
			click(ele, "Select Income");*/
			wait(2);
			click(myJobIncome, "MyJobIncome");
			type(CompanyName, CurrentEmployer, "Current job");
			//Enterdata(EmployerPhoneNumber);
			type(employerPhoneNumber, EmployerPhoneNumber, "Phone");
			//sdriver.hideKeyboard();
			/* MobileElement el2 = (MobileElement) sdriver.findElementByAccessibilityId("Select");
			    el2.click();*/
			   /* MobileElement el = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeButton");
				el.click();*/
			click(Select, "Select Income");
			wait(2);
			click(lessThan6, "LessThan6");
			wait(2);
			//click(pretaxIncome, "pre tax Income");
			//Enterdata("9000000");
			type(pretaxIncome, "5000", "Pre tax Income");
			click(EXIT, "Hide keyboard");
			// type(income, MonthlyTakeHomeIncome, "Income");
			
			wait(2);
			click(continueText, "continue");
			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName workingcompany
	 * @return
	 * @throws
	 */
	public boolean workingcompanyforPrstore(String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber)
					throws Exception {
		//System.out.println(sdriver.getPageSource());
		if (isElementPresent(Infromationtxt, "Income Information")) {
			/*MobileElement el2 = (MobileElement) sdriver.findElementByAccessibilityId("Seleccione");
			el2.click();*/
			
			MobileElement el4 = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeButton");
			el4.click();
			//click(Select, "Select Income");
			wait(2);
			click(SelfEmployment, "Self Employment");

			/*sdriver.closeKeyboard();
			wait(2);
			click(BACK,"Back");*/


			//other
			/*if(isElementPresent(TakePhoto, 1)){
				click(takePhoto, "Take Photo");
				click(takePhoto, "Take Photo");
				click(Continue, "Continue");
				wait(2);
			}*/
			/*type(CompanyName, CurrentEmployer, "Current job");
			type(phone, EmployerPhoneNumber, "Phone");
			sdriver.closeKeyboard();
			click(Select, "Select Income");
			wait(2);
			click(lessThan6, "LessThan6");
			sdriver.findElement(
					By.xpath("//*[@accessibilityLabel='pretaxIncome']"))
					.click();
			click(pretaxIncome, "pre tax Income");
			type(pretaxIncome, "5000", "Pre tax Income");
			sdriver.sendKeys("5000");

			// type(income, MonthlyTakeHomeIncome, "Income");
			sdriver.closeKeyboard();
			wait(2);
			click(Continue, "continue");*/
			//My job
			//Monthly income
			wait(2);
			type(pretaxIncome, EmployerPhoneNumber, "Current job");	
			MobileElement el5 = (MobileElement) sdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[8]/XCUIElementTypeOther/XCUIElementTypeButton");
			el5.click();
		//	click(Select, "Select Income");
			wait(2);
			click(Monthly, "Monthly");
			type(companyName, "Cigniti", "companyName");
			//sdriver.hideKeyboard();
			wait(2);
			continueButton();
			extentLogs.pass("Verify Self  Employement ",
					"Completed Self Employement Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Self Employement",
					"Self Employement Failed");
			Assert.fail();
			return false;
		}

	}


	
	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName CoapplicantInformation
	 * @return
	 * @throws
	 */
	public boolean CoapplicantInformation(String efirstname,String cossn, String cocontact)
			throws Exception {

		if (isElementPresent(FirstName, "Co applicant Information")) {
			type(FirstName, efirstname, "First Name");
			type(LastName, "tester", "Last Name");
			type(Monthdate, "11121984", "Last Name");	
			type(ssn, cossn, "ssn");
			type(contactNumber, cocontact, "Coapplicant contactNumber");	
			//sdriver.closeKeyboard();
			click(hidekeyboard, "continue");
			continueButton();
			extentLogs.pass("Verify Co applicant Information",
					"Completed Co applicant Information Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Co applicant Information",
					"Co applicant Information Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName CoapplicantInformation
	 * @return
	 * @throws
	 */
	public boolean CoapplicantInformation(String efirstname)
			throws Exception {

		if (isElementPresent(Header, "Co applicant Information")) {
			type(FirstName, efirstname, "First Name");
			type(LastName, "tester", "Last Name");
			type(Monthdate, "11121984", "Last Name");	
			type(ssn, "456657896", "ssn");
			type(contactNumber, "7889945612", "7889945612");
			sdriver.hideKeyboard();
			click(Continue, "continue");
			extentLogs.pass("Verify Co applicant Information",
					"Completed Co applicant Information Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Co applicant Information",
					"Co applicant Information Failed");
			Assert.fail();
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName CoapplicantInformation
	 * @return
	 * @throws
	 */
	public boolean CoapplicantIncomeInformation()
			throws Exception {

		if (isElementPresent(NOTAPPLICABLE, "Co applicant Income Information")) {

			click(NOTAPPLICABLE, "NOT APPLICABLE");
			extentLogs.pass("Verify Co applicant Information",
					"Completed Co applicant Information Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Co applicant Information",
					"Co applicant Information Failed");
			Assert.fail();
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter CurrentEmployer, MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName Verify_Monthly_Take_Home_Income_cannot_be_0
	 * @return
	 * @throws
	 */
	public boolean Verify_Monthly_Take_Home_Income_cannot_be_0(
			String CurrentEmployer, String MonthlyTakeHomeIncome,
			String EmployerPhoneNumber) throws Exception {

		if (isElementPresent(continueText, "Income Information")) {
			 MobileElement el1 = (MobileElement) sdriver.findElementByAccessibilityId("Select");
			    el1.click();
//			ele = waitForElementPresent(Select, 60, "Select Income");
//			click(ele, "Select Income");
			wait(2);
			click(myJobIncome, "MyJobIncome");
			type(CompanyName, CurrentEmployer, "Current job");
			//Enterdata(EmployerPhoneNumber);
			type(employerPhoneNumber, EmployerPhoneNumber, "Phone");
			//sdriver.hideKeyboard();
			 MobileElement el2 = (MobileElement) sdriver.findElementByAccessibilityId("Select");
			    el2.click();
		//	click(Select, "Select Income");
			wait(2);
			click(lessThan6, "LessThan6");
			wait(1);
			type(pretaxIncome, "0", "Pre tax Income");
			click(EXIT, "Hide keyboard");
			wait(2);
			click(continueText, "continue");
			
			// Verification
			String amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display: "
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}

			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName cancelbtn
	 * @return
	 * @throws
	 */
	public void cancelbtn() throws Exception {
		if (isElementPresent(CANCEL, "Cancel Button")) {
			click(CANCEL, "CANCEL Button");
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Exitbtn
	 * @return
	 * @throws
	 */
	public void Exitbtn() throws Exception {
		if (isElementPresent(EXIT, "EXIT Button")) {
			click(EXIT, "EXIT Button");
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean Createmyorder(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {
		try {
			wait(5);
			Bankaccountinformation();
			if (isElementPresent(referenceOneFirstName,
					"References")) {
				References(ref1FirstName, ref1LastName, ref1Number,
						ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
						ref3LastName, ref3Number);
				wait(3);
				if(isElementPresent(CONFIRMbtn, 2)){
					click(CONFIRM, "CONFIRM");
				}
				ele = waitForElementPresent(CREATEMYORDER, 60,
						"CREATE MY ORDER");
				click(ele, "Create MyOrder Button");
				extentLogs.pass("Verify complete Create MyOrder",
						"Completed Create MyOrder");
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}


	
	
	public boolean References(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {
		try {
			if (isElementPresent(referenceOneFirstName,
					"Reference One First Name")) {

				// first reference
				type(referenceOneFirstName, ref1FirstName,
						"Reference One First Name");
				//click(referenceOneLastName, "reference One Last Name");
				type(referenceOneLastName, ref1LastName,
						"Reference One Last Name");
				// phone number
				type(referenceOneContactNumber, ref1Number, "Reference One ContactNumber");
				click(referenceOneRelationfirst, "Relationship");
				click(referenceOneRelationFriend,
						"Reference One Relation Friend");
				// first reference

				type(referenceTwoFirstName, ref2FirstName,
						"ReferenceTwo FirstName");
				type(referenceTwoLastName, ref2LastName,
						"ReferenceTwo LastName");

				// phone number
				type(referenceTwoContactNumber, ref2Number, "referenceTwoContactNumber");
				// related to you
				wait(1);
				click(referenceOneRelationtwo, "Relationship");
				wait(1);
				MobileElement el = (MobileElement) sdriver.findElementByAccessibilityId("Aunt/Uncle");
			    el.click();
			    wait(2);
				/*click(referenceTwoRelationFriendselect,
						"referenceTwoRelationAunt");*/
				type(referenceThreeFirstName, ref3FirstName,
						"ReferenceThree FirstName");
				type(referenceThreeLastName, ref3LastName,
						"ReferenceThree LastName");
				// phone number
				type(referenceThreeContactNumber, ref3Number, "Reference ThreeContactNumber");
				click(referenceOneRelationthree, "Relationship");
				wait(2);
				 MobileElement el2 = (MobileElement) sdriver.findElementByAccessibilityId("My Grandparent");
			    el2.click();
				//click(referenceThreeRelationAunt,"ReferenceThree Relation My Grandparent");
				wait(2);
				continueButtoninHome();
				// continueButton();
				wait(2);
				/*new WebDriverWait(sdriver,30).until(ExpectedConditions.
		                elementToBeClickable(MobileBy.AccessibilityId("SUBMIT"))).click();*/
				//System.out.println(sdriver.getPageSource());
				click(SUBMIT1, "SUBMIT");

				extentLogs.pass("Verify complete Three References",
						"Completed Three References");
				return true;
			} else {
				extentLogs.fail( "Verify complete Three References",
						" Three References Failed");
				return false;	
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}
	
	
	
	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean withoutCreatemyorder(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {
		try {
			if (isElementPresent(referenceOneFirstName,
					"References")) {
				References(ref1FirstName, ref1LastName, ref1Number,
						ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
						ref3LastName, ref3Number);
				if(isElementPresent(CONFIRMbtn, 2)){
					click(CONFIRM, "CONFIRM");
				}
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}


	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean Createmyorder(String ref1FirstName,
			String ref1LastName, String ref1Number, String ref2FirstName,
			String ref2LastName, String ref2Number, String ref3FirstName,
			String ref3LastName, String ref3Number, String associatemannedlogin)
					throws Exception {
		try {
			wait(2);
			//commented
			Bankaccountinformation();
			if (isElementPresent(personalinformation,1)) {
		
					click(SUBMIT1, "SUBMIT");
				}
			
			
			if (isElementPresent(referenceOneFirstname,1)) {
				wait(10);
				References(ref1FirstName, ref1LastName, ref1Number,
						ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
						ref3LastName, ref3Number);
				if(isElementPresent(CONFIRMbtn, 1)){
					click(CONFIRM, "CONFIRM");
				}
			}
				wait(5);
				//System.out.println(sdriver.getPageSource());
				if(isElementPresent(associatelogin, 2)){
					//click(Enteryourassociatelogin, "Enteryourassociatelogin");
					//sdriver.getKeyboard().sendKeys(associatemannedlogin);
					type(Enteryourassociatelogin, associatemannedlogin,
	  						"Enter your associate Login");
					//type(Enteryourassociatelogin, associatemannedlogin,"Enter your associate Login");
		 			click(SUBMIT, "SUBMIT");
				}
				if(isElementPresent(associatepassword, 3)){
					type(Enteryourassociatepassword, "test",
							"Enter your associate password");
					click(SUBMIT, "SUBMIT");
				}
				wait(1);
				if(isElementPresent(BankRoutingNumber, 1)) {
					isElementPresent(bankRoutingNumber,"Bank Account Information");	
					Enterdata("123456780");
					//type(bankRoutingNumber, "123456780", "Enter Bank Routing number");
				Enterdata("1235432");
				click(CONTINUE, "CONTINUE");
			
				// submit
			}
				if(isElementPresent(Emailbt, 1)){
					waitForElementPresent(Email, 60);
					click(Email, "Email");
					click(Continue, "continueButton");
					//continueButton();
					Thread.sleep(5000);
					//waitForElementPresent(CompanyNamechange, 60);
					GmailAPI ga = new GmailAPI();
					String code = ga.verificationCode();
					wait(1);
					System.out.println("gmail:" + code);
					wait(1);
					Enterdata(code);
					//type(Codetxt, code, "Please enter the code to continue");
					wait(4);
					continueButton();
				}
				wait(2);
				//System.out.println(sdriver.getPageSource());
				if (isElementPresent(CREATEMYORDER,"CREATEMYORDER")) {
					
				ele = waitForElementPresent(CREATEMYORDER, 100,
						"CREATE MY ORDER");
				click(ele, "Create MyOrder Button");

				extentLogs.pass("Verify complete Create MyOrder",
						"Completed Create MyOrder");
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				Assert.fail();
				return false;
			}
		} catch (Exception e) {
			//sdriver.getPageSource();
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}



	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean CreatemyorderforPRstore(String ref1FirstName,
			String ref1LastName, String ref1Number, String ref2FirstName,
			String ref2LastName, String ref2Number, String ref3FirstName,
			String ref3LastName, String ref3Number,String ref4FirstName,
			String ref4LastName, String ref4Number, String associatemannedlogin)
					throws Exception {
		try {
			Bankaccountinformation();
			if (isElementPresent(referenceOneFirstName,
					"Reference One First Name")) {

				// first reference
				type(referenceOneFirstName, ref1FirstName,
						"Reference One First Name");
				//	click(referenceOneLastName, "Reference One Last Name");
				type(referenceOneLastName, ref1LastName,
						"Reference One Last Name");
				// phone number
				type(referenceOneCNumber, ref1Number, "Phone");
				click(referenceOne, "Relationship");
				click(Home,
						"Home");
				// first reference
				click(referenceTwo, "Relationship");
				click(Friend,"Friend");
				click(referenceOneAddress,"referenceOneAddress");
				type(referenceOneAddress, "referenceOneAddress",
						"Reference One Address");

				// 2nd 
				type(referenceTwoFirstName, ref2FirstName,
						"ReferenceTwo FirstName");
				type(referenceTwoLastName, ref2LastName,
						"ReferenceTwo LastName");

				// phone number
				type(referenceTwoCNumber, ref2Number, "Phone");
				// related to you
				click(referenceThree, "Select");
				wait(2);
				click(Home1,"Home");
				wait(2);
				click(referencefour, "Relationship");
				wait(2);
				click(Aunt,"Aunt");	
				wait(2);
				type(referenceTwoAddress, "referenceTwoAddress",
						"Reference Two Address");
				click(hidekeyboard,"hidekeyboard");
				continueButton();


				//ref 3

				type(referenceThreeFirstName, ref3FirstName,
						"ReferenceThree FirstName");
				type(referenceThreeLastName, ref3LastName,
						"ReferenceThree LastName");
				// phone number
				type(referenceThreeCNumber, ref3Number, "Phone");
				wait(2);
				click(referenceOne, "Relationship Mobile/Home");
				wait(2);
				click(Mobile,"Mobile");
				// first reference
				wait(2);
				click(referencetwo, "Relationship");
				wait(2);
				click(Cousin,"Cousin");
				wait(2);
				click(referenceThreeAddress,"referenceThreeAddress");
				wait(2);
				type(referenceThreeAddress, "referenceThreeAddress",
						"Reference Three Address");


				//4th 
				type(referenceFourFirstName, ref4FirstName,
						"Reference Four FirstName");
				type(referenceFourLastName, ref4LastName,
						"Reference Four LastName");
				// phone number
				type(referenceFourCNumber, ref4Number, "Phone");
				wait(2);
				click(referenceThree, "Relationship Mobile/Home");
				wait(2);
				click(Mobilebtn,"Home");
				// first reference
				wait(2);
				click(referencefour, "Relationship");
				wait(2);
				click(Myparent,"My parent/In-law");
				wait(2);
				type(referenceFourAddress, "referenceFourAddress",
						"Reference Four Address");
				click(hidekeyboard,"hidekeyboard");
				
				//click(continueButton,"Continue Button");
				continueButton();

				continueButton();





				// continueButton();
				/*click(SUBMIT, "SUBMIT");
				wait(10);
				if(isElementPresent(CONFIRMbtn, 2)){
				click(CONFIRM, "CONFIRM");
				}

				if(isElementPresent(associatelogin, 5)){
					type(Enteryourassociatelogin, associatemannedlogin,
							"Enter your associate Login");
					click(SUBMITvalue, "SUBMIT");
				}
				if(isElementPresent(associatepassword, 2)){
					type(Enteryourassociatepassword, "test",
							"Enter your associate password");
					click(SUBMITvalue, "SUBMIT");
				}
				wait(2);
				if(isElementPresent(Emailbt, 1)){
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				Thread.sleep(30000);
				waitForElementPresent(CompanyNamechange, 60);
				GmailAPI ga = new GmailAPI();
				String code = ga.verificationCode();
				wait(6);
				System.out.println("gmail:" + code);
				type(Codetxt, code, "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				}*/
				wait(2);
				ele = waitForElementPresent(CREATEMYORDER, 100,
						"CREATE MY ORDER");
				click(ele, "Create MyOrder Button");

				extentLogs.pass("Verify complete Create MyOrder",
						"Completed Create MyOrder");
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				Assert.fail();
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}


	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean VerifyGetApprovedWithConfirmationCode_UnmannedStore(
			String ref1FirstName, String ref1LastName, String ref1Number,
			String ref2FirstName, String ref2LastName, String ref2Number,
			String ref3FirstName, String ref3LastName, String ref3Number,
			String associatemannedlogin) throws Exception {
		try {
			if (isElementPresent(referenceOneFirstName,
					"References")) {

				References(ref1FirstName, ref1LastName, ref1Number,
						ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
						ref3LastName, ref3Number);
				if(isElementPresent(CONFIRMbtn, 2)){
					click(CONFIRM, "CONFIRM");
				}
				/*
				 * continueButton(); continueButton();
				 */
				if (isElementPresent(MobileLocator.ByXPath,
						"//*[@class='_UIFieldEditorContentView']", 10)) {
					if (isElementPresent(Enteryourassociatelogin,
							"Enter your associate Login"))
						;
					type(Enteryourassociatelogin, associatemannedlogin,
							"Enter your associate Login");
					wait(2);
					click(SUBMITvalue, "SUBMIT");
				}

				wait(5);
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				Thread.sleep(30000);
				waitForElementPresent(CompanyNamechange, 60);
				GmailAPI ga = new GmailAPI();
				String code = ga.verificationCode();
				wait(6);
				System.out.println("gmail:" + code);
				type(Codetxt, "2525",
						"Enter the wrong code two times in the edit box.");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				// msg();

				wait(3);
				type(Codetxt, "2525",
						"Enter the wrong code two times in the edit box.");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				// msg();
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				type(Codetxt, "2525", "Email code");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				wait(5);
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				wait(4);
				waitForElementPresent(CompanyNamechange, 60);
				wait(6);
				type(Codetxt, "2525", "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				wait(3);
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				// msg();
				type(Codetxt, "2525", "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				// msg();
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				type(Codetxt, "2525", "Email code");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				// msg();
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				wait(5);
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				wait(10);
				type(Codetxt, "2525", "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				// msg();
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				wait(3);
				type(Codetxt, "2525", "Please enter the code to continue");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				// msg();
				extentLogs.pass("Verify Error Message.", "Error Message:"
						+ "The code entered was incorrect. Please try again.");
				type(Codetxt, "2525", "Email code");
				wait(4);
				ele = waitForElement(Continue, 60, "continueButton");
				click(Continue, "continueButton");
				wait(5);
				String validApplicationmsg = getText(Headeraccount,
						"'We are not able to complete your application at this time.");
				if (validApplicationmsg != null) {
					extentLogs
					.pass("Verify Message We are not able to complete your application at this time.",
							"User should error Message:"
									+ validApplicationmsg);
				} else {
					extentLogs
					.fail(
							"Verify Message We are not able to complete your application at this time.",
							"User should  not get error Message:"
									+ validApplicationmsg);

				}
				click(Exitapplicationbtn, "Exit");
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}



	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Gmailverifications
	 * @return
	 * @throws
	 */
	public boolean Gmailverifications() throws Exception {
		try {
			if (isElementPresent(Email, "Email")) {
				wait(5);
				waitForElementPresent(Email, 60);
				click(Email, "Email");
				continueButton();
				Thread.sleep(30000);
				waitForElementPresent(CompanyNamechange, 60);
				GmailAPI ga = new GmailAPI();
				String code = ga.verificationCode();
				wait(6);
				System.out.println("gmail:" + code);
				type(CompanyNamechange, "2525", "Email code");
				wait(4);
				click(Continue, "continueButton");

				clear(CompanyNamechange, "Clear email code");
				type(CompanyNamechange, code, "Email code");
				click(Continue, "continueButton");

				ele = waitForElementPresent(CREATEMYORDER, 60,
						"CREATE MY ORDER");
				// type(CompanyNamechange, code, "Email code");
				click(ele, "Create MyOrder Button");

				/*
				 * ele = waitForElementPresent(CREATEMYORDER, 60);
				 * 
				 * click(ele, "create MyOrder Button");
				 */
				extentLogs.pass("Verify complete Create MyOrder",
						"Completed Create MyOrder");
				return true;
			} else {
				extentLogs.fail( "Verify complete Create MyOrder",
						" Create MyOrder Failed");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName CREATEMYORDER
	 * @return
	 * @throws
	 */
	public void CREATEMYORDER() throws Exception {
		wait(6);
		ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");		
		click(ele, "Create MyOrder Button");
		extentLogs.pass("Verify complete Create MyOrder",
				"Completed Create MyOrder");

	}


	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Clickcancel
	 * @return
	 * @throws
	 */
	public void Clickcancel() throws Exception {
		wait(6);
		ele = waitForElementPresent(CANCELbtn, 60, "CANCEL");	
		click(ele, "CANCEL");
	}
	
	/**
	 * @author @Cigniti
	 * @parameter ref1FirstName, ref1LastName, ref1Number, ref2FirstName,
	 *            ref2LastName, ref2Number, ref3FirstName,
	 *            ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws
	 */
	public boolean CreatemyorderAddItemLimit(String ref1FirstName,
			String ref1LastName, String ref1Number, String ref2FirstName,
			String ref2LastName, String ref2Number, String ref3FirstName,
			String ref3LastName, String ref3Number, String associatemannedlogin)
					throws Exception {

		if (isElementPresent(referenceOneFirstName, "References")) {

		
			References(ref1FirstName, ref1LastName, ref1Number,
					ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
					ref3LastName, ref3Number);
			
			if(isElementPresent(CONFIRMbtn, 2)){
				click(CONFIRM, "CONFIRM");
			}
			continueButton();
			continueButton();

			if (isElementPresent(Enteryourassociatelogin,
					"Enter your associate Login")) {
				type(Enteryourassociatelogin, associatemannedlogin,
						"Enter your associate Login");
				click(SUBMIT, "SUBMIT");
			}
			if (isElementPresent(
					confirmationcodeSecondaryemail,
					"To confirm your identity we will be sending you a temporary confirmation code.")) {

				click(confirmationcodeSecondaryemail,
						"confirmation code Secondary Email");
				continueButton();
			}
			if (isElementPresent(ANOWCOWORKEROVERRIDE, "ANOW COWORKER OVERRIDE")) {

				click(ANOWCOWORKEROVERRIDE, "ANOW COWORKER OVERRIDE");
			}
			type(Enteryourassociatelogin, associatemannedlogin,
					"Enter your associate Login");
			click(CONFIRM, "CONFIRM");

			if (isElementPresent(Empname, "ANOW Coworker Override ")) {
				type(Empname, "xyztester", "Employee Name");
				type(EmpID, "1234", "Enter Employee Id");
				type(Comments, "tester", "Enter reasons for Overriding");
				continueButton();
				wait(2);
				click(deletevalue, "deletevalue");
				wait(2);
				continueButton();

			}

			ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");

			click(ele, "Create MyOrder Button");

			ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");
			extentLogs.pass("Verify complete Create MyOrder",
					"Completed Create MyOrder");
			return true;
		} else {
			extentLogs.fail( "Verify complete Create MyOrder",
					" Create MyOrder Failed");
			return false;
		}
	}

	

	/**
	 * @author @Cigniti
	 * @parameter associateMannedlogin
	 * @MethodName Verifythattheapplicationisdeclined
	 * @return
	 * @throws
	 */
	public boolean Verifythattheapplicationisdeclined(
			String associateMannedlogin) throws Exception {
		
		/*type(Enteryourassociatelogin, associateMannedlogin,
				"Enter your associate Login");*/
		/*click(Enteryourassociatelogin, "Enter your associate login");
		 sdriver.getKeyboard().sendKeys(associateMannedlogin);

		click(SUBMIT, "SUBMIT");*/
		/*if(isElementPresent(associatelogin, 5)){
			//click(Enteryourassociatelogin, "Enter your associate login");
			// sdriver.getKeyboard().sendKeys(associateMannedlogin);

		type(Enteryourassociatelogin, associateMannedlogin,
					"Enter your associate Login");
			click(SUBMIT, "SUBMIT");
		}else{
			isElementPresent(associatepassword, 5);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
		}*/

		if (isElementPresent(headerverifcations,
				"We are not able to approve your application at this time.")) {
			extentLogs
			.pass("Verify that the application is declined ",
					"We are not able to approve your application at this time.");
			return true;
		} else {
			extentLogs.fail(
					"Verify that the application is declined ",
					" We are able to approve your application at this time.");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName, LastName, primaryPhno, phoneType, Email, cnfEmail,
	 *            addrLine1, zipCode, ssnnumber1, ssnnumber2, ssnnumber3,
	 *            verifySsn1, verifySsn2, verifySsn3, drivingLicense, idState,
	 *            DOB, SecondaryPhone, CurrentEmployer, MonthlyTakeHomeIncome,
	 *            EmployerPhoneNumber, ref1FirstName, ref1LastName,
	 *            ref1Number,ref2FirstName, ref2LastName,
	 *            ref2Number,ref3FirstName, ref3LastName, ref3Number
	 * @MethodName getapprovedtestdata
	 * @return
	 * @throws
	 */
	public boolean getapprovedtestdata(String EfirstName, String LastName,
			String primaryPhno, String phoneType, String Email,
			String cnfEmail, String addrLine1, String zipCode,
			String ssnnumber1, String ssnnumber2, String ssnnumber3,
			String verifySsn1, String verifySsn2, String verifySsn3,
			String drivingLicense, String idState, String DOB,
			String SecondaryPhone, String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber,
			String ref1FirstName, String ref1LastName, String ref1Number,
			String ref2FirstName, String ref2LastName, String ref2Number,
			String ref3FirstName, String ref3LastName, String ref3Number)
					throws Exception {
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {

			YourInformation(EfirstName, LastName, primaryPhno, Email, cnfEmail);
			// mailing
			mailingaddress(addrLine1, zipCode);
			SocialSecuritynumber(ssnnumber1, ssnnumber2, ssnnumber3,
					verifySsn1, verifySsn2, verifySsn3);
			StateIDnumber(drivingLicense, idState);
			Takephoto(DOB, SecondaryPhone);
			workingcompany(CurrentEmployer, MonthlyTakeHomeIncome,
					EmployerPhoneNumber);
			Createmyorder(ref1FirstName, ref1LastName, ref1Number,
					ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
					ref3LastName, ref3Number);

			// extentLogs.pass("Verify complete Create MyOrder",
			// "Completed Create MyOrder");
			return true;
		} else {
			// extentLogs.fail("Verify complete Create MyOrder",
			// " Create MyOrder Failed");
			return false;
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName continueButton
	 * @return
	 * @throws
	 */
	public void continueButton() throws Exception {
		ele = waitForElement(continueButtonText, 60, "continueButton");
		click(ele, "continueButton");

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName continueButtoninHome
	 * @return
	 * @throws
	 */
	public void continueButtoninHome() throws Exception {
		ele = waitForElement(continueText, 60, "continueButton");
		click(ele, "continueButton");

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName CustomerZipCodecannotbe_00000
	 * @return
	 * @throws
	 */
	public void CustomerZipCodecannotbe_00000() throws Exception {
		try {
			// mailing

			ele = waitForElementPresent(street1, 60, "street Name");
			type(ele, "alexander", "street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			// 85282
			type(ele, "00000", "Postal Code");
			type(City, "Tempe", "City");
			type(ST, "AZ", "ST");
			wait(1);
		//	System.out.println(sdriver.getPageSource());
			continueButton();
			String validzipcodeactmsg = getText(plzzipCodetxt,
					"Please enter a valid zip code");
			if (validzipcodeactmsg
					.equalsIgnoreCase("Please enter a valid zip code")) {
				extentLogs.pass(
						"Verify Customer Zip Code cannot be 00000 - Kiosk",
						"User should not be allowed Zip Code  error Message:"
								+ validzipcodeactmsg);
			} else {
				extentLogs.fail(
						"Verify Customer Zip Code cannot be 00000 - Kiosk",
						"User should  allowed Zip Code error Message:"
								+ validzipcodeactmsg);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_Monthly_Take_Home_Income_cannot_be_0
	 * @return
	 * @throws
	 */
	public void Verify_Monthly_Take_Home_Income_cannot_be_0() throws Exception {
		try {
			// enter income
			type(income, "0", "Income");
			continueButton();
			// Verification
			String amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display: "
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}

			// SelfEmployment
			ele = waitForElementPresent(SelfEmployment, 60, "Self Employment");
			click(ele, " Select SelfEmployment");
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(Continue, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_SelfEmployment_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_SelfEmployment_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}

			// SocialSecurity
			ele = waitForElementPresent(SocialSecurity, 60, "Social Security");
			click(ele, "Select SocialSecurity");
			click(Continue, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(Continue, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_SocialSecurity_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_SocialSecurity_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}
			click(BACK, "BACK Button");
			// Retirement
			ele = waitForElementPresent(Retirement, 60, "Retirement");
			click(ele, "Select Retirement");
			click(Continue, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(Continue, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Retirement_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should  display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_Retirement_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}
			click(BACK, "BACK Button");
			// Pension
			ele = waitForElementPresent(Pension, 60, "Pension");
			click(ele, "Select Pension");
			click(Continue, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(Continue, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Pension_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display:"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail(
						"Verify_Pension_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}

			click(BACK, "BACK Button");
			// Disability
			ele = waitForElementPresent(Disability, 60, "Disability");
			click(ele, "Select Disability");
			click(Continue, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(Continue, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Disability_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display:"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail(
						"Verify_Disability_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public boolean mailingaddressforspanishforRent(Map<String, List<String>> testdata)throws Exception  {
		// TODO Auto-generated method stub
		

		if (isElementPresent(Startmyapplicationbtn,1)) {

			click(STARTMYAPPLICATION, "START MY APPLICATION");
		}
		waitForElementPresent(street1, 60);
		if (isElementPresent(Headeraccount, "What is your mailing address?")) {
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, testdata.get("Address").get(0), "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, testdata.get("Zipcode").get(0), "Postal Code");
			wait(2);	
			click(Rent, "Rent");
			type(Date, testdata.get("MOVEONDATE").get(0), "Date");
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify mailing address",
					"Mailing address? Failed");
			Assert.fail();
			return false;
		}
		
	}
	
	public boolean mailingaddressforspanish(Map<String, List<String>> testdata)throws Exception  {
		// TODO Auto-generated method stub
		

		/*if (isElementPresent(Startmyapplicationbtn,1)) {

			click(STARTMYAPPLICATION, "START MY APPLICATION");
		}*/
		waitForElementPresent(street1, 60);
		if (isElementPresent(street1, "What is your mailing address?")) {
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, testdata.get("Address").get(0), "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			type(ele, testdata.get("Zipcode").get(0), "Postal Code");
			wait(2);			
			click(Own, "Own");			
			type(Date, testdata.get("MOVEONDATE").get(0), "Date");
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify mailing address",
					"Mailing address? Failed");
			Assert.fail();
			return false;
		}
		
	}
	
	
	public boolean RentingInformation(Map<String, List<String>> testdata)throws Exception  {
		// TODO Auto-generated method stub
		

		
		
		if (isElementPresent(Headeraccount, "Información de Alquiler")) {
			// mailing
			ele = waitForElementPresent(apartmentComplexname, 60, "apartmentComplexname");
			type(ele, testdata.get("Address").get(0), "apartment Complexname");
			ele = waitForElementPresent(rentingLandlordName, 60, "Renting LandlordName");
			clear(ele, "Postal Code");
			type(ele, "Oxford denn", "Renting Landlord Name");
			type(rentingLandLordPhone, "9949599612", "Renting LandLord Phone");		
			click(Seleccione, "Seleccione");	
			click(Mensual, "Mensual");	
			wait(2);
			click(rentingLeaseEndDate, "Renting Lease EndDate");
			sdriver.getKeyboard().sendKeys("061989");
			//type(rentingLeaseEndDate, "061989", "Renting Lease EndDate");
			type(rentingMonthlyUtility, "9000", "Renting Monthly Utility");
			Closekeypad();
			type(rentingCustomerPayment, "500", "Renting Customer Payment");
			Closekeypad();
			continueButton();
			extentLogs.pass("Verify Renting Information",
					"Completed Renting Information Successfully");
			return true;
		} else {
			extentLogs.fail( "Verify Renting Information",
					"Renting Information Failed");
			Assert.fail();
			return false;
		}
		
	}
}