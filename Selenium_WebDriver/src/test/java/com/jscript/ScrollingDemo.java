package com.jscript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingDemo {
	
	
	@Test
	public void Test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	
		
		//scroll to specific location (x,y coordinates)
	     jse.executeScript("scrollTo(0,1500)");
		
		//Horizontal scrolling(x,y coordinates)
		  jse.executeScript("scrollTo(15000,0)");
		
		//scroll up to an element(using scrollintoView)
		WebElement todaysdeal=driver.findElement(By.xpath("//span[@class='a-color-base']"));
			
		jse.executeScript("arguments[0].scrollIntoView(true)",todaysdeal);
		
		//scroll until bottom of the page(using scroll height)
		jse.executeScript("scrollTo(0,document.body.scrollHeight)");
		
		
		
		/*
		//scroll dynamically for loadingpages
		long initialheight=(Long) (jse.executeScript("return document.body.scrollHeight"));
		
		while(true) {
			jse.executeScript("scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			long currentheight=(Long)(jse.executeScript("return document.body.scrollHeight"));
			if(initialheight==currentheight) {
				break;
			}
			initialheight=currentheight;
		}
		*/
			
			
		
	}

}
