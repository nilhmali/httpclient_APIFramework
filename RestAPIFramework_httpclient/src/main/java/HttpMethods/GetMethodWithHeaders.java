package HttpMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


public class GetMethodWithHeaders {
	
		//2.GET method with headers with authitication
		public CloseableHttpResponse getMethod(String url,HashMap<String, String> headerMap) throws ClientProtocolException, IOException
		{
			//Default client is created(Return Jsondata,Headers,status code)
			CloseableHttpClient httpclient= HttpClients.createDefault();
			
			//Create http get connection
			HttpGet httpGET= new HttpGet(url);
			
			for(Map.Entry<String,String> entry:headerMap.entrySet())
			{
				httpGET.addHeader(entry.getKey(),entry.getValue());
			}
			
			//Hit url API(Send button)
			CloseableHttpResponse HttpResponse=httpclient.execute(httpGET);
			
			return HttpResponse;

		
	}

}
