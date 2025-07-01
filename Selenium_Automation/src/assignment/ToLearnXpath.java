package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/kumar/OneDrive/Desktop/login.html");
	//Finding checkbox element using Absolute xpath() Locator
	driver.findElement(By.xpath("/html/body/input[4]")).click();
	//Finding radio button element using Relative xpath() Locator
	driver.findElement(By.xpath("//input[6]")).click();
	//Finding link element using Absolute xpath() Locator
	driver.findElement(By.xpath("/html/body/a")).click();
  }
}
