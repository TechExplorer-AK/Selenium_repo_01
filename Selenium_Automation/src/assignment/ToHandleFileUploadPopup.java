package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.freshersworld.com/");
	
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\kumar\\Downloads\\Introduction to Machine Learning pdf.pdf");
	WebElement jobs = driver.findElement(By.xpath("//a[text()='Jobs']"));
	driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
//	Thread.sleep(5000);
//	Actions act=new Actions(driver);
//	act.moveToElement(jobs).perform();
}
}
