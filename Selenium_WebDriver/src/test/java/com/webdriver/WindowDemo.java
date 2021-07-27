package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowDemo {
	@Test
	public void OpenHomepage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.findElement(By.id("home")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iter =windows.iterator();
		String w1=iter.next();
		String w2=iter.next();
		System.out.println(w1);
		System.out.println(w2);
		driver.switchTo().window(w2);
		String child=driver.getTitle();
		System.out.println("title of child page:"+driver.getTitle());
				
		driver.switchTo().window(w1);				
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();	
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent page title"+driver.getTitle());
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> iter1 =allwindows.iterator();
		String w3=iter1.next();
		String w4=iter1.next();
		String w5=iter1.next();
		String w6=iter1.next();
		System.out.println(w5);
		System.out.println(w6);
		driver.switchTo().window(w5);
		String hyperlink=driver.getTitle();
		System.out.println("title of the hyperlink page" +hyperlink);				
		driver.switchTo().window(w6);
		String buttonpage=driver.getTitle();
		System.out.println("Title of button page" +buttonpage);
	
		}
		
		

	
	
	
	

	 


}
