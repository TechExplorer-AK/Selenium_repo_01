package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
	    String title = driver.getTitle();
		if(title.equals("Login • Instagram")) {
			System.out.println("Login page is displayed!!");
		}else {
			System.out.println("Login page is not displayed!!");
		}

	}

}
