package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	//driver.navigate().back();
	Thread.sleep(8000);
	/*driver.navigate().forward();
	String windowhandleids= driver.getWindowHandle();
	System.out.println(windowhandleids);*/
	
	WebElement SearchButton= driver.findElement(By.id("nav-search-submit-button"));
	SearchButton.click();
	
	
//	driver.close();
	}

}
