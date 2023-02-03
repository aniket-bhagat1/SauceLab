package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {
	
	public static String  readPropertyFile(String value) throws Exception {
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\amard\\eclipse-workspace\\SauceLab\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
	}
}
