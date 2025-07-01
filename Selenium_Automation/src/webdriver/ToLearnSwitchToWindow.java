package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToWindow {
	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.shoppersstack.com/products_page/3864");
      Thread.sleep(20000);
      driver.findElement(By.id("compare")).click();
      Thread.sleep(2000);
      switchToWindow(driver,"flipkart");//Genric Method
      //Control is in flipkart window
      Point flPosition = driver.manage().window().getPosition();
      
      switchToWindow(driver, "ebay");
    //Control is in ebay window
      Point ebPosition = driver.manage().window().getPosition();
      driver.manage().window().setPosition(flPosition);//Changing position of ebay window with flipkart window 
//      Thread.sleep(2000);
      switchToWindow(driver, "flipkart");
      driver.manage().window().setPosition(ebPosition);//Changing position of flipkart window with ebay window
//      driver.close();
      switchToWindow(driver, "amazon");
      Point amzPosition = driver.manage().window().getPosition();
//      Thread.sleep(2000);
      switchToWindow(driver, "flipkart");
      driver.manage().window().setPosition(amzPosition);
   }
	//Genric Method-----> Generalization i.e. working for all windows(URLs)
	//Switching Control to respective Window URL 
	// Functionality of Below method is just taking the control to respective window(URL) and then stopped
	//Then control will remain in current Window
	public static void switchToWindow(WebDriver driver,String expUrl) {
		   Set<String> allWindowIds = driver.getWindowHandles();
		   for(String id: allWindowIds) {
			   driver.switchTo().window(id);
			   String acurl = driver.getCurrentUrl();
			   if(acurl.contains(expUrl)) {
				   break;// Using break so that control will remain current Window
			   }
		   }

	   }
		
 
}
