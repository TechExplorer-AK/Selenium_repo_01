package mini_project_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
@FindBy(xpath= "//a[text()='Log in']")
private WebElement  loginLink;

public WelcomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLoginLink() {
	return loginLink;
}

}
