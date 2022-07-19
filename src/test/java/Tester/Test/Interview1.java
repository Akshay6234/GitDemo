package Tester.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interview1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.gsmarena.com");
		driver.manage().window().maximize();

		
		//an.moveToElement(driver.findElement(By.xpath("//input[@id=\'topsearch-text\']")).sendKeys("Galaxy A7"));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		
		driver.findElement(By.xpath("//input[@id=\'topsearch-text\']")).sendKeys("Galaxy A7");
		Actions an = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		an.moveToElement(driver.findElement(By.xpath("//*[@id=\"topsearch\"]/div[1]/div[2]/ul/li[4]/a/span"))).click().build().perform();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'hits')]")).getText());
		driver.close();

}
}
