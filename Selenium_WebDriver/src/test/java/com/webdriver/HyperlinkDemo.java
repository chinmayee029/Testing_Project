package com.webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperlinkDemo {
	
	@Test
	public void Script1() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
		driver.findElement(By.linkText("HyperLink")).click();
		
		//Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.linkText("HyperLink")).click();
		
		
		//Find where am supposed to go without clicking me?
		WebElement findlocation=driver.findElement(By.xpath("//a[@link='blue']"));
		String linklocation=findlocation.getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me?"+linklocation);
		

	    //Verify am I broken?
		List<WebElement>verifylink=driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement elements :verifylink)
		{
			String brokenlink=elements.getAttribute("href");
			

			URL url=new URL(brokenlink);
			URLConnection openConnection = url.openConnection();
			HttpURLConnection connection=(HttpURLConnection)openConnection;
			int responseCode = connection.getResponseCode();
			if (responseCode==404) {
				System.out.println(responseCode);
				count ++;
				}
			}
			System.out.println("Broken Link Count"+count);
			
			
			//Go To Home Page
			driver.findElement(By.linkText("Go to Home Page")).click();
		
			driver.findElement(By.linkText("HyperLink")).click();
			
			
			// Link Count
			int lincount=0;
			List<WebElement> linkCount = driver.findElements(By.tagName("a"));
			for (WebElement webelement : linkCount) {
				lincount++;
				System.out.println("Links "+linkCount);
				
				
			}
			System.out.println("Total Link"+lincount);
			
		}
		
		

		


}
