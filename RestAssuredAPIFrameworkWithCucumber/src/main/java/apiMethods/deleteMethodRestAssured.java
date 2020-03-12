package apiMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteMethodRestAssured {
	
	public Response deleteCall(String URI)
	{
		
	RestAssured.baseURI=URI;
	Response httpdeleteResponse=RestAssured.given().delete();
	return httpdeleteResponse;

}


	}
