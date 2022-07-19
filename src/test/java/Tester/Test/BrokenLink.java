package Tester.Test;

import java.util.Scanner;
import java.util.Stack;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String one:");
	    String st1 = sc.nextLine();
	    System.out.println("Enter String Two:");
	    String st2 = sc.nextLine();
	    
	    char ch1[]=st1.toCharArray();
	    char ch2[]=st2.toCharArray();
	     Stack<Character> stack = new Stack<>();
	     for(int i=0;i<ch1.length;i++)
	     {
	         if(ch1[i] == '#' && !stack.isEmpty())
	         {
	             stack.pop();
	         }
	         else
	         {
	             stack.push(ch1[i]);
	         }
	     }
	     for(int j=0;j<ch2.length;j++)
	     {
	         if(ch2[j] == '#' && !stack.isEmpty())
	         {
	             stack.pop();
	         }
	         else{
	             stack.push(ch2[j]);
	         }
	     }
	     if(st1.equalsIgnoreCase(st2))
	     {
	         System.out.println("output is 1");
	     }   
	     
	     else{
	         System.out.println("output is zero");
	     }
	    }
}
