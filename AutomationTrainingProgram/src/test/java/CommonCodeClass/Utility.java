package CommonCodeClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Utility {
	

  public WebDriver driver;
  @Parameters({"Browser"})
  @BeforeClass
 // public void beforeClass(String browser) {
	  public void BrowserSetUP(String Browser) {
		  if(Browser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.navigate().to("https://www.facebook.com/"); 
				driver.manage().window().maximize();
		  }else if (Browser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
			   driver=new EdgeDriver();
			   driver.navigate().to("https://www.facebook.com/"); 
				driver.manage().window().maximize();}
		  else if(Browser.equalsIgnoreCase("Firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();  
			  driver.navigate().to("https://www.facebook.com/"); 
				driver.manage().window().maximize();
		  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  
  }

}
