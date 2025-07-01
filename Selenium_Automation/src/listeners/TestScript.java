package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass1 {
@Test
public void login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("virat@1");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not dispalyed");
	Reporter.log("Home page is displayed",true);                                                                                                
}
}
