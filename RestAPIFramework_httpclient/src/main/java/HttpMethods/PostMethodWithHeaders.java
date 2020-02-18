package HttpMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


public class PostMethodWithHeaders {
	
	//1.POST method without headers
	public CloseableHttpResponse getPost(String url,String entityString,HashMap<String, String> headersmap) throws ClientProtocolException, IOException
	{
		
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpPost httpPOST=new HttpPost(url);
		
		//Defined Payload(Add data)
		httpPOST.setEntity(new StringEntity(entityString));
		
		//for read headers
		for(Map.Entry<String,String> entry:headersmap.entrySet())
		{
			httpPOST.addHeader(entry.getKey(),entry.getValue());
		}
		
		//Hit url API(Send button)
		CloseableHttpResponse HttpResponse=httpclient.execute(httpPOST);
		
		return HttpResponse;
	}	
		

}
