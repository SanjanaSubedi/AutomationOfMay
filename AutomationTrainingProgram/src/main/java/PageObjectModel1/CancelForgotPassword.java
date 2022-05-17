package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelForgotPassword {
	WebDriver driver;
	@FindBy(linkText="Cancel") WebElement Cncl;
	@FindBy(xpath="//*[contains(text(),'Please enter your email or ')]") WebElement ForgotpageTxt;
	
	public CancelForgotPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
public void CancelPassword() {
	Cncl.click();
}

public String GetOfText() {
	String ForgotPageVerify=ForgotpageTxt.getText();
	return ForgotPageVerify;
}
}
