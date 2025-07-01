package locators.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/kumar/OneDrive/Desktop/login.html");
//	driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("jack@gmail.com");
	driver.findElement(By.xpath("//input[1]")).sendKeys("smith@gmail.com");
 }
}
