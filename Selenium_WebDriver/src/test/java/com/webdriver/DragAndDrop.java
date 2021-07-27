package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver d1;
	
	@BeforeMethod
	public void test1() {
	
	    System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");	
		d1=new ChromeDriver();
	
	}
	
	@Test(enabled=false)
	public void droppable() {
		
       
		d1.get("http://www.leafground.com/pages/drop.html");
		WebElement source=d1.findElement(By.id("draggable"));
		WebElement dest=d1.findElement(By.id("droppable"));
		Actions act1=new Actions(d1);
		act1.dragAndDrop(source, dest).build().perform();
		d1.close();
       }
	@Test
	public void draggable() {
		d1.get("http://www.leafground.com/pages/drag.html");
		WebElement e1=d1.findElement(By.id("draggable"));
		Actions act=new Actions(d1);
		act.dragAndDropBy(e1,100,100).build().perform();
		d1.close();
	}
		

}
