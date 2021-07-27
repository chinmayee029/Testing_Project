package cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetcookieDemo {
	
	
	@Test
	public void script() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File file=new File("Mycookie.data");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie ck:cookies)
		{   
			bw.write(ck.getName()+";"+ck.getDomain()+" ;"+ck.getPath()+";"+ck.getValue()+";"+ck.getExpiry()+";"+ck.isSecure());
			bw.newLine();
			System.out.println(ck.getName()+" "+ck.getDomain()+" "+ck.getPath()+" "+ ck.getClass()+" "+ck.getExpiry());
		}
		
		bw.close();
		fw.close();
		
		
		
	}


}
