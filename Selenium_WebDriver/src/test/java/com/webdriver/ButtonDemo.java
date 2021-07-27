package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonDemo {
	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Button.html");
		
		d1.findElement(By.id("home"));
		d1.findElement(By.id("position"));
		d1.findElement(By.id("color"));
		d1.findElement(By.id("position"));
		d1.findElement(By.id("size")).click();
		d1.quit();
		
	
	
			
	
	
	}

}
