package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Alert popup = driver.switchTo().alert();
	//Handling Alert Popup
//	popup.accept();
	//Capturing Alert Popup Message
	System.out.println(popup.getText());
	popup.dismiss();
	
}
}
