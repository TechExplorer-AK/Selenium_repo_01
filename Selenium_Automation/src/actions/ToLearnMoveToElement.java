package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToLearnMoveToElement {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.vtiger.com/");
	WebElement feature = driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]"));
	Actions act=new Actions(driver);
	//Performing Mouse Hover operation using Element address
	act.moveToElement(feature).perform();
	WebElement salAutomation = driver.findElement(By.xpath("(//a[contains(text(),'Sales Automation')])[1]"));
	//Performing Mouse Hover operation using Element address
	act.moveToElement(salAutomation).perform();
}
}
