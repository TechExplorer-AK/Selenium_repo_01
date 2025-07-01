package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/3864");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();//Opening Child Window by clicking Compare icon
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println(allWindowIds);//Printing all window IDs including Child window in list
	for(String s: allWindowIds) {//for-each loop
		System.out.println(s);
	}
}
}
