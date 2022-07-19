package Tester.Test;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RanuTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
	//	driver.get("https://www.myntra.com/");
//		WebElement wb = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//		wb.click();
//		wb.sendKeys("Highlander shoes for men");
//		wb.sendKeys(Keys.ENTER);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//        //driver.close();
		
		
		
	}

}
