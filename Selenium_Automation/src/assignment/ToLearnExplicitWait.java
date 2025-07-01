//Here , I have modified the assignment
package assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
  public static void main(String[] args) throws IOException, InterruptedException {
	String time = LocalDateTime.now().toString().replace(":", "-");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	//Scrolling the Web page
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	
	//Taking 14-Inch Laptop product Screenshot
	WebElement img_element = driver.findElement(By.xpath("(//div[@class='product-item'])[2]"));
	File temp1 = img_element.getScreenshotAs(OutputType.FILE);
	File dest1=new File("./screenshots/"+time+".png");
	FileHandler.copy(temp1, dest1);
	//Performing click operation on "Add to cart" button
	driver.findElement(By.xpath("//a[contains(text(),'inch Laptop')]/../..//input[@value='Add to cart']")).click();
	
	 //Inspecting "Product Added to Cart" Message
	 WebElement pdAddedMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	 //Checking visibility of Success message
	 wait.until(ExpectedConditions.visibilityOf(pdAddedMsg)); 
	 Thread.sleep(10000);
	 File temp2 = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getScreenshotAs(OutputType.FILE);
	 File dest2=new File("./screenshots/successMsg.png");
	 FileHandler.copy(temp2, dest2);
	
	
	
}
}  
