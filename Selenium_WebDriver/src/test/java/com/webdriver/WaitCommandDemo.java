package com.webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitCommandDemo {
	
	@Test
	public void Script() {
	System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebDriverWait var_wait =new WebDriverWait(driver,20);
	var_wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUsername")));
	
	driver.findElement(By.name("txtUsername")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
	var_wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
	driver.findElement(By.name("Submit")).click();

    
			
	driver.close();
	
	}
    
	
}
