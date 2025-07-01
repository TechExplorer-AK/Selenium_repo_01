package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSubmit {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Performing click operation using submit() method
	//driver.findElement(By.xpath("//input[@type='submit']")).submit();
	driver.findElement(By.xpath("//input[@value='Search']")).submit();
}
}
