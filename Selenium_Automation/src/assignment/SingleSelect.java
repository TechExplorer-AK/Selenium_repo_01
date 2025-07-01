package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class SingleSelect {
  public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	
	WebElement posDropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
	
	Select selPos= new Select(posDropdown);
	selPos.selectByIndex(2);
	
	WebElement pageDropdown = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	Select selPage= new Select(pageDropdown);
	selPage.selectByVisibleText("12");
	
	WebElement gridDropdown = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	Select selGrid= new Select(gridDropdown);
	selGrid.selectByVisibleText("Grid");
	
	
	List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfAllElements(allDropdowns));
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/books.png");
	FileHandler.copy(temp, dest);
	
	
	
}
  
}
