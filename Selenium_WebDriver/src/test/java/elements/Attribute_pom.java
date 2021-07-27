package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Attribute_pom {
	
	public WebElement username(WebDriver d1)
	{
		return	d1.findElement(By.name("txtUsername"));
	}

	

	public  WebElement password(WebDriver d1)
	{
		return	d1.findElement(By.name("txtPassword"));
	}
	

	public  WebElement loginbutton(WebDriver d1)
	{
		return	d1.findElement(By.id("btnLogin"));
	}
	

}
