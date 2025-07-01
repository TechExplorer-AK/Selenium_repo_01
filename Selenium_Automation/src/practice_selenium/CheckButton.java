package practice_selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/23");
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("560010");
	driver.findElement(By.xpath("//button[@id='Check']")).click();
}
}
