package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Executing script BASED on priority of Test Cases
public class AnnotationsAttributes {
 @Test(priority=-10,invocationCount = 4,threadPoolSize =3)
 public void register() {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/register");
	 Reporter.log("Registered successfully!",true);
	 
 }
 @Test(priority=-8,invocationCount = 1, enabled = false)
 public void login() {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/login");
	 Reporter.log("Logged in successfully",true);
	 
 }
}
