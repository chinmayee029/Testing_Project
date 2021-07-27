package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elements.Attribute_pom;



public class Login_pom {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		
		d1.get("https://opensource-demo.orangehrmlive.com/");
		
		Attribute_pom att=new Attribute_pom();
		att.username(d1).sendKeys("admin");
		att.password(d1).sendKeys("admin123");
		att.loginbutton(d1).click();
		System.out.println("login succesfully");
		
		
	}

}
