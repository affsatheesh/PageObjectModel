package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBorad_page_Object {
	
    @FindBy (xpath="//*[@id='task-list-group-panel-menu_holder']//following::td[1]")
	public static WebElement Pending_leave_Request;

}
