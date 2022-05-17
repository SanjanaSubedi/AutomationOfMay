package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;

import PageObjectModel1.CancelForgotPassword;
import PageObjectModel1.FaceBookHomePage;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Browser {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  FaceBookHomePage Fb=new FaceBookHomePage(driver);
		Fb.Email();
		Fb.Password();
		Fb.ForgotPassword();
		Thread.sleep(3000);
		CancelForgotPassword CFP=new CancelForgotPassword(driver);
		CFP.CancelPassword();
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  BrowserSetUP("Edge");
	  Images();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
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
  public void Images() throws IOException {
	  Date dt=new Date();
	  System.out.println(dt);
	  String it=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(it);
	  
	  File BabyPageShot= ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(BabyPageShot, new File("C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Images\\ImagesOfbabyPage"+it+".jpg"));
}
}

