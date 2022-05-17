package PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOfArt {
	WebDriver driver;
	@FindBy(partialLinkText="Art") WebElement Art;
	
	public PageOfArt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
public void ArtPage() {
	Art.click();
}
}
