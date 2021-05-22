package com.mobile.automation.scripts.original;

import java.rmi.AccessException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JDsportsFlowbrowser {

	
 //   public static IWebDriver driver;
    public static By PopupClose = By.xpath("//span[@class='closeLightbox']");
    public static By Inputsearch = By.id("srchInput");
    public static By SearchButtonClick = By.xpath("//input[@id='srchButton']");
    public static By GetSizeFromPdp = By.xpath("//div[@id='productSizeStock']//button[1]");
    public static By GetTitleFromPdp = By.xpath("//div[@id='productItemTitle']//h1[@itemprop='name']");
    public static By GetPriceFromPdp = By.xpath("//div[@class='itemPrices']");
    public static By Addtobasket = By.xpath("//button[@id='addToBasket']");
    public static By RetrievSizeFromBasket = By.xpath("//li[@class='basketListItem ']//span[@class='itemSize']/strong");
    public static By RetrievTilteFromBasket = By.xpath("//li[@class='basketListItem ']/div[@class='itemInfo']//a");
    public static By RetrievPriceFromBasket = By.xpath("//li[@class='basketListItem ']//div[@class='itemCost']/span");
    public static By Checkoutsecurely = By.xpath("//div[@class='basketContinue']//a[@class='btn btn-level1 large wArro']");
    public static By guestcheckout = By.xpath("//input[@id='guestEmail']");
    public static By selectclickandcollect = By.xpath("//input[@id='guestEmail']");
    public static By SearchPostCode = By.xpath("//div[@id='storePostcodeHolder']//div[@id='addressLookup']");
    //public static By SearchPostCode =By.XPath("//li[@class='clickAndCollectMethod activeListOption' and not(contains(@class,'disabled]");
    public static By loadingCircle = By.xpath("//div[@class='checkoutLoadingOverlay']");

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.out.println("Opening chrome browser");
		//System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "C:\\appiumjava\\AppiumDemo\\Tool\\chromedrivers\\windows\\chromedriver.exe");
	    	
		driver = new ChromeDriver();
	}

    
    @Test()
    public void verifyTitle() throws Exception, AccessException {
    	//driver = new ChromeDriver();
          
     //   driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
        
        driver.get("https://www.jdsports.de/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SearchForProduct();
        PlpRandomSelect();
        PdpPage();
        AddToBasket();
        GuestCheckout();
        DeilveryPage();
        BillingPage();



        
        
        
       

        

        
        
}
    
    
    public void SearchForProduct()
    {
        driver.findElement(PopupClose).click();
        driver.findElement(Inputsearch).sendKeys("laces"); 
        
       
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", 
        		
        		driver.findElement(SearchButtonClick));
    }
    
    public void PlpRandomSelect()
    {
        Random Ramdom = new Random();
     //   int maxcount = driver.findElements(By.xpath("//div[@id='productListRightContainer']")).getcount;
      //  int randomNumber = ((Object) Ramdom).Next(1, maxcount);
      //  driver.findElement(By.xpath("//ul[@id='productListMain']//li[" + randomNumber + "]//a[@class='itemImage']")).click();
    }

    public void PdpPage()
    {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("size", driver.findElement(GetSizeFromPdp).getText());
        dict.put("title", driver.findElement(GetTitleFromPdp).getText());
        dict.put("Price", driver.findElement(GetPriceFromPdp).getText());
    }
    public void AddToBasket()
    {
        driver.findElement(Addtobasket).click();
        String size = driver.findElement(RetrievSizeFromBasket).getText();
        String title = driver.findElement(RetrievTilteFromBasket).getText();
        String price = driver.findElement(RetrievPriceFromBasket).getText();

    }
    public void GuestCheckout()
    {
        driver.findElement(Checkoutsecurely).click();
        driver.findElement(guestcheckout).sendKeys("jogireddy.chintapalli@gmai.com");
        driver.findElement(By.xpath("//*[@id='checkoutGuest' and not(contains(@class,'disabled'))]")).click();

    }
    public void DeilveryPage() throws InterruptedException
    {
       // waitforElement(loadingCircle);
        driver.findElement(By.xpath("//span[@data-e2e='checkout-delivery-collect']/following-sibling::h4[.='Click & Collect']")).click();   
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("berlin");
        Thread.sleep(5000);
        driver.findElement(SearchPostCode).click();
        //Store details Entry
        driver.findElement(By.id("firstName")).sendKeys("Jogireddy");
        driver.findElement(By.id("lastName")).sendKeys("Chintapalli");
        driver.findElement(By.id("phone")).sendKeys("9676974761");
        driver.findElement(By.xpath("//button[@id='continueSecurelyButton']")).click();
        Thread.sleep(5000);
        
    }
    public void BillingPage() throws InterruptedException
    {
        driver.findElement(By.xpath("//input[@id='addressPredictLook']")).sendKeys("berlin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@class='result'][1]")).click();
        Thread.sleep(5000);     
        driver.findElement(By.xpath("//div[@class='fs-row but act hlb paybyCARD ']")).click();
        Thread.sleep(5000);  
      //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='paymentFrame']")));
    }

    
}
