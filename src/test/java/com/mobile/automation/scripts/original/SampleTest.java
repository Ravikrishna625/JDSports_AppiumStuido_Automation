package com.mobile.automation.scripts.original;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "6.0.1");
    desiredCapabilities.setCapability("deviceName", "Galaxy Note5");
    desiredCapabilities.setCapability("automationName", "UiAutomator2");
    desiredCapabilities.setCapability("app", "/Users/e001513/Downloads/VodQaAdvancedAppium-master/VodQA.apk");
    desiredCapabilities.setCapability("udid", "0815f894f8c53e05");
    desiredCapabilities.setCapability("noReset", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView");
    el1.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
