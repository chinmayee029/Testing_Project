package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadFile {
	
	    @Test
        public void test() throws AWTException, InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/upload.html");
		d1.findElement(By.name("filename")).click();
		
		Thread.sleep(5000);
		StringSelection select=new StringSelection("C:\\Users\\Tina\\OneDrive\\Desktop\\New folder");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		
     }
}
