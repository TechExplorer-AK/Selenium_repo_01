package mini_project_2;
//To verify that user is able to click on Apparel & Shoes

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
@Test
public void apparelShoes(){
	HomePage hp=new HomePage(driver);
	hp.getApparelShoesLink().click();
	if(driver.getTitle().equals("Demo Web Shop. Apparel & Shoes"))
		Reporter.log("Apparel & Shoes page is launched",true);
	else
	   Reporter.log("Apparel & Shoes page is failed to launch",true);
}
}
