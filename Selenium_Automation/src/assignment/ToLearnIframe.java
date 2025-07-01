package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframe {
 public static void main(String[] args) throws IOException  {
	String time = LocalDateTime.now().toString().replace(":", "-");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://petdiseasealerts.org/");
	driver.findElement(By.xpath("//a[text()='Go to maps']")).click();
//	Thread.sleep(15000);
	WebElement iframeMap = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	
	driver.switchTo().frame(iframeMap);
	WebElement state = driver.findElement(By.name("Montana"));
//	WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait1.until(ExpectedConditions.visibilityOf(state));+
	
	state.click();
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	driver.findElement(By.xpath("//input[@id='user']")).sendKeys("jack458@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jack@5486");
	driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("jack@5486");
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jack");
	
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Smith");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8456214792");
    WebElement userType = driver.findElement(By.xpath("//select[@id='user-type']"));
    Select selUserType=new Select(userType);
    selUserType.selectByIndex(3);
    
    driver.findElement(By.xpath("//input[@id='accept-tou']")).click();
    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
    
    WebElement addAlert = driver.findElement(By.xpath("//span[text()='Add Alert']"));
    WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait2.until(ExpectedConditions.visibilityOf(addAlert));
    TakesScreenshot ts=(TakesScreenshot) driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshots/"+time+".png");
    FileHandler.copy(temp, dest);
	
	
}
}
