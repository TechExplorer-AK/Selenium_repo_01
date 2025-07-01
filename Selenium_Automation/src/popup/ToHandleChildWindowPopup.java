package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://shoppersstack.com/products_page/23");
	driver.findElement(By.xpath("//button[@id='compare']")).click();
	
	switchToWindow(driver,"amazon");
	System.out.println(driver.getTitle());
	driver.close();
	switchToWindow(driver, "flipkart");
	driver.close();
    switchToWindow(driver, "ebay");
	driver.close();

    
}
public static void switchToWindow(WebDriver driver,String expUrl) {
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds) {
		driver.switchTo().window(id);
		String actUrl = driver.getCurrentUrl();
		if(actUrl.contains(expUrl))
			break;
	}
}
}
