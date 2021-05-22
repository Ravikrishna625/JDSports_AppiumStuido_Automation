package com.mobile.automation.scripts.original;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testrail.utils.APIClient;
import com.Testrail.utils.APIException;
public class testgoogle {

    public static String TEST_RUN_ID                = "51202";
    public static String TESTRAIL_USERNAME          = "ravi.munigeri@jdplc.com";
    public static String TESTRAIL_PASSWORD          = "Computer@12";
    public static String RAILS_ENGINE_URL           = "https://jdplc.testrail.com";
    public static final int TEST_CASE_PASSED_STATUS = 3;
    public static final int TEST_CASE_FAILED_STATUS = 5;
    WebDriver driver;
    
    @Test(description = "Basket - Messagesone - Skiped. TC_ID=C11265615")
    public void verifyTitle() throws Exception, AccessException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\appiumjava\\AppiumDemo\\Tool\\chromedrivers\\windows\\chromedriver.exe");
    	//driver = new ChromeDriver();


HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
chromePrefs.put("intl.accept_languages", "de");
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", chromePrefs);
driver = new ChromeDriver(options);
          
     //   driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
        
        driver.get("https://www.sizeofficial.de/");
        String actualTilte = driver.getTitle();
        if (actualTilte.contains("size?")) {
           // Assert.assertTrue(actualTilte.contains("Google"));
            testgoogle.close_runForTestCase("51202", TEST_CASE_PASSED_STATUS, "");
        }
else{
		testgoogle.close_runForTestCase("51202", TEST_CASE_FAILED_STATUS, "");
	}

        driver.quit();
    }


    public static void addResultForTestCase(String testCaseId, int status,String error) throws IOException, AccessException, APIException {

        String testRunId = TEST_RUN_ID;

        APIClient client = new APIClient(RAILS_ENGINE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
       // JSONObject c = (JSONObject) client.sendGet("get_case/" + p_caseId);
       // JSONObject c = (JSONObject) client.sendGet("get_case/146222");      
      //  System.out.println(c.get("title"));
        Map data = new HashMap();
        data.put("status_id", status);
        data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
        client.sendPost("add_result_for_case/"+testRunId+"/"+testCaseId+"",data );
      //  client.sendPost("add_result_for_case/1/1",data );
    }
    
    
    
    public static void close_runForTestCase(String testCaseId, int status,String error) throws IOException, AccessException, APIException {

        String testRunId = TEST_RUN_ID;

        APIClient client = new APIClient(RAILS_ENGINE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
       // JSONObject c = (JSONObject) client.sendGet("get_case/" + p_caseId);
       // JSONObject c = (JSONObject) client.sendGet("get_case/146222");      
      //  System.out.println(c.get("title"));
        Map data = new HashMap();
        data.put("status_id", status);
        data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
        client.sendPost("index.php?/api/v2/close_run/:"+testRunId+"",data );
      //  client.sendPost("add_result_for_case/1/1",data );
    }
   
    

}