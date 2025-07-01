package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetTitle {
   public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.myntra.com/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
		System.out.println("Welcome page is displayed");
	}else {
		System.out.println("Welcome page is not displayed");

	}
  }
}
