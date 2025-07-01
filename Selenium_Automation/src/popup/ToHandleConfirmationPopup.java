package popup;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToHandleConfirmationPopup {
   public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		popup.accept();
		
		System.out.println(popup.getText());

   }
}
