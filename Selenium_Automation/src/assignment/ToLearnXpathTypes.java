package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathTypes {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jack551@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hsjhbvs55");
    driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
    
    
  }
}
