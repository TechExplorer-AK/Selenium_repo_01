package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//Launching Empty Browser
	driver.manage().window().maximize();// Maximizing window
	driver.navigate().to("https://www.ajio.com/");
	Thread.sleep(1000);//Checked Exception---->InterruptedException
	driver.navigate().back();
	Thread.sleep(1000);//Checked Exception---->InterruptedException
	driver.navigate().forward();
	String title = driver.getTitle();
	//System.out.println(title);
	if(title.equals("Online Shopping Site for Women, Men, Kids Fashion, Lifestyle & More.")) {
		System.out.println("Welcome page displayed!!");
	}else {
		System.out.println("Welcome page is not displayed!!");

	}
	driver.manage().window().setPosition(new Point(350, 270));
	Thread.sleep(1000);//Checked Exception---->InterruptedException
	driver.manage().window().setSize(new Dimension(400, 300));
	Dimension size = driver.manage().window().getSize();//Assigning Dimension object
	System.out.println(size);//Printing window dimension
	//Not getting same Window dimension which I had set earlier
  }
}
