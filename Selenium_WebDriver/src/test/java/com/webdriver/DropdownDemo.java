package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo {
	
	@Test
	public void Script1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Drop down")).click();
		
		//Select training program using index
		
	
		WebElement dd1=driver.findElement(By.id("dropdown1"));
		dd1.click();
		
		Select s1=new Select(dd1);
		s1.selectByIndex(1); //selenium
		
		System.out.println("Is dropdown support multiple selection -" +s1.isMultiple());
		
		
	
		//select training program using text
		WebElement dd2=driver.findElement(By.name("dropdown2"));
		dd2.click();
		
		Select s2=new Select(dd2);
		s2.selectByVisibleText("Appium"); //Appium
		
		//select training program using value
		
		WebElement dd3=driver.findElement(By.xpath("//select[@id='dropdown3']"));
		dd3.click();
		
		Select s3=new Select(dd3);
		s3.selectByValue("3"); 
		
		//get the number of dropdownoption
		WebElement dd4=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s4=new Select(dd4);
		s4.selectByIndex(4);
		
		List<WebElement> number= s4.getOptions();
		System.out.println("number odf dropdown:" +number.size());
		
	
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("Appium");
		
		
		//select your program
		
		WebElement drpdown=driver.findElement(By.xpath("//select[@multiple='']"));
	
		Select s5=new Select(drpdown);
		s5.selectByVisibleText("Selenium");
		s5.selectByIndex(3);
		System.out.println("multiple selection in select your program:"+s5.isMultiple());//true
		
		
				
		
	}


}
