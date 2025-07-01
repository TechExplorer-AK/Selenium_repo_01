package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   @FindBy(xpath="//input[@id='email']")
   private WebElement emailTF;
 
   @FindBy(xpath="//input[@id='pass']")
   private WebElement passwordTF;
   
   @FindBy(xpath="//button[text()='Log in']")
   private WebElement loginButton;
   
   public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
  }

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getPasswordTF() {
	return passwordTF;
}

public WebElement getLoginButton() {
	return loginButton;
}
   
}
