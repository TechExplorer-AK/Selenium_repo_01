package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToLearnRightClick {
 public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	WebElement rightClickEle = driver.findElement(By.xpath("//button[@id='btn_a']"));
	//Performing Right Click operation on the Web Element
	Actions act=new Actions(driver);
	act.contextClick(rightClickEle).perform();
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	
	//Capturing Text and Color of pop Message
	WebElement textMsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
	System.out.println(textMsg.getText());
    System.out.println(textMsg.getCssValue("color"));
    
  //Capturing Screenshot of Web-page
    TakesScreenshot ts= (TakesScreenshot) driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshots/rightClick.png");
    FileHandler.copy(temp, dest);
	
	
	
}
}
