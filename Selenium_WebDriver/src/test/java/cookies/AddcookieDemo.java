package cookies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddcookieDemo {
	
	@Test
	public void test() throws IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File file=new File("amazoncookie.data");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String	strLine;
		while((strLine=br.readLine())!=null) 
		{
			StringTokenizer token=new StringTokenizer(strLine,";");
			while(token.hasMoreTokens())
			{
				String name=token.nextToken();
				String domain=token.nextToken();
				String path=token.nextToken();
				String value=token.nextToken();
				Date expire=null;
				Boolean secure=new Boolean(token.nextToken());
				
				
				Cookie ck=new Cookie(name,domain,path,value,expire,secure);
				driver.manage().addCookie(ck);				
				
			}
		}
		br.close();
		fr.close();
		//driver.findElement(By.)
		
		
		
	}

}
