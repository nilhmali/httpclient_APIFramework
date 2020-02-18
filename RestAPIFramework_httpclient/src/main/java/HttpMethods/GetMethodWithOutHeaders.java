package HttpMethods;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;



public class GetMethodWithOutHeaders {
	
	//1.GET method without headers
	public CloseableHttpResponse getMethod(String url) throws ClientProtocolException, IOException
	{
		//Default client is created(Return Jsondata,Headers,status code)
		CloseableHttpClient httpclient= HttpClients.createDefault();
		
		//Create http get connection
		HttpGet httpGET= new HttpGet(url);
		
		//Hit url API(Send button)
		CloseableHttpResponse HttpResponse=httpclient.execute(httpGET);
		
		return HttpResponse;
	}	
		

}
