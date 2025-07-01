package mini_project_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
WebDriver driver;
FileInputStream fis;
Properties prop;
@BeforeClass
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	fis=new FileInputStream("./Test_Data/common_data_dws.properties");
	prop=new Properties();
	prop.load(fis);
	driver.get(prop.getProperty("url"));
}
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException {
  fis=new FileInputStream("./Test_Data/Test_Script_Data.xlsx");
  Workbook wb = WorkbookFactory.create(fis);
  String email = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
  String password = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
  WelcomePage wp=new WelcomePage(driver);
  wp.getLoginLink().click();
  LoginPage lp=new LoginPage(driver);
  lp.getEmailTF().sendKeys(email);
  lp.getPasswordTF().sendKeys(password);
  lp.getLoginButton().click();
  
}
@AfterMethod
public void logout() {
	HomePage hp=new HomePage(driver);
	hp.getLogoutLink().click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}

}
