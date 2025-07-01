package dhrmendra;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assingment_DragDrop {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		WebElement iframe_elme = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe_elme);
        Actions act=new Actions(driver);
        WebElement photo1 = driver.findElement(By.xpath("//img[contains(@alt,'The chalet at the Green mountain lake')]"));
        WebElement photo2 = driver.findElement(By.xpath("//img[contains(@alt,'Planning the ascent')]"));
        WebElement drop_potion = driver.findElement(By.xpath("//div[@id='trash']"));
        act.dragAndDrop(photo1, drop_potion).perform();
        act.dragAndDrop(photo2, drop_potion).perform();
        driver.switchTo().parentFrame();
        String parentpage = driver.getWindowHandle();
        driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement sql_elem = driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']"));
        sql_elem.click();
        Set<String> allwindowid = driver.getWindowHandles();
        for(String el:allwindowid) {
        	driver.switchTo().window(el);
        	String url = driver.getCurrentUrl();
        	if(url.equals("https://www.globalsqa.com/sql-cheat-sheet/"))
        		break;
        }
       WebElement scroll = driver.findElement(By.xpath("(//img[@loading='lazy'])[2]"));
        act.scrollToElement(scroll).perform();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File loc = ts.getScreenshotAs(OutputType.FILE);
        File des=new File("./screenshots/dk2.png");
        FileHandler.copy(loc, des);
        
        
        
	}

}
