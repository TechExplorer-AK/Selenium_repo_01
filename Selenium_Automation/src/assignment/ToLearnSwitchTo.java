package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/3864");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	Thread.sleep(2000);
	Set<String> allWindowIds = driver.getWindowHandles();
	int flipkartXPosition=0;
	int flipkartYPosition=0;
	int ebayXPosition=0;
	int ebayYPosition=0;
	for(String id: allWindowIds) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("flipkart")){//Capturing flipkart X & Y Coordinates
		     Point flipkartPosition = driver.manage().window().getPosition();
		     flipkartXPosition=flipkartPosition.getX();
		     flipkartYPosition=flipkartPosition.getY();
			}
		else if(url.contains("ebay")){//Capturing ebay X & Y Coordinates
			Point ebayPosition = driver.manage().window().getPosition();
		    ebayXPosition=ebayPosition.getX();
		    ebayYPosition=ebayPosition.getY();
			}
		Thread.sleep(2000);
		}
		
	for(String id: allWindowIds) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("ebay") ) {// Setting flipkart X & Y Coordinates to ebay
			driver.manage().window().setPosition(new Point(flipkartXPosition, flipkartYPosition));
//			System.out.println(flipkartPosition);		
		}
		else if(url.contains("flipkart")) {// Setting ebay X & Y Coordinates to flipkart
			driver.manage().window().setPosition(new Point(ebayXPosition, ebayYPosition));
		}
	}
	
 }
}
