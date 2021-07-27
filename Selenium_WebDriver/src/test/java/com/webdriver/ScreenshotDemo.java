package com.webdriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
	
	 @Test
      public void test() throws AWTException, IOException {
		
        System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		
		d1.findElement(By.linkText("Alert")).click();
		
		//AlertBox
		d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		
		Alert alt=d1.switchTo().alert();
		
		System.out.println("alert message:-" +alt.getText());
		alt.accept();
		
		
		Robot robot1=new Robot();
		Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect1=new Rectangle(screen_size);
		BufferedImage source=robot1.createScreenCapture(rect1);
		File destination=new File("C:\\Users\\Tina\\OneDrive\\Desktop\\screen2");
		ImageIO.write(source, "jpg", destination);
       }

}
