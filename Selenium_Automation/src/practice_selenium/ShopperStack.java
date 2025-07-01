package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShopperStack {
@Test
public void placeOrder() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://shoppersstack.com/");
	
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("harish254@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("ghty456&Q");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	Actions act=new Actions(driver);
    Thread.sleep(6000);
	act.moveByOffset(529, 93).perform();
	
	driver.findElement(By.partialLinkText("T-SHIRTS")).click();
	driver.findElement(By.id("search")).sendKeys("nike",Keys.ENTER);
	
}
}
