package StepDefination;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import Basesetup.testbase;
import Utility.readjsondata;
import apiMethods.postMethodRestAssured;
import StepDefination.PostTestcases;
import StepDefination.PostTestcases;
import cucumber.api.java.en.*;
import io.restassured.response.Response;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PostTestcases extends testbase {

	private testbase testbase;
	private  String serviceurl;
	private  String apiurl;
	private  String URI;
	private  Response httpPostResponse;
	private postMethodRestAssured httpPost;

	@Given("^the user is about to make a valid Post request for users$")
	public void the_user_is_about_to_make_a_valid_Post_request_for_users() throws Throwable {
		
		testbase = new testbase();
		serviceurl = prop.getProperty("URL");                                                        
		URI = serviceurl;
	}

	@When("^the hit request to server for for specific add resource$")
	public void the_hit_request_to_server_for_for_specific_add_resource() throws Throwable {
		
		httpPost=new postMethodRestAssured();
		
		httpPostResponse=httpPost.postCall(URI,"Nilesh","QA");
	}

	@Then("^the server returns a created '(\\d+)' response$")
	public void the_server_returns_a_created_response(int arg1) throws Throwable {
		
		int postStatusCode=httpPostResponse.getStatusCode();
		System.out.println("response status code is => "+postStatusCode);
		assertEquals(RESPONSE_STATUSCODE_201_CREATED, postStatusCode);	
	}

	@Then("^Post response Time$")
	public void post_response_Time() throws Throwable {
		
		Long getResponseTime=httpPostResponse.timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Take Response Time=> "+getResponseTime);
	}

	@Then("^Post Response body$")
	public void postMethodValidateJsonData() throws Throwable {
		String responseGetbody=httpPostResponse.asString();
		System.out.println("ResponseBody is=> "+responseGetbody);
		
		JSONObject jsonResponsedata=new JSONObject(responseGetbody);
		String createdAt=readjsondata.getvalueByJpath(jsonResponsedata, "/createdAt");
		
	//	Assert.assertEquals("2019-12-18T08:51:03.928Z", createdAt);
		
		System.out.println("createdAt datetime is =>"+createdAt);
		
		System.out.println("---------------Authetication Testcases------------");
		}
	
	}



