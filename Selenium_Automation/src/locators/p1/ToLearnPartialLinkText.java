package locators.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartialLinkText {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Books")).click();
	driver.findElement(By.partialLinkText("Copy")).click();
	Thread.sleep(2000);
	driver.navigate().back();

	driver.findElement(By.partialLinkText("Computers")).click();
	driver.findElement(By.partialLinkText("Notebooks")).click();
	
	
}
}
