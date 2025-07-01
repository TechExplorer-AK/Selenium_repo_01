package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Identifying search box and sending data to that text field and clicking on Enter
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone",Keys.ENTER);
}
}
