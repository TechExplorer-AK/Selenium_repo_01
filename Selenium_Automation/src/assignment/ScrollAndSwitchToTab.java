package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScrollAndSwitchToTab {
  public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	Actions act=new Actions(driver);
	act.scrollToElement(facebook).perform();
	Thread.sleep(5000);
	facebook.click();
	switchToWindow(driver,"facebook");
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	switchToWindow(driver, "logged_out_dialog");
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Select selMonth= new Select(months);
	
	selMonth.selectByIndex(selMonth.getOptions().size()-1);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/facebook.png");
	FileHandler.copy(temp, dest);
	driver.quit();
}
  public static void switchToWindow(WebDriver driver,String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(expUrl))
				break;
		}
	}
}
