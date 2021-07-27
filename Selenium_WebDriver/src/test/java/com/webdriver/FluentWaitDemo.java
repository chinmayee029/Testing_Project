package com.webdriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWaitDemo {
	
	
	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String title=driver.getTitle();
	System.out.println("Title of application is:"+title);  //title
	
	 FluentWait wait1 = new FluentWait(driver)
             .withTimeout(20, TimeUnit.SECONDS)
             .pollingEvery(10, TimeUnit.SECONDS)
             .ignoring(NoSuchElementException.class);
	 
	 driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		
		
	

	}
	
	
}
