package streamTest;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	public static void main(String[] args) 
	{
//		Collect all the links in the web page based on <a> tag.
//		Send HTTP request for the link and read HTTP response code.
//		Find out whether the link is valid or broken based on HTTP response code.
//		Repeat this for all the links captured.

		String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gsmarena.com/");
	List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println(driver.findElements(By.tagName("a")).size());
	Iterator<WebElement> it = li.iterator();



	while(it.hasNext())
	{
		url=it.next().getAttribute("href");
		System.out.println(url);
		if(url == null || url.isEmpty()){
			System.out.println("URL is either not configured for anchor tag or it is empty");
			                continue;
			            }
			            
			            if(!url.startsWith("https://www.gsmarena.com/")){
			                System.out.println("URL belongs to another domain, skipping it.");
			                continue;
			            }
			            
			            try {
			                huc = (HttpURLConnection)(new URL(url).openConnection());
			                
			                huc.setRequestMethod("HEAD");
			                
			                huc.connect();
			                
			                respCode = huc.getResponseCode();
			                
			                if(respCode >= 400){
			                    System.out.println(url+" is a broken link");
			                }
			                else{
			                    System.out.println(url+" is a valid link");
			                }
			                    
			            } catch (MalformedURLException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            } catch (IOException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            }
			        }
			        
	}
}
