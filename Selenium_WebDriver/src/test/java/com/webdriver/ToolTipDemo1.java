package com.webdriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;


public class ToolTipDemo1 {
	
	@Test
	public void tooltip() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement your_age=driver.findElement(By.xpath("//input[@id='age']"));
		String actual_tooltip=your_age.getAttribute("title");
		System.out.println("actual title of tool tip..."+actual_tooltip);
		String exp_tooltip="We ask for your age only for statistical purposes.";
		
		if(actual_tooltip.equals(exp_tooltip))
		{
			System.out.println("Test passed");
		}
		
		driver.close();
		
			
	}
}
