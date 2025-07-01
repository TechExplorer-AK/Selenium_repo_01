package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelector {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://demowebshop.tricentis.com/"))
	{
		System.out.println("Welcome page is displayed!!");
	}
	else {
		System.out.println("Welcome page is not dispalyed!!");
	}
	//Finding button element using cssSelector Locator
	driver.findElement(By.cssSelector("input[value='Vote']")).click();
  }
}
