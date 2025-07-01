package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//	driver.get("https://petdiseasealerts.org/");
	Actions act=new Actions(driver);
	//Performing Right click on the Web-Page
//	act.contextClick().perform();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
	//Performing Right click on the web-Element
    act.contextClick(rightClickEle).perform();
    driver.findElement(By.xpath("//span[text()='Copy']")).click();
}  
}