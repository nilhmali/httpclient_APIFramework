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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import APIutility.APIutil;
import HttpMethods.GetMethodWithHeaders;
import basesetup.testbase;

public class GetMethodwithheadersTestcases extends testbase {

	// TestNG
	public testbase testbase;
	public String serviceurl;
	public String apiurl;
	public String URI;
	public GetMethodWithHeaders GetMethodWithHeaders;
	public CloseableHttpResponse HttpResponse;

	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {

		testbase = new testbase();
		serviceurl = prop.getProperty("URL");
		apiurl = prop.getProperty("serviceURL");
		URI = serviceurl + apiurl;
	}

	// Get Method with header
	@Test
	public void getMethodtestcasesWithHeader() throws ClientProtocolException,
			IOException {
		GetMethodWithHeaders GetMethodWithHeaders = new GetMethodWithHeaders();

		HashMap<String, String> headermap = new HashMap<String, String>();
		headermap.put("Content-Type", "application/json");

		/*
		 * Authonication provide from devloper headermap.put("usename", "test");
		 * headermap.put("password", "test123"); headermap.put("Authtoken",
		 * "1234");
		 */

		HttpResponse = GetMethodWithHeaders.getMethod(URI, headermap);

		// Print status code
		int statuscode = HttpResponse.getStatusLine().getStatusCode();
		System.out.println("Statuscode=>" + statuscode);

		Assert.assertEquals(statuscode, RESPONSE_STATUSCODE_200,
				"status code is not 200");
		// or
		StatusLine statusline = HttpResponse.getStatusLine();
		System.out.println("Status line=> " + statusline);

		// response data
		String responsedata = EntityUtils.toString(HttpResponse.getEntity(),
				"UTF-8");

		// Convert string to json(Response json data retrun)
		JSONObject responsejson = new JSONObject(responsedata);
		System.out.println("Responsae json from API=> " + responsejson);

		// Single Value Assertion from json
		String per_pageValue = APIutil.getvalueByJpath(responsejson,
				"/per_page");
		System.out.println("value of per_page value => " + per_pageValue);
		Assert.assertEquals(Integer.parseInt(per_pageValue), 6);

		String total = APIutil.getvalueByJpath(responsejson, "/total");
		System.out.println("value of per_page value => " + total);
		Assert.assertEquals(Integer.parseInt(total), 12);

		// Get Array value from JsonArray
		String firs_name = APIutil.getvalueByJpath(responsejson,
				"/data[0]/first_name");
		String id = APIutil.getvalueByJpath(responsejson, "/data[0]/id");
		String email = APIutil.getvalueByJpath(responsejson, "/data[0]/email");
		String last_name = APIutil.getvalueByJpath(responsejson,
				"/data[0]/last_name");
		String avatar = APIutil
				.getvalueByJpath(responsejson, "/data[0]/avatar");

		Assert.assertEquals(firs_name, "George");
		Assert.assertEquals(Integer.parseInt(id), 1);
		Assert.assertEquals(email, "george.bluth@reqres.in");
		Assert.assertEquals(last_name, "Bluth");
		Assert.assertEquals(avatar,
				"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");

		// Headers return
		Header[] headerArray = HttpResponse.getAllHeaders();

		HashMap<String, String> allHeaders = new HashMap<String, String>();

		for (Header headers : headerArray) {
			allHeaders.put(headers.getName(), headers.getValue());
		}
		// Print headers value
		System.out.println("Headers Array=>" + allHeaders);

	}

}
