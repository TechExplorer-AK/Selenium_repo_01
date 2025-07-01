package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Returns "placeholder" attribute value
	String value = driver.findElement(By.xpath("//input[@name='q']")).getAttribute("placeholder");
	System.out.println(value);
 }
}
