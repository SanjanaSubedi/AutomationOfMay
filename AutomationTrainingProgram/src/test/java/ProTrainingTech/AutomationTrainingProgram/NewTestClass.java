package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestClass {
  @Test
  public void f() {
	  System.out.println("This is Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is BeforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is AfterMethod Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is BeforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is AfterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is AfterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is AfterSuite Annotation");
  }
  
  @Test
  public void G() {
	  System.out.println("This is Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("This is BeforeMethod Annotation");
  }
  
  
  
}

