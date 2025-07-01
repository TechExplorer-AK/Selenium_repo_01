package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
    //Switching to frame using WebElement address
    driver.switchTo().frame(photoFrame);
    //Capturing address of Image which we move to Trash
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
    //Capturing Address of Trash
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	Actions act=new Actions(driver);
	//Performing Drag and Drop operation i.e. moving Image TO Trash 
	act.dragAndDrop(img1, trash).perform();
}
}
