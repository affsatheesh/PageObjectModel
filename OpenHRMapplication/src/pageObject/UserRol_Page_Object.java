package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRol_Page_Object 
{
@FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
public static WebElement Username;
@FindBy(xpath= "//select[@id='searchSystemUser_userType']")
public static WebElement userRole;
@FindBy(xpath= "//select[@id='searchSystemUser_status']")
public static WebElement Status;
@FindBy(xpath = "//input[@id=\"searchBtn\"]")
public static WebElement  Search;
@FindBy(xpath = "//tr[1]/td[3]")
public static WebElement UserRoleResult;
@FindBy(xpath = "//tr[1]/td[5]")
public static WebElement StatusResult;

@FindBy(linkText="Admin")
public static WebElement Admin;

@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
public static WebElement UserManagement;

@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
public static WebElement Users;

}