package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//p[contains(text(),'Concepts')]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//section[contains(text(),'Table')]")).click();
	Thread.sleep(10000);
	String samsung_disc = driver.findElement(By.xpath("//th[contains(text(),'SAMSUNG')]/following-sibling::td[3]")).getText();
	System.out.println(samsung_disc);
	String hp_price = driver.findElement(By.xpath("//th[contains(text(),'HP')]/following-sibling::td[4]")).getText();
	System.out.println(hp_price);
  }
}