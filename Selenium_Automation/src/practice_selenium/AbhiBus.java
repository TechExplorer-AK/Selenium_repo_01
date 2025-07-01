package practice_selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AbhiBus {
@Test
public void leastPrice() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	WebElement hydToBang = driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']"));
	Actions act=new Actions(driver);
	act.scrollToElement(hydToBang).perform();
	hydToBang.click();
	WebElement dropdown = driver.findElement(By.xpath("(//div[@class='container collapsible   '])[1]"));
	dropdown.click();
	
    Thread.sleep(4000);
	driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']")).click();
	
	List<WebElement> allPrices = driver.findElements(By.xpath("//span[contains(text(),'₹')]"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfAllElements(allPrices));
	//Creating Empty ArrayList Collection
	List<Integer> integerList = new ArrayList<Integer>();
	
	for(WebElement id:allPrices) {
		//fetching text from element address & replacing characters
		//Then storing price into a variable str
		String str=id.getText().replace("₹", "").replace(",", "");
		//Parsing from String type object to Integer type object
		//Then adding Integer type object into List<Integer>
		integerList.add(Integer.parseInt(str));
		
	}
	System.out.println(integerList);
	System.out.println(Collections.min(integerList));
	
	
	

	
	

}
}
