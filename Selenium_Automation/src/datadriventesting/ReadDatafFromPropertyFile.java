package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafFromPropertyFile {
   public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
	
	Properties prop=new Properties();
	prop.load(fis);
//	String URL = prop.getProperty("url");
//	System.out.println(URL);
	String EMAIL = prop.getProperty("email");
	System.out.println(EMAIL);
	String pwd = prop.getProperty("password");
	System.out.println(pwd);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(EMAIL);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
}
}
