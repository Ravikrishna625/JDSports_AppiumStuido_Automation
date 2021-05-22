package com.mobile.automation.scripts.original;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testrail.utils.APIClient;
import com.Testrail.utils.APIException;
import com.Testrail.utils.TestRail;
import com.Testrail.utils.TestRailAPI;

public class TestRailTests
{
	
    @Test
    public void testAPI() throws Exception
    {
        TestRailAPI api = new TestRailAPI();
        String testRailCase = TestRailAPI.getCase(146222).toString();
        System.out.println(testRailCase);
    }

	
	
	  @Test
	  
	  @TestRail(testCaseId = {146222}) public void passTest() {
	  Assert.assertTrue(true); System.out.println("pass"); }
	 
	 

	/*
	 * @Test
	 * 
	 * @TestRail(testCaseId = {9099036}) public void failTest() {
	 * Assert.assertTrue(false); }
	 */

	/*
	 * @Test
	 * 
	 * @TestRail(testCaseId = {8617, 8618}) public void failMultipleTests() {
	 * Assert.assertTrue(false); }
	 */

	/*
	 * @Test public void dontPostToTestRail() { Assert.assertTrue(true); }
	 */
}
