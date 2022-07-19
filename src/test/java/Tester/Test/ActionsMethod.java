package Tester.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMethod {

	@Test
	public void act() throws InterruptedException
	{
//
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		Actions an = new Actions(driver);
//		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
//		an.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
//		Thread.sleep(5000);
//		//Context click is work like right click
		
HashMap<String, Character> hm = new HashMap<String, Character>();
hm.put("kabir",'D');
System.out.println("Value is :"+hm);

//driver.close();
List<Integer> al = new ArrayList<Integer>();

al.add(1);
al.add(11);
al.add(2);
al.add(4);
al.add(20);
al.add(12);
System.out.println(al);
Iterator it=al.iterator();
while(it.hasNext())
{
System.out.println(it.next());

}


		
	}
}
