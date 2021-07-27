package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	WebDriver driver;
	
	@Given("open chrome and url of application")
	public void open_chrome_and_url_of_the_application() {
	System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	
	
	@When("enter username and password")
	public void enter_username_and_password() {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	}
	
	@Then("login to the account")
	public void login_to_account() {
		System.out.println("login to the application");
	}
	
	

}
