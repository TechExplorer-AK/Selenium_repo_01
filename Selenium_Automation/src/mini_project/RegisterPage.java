package mini_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
  @FindBy(id="gender-male")
  private WebElement maleRadioButton;
  
  @FindBy(id="gender-female")
  private WebElement femaleRadioButton;
  
  @FindBy(id="FirstName")
  private WebElement firstnameTF;
  
  @FindBy(id="LastName")
  private WebElement lastnameTF;
  
  @FindBy(id="Email")
  private WebElement emailTF;
  
  @FindBy(id="Password")
  private WebElement passwordTF;
  
  @FindBy(id="ConfirmPassword")
  private WebElement confirmpasswordTF;
  
  @FindBy(id="register-button")
  private WebElement registerButton;
  
  public RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getMaleRadioButton() {
	return maleRadioButton;
}

public WebElement getFemaleRadioButton() {
	return femaleRadioButton;
}

public WebElement getFirstnameTF() {
	return firstnameTF;
}

public WebElement getLastnameTF() {
	return lastnameTF;
}

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getPasswordTF() {
	return passwordTF;
}

public WebElement getConfirmpasswordTF() {
	return confirmpasswordTF;
}

public WebElement getRegisterButton() {
	return registerButton;
}
  

}
