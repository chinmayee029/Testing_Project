package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class ToolTipDemo {
	
	@Test
	public void Test()  {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	
	WebElement tooltip_button=driver.findElement(By.id("toolTipButton"));
	
	Actions act=new Actions(driver);
	act.moveToElement(tooltip_button).build().perform();
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='You hovered over the Button']")));
	WebElement tooltip_text=driver.findElement(By.xpath("//*[text()='You hovered over the Button']"));
	String text=tooltip_text.getText();
	System.out.println("Tool tip text:" +text);
	
	
	}

}
