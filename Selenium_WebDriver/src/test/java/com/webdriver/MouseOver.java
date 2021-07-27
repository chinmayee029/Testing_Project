package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import elements.Attribute;

public class MouseOver {
	
	@Test
	public void Script1()
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement ele1=driver.findElement(By.id("email"));
		
		Actions act1=new Actions(driver);
		act1.sendKeys(ele1,"abc123@abc.com");
		act1.doubleClick(ele1).build().perform();
		
	}

}
