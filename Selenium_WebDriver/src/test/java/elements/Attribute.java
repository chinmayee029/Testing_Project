package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Attribute {

		
	//pagefactory
	
	@FindBy(name="txtUsername")
	public static WebElement userName;
	
	@FindBy(name="txtPassword")
	public static WebElement passWord;
	
	@FindBy(name="Submit")
	public static WebElement loginbutton;

		
		
	

}
