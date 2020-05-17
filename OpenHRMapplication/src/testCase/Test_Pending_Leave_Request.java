package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import pageObject.DashBorad_page_Object;
import pageObject.LoginUname;

public class Test_Pending_Leave_Request extends CommonFunction
{
	
String text=null;
	
	
     public void login() throws InterruptedException
     {
    	
    	 PageFactory.initElements(driver,LoginUname.class);
    	 LoginUname.Username.sendKeys(properties.getProperty("username"));
    	 LoginUname.Password.sendKeys(properties.getProperty("password"));
    	 LoginUname.submit.click();
     }
	public void verify_Request_Code()
	{
		 PageFactory.initElements(driver,DashBorad_page_Object.class);
	     text =	DashBorad_page_Object.Pending_leave_Request.getText();
	}
	@Test
	public void leave_Request() throws InterruptedException
	{
	login();
    verify_Request_Code();
	Assert.assertEquals(text,"No Records are Available");
	}
}

