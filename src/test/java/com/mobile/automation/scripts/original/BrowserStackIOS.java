package com.mobile.automation.scripts.original;
import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
 
public class BrowserStackIOS {
  public static String accessKey = "NrrD4FsJXyUW67WzvEhC";
  public static String userName = "vikrampatelnooli1";

  public static void main(String args[]) throws MalformedURLException, InterruptedException {
    DesiredCapabilities caps = new DesiredCapabilities();

    caps.setCapability("device", "iPhone 8 Plus");
    caps.setCapability("os_version", "11");
    caps.setCapability("name", "Bstack-[Java] Sample Test");
    caps.setCapability("app", "bs://<hashed app-id>");
    

    IOSDriver driver = new IOSDriver(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

    IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
    textButton.click();
    IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
    textInput.sendKeys("hello@browserstack.com");

    driver.findElementByAccessibilityId("Next").click();     
    Thread.sleep(5000);

    IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
    
    if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
        assert(true);
    else
        assert(false);

    driver.quit();
  }
}