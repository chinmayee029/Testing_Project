package cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookie {
	
	@Test
	public void test()
	{
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().deleteCookieNamed("csm-hit");
		//driver.manage().deleteAllCookies();
					
		//after adding the cookie we will check that by displaying all the cookies
		Set<Cookie>cookieslist=driver.manage().getCookies();
		for(Cookie getcookies:cookieslist)
		{
			System.out.println(getcookies);
		}
	
	}
}
