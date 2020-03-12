package apiMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class getMethodRestAssured {
	
	Response httpGetResponse;
	
	public Response getCall(String URI,String endPoint)
	{
		
	RestAssured.baseURI=URI;
	httpGetResponse=RestAssured.given().get(endPoint);
	
	return httpGetResponse;
}
	public Response getCallWithInvalid(String URI,String endPoint)
	{
		
	RestAssured.baseURI=URI;
	httpGetResponse=RestAssured.given().get(endPoint);
	
	return httpGetResponse;
}
}
