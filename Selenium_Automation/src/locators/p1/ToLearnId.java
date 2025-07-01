package locators.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
//	driver.get("https://www.facebook.com/");
//	driver.findElement(By.id("email")).sendKeys("aniket@gmail.com");
	//Above firstly, id locater searches for "email text field" element and set the value
	driver.findElement(By.name("q")).sendKeys("mobiles");
	}
}
