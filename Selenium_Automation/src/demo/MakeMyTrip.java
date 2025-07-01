package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	WebElement fromCity = driver.findElement(By.xpath("//div[contains(@class,'searchCity')]"));
	fromCity.click();
	
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata");
    Thread.sleep(2000);

    driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
    Thread.sleep(2000);
	
	WebElement toCity = driver.findElement(By.xpath("//div[contains(@class,'searchToCity')]"));
	toCity.click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru");
    driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
//	driver.findElement(By.xpath("//label[@for='departure']")).click();
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	driver.findElement(By.xpath("(//div[text()='August 2025']/../..//div[@class='DayPicker-Day'])[20]")).click();
//  driver.quit();
	
}
}
