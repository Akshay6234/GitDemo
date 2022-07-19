package Tester.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {

	@Test
	 public void m2()
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
	 }
}
