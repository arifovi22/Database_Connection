package readUtility;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;



public class ReadProperties {
	//this is the instance of the class and its returning the properties instance 
	//map store data like key and value
	public static Map<String,String> readProperties() {
		//this prop will load and read the properties
		Properties prop = new Properties();
		FileInputStream fi;
		try {
			fi = new FileInputStream("C:\\Users\\hoque\\eclipse-workspace\\database\\Utility\\Utility.properties");//this line will
			//give you exception so we need try/catch
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, String> properties = new HashMap<String, String>();
		Enumeration<Object> keyValue = prop.keys();
		while(keyValue.hasMoreElements()) {
			//casting
		String key = (String) keyValue.nextElement();
		String value = prop.getProperty(key);
		properties.put(key, System.getProperty(key, value));
		}
		return properties;
		
		}
	}
	



