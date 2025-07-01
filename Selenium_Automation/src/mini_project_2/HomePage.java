package mini_project_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(partialLinkText ="GIFT CARDS")
private WebElement giftCardLink;

@FindBy(partialLinkText ="Log out	")
private WebElement logoutLink;

@FindBy(partialLinkText ="APPAREL & SHOES")
private WebElement apparelShoesLink;

@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
private WebElement digitalDownloadsLink;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getGiftCardLink() {
	return giftCardLink;
}

public WebElement getApparelShoesLink() {
	return apparelShoesLink;
}

public WebElement getDigitalDownloadsLink() {
	return digitalDownloadsLink;
}

public WebElement getLogoutLink() {
	return logoutLink;
}


}
