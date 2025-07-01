package mini_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScript {
  public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	FileInputStream fis=new FileInputStream("./TestData/common_data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	driver.get(prop.getProperty("url"));
	
	WelcomePage wp=new WelcomePage(driver);
	wp.getRegisterLink().click();
	
	fis=new FileInputStream("./TestData/Test_Script_Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String firstName = wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
	String lastName = wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
	String email = wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
	String password = wb.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
	String confirmPassword = wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
	RegisterPage rp=new RegisterPage(driver);
	rp.getMaleRadioButton().click();
	rp.getFirstnameTF().sendKeys(firstName);
	rp.getLastnameTF().sendKeys(lastName);
	rp.getEmailTF().sendKeys(email);
	rp.getPasswordTF().sendKeys(password);
	rp.getConfirmpasswordTF().sendKeys(confirmPassword);
	rp.getRegisterButton().click();
	Thread.sleep(5000);
	TakesScreenshot ts= (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/registration.png");
	FileHandler.copy(temp, dest);
	
	
	
	
}
}
