package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
	
	
	@Test
	public void Script1()
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.linkText("Edit")).click();
		
		//Enter email address
		driver.findElement(By.id("email")).sendKeys("abc@123");
		
		//append a text
		driver.findElement(By.cssSelector("input[value='Append ']")).clear();
		driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("Chinmayee");
		
		
		//Get default text entered
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("abc");
		
		//Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
		
		driver.close();
			
		
	}
	

}
