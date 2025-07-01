package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {
  @Test
  public void main() throws IOException, InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  FileInputStream fis=new FileInputStream("./TestData/facebook_data.properties");
	  Properties prop=new Properties();
	  prop.load(fis);
//	  Reporter.log(prop.getProperty("url"), true);
	  driver.get(prop.getProperty("url"));
	  
	  LoginPage lp=new LoginPage(driver);
	  lp.getEmailTF().sendKeys(prop.getProperty("email"));
	  lp.getPasswordTF().sendKeys(prop.getProperty("password"));
	  lp.getLoginButton().click();
	   
	  
  }
  
}
