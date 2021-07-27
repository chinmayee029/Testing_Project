package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UnOrderListDemo {
	
	@Test
	public void Script() throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/AutoComplete.html");
	
	WebElement txtbox=driver.findElement(By.id("searchbox"));
	txtbox.sendKeys("a");
	
	Thread.sleep(5000);
	List<WebElement> list=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	System.out.println(list.size());
	
	for(WebElement i:list)
	{
	    
		if(i.getText().equals("Algeria"))
		{	
			i.click();
			break;
		    
		}
		
	
	}
	
	Robot robot1=new Robot();
	Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect1=new Rectangle(screen_size);
	BufferedImage source=robot1.createScreenCapture(rect1);
	File destination=new File("C:\\Users\\Tina\\OneDrive\\Desktop\\New folder");
	ImageIO.write(source, "jpg", destination);
	
	
	}
}