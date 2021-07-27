package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo {
	@Test
	public void Script1() 
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Checkbox")).click();
		
		//java
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//vb
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		
		//sql
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//c
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		
				
		//c++
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		
		//Confirm Selenium is checked
	     WebElement	isChecked=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		 System.out.println("Selenium is checked"+isChecked.isSelected());
		 
		 //DeSelect only checked
		WebElement notselected=driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		System.out.println("Not Selected"+notselected.isSelected());
		 
		
		//Select all below checkboxes
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
				
		driver.quit();
		
	}

}
