package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsProTech {
	WebDriver driver;
	@FindBy(linkText="Contact us") WebElement CntUs;
	
	public ContactUsProTech(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void ContactInfo() {
		CntUs.click();
	}
}
