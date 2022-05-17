package ProTrainingTech.AutomationTrainingProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	// telling selenium to find chrome driver
		WebDriver driver=new ChromeDriver();//initializing the browser
		driver.navigate().to("https://www.facebook.com/"); // opening facebook page
		driver.manage().window().maximize();// maximizing the size of screen
		//Thread.sleep(1000);//wait time
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement EmailField=driver.findElement(By.name("email"));// identifying the webelement using name attribute (locator) and findelement is used to identify webelement within the page
		EmailField.sendKeys("Sanzana08@gmail.com");
		Thread.sleep(1000);// wait time
		WebElement PasswordField=driver.findElement(By.id("pass"));// identifying the webelement using id attribute (locator)
		PasswordField.sendKeys("abcdef1234");
		Thread.sleep(2000);// wait time
		WebElement LoginButton= driver.findElement(By.name("login"));// identifying the webelement using name attribute (locator)
		LoginButton.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement CreateAccount=driver.findElement(By.linkText("Create new account"));
		CreateAccount.click();
		Thread.sleep(1000);
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Mia");
		Thread.sleep(1000);
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("Leo");
		Thread.sleep(1000);
		WebElement Email=driver.findElement(By.name("reg_email__"));
		Email.sendKeys("Sanzana.sbdy@gmail.com");
		Thread.sleep(1000);
		WebElement EmailConfirmation=driver.findElement(By.name("reg_email_confirmation__"));
		EmailConfirmation.sendKeys("Sanzana.sbdy@gmail.com");
		Thread.sleep(1000);
		WebElement Password=driver.findElement(By.id("password_step_input"));
		Password.sendKeys("123@abcd11");
		Thread.sleep(1000);
		WebElement Months=driver.findElement(By.id("month"));
		Select Mo=new Select(Months);
		Mo.selectByValue("4");
		Thread.sleep(1000);
		WebElement DateOfBirth=driver.findElement(By.name("birthday_day"));
		Select DOB=new Select(DateOfBirth);
		DOB.selectByVisibleText("20");
		Thread.sleep(1000);
		WebElement Years=driver.findElement(By.id("year"));
		Select Yrs=new Select(Years);
		Yrs.selectByValue("2000");
	WebElement Gender=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/label"));
	Gender.click();
	Thread.sleep(3000);
	WebElement SignUp=driver.findElement(By.name("websubmit"));
	SignUp.click();
	Thread.sleep(5000);
	
	
	
	
	driver.close();
	
	}

}
