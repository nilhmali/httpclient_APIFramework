package HttpMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class putMethodwithheaders {
	
	public CloseableHttpResponse putmethod(String url,String entityString,HashMap<String, String> headerPut) throws ClientProtocolException, IOException
	{
		
	CloseableHttpClient httprequest=HttpClients.createDefault();
	
	HttpPut httpPUT=new HttpPut(url);
	
	for(Map.Entry<String,String> entity:headerPut.entrySet())
	{
		httpPUT.addHeader(entity.getKey(),entity.getValue());
	}
	
	CloseableHttpResponse httpResponse=httprequest.execute(httpPUT);
	 
	return httpResponse;
	
	}


}
