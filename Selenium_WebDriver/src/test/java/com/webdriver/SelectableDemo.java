package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;

public class SelectableDemo {
	
	@Test
	public void orderlist() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		
		driver.findElement(By.xpath("//a[@href='#Serialize']")).click();
		
		List<WebElement>serialize=driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		
		System.out.println(serialize.size());
		
		for(WebElement elements:serialize)
		{
			System.out.println(elements.getText());
		}
		
		Actions act=new Actions(driver);
		    act.keyDown(Keys.CONTROL)
		       .click(serialize.get(0))
		       .click(serialize.get(2))
		       .click(serialize.get(4))
		       .build().perform();
		    
		 
		 
		TakesScreenshot s1=(TakesScreenshot) driver;
		File Source=s1.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\Tina\\OneDrive\\Desktop\\screen1");
		FileHandler.copy(Source, destination);
	}

}
