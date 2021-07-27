package com.webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	
	@Test
	public void test() {
		
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
		
		//confirm alert
		d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		
		Alert a1=d1.switchTo().alert();
		System.out.println("confirm box message:-"+alt.getText());
		a1.dismiss();
		
		//prompt box
		d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		
		Alert a2=d1.switchTo().alert();
		System.out.println("prompt box message:-"+a2.getText());
		
		a2.sendKeys("HI");
		a2.accept();
		
		d1.close();
		
		
		
		
		
		
	}
	

}
