package com.webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {
	
	@Test
	public void test()
	{
			
	System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
	
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/download.html");
	d1.findElement(By.linkText("Download Excel")).click();
	
	
	File f1=new File("C:\\Users\\Tina\\Downloads");
	File[]totalfile=f1.listFiles();
	for(File type_file:totalfile)
	{
		if(type_file.getName().equalsIgnoreCase("testleaf.xls"));
		{
		System.out.println("file exist");
		break;
		}
	}
	
	}
}
