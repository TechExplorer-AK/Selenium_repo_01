package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
  public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-male")).click();
    driver.findElement(By.name("FirstName")).sendKeys("Jack");
    driver.findElement(By.name("LastName")).sendKeys("Smith");
    driver.findElement(By.id("Email")).sendKeys("jack551@gmail.com");
    driver.findElement(By.name("Password")).sendKeys("hsjhbvs55");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("hsjhbvs55");
    driver.findElement(By.id("register-button")).click();
    
    
 }
}
