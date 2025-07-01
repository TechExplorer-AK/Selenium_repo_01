package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		//Switching control TO iframe by iframe Index
//		driver.switchTo().frame(0);
		//Switching control TO iframe by iframe Id
		//driver.switchTo().frame("send-sms-iframe");
		//Switching control TO iframe by iframe ADDRESS
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(iFrame);

		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9865436785");
	    
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
	}
}
