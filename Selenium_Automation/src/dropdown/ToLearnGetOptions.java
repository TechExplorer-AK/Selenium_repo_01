package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	Select selMonth=new Select(months);
	List<WebElement> allMonths = selMonth.getOptions();
	for(WebElement id:allMonths) {
		System.out.println(id.getText());
		
	}
}
}
