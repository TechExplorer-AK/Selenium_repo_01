package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ImplicitlyWait {
  public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String time = LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Raj");
	driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//span[text()='Male']/..//input[@type='radio']")).click();
	driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9547895416");
	driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("raj214@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ghT@4451");
	driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("ghT@4451");
	driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File("./screenshots/"+time+".png");
	FileHandler.copy(temp, dest);
	driver.quit();
	

}
}
