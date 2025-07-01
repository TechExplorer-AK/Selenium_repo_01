package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(5000);// Used to delay the script if Webpage is not loading
	driver.findElement(By.id("compare")).click();// statement Used to click on compare button
	driver.quit();// Used to close multiple windows
	
}
}
