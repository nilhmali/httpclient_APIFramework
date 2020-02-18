package basesetup;

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
	
	
	public testbase()
	{
		try{
			prop=new Properties();
		    FileInputStream configFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/configure/config.properties");	
		    prop.load(configFile);
		    
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
