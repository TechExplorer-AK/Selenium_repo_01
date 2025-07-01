package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentXpath {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	//Using Xpath() By contains to identify 'Train tickets' element
	driver.findElement(By.xpath("//span[contains(text(),'Train')]")).click();
	Thread.sleep(5000);
	//Using Xpath() By contains to identify 'Train Live status' element
	driver.findElement(By.xpath("//span[contains(text(),'Live train')]")).click();
	Thread.sleep(8000);
	//Using Dependent and Independent Xpath to find first 'Show Availability' element
	driver.findElement(By.xpath("")).click();

	Thread.sleep(5000);
 }
}
