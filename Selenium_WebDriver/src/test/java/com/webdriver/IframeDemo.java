package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo {
	
	@Test
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		//go to frame
		driver.findElement(By.linkText("Frame")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//i am inside a frame
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		int size=driver.findElements(By.xpath("//iframe[@src='default.html']")).size();
		System.out.println("Size of the inside a frame :"+size);
		
		
		//i am inside a nested frame
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("frame2")).click();
		int size1=driver.findElements(By.xpath("//iframe[@src='default.html']")).size();
		System.out.println("Size of the nested frame :"+size1);
		
		
		
	
		
		//find total no of frame
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames:-"+totalFrames.size());
		
		
		driver.close();
			
		
	}
	
	

}
