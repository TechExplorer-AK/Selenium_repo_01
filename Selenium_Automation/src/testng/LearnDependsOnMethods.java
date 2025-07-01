package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnDependsOnMethods {
@Test
public void register() {
	WebDriver driver=new ChromeDriver();
	driver.get("demowebshop.tricentis.com/register");
	Reporter.log("Registered successfully!",true);
}
@Test(dependsOnMethods ="register")
public void login() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("Logged in successfully",true);
}
@Test(dependsOnMethods = {"login","register"})
public void addToCart() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/cart");
	Reporter.log("Product added to the cart successfuly!");
}

}
