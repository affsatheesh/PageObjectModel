package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Test
public class LoginUname {

	@FindBy(id="txtUsername")
	public static WebElement Username;
	
	@FindBy(id="txtPassword")
	public static WebElement Password;
	
	@FindBy(id="btnLogin")
	public static WebElement submit;
}
