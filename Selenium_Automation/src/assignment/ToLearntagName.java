package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearntagName {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Facebook – log in or sign up")) {
		System.out.println("Login page displayed");
	}
	else {
		System.out.println("Login page is not displayed");
	}
	driver.findElement(By.partialLinkText("Contact")).click();
	List<WebElement> allh1 = driver.findElements(By.tagName("h1"));
	
	List<WebElement> allh2 = driver.findElements(By.tagName("h2"));
	List<WebElement> allh3 = driver.findElements(By.tagName("h3"));
	List<WebElement> allh4 = driver.findElements(By.tagName("h4"));
	List<WebElement> allh5 = driver.findElements(By.tagName("h5"));
	List<WebElement> allh6 = driver.findElements(By.tagName("h6"));
	
	 int totalheaders = allh1.size()+allh2.size()+allh3.size()+allh4.size()+allh5.size()+allh6.size();
     System.out.println("Total Header tags:"+totalheaders); 
 }
}

