package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;

import PageObjectModel1.ContactUsProTech;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class ContactUsProTraining {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  ContactUsProTech CP= new ContactUsProTech(driver);
	  CP.ContactInfo();
	  
		Thread.sleep(1000);
		WebElement FirstName= driver.findElement(By.id("nf-field-17"));
		FirstName.sendKeys("Sanjana");
		Thread.sleep(1000);
		WebElement LastName= driver.findElement(By.id("nf-field-18"));
		LastName.sendKeys("Subedi");
		Thread.sleep(1000);
		WebElement emailField= driver.findElement(By.name("email"));
		emailField.sendKeys("sanzana.sbdy@gmail.com");
		Thread.sleep(1000);
		WebElement PhoneField=driver.findElement(By.id("nf-field-20"));
		PhoneField.sendKeys("1234567890");
		Thread.sleep(1000);
		WebElement Course=driver.findElement(By.id("nf-label-field-22"));
		Course.click();
		Thread.sleep(1000);
		WebElement CourseTitle=driver.findElement(By.id("nf-field-22"));
		Select Co=new Select(CourseTitle);
		Co.selectByValue("cyber-security");
		Thread.sleep(1000);
		WebElement Register=driver.findElement(By.id("nf-field-27"));
		Register.click();
		Thread.sleep(3000);
	  
  }
  @BeforeClass
  public void beforeClass() {
	 /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe"); // telling selenium to find chrome driver
		driver=new ChromeDriver(); */
	  BrowserSetUp("Chrome");
		driver.navigate().to("https://www.protrainingtech.com/"); 
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

  public void BrowserSetUp(String Browser) {
	  if(Browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe"); // telling selenium to find chrome driver
			driver=new ChromeDriver();
	  }
	  else if (Browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		   driver=new EdgeDriver();}
		
	  else if (Browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();  
		
	}
		  
  

}
  }

