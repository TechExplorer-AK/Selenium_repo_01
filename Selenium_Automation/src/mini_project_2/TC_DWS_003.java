package mini_project_2;
//To verify that user is able to click on Digital Downloads

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
@Test
public void digitalDownloads() {
	HomePage hp=new HomePage(driver);
	hp.getDigitalDownloadsLink().click();
	if(driver.getTitle().equals("Demo Web Shop. Digital downloads"))
		Reporter.log("Digital Downloads page is launched",true);
	else
		Reporter.log("Digital Downloads page is failed to launch",true);
}
}
