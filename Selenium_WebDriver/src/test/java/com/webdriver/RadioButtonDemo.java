package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonDemo {
	
	@Test
	public void Script1() 
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		
		driver.findElement(By.name("0")).click();
		
		
		//Find default selected radio button
		driver.findElement(By.name("news")).click();
		
		driver.findElement(By.xpath("//input[@type='radio'][3]")).click();
		
		//Select your age group (Only if choice wasn't selected)
		driver.findElement(By.name("age")).click();
		
		driver.findElement(By.xpath("//input[@name='age'][1]")).click();
		
		driver.findElement(By.xpath("//input[@name='age'][2]")).click();
		
		
		
	}

}
