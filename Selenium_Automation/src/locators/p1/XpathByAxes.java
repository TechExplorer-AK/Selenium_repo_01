package locators.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/kumar/OneDrive/Desktop/movie_data.html");
	String salaar_colln = driver.findElement(By.xpath("//td[text()='SALAAR']/preceding-sibling::td")).getText();
	System.out.println(salaar_colln);
	String kgf_pos = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
	System.out.println(kgf_pos);

 }
}
