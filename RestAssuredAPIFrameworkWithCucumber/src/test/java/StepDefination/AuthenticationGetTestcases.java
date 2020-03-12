package StepDefination;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.testng.annotations.Parameters;

import Basesetup.testbase;
import apiMethods.AutheticationGetMethodRestAssured;
import apiMethods.getMethodRestAssured;
import apiMethods.AutheticationGetMethodRestAssured;
import StepDefination.AuthenticationGetTestcases;
import Utility.readjsondata;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class AuthenticationGetTestcases extends testbase {

	private Response httpGetResponse;
	private Headers allHeaders;
	private  testbase testbase;
	private  String BaseURL;
	private  String apiurl;
	private  String URI;
	private  AutheticationGetMethodRestAssured httpget;
	private String Content_TypeValues="";
	

	@Given("^Login valid user and make a valid Get request for users$")
	public void login_valid_user_and_make_a_valid_Get_request_for_users() throws Throwable {
	   
		testbase = new testbase();
		BaseURL = prop.getProperty("AuthenticationURI");
		URI = BaseURL;
		httpget=new AutheticationGetMethodRestAssured();
	}

	@When("^the hit request to server for for specific valid user$")
	public void the_hit_request_to_server_for_for_specific_valid_user() throws Throwable
	{
		httpGetResponse=httpget.getCallWithValid(URI);	
	}

	@Then("^the server returns Successfully '(\\d+)' response$")
	public void the_server_returns_Successfully_response(int arg1) throws Throwable
	{
		int getStatusCode=httpGetResponse.getStatusCode();
		System.out.println("response status code is => "+getStatusCode);
		assertEquals(RESPONSE_STATUSCODE_200, getStatusCode);
	}

	@Then("^response Time for valid user$")
	public void response_Time_for_valid_user() throws Throwable
	{
		Long getResponseTime=httpGetResponse.timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Take Response Time=> "+getResponseTime);
	}

	@Then("^Response body of OPERATION_SUCCESS$")
	public void response_body_of_OPERATION_SUCCESS() throws Throwable {
	  
		String responseGetbody=httpGetResponse.asString();
		System.out.println("ResponseBody is=> "+responseGetbody);
		
		JSONObject jsonResponsedata=new JSONObject(responseGetbody);
		String validAutheticationFault=readjsondata.getvalueByJpath(jsonResponsedata,"/Fault");
		
		
		System.out.println("Page data is valid user =>"+validAutheticationFault);
		
		assertEquals(ReturnJsondata_validAuthetication,validAutheticationFault);	
	}

	@Given("^Login Invalid user and try to Get request for users$")
	public void login_Invalid_user_and_try_to_Get_request_for_users() throws Throwable {
	    
		BaseURL = prop.getProperty("AuthenticationURI");
		URI = BaseURL;
		httpget=new AutheticationGetMethodRestAssured();
	}

	@When("^the hit request to server for for specific Invalid user$")
	public void the_hit_request_to_server_for_for_specific_Invalid_user() throws Throwable {
	   
		httpGetResponse=httpget.getCallWithInValid(URI);
		
		int getInvalidStatusCode=httpGetResponse.getStatusCode();
		System.out.println("response status code is => "+getInvalidStatusCode);
		try
		{	
		assertEquals(RESPONSE_STATUSCODE_401, getInvalidStatusCode);		
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}

	@Then("^Response body of FAULT_USER_INVALID_USER_PASSWORD$")
	public void response_body_of_FAULT_USER_INVALID_USER_PASSWORD() throws Throwable {
		String responseGetbody=httpGetResponse.asString();
		System.out.println("ResponseBody is=> "+responseGetbody);
		
		JSONObject jsonResponsedata=new JSONObject(responseGetbody);
		String Fault=readjsondata.getvalueByJpath(jsonResponsedata, "/fault");
		
		
		System.out.println("Page data is =>"+Fault);
		
		assertEquals(ReturnJsondata_InvalidAuthetication,Fault);
	}

	@Then("^Check header for valida user$")
	public void check_header_for_valida_user() throws Throwable {
		allHeaders = httpGetResponse.headers();
		
		 // Iterate over all the Headers
	for(Header header : allHeaders)
	 {
		if(header.getName().contains("Content-Type"))	
		{
		 System.out.println(header.getName() + " Value: " + header.getValue());
		 Content_TypeValues=httpGetResponse.header("Content-Type");
		 break;
		}
		 
	 } 
	assertEquals(Content_TypeValues, headerForAuthetication);
	
	}


}
