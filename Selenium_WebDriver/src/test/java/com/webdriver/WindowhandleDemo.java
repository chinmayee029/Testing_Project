package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowhandleDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void bMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
	}
	@Test(enabled=false)
	public void OpenHomepage() {
		driver.findElement(By.id("home")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iter =windows.iterator();
		String w1=iter.next();
		String w2=iter.next();
		System.out.println(w1);
		System.out.println(w2);
		driver.switchTo().window(w2);
		String child=driver.getTitle();
		System.out.println("title of child page:"+driver.getTitle());
		
		}
		
		
	@Test(enabled=false)
	public void Open_multiple_window() {
		//driver.switchTo().window(w1);
		//driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();	
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent page title"+driver.getTitle());
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> iter1 =allwindows.iterator();
		String w3=iter1.next();
		String w4=iter1.next();
		String w5=iter1.next();
		System.out.println(w4);
		System.out.println(w5);
		driver.switchTo().window(w4);
		String hyperlink=driver.getTitle();
		System.out.println("title of the hyperlink page" +hyperlink);
		
		driver.switchTo().window(w5);
		String buttonpage=driver.getTitle();
		System.out.println("Title of button page" +buttonpage);
		
		driver.quit();
		}
		
		
	@Test
	public void do_not_close_me() {
		
	
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("color")).click();
		Set<String>closemewindow=driver.getWindowHandles();
		Iterator<String> iter2=closemewindow.iterator();
		String w7=iter2.next();	
		String w8=iter2.next();	
		String w9=iter2.next();	
		System.out.println(w7);
		System.out.println(w8);
		System.out.println(w9);
		driver.switchTo().window(w8);
		String newpage1=driver.getTitle();
		System.out.println("title of the newpage page" +newpage1);
		driver.switchTo().window(w9);
		String newpage2=driver.getTitle();
		System.out.println("title of the newpage page" +newpage2);
			
		
	}



	
}
