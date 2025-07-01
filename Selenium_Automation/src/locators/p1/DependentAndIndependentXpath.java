package locators.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentXpath {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	//Using Xpath() by contains to identify 'Cancellation & Refund' element
	driver.findElement(By.xpath("//div[contains(text(),'Refund')]")).click();
	//Using Dependent and Independent Xpath() to identify '+' element
	driver.findElement(By.xpath("//span[contains(text(),'reschedule')]/..//i[contains(@class,'plusMinus icon ')]")).click();
	Thread.sleep(3000);
	//Using Dependent and Independent Xpath() to identify '-' element
	driver.findElement(By.xpath("//span[contains(text(),'reschedule')]/..//i[contains(@class,'plusMinus icon')]")).click();
  }
}
