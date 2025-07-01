package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/kumar/OneDrive/Desktop/dropdown.html");
	WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
	Select selCars=new Select(cars);
	//Selecting single option
	selCars.selectByIndex(0);
	
	WebElement firstOption = selCars.getFirstSelectedOption();
	System.out.println(firstOption.getText());
	
	
}
}
