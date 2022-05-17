package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonCodeClass.Utility;
import PageObjectModel1.CancelForgotPassword;
import PageObjectModel1.FaceBookHomePage;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BrowsingFacebook extends Utility{
  @Test(priority=2)
  public void f() throws InterruptedException {
	FaceBookHomePage Fb=new FaceBookHomePage(driver);
	Fb.Email();
	Fb.Password();
	Fb.ForgotPassword();
	Thread.sleep(3000);
	CancelForgotPassword CFP=new CancelForgotPassword(driver);
	CFP.CancelPassword();
	  
	
		
	}
/*@Test(priority=1)
  public void VerifyingText() throws InterruptedException {
	  FaceBookHomePage Fb=new FaceBookHomePage(driver); 
	  CancelForgotPassword CFP=new CancelForgotPassword(driver);
	  Thread.sleep(2000);
	  Fb.ForgotPassword();
	  String VerificationOfText=Fb.getOfText();
	  SoftAssert st=new SoftAssert();
	  st.assertEquals(VerificationOfText,"Please enter your email or mobile number to search for your account.");
	  //Assert.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account.","Text is displayed");
	  Assert.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account.", "Text is Displayed");
	 // st.assertAll();
	  CFP.CancelPassword();
	
	  
	  
	  
  }*/
  

  @BeforeClass
  public void beforeClass() throws IOException {
	  BrowserSetUP("Edge");
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
}

		
  


  
  
   
	  
  


