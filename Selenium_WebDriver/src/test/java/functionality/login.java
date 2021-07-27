package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.Attribute;


public class login {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		
		d1.get("https://opensource-demo.orangehrmlive.com/");
		PageFactory.initElements(d1,Attribute.class);
		
		Attribute.userName.sendKeys("admin");
		Attribute.passWord.sendKeys("admin123");
		Attribute.loginbutton.click();
		
		
	}

}
