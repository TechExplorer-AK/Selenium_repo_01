package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationsAttributes {
@Test
public void addAccount() {
	WebDriver driver=new ChromeDriver();
	driver.get("demo.guru99.com/V4/manager/addAccount.php");
	Reporter.log("Account has been added successfully!",true);
}
@Test(dependsOnMethods = {"addAccount"})
public void editAccount() {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/V4/manager/editAccount.php");
	Reporter.log("Account details has been updated successfully!",true);
}
@Test
public void deleteAccount() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/V4/manager/deleteAccountInput.php");
	Reporter.log("Account has been deleted successfully!",true);
  }
}
