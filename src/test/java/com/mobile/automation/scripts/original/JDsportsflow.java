package com.mobile.automation.scripts.original;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JDsportsflow {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "8.0");
    desiredCapabilities.setCapability("app", "C:\\Users\\ravi.munigeri\\Desktop\\jd.apk");
    desiredCapabilities.setCapability("deviceName", "ce0117110aa72f3d04");
    desiredCapabilities.setCapability("noReset", true);
    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws InterruptedException {
	  Thread.sleep(5000);
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
    el2.click();
    driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Men']")).click();
    
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
