package Tester.Test;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("chrome://downloads/");
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	

//		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript ("document.getElementById('file-link').value='Selenium'");
		
		String s1 = "lala";
		String s2 ="lala";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3 = new String(s2);
		String s4 = new String(s3);
		System.out.println(s3==s2);
		System.out.println(s3.equals(s2));
		System.out.println(s3.equals(s4));
		
	}

}
