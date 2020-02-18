package HttpMethodTetscases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import HttpMethods.PostMethodWithHeaders;
import APIutility.APIutil;
import apiInsertJsondata.users;
import basesetup.testbase;


public class PostMethodwithheadersTestcases extends testbase {
	
	//TestNG
	public  testbase testbase;
	public  String serviceurl;
	public  String apiurl;
	public  String URI;
	public PostMethodWithHeaders PostMethodWithHeaders;
	public CloseableHttpResponse HttpResponse;

	
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException
	{
		
		testbase=new testbase();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("serviceURL");
		URI=serviceurl+apiurl;
	}

	//Post Method without header
	@Test
	public void postMethodtestcaseswithoutheader() throws ClientProtocolException, IOException
	{
		PostMethodWithHeaders=new PostMethodWithHeaders();
		
		HashMap<String, String> header=new HashMap<String, String>();
		
		header.put("Content-Type", "application/json");
		
		//Insert Json data(Convert Json payload into object-Serilization)
		//Jackson API
		ObjectMapper mapper=new ObjectMapper();
		users users=new users("mukund","QA");
		
		
		//Write object data into .json file
		mapper.writeValue(new File(System.getProperty("user.dir")+"/src/main/java/configure/jsondata.json"), users);
		 
		//Convert object to json String(Payload)-deSerilization
		String userjsonstring=mapper.writeValueAsString(users);
		System.out.println("UserJosn Data=>"+userjsonstring);
		
		//Post Data  
		HttpResponse=PostMethodWithHeaders.getPost(URI, userjsonstring, header);
		
		
		//Print status code
		int statuscode=HttpResponse.getStatusLine().getStatusCode();
		System.out.println("Statuscode=>"+statuscode);
		//or
		StatusLine statusline=HttpResponse.getStatusLine();
		System.out.println("Status line=> "+statusline);
		
		Assert.assertEquals(statuscode,RESPONSE_STATUSCODE_201_CREATED,"status code is not 201");
		
		//response data
		String responsedata=EntityUtils.toString(HttpResponse.getEntity(),"UTF-8");
		
		//Convert string to json(Response json data retrun)
		JSONObject responsejson=new JSONObject(responsedata);
		System.out.println("Response json from API=> "+responsejson);
		
		
		String name=APIutil.getvalueByJpath(responsejson,"/name");
		System.out.println("Name value => "+name);
		
		Assert.assertEquals(name, "mukund");
	
		String job=APIutil.getvalueByJpath(responsejson,"/job");
		System.out.println("value of total => "+job);
		
		Assert.assertEquals(job, "QA");
		
		//Headers return
		Header[] headerArray=HttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeaders=new HashMap<String, String>();
		
		for(Header headers:headerArray)
		{
			allHeaders.put(headers.getName(), headers.getValue());
		}
		//Print headers value
		System.out.println("Headers Array=>"+allHeaders);
		
	}
	
}
	