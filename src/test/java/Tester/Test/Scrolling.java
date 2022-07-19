package Tester.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	
		//driver.get("https://www.amazon.com/");
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,500)");
//		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Code is not waiting and behaving abruptly
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,3000)");
//		

	}

}
