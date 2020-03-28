package cta.test.practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


			File src=new File("./Configuration1/Config.property");

			FileInputStream fis=new FileInputStream(src);

			Properties pro=new Properties();

			pro.load(fis);

			String chromepath=pro.getProperty("chromeDriver");

			System.out.println("Hey chrome path is " + chromepath);

			}
			
	}


