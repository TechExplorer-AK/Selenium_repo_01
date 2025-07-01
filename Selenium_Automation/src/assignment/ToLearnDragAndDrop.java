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

public class ToLearnDragAndDrop {
  public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(photoFrame);
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(img1, trash).perform();
	
	WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	act.dragAndDrop(img2, trash).perform();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.globalsqa.com/sql-cheat-sheet/"))
			break;
	}
	
	WebElement sqlJoins = driver.findElement(By.xpath("(//img[@loading='lazy'])[2]"));
	
	act.scrollToElement(sqlJoins).perform();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/sql_joins.png");
	FileHandler.copy(temp, dest);	
	
}
}
