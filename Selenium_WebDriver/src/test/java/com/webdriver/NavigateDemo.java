package com.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateDemo {
	
	@Test
	public void test() {
		
	
	System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println("Title of application is:"+title);  //title
	
	driver.navigate().to("https://www.facebook.com");
	System.out.println("Title is:" +driver.getTitle()); //facebook
	driver.navigate().back(); //google
	driver.navigate().forward(); //facebook
	driver.navigate().refresh(); 
	
	
	}
}
