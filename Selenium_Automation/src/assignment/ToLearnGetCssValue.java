package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	//Capturing Parent window id
	String originalWindow = driver.getWindowHandle();
    //Launching Child window/tab
	driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
	//Capturing all window IDs
	Set<String> allWindows = driver.getWindowHandles();
	for(String id:allWindows) {
		//if-condition will be true ,if 'id NOT EQUAL TO originalWindow'
		if (!id.equals(originalWindow)) {
	        // Switching control to the new tab/window
	        driver.switchTo().window(id);
	        break;
	    }
	}
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//span[@id='loginspan']")).click();
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.clear();
	username.sendKeys("aniket444@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.clear();
	password.sendKeys("ghdg45##");
	WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
    signIn.click();
	Thread.sleep(10000);
	WebElement errorMsg = driver.findElement(By.xpath("//p[@id='com-form-login-error']"));
	Thread.sleep(5000);
	//Capturing ERROR MESSAGE text
	String text = errorMsg.getText();
	System.out.println(text);
	//Capturing ERROR MESSAGE text color
	String text_color = errorMsg.getCssValue("color");
	System.out.println(text_color);
	//Capturing SIGN IN button Background Color
	String bg_color = signIn.getCssValue("background-color");
	System.out.println(bg_color);
	driver.quit();
	
	


	
	
	
}
}
