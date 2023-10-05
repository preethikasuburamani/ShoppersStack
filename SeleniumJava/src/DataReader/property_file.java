package DataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property_file {

	public static void main(String[] args) throws IOException {
		
	
	//create an object of FIS (FileInputStream)
	FileInputStream FIS = new FileInputStream("./resourse/Pdata.properties");
	
	//Create an aobject for File type
	Properties pro = new Properties();
	
	//resd the data
	
	pro.load(FIS);
	
	System.out.println(pro.stringPropertyNames());
	
	System.out.println(pro.getProperty("name"));
	System.out.println(pro.getProperty("chromeDriverKey"));
	System.out.println(pro.getProperty("chromeDriverPath"));
	}
}
