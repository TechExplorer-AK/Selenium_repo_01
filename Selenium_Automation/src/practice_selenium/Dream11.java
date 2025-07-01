package practice_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.dream11.com/");
	driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9865436785");
	driver.findElement(By.xpath("//a[@id='regUser']")).click();
}
}
