package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
   public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
//	driver.manage().window().maximize();
	Dimension size=driver.manage().window().getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	System.out.println(size); //Giving both Width and Height
	driver.manage().window().setSize(new Dimension(500,500));
	//Passing object of Dimension type 
	driver.quit();
	}
}
