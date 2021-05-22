package com.mobile.automation.scripts.original;
//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class jdsports {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "jdsports";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "ce0117110aa72f3d04");
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ravi.munigeri\\AppData\\Roaming\\appiumstudio\\apk\\com.jd.jdsports.ui.MainActivity.2.apk");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jd.jdsports");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.MainActivity");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);
        dc.setCapability("instrumentApp", true);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testjdsports() {
        driver.startActivity(new Activity("com.jd.jdsports",".ui.MainActivity"));
        driver.findElement(By.xpath("//*[@contentDescription='Open navigation drawer']")).click();
        driver.findElement(By.xpath("//*[@text='Men']")).click();
        driver.findElement(By.xpath("//*[@text='Clothing']")).click();
        driver.findElement(By.xpath("//*[@text='Jackets']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Quick Buy']")));
        driver.findElement(By.xpath("//*[@text='Quick Buy']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='S']")));
        driver.findElement(By.xpath("//*[@text='S']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Secure checkout']")));
        driver.findElement(By.xpath("//*[@text='Secure checkout']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}