package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToWindow {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	
	switchToWindow(driver,"amazon");//Switching to amazon window
//	Thread.sleep(2000);
	driver.close();// closing amazon window
	Thread.sleep(2000);
	switchToWindow(driver, "ebay");//Switching to ebay window
	driver.close();//closing ebay window
	
   }
  public static void switchToWindow(WebDriver driver,String expUrl) {
	 Set<String> allWindowIds = driver.getWindowHandles();
	 for(String id: allWindowIds) {
		 driver.switchTo().window(id);
		 String acURL = driver.getCurrentUrl();
		 if(acURL.contains(expUrl)) {//Checking If passed String Exists in Current window URL or Not 
			 break;
		 }
	 }
  }
}
