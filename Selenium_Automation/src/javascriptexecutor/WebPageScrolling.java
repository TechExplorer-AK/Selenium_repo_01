package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScrolling {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//Executing java script code in Selenium
	//Scrolling UP the Web page by 1500 pixel 
	js.executeScript("window.scrollBy(0,1500)");
//	js.executeScript("window.scrollTo(0,3000)");
}
}
