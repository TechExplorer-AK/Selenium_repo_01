package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToGetExternalDataProvider {
	@Test(dataProviderClass = DataStorage.class,dataProvider = "loginData")
	public void login(String[] cred) {//For one Test CASE execution we need only one set of data
	//It will execute test case one by one 4 times for different set of data
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
	}
}
