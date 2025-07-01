package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/3864");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	Set<String> allWindowIds = driver.getWindowHandles();// Returning all window IDs
	for(String id: allWindowIds) {// all window-Ids will be ASSIGNED to id ONE BY ONE
		driver.switchTo().window(id);// Switching control from Main window to Child window
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/") ) {
			String title = driver.getTitle();
			System.out.println(title);
		}
		else if(url.equals("https://www.ebay.com/")) {
			driver.manage().window().maximize();
		}
		Thread.sleep(1000);
//		driver.close();
	}
	
	
}
}


