package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElement {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.myntra.com/");
//	WebElement searchElement = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
//	searchElement.sendKeys("mobiles",Keys.ENTER);
//	searchElement.sendKeys("laptop",Keys.ENTER);
	MyntraPage mp=new MyntraPage(driver);
	mp.getSearchTF().sendKeys("mobiles",Keys.ENTER);
	mp.getSearchTF().sendKeys("shoes");
	
	
}
}
