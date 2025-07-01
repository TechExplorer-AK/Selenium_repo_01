//Capturing multiple Screenshot using System date and time
package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {
  public static void main(String[] args) throws IOException {
	   String time = LocalDateTime.now().toString().replace(":", "-");;
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Performing Type-Casting as there is no relation between TakeScreenshot and WebDriver Interface
	//Doing Type-Casting in order to call getScreenshotAs() method
	TakesScreenshot ts=  (TakesScreenshot) driver;
	//Screenshot is stored at temporary location in "File" format
	//As we are passing argument OutputType.FILE
	File temp = ts.getScreenshotAs(OutputType.FILE);
	//Creating a file WITH "System DATE & TIME" inside "screenshots" folder as folder is already CREATED
	File dest=new File("./screenshots/"+time+".png");
	//SHIFTING Screenshot from temporary location to permanent location
	FileHandler.copy(temp, dest);

	driver.quit();
	
}
}
