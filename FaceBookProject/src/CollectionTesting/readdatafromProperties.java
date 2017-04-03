package CollectionTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readdatafromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties();
		
	
		
		FileInputStream fis=new FileInputStream("demo.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));

	}

}
