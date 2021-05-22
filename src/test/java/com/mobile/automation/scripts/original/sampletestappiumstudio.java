package com.mobile.automation.scripts.original;


import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class sampletestappiumstudio {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected IOSDriver<IOSElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "07dbd4841b712855b78925fc5220dee9b4056101");
    //    dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ravi.munigeri\\AppData\\Roaming\\appiumstudio\\original-apks\\JDSports.ipa");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.jd.jdsports");

        dc.setCapability("instrumentApp", true);
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.executeScript("seetest:client.setDevice(\"ios_app:MCTestTeam’s iPhone\")");
        driver.executeScript("seetest:client.launch(\"com.jd.jdsports\", \"false\",\"true\")");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}