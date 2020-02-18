package HttpMethodTetscases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import APIutility.APIutil;
import HttpMethods.putMethodwithheaders;
import apiInsertJsondata.users;
import basesetup.testbase;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PutMethodwithheadersTestcases extends testbase {

	//TestNG
		public  testbase testbase;
		public  String serviceurl;
		public  String apiurl;
		public  String URI;
		public putMethodwithheaders putMethodwithheaders;
		public CloseableHttpResponse HttpResponse;

	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException
	{
		
		testbase=new testbase();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("putServiceURL");
		URI=serviceurl+apiurl;
	}
	@Test
	public void putMethodtestcaseswithheader() throws ClientProtocolException, IOException
	{
	putMethodwithheaders= new putMethodwithheaders();

	HashMap<String,String> headers=new HashMap<String, String>();
	
	headers.put("Content-Type", "application/json");
	
	//Insert Json data
	//Jackson API->Mapper
	ObjectMapper mapper=new ObjectMapper();
	users users=new users("morpheus","HR");
	
	mapper.writeValue(new File(System.getProperty("user.dir")+"/src/main/java/configure/jsondataPut.json"), users);	
	
	//object to json String
	String userjsonstrong= mapper.writeValueAsString(users);
	System.out.println(userjsonstrong);
	
	HttpResponse=putMethodwithheaders.putmethod(URI, userjsonstrong, headers);
	
	int statuscode=HttpResponse.getStatusLine().getStatusCode();
	System.out.println("Statuscode=>"+statuscode);
	

	if(statuscode==200)
	{
		System.out.println("Response code is mathched=> "+statuscode);	
	}
	else
		System.out.println("Response code is incorrect");	
	
	//response data
	String responsedata=EntityUtils.toString(HttpResponse.getEntity(),"UTF-8");
	
	//Convert string to json(Response json data retrun)
	JSONObject responsejson=new JSONObject(responsedata);
	System.out.println("Response json from API=> "+responsejson);
	
	/*
	String name=APIutil.getvalueByJpath(responsejson,"/name");
	System.out.println("Name value => "+name);
	
	if(name.contains("morpheus"))
	{
		System.out.println("Name Value is matched");
	}
	else
		System.out.println("Name Value is not matched");
	
	String job=APIutil.getvalueByJpath(responsejson,"/job");
	System.out.println("value of total => "+job);
	
	if(job.contains("HR"))
	{
		System.out.println("Job Value is matched");
	}
	else
		System.out.println("Job Value not matched");
	*/
	String UpdatedAt=APIutil.getvalueByJpath(responsejson,"/updatedAt");
	System.out.println("UpdatedAt => "+UpdatedAt);
	
	//Headers return
			Header[] headerArray=HttpResponse.getAllHeaders();
			
			HashMap<String, String> allHeaders=new HashMap<String, String>();
			
			for(Header headersput:headerArray)
			{
				allHeaders.put(headersput.getName(), headersput.getValue());
			}
			//Print headers value
			System.out.println("Headers Array=>"+allHeaders);
	}

	}
