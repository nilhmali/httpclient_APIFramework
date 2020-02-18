package HttpMethodTetscases;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HttpMethods.GetMethodWithOutHeaders;
import APIutility.APIutil;
import basesetup.testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class GetMethodwithOutheadersTestcases extends testbase {
	
	//TestNG
	public  testbase testbase;
	public  String serviceurl;
	public  String apiurl;
	public  String URI;
	public GetMethodWithOutHeaders GetMethodWithOutHeaders;
	public CloseableHttpResponse HttpResponse;
	public JSONObject responsejson;
	public String responsedata;


	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException
	{
		
		testbase=new testbase();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("serviceURL");
		URI=serviceurl+apiurl;
	}

	//Get Method without header
	@Test(priority=1)
	public void getMethodstatuscode() throws ClientProtocolException, IOException
	{
		GetMethodWithOutHeaders=new GetMethodWithOutHeaders();
		HttpResponse=GetMethodWithOutHeaders.getMethod(URI);
		
		//Print status code
		int statuscode=HttpResponse.getStatusLine().getStatusCode();
		System.out.println("Statuscode=>"+statuscode);
	
		Assert.assertEquals(statuscode,RESPONSE_STATUSCODE_200,"status code is not 200");
		//or
		StatusLine statusline=HttpResponse.getStatusLine();
		System.out.println("Status line=> "+statusline);
		
	}
	@Test(priority=2)
		public void getMethodValidateJsonData() throws ClientProtocolException, IOException
		{
		//response data
		responsedata=EntityUtils.toString(HttpResponse.getEntity(),"UTF-8");
		
		//Convert string to json(Response json data retrun)
		responsejson=new JSONObject(responsedata);
		System.out.println("Responsae json from API=> "+responsejson);

	
		//Single Value Assertion from json
		String per_pageValue=APIutil.getvalueByJpath(responsejson,"/per_page");
		System.out.println("value of per_page value => "+per_pageValue);
		Assert.assertEquals(Integer.parseInt(per_pageValue), 6);
		
		String total=APIutil.getvalueByJpath(responsejson,"/total");
		System.out.println("value of per_page value => "+total);
		Assert.assertEquals(Integer.parseInt(total), 12);
		
		//Get Array value from JsonArray
		String firs_name=APIutil.getvalueByJpath(responsejson, "/data[0]/first_name");
		String id=APIutil.getvalueByJpath(responsejson, "/data[0]/id");
		String email=APIutil.getvalueByJpath(responsejson, "/data[0]/email");
		String last_name=APIutil.getvalueByJpath(responsejson, "/data[0]/last_name");
		String avatar=APIutil.getvalueByJpath(responsejson, "/data[0]/avatar");
		
		Assert.assertEquals(firs_name, "George");
		Assert.assertEquals(Integer.parseInt(id), 1);
		Assert.assertEquals(email, "george.bluth@reqres.in");
		Assert.assertEquals(last_name, "Bluth");
		Assert.assertEquals(avatar, "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
		}
		
	@Test(priority=3)
		public void getMethodValidateHeaders() throws ClientProtocolException, IOException
		{
		
		String ActualHeaderValue=" ";
		String ExpectedHeaderValue="application/json; charset=utf-8";
		//Headers return
		Header[] headerArray=HttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeaders=new HashMap<String, String>();
		
		for(Header headers:headerArray)
		{
			allHeaders.put(headers.getName(), headers.getValue());
			
			boolean Key=headers.getName().contains("Content-Type");
					
			if(Key)
			{
				ActualHeaderValue=headers.getValue();
				System.out.println("Values=>"+ActualHeaderValue);
				Assert.assertEquals(ActualHeaderValue, ExpectedHeaderValue);
				break;
			}
			
		}
		
		//Print headers value
		System.out.println("Headers Array=>"+allHeaders);
		
		}
	
	 
	  
}
