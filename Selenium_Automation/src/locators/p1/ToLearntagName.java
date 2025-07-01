package locators.p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearntagName {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Returns list of Web Elements i.e. list of links
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	System.out.println(alllinks);
	System.out.println("Total Links: "+alllinks.size());//getting all links
	List<WebElement> allimg = driver.findElements(By.tagName("img"));
	System.out.println("Total images: "+allimg.size());//getting all images
	System.out.println(alllinks);
 }
}
