package mini_project_2;
//To verify that user is able to click on Gift Cards

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{
@Test
public void giftCards() {
	HomePage hp=new HomePage(driver);
	hp.getGiftCardLink().click();
	if(driver.getTitle().equals("Demo Web Shop. Gift Cards"))
		Reporter.log("Gift Cards page is launched",true);
	else
		Reporter.log("Gift Cards page is failed to launch",true);
}
}
