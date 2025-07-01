package demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class SearchButton {

		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			String time = LocalDateTime.now().toString().replace(":", "-");
			driver.manage().window().maximize();
			driver.get("https://www.dream11.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement helpLink = driver.findElement(By.linkText("Help & Support"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(true)", helpLink);
			TakesScreenshot ts= (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./screenshots/"+time+".png");
			FileHandler.copy(temp, dest);
			helpLink.click();
			
			Set<String> allWindowIds = driver.getWindowHandles();//capture all window ids
			for(String id:allWindowIds) {//use for each loop to get single id
				driver.switchTo().window(id);
				String actualUrl = driver.getCurrentUrl();//capture url and use the condition
				if(actualUrl.equals("https://get.dream11.help/hc/en-us")) {
					break;
				}
			}
			WebElement searchBtn = driver.findElement(By.xpath("(//input[@value='Search'])[2]"));
			
			String backClr = searchBtn.getCssValue("background-color");
			System.out.println(backClr);
			Rectangle rect = searchBtn.getRect();
			System.out.println("Height is:"+rect.getHeight());
			System.out.println("Width is:"+rect.getWidth());
			System.out.println("X is:"+rect.getX());
			System.out.println("Y is:"+rect.getY());
			driver.quit();
		}

	}

