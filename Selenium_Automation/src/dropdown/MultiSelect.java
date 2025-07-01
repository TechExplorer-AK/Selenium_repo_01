package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/kumar/OneDrive/Desktop/dropdown.html");
	WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
	Select selCars=new Select(cars);
	//Selecting Multiple options
	selCars.selectByIndex(0);
	selCars.selectByValue("2");
	selCars.selectByVisibleText("Volvo");
	
	Thread.sleep(3000);
	
	//DeSelecting selected Options
	selCars.deselectByIndex(0);
	selCars.deselectByValue("2");
	selCars.deselectByVisibleText("Volvo");
	
	Thread.sleep(3000);
	
	//Selecting Multiple options
		selCars.selectByIndex(0);
		selCars.selectByValue("2");
		selCars.selectByVisibleText("Volvo");
		
		Thread.sleep(3000);
	//De-selecting all options at a time
		selCars.deselectAll();
		
	
}
}
