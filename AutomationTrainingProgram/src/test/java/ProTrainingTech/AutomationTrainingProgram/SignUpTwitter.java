package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SignUpTwitter {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement SignUp=driver.findElement(By.linkText("Sign up with phone or email"));
	  SignUp.click();
	  Thread.sleep(2000);
	  WebElement Name=driver.findElement(By.name("name"));
	  Name.sendKeys("Mia");
	  
	 
}
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://twitter.com/");
			driver.manage().window().maximize();
}
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
