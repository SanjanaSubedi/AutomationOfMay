package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickBabyPage {
	
	WebDriver driver;
	@FindBy(linkText="Baby") WebElement Bby;
	
	public ClickBabyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

	public void BabyPage(){
		Bby.click();
		
	}
}
