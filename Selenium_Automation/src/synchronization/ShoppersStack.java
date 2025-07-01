package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Giving 20 sec wait time to load the all the elements
	//Once element is loaded, it will not wait for further seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Used to check whether Webpage IS loaded within specified time or not. 
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
	driver.get("https://www.shoppersstack.com/");
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	List<WebElement> allImgs = driver.findElements(By.tagName("img"));
	System.out.println(allImgs.size());
}
}
