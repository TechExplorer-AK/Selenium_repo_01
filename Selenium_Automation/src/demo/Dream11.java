package demo;

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

public class Dream11 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.dream11.com/");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("regEmail")).sendKeys("952896");
	driver.findElement(By.linkText("GET APP LINK")).click();
	System.out.println(driver.findElement(By.xpath("//label[@id='errorMob']")).getText());
	driver.switchTo().defaultContent();
	Actions act=new Actions(driver);
	act.scrollByAmount(0,3000);
	driver.findElement(By.linkText("About Us")).click();
	switchToWindows(driver,"Home - Dream Responsibly");
    driver.findElement(By.linkText("Dream Responsibly")).click();
	switchToWindows(driver,"https://www.dreamsports.group/dream-responsibly/dream-stories");
	driver.findElement(By.linkText("Dream Stories")).click();

	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/dream11.png");
	FileHandler.copy(temp, dest);
	
}

	public static void switchToWindows(WebDriver driver,String expUrl) {
		 Set<String> allids = driver.getWindowHandles();
		 
		 for(String id:allids) {
			 driver.switchTo().window(id);
			 
			 if(driver.getCurrentUrl().equals(expUrl))
				 break;
		 }
	}
}
	


