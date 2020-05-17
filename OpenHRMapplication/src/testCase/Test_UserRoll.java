package testCase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import pageObject.UserRol_Page_Object;

public class Test_UserRoll extends CommonFunction
{ 
	public void UserRole_login()
	{
	
	Actions action = new Actions(driver);
	action.moveToElement(UserRol_Page_Object.Admin);
	action.moveToElement(UserRol_Page_Object.UserManagement);
	action.moveToElement(UserRol_Page_Object.Users);
	action.click().build().perform();
	}
	public void Select_UserRole_status()
	{
		Select select = new Select(UserRol_Page_Object.userRole);
		select.selectByIndex(1);
	}
	public void Select_User_Status() { 
	
		Select select = new Select(UserRol_Page_Object.Status);
		select.selectByIndex(1);
	}
	
	public void SearchClick()
	{
		UserRol_Page_Object.Search.click();
	}
	public void VarifyText()
	{
		String Result = UserRol_Page_Object.UserRoleResult.getText();
		String Statusresult = UserRol_Page_Object.StatusResult.getText();
		
		Assert.assertEquals(Result, "Admin");
		Assert.assertEquals(Statusresult, "Enabled");
		
	}
	@Test
	public void CheckEverything() 
	{
		PageFactory.initElements(driver, UserRol_Page_Object.class);
		UserRole_login();
		Select_UserRole_status();
		Select_User_Status();
		SearchClick();
		VarifyText();
	}
}
	