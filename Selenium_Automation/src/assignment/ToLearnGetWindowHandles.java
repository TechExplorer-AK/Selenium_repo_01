package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/3864");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	Thread.sleep(2000);
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds) {
		driver.switchTo().window(id);
		
		String url = driver.getCurrentUrl();
		if(url.contains("shoppersstack")) {
			continue;
		}
		driver.close();
		Thread.sleep(2000);
	}
}
}
