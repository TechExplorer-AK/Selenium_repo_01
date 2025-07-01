package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Capturing Radio Button element address
	WebElement radioButton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
	//Checking whether Radio button is Selected or Not
	System.out.println(radioButton.isSelected());
	radioButton.click();
	//Checking whether Radio button is Selected or Not
	System.out.println(radioButton.isSelected());
}
}
