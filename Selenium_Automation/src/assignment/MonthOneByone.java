package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthOneByone {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	//Capturing month list box/Dropdown address
	 WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	 //Passing month dropdown address
	 Select selMonth=new Select(months);
	 //Capturing all month options IDs
	 List<WebElement> allMonths = selMonth.getOptions();
	 for(WebElement ele:allMonths) {
		 //Capturing month text
		 String month = ele.getText();
		 System.out.println(month);
		 selMonth.selectByVisibleText(month);
		 
	 }
}
}
