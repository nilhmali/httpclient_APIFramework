package Basesetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class testbase {
	
	public static Properties prop;
	
	public int RESPONSE_STATUSCODE_200=200;
	public int RESPONSE_STATUSCODE_201_CREATED=201;
	public int RESPONSE_STATUSCODE_400=400;
	public int RESPONSE_STATUSCODE_401=401;
	public int RESPONSE_STATUSCODE_404=404;
	public int RESPONSE_STATUSCODE_500=500;
	public int ReturnJsondata_validatePage=1;
	public String jsonArray_ValidateLastname="Holt";
	public String Header_ValidateContentType="application/json; charset=utf-8";
	public String ReturnJsondata_validAuthetication="Operation completed successfully";
	public String headerForAuthetication="application/json";
	public String ReturnJsondata_InvalidAuthetication="Invalid username or password";
	public String ConfigureFile;
	public FileInputStream loadApis;
	
	public testbase()
	{
		try{
			prop=new Properties();
			ConfigureFile=System.getProperty("user.dir")+"/resource/config_RestAssured.properties";
		    loadApis=new FileInputStream(ConfigureFile);
		    prop.load(loadApis);
		    
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
