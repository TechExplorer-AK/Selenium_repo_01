package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopup {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	//Make My Trip is working according to old version of Chrome Browser
	//i.e. Login page Popup automatically comes here And It's HIDDEN
	//That's why, we are performing only CLOSE operation here.
	
}
}
