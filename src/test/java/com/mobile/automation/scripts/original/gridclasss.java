package com.mobile.automation.scripts.original;

import java.net.URL;
import java.rmi.AccessException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridclasss {
	

		static WebDriver driver;
			String baseURL,nodeURL; 
		 

	 @Test()
	    public void verifyTitle() throws Exception, AccessException {
		 	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			  String baseURL = "https://www.jdsports.co.uk/";
			  String nodeURL = "http://18.203.186.132:5585/wd/hub";
			  ChromeOptions capability=new ChromeOptions(); 
			  capability.setCapability("platform", Platform.WINDOWS);
//			  driver=new ChromeDriver();
			  driver=new RemoteWebDriver(new URL(nodeURL),capability);
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  driver.get(baseURL); 
		 

	 }
}
