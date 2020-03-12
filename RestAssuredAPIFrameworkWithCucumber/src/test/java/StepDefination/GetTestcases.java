package StepDefination;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Basesetup.testbase;
import apiMethods.getMethodRestAssured;
import StepDefination.GetTestcases;
import Utility.readjsondata;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetTestcases extends testbase {

	private Response httpGetResponse;
	private Headers allHeaders;
	private  testbase testbase;
	private  String BaseURL;
	private  String apiurl;
	private  String URI;
	private  GetTestcases httpget;
	private 	String Content_TypeValues="";
	 

	@Given("^the user is about to make a valid Get request for users$")
	public void the_user_is_about_to_make_a_valid_Get_request_for_users() throws Throwable {

		testbase = new testbase();
		BaseURL = prop.getProperty("URL");
		URI = BaseURL;
	}
	
	@When("^the hit request to server for for specific user$")
	//@Parameters({"endPoint"})
	public void the_hit_request_to_server_for_for_specific_user() throws Throwable {
		
		getMethodRestAssured httpget=new getMethodRestAssured();
		httpGetResponse=httpget.getCall(URI,"4");
	}
	
	
	@Then("^the server returns a '(\\d+)' response$")
	public void the_server_returns_a_response(int arg1) throws Throwable {
		
		int getStatusCode=httpGetResponse.getStatusCode();
		System.out.println("response status code is => "+getStatusCode);
		assertEquals(RESPONSE_STATUSCODE_200, getStatusCode);
	}

	@Then("^response Time$")
	public void response_Time() throws Throwable {
		Long getResponseTime=httpGetResponse.timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Take Response Time=> "+getResponseTime);
	}


	@Then("^Response body$")
	public void response_body() throws Throwable 
	{
		String responseGetbody = httpGetResponse.asString();
		System.out.println("Response Body=>"+responseGetbody);
		
		JSONObject jsonResponsedata=new JSONObject(responseGetbody);
		//String jsonLastName=readjsondata.getvalueByJpath(jsonResponsedata, "/data[4]/last_name");
		String jsonLastName=readjsondata.getvalueByJpath(jsonResponsedata, "/data/last_name");
		System.out.println("lastName of data 4 is =>"+jsonLastName);
		assertEquals(jsonArray_ValidateLastname,jsonLastName);
	}

	@Then("^headers$")
	public void headers() throws Throwable {

		allHeaders = httpGetResponse.headers();

		// Iterate over all the Headers
		for (Header header : allHeaders) {
			if (header.getName().contains("Content-Type")) {
				System.out.println(header.getName() + " Value: " + header.getValue());
				String Content_TypeValues = httpGetResponse.header("Content-Type");
				break;
			}

		}
		System.out.println("-------------Post Method----------------------------");
		
	}

}
