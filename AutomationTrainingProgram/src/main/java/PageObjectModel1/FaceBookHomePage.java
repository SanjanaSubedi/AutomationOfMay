package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookHomePage {
	WebDriver driver;
	@FindBy(name="email") WebElement Ids;
	@FindBy(id="pass") WebElement passwrd;
	@FindBy(linkText="Forgot password?") WebElement FrgtPass;
	
	public FaceBookHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}

	public void Email() {
		Ids.sendKeys("sanjanasubedi");
	}
	
	public void Password() {
		passwrd.sendKeys("12345677889");
	}
	
	public void ForgotPassword() {
		FrgtPass.click();
	}

	public String getOfText() {
		// TODO Auto-generated method stub
		return null;
	}
}
