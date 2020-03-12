package apiMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class AutheticationGetMethodRestAssured {
	
	Response httpGetResponse;
	
	public Response getCallWithValid(String URI)
	{
		
	RestAssured.baseURI=URI;
	httpGetResponse=RestAssured.given().auth().preemptive().basic("ToolsQA","TestPassword").get();
	
	return httpGetResponse;
}
	public Response getCallWithInValid(String URI)
	{
		
	RestAssured.baseURI=URI;
	httpGetResponse=RestAssured.given().auth().preemptive().basic("ToolsQA1212","TestPassword").get();
	
	return httpGetResponse;
}
}
