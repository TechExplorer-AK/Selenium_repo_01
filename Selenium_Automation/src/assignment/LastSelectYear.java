package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastSelectYear {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	 WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
	
	 Select selYear=new Select(years);
	 List<WebElement> allYears = selYear.getOptions();
	 selYear.selectByIndex(allYears.size()-1);
	 WebElement lastYear = selYear.getFirstSelectedOption();
	 System.out.println(lastYear.getText());
	 
  }
}
