package Tester.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionAssignment {

	@Test
	public void act() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		Actions an = new Actions(driver);
		an.moveToElement(driver.findElement(By.linkText("Multiple Windows"))).click().build().perform();
		driver.findElement(By.cssSelector("a[target='_blank']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.xpath("//body/div/h3")).getText());
        driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.cssSelector(".example")).getText());
	}
}
