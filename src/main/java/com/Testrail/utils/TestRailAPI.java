package com.Testrail.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TestRailAPI
{

    public static APIClient client()
    {
        // TODO make this read from settings/config file
        APIClient client = new APIClient("https://jdplc.testrail.com");
        client.setUser("Ravi.munigeri@jdplc.com");
        client.setPassword("Computer@12");

        return client;
    }

    public static JSONObject getCase(int p_caseId) throws Exception
    {
        APIClient client = TestRailAPI.client();
        JSONObject c = (JSONObject) client.sendGet("get_case/" + p_caseId);

        return c;
    }

    
    public static JSONObject get_test(int p_caseId) throws Exception
    {
        APIClient client = TestRailAPI.client();
        JSONObject c = (JSONObject) client.sendGet("get_test/" + p_caseId);

        return c;
    }
    
	
	  public static JSONArray case_id(int p_caseId) throws Exception { APIClient
	  client = TestRailAPI.client(); org.json.simple.JSONArray c =
	  (org.json.simple.JSONArray) client.sendGet("case_id/" + p_caseId);
	  
	  return c; }
	 
    
    public static JSONArray get_tests(int run_id) throws Exception
    {
        APIClient client = TestRailAPI.client();
        org.json.simple.JSONArray c = (org.json.simple.JSONArray) client.sendGet("get_tests/" + run_id);

        return c;
    }
    
    
    public static JSONObject get_suite(int suite_id) throws Exception
    {
        APIClient client = TestRailAPI.client();
       // org.json.simple.JSONArray c = (org.json.simple.JSONArray) client.sendGet("get_suite/" + suite_id);
        JSONObject c = (JSONObject) client.sendGet("get_suite/" + suite_id);
        return c;
    }
    
    
    public static JSONArray get_suites(int project_id) throws Exception
    {
        APIClient client = TestRailAPI.client();
        org.json.simple.JSONArray c = (org.json.simple.JSONArray) client.sendGet("get_suites/" + project_id);
      //  JSONObject c = (JSONObject) client.sendGet("get_suites/" + suite_id);
        return c;
    }
    
    public static JSONObject addResult(int p_statusId, String p_comment, int p_runId, int p_caseId) throws Exception
    {
        APIClient client = TestRailAPI.client();
        Map data = new HashMap();
        data.put("status_id", new Integer(p_statusId));
        data.put("comment", p_comment);
        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + p_runId + "/" + p_caseId, data);

        return r;
    }

	/*
	 * public static Object get_tests(int p_caseId) { APIClient client =
	 * TestRailAPI.client(); JSONObject c = (JSONObject) client.sendGet("get_tests/"
	 * + p_caseId);
	 * 
	 * return c; // TODO Auto-generated method stub return null; }
	 */

}
