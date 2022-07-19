package Tester.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Test\\src\\test\\java\\TestData.properties");
		pr.load(fis);
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("url"));
		pr.setProperty("browser", "firefox");
		System.out.println(pr.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\Test\\src\\test\\java\\TestData.properties");
	pr.store(fos, null);

	}

}
