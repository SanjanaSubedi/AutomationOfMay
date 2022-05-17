package ProTrainingTech.AutomationTrainingProgram;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProTech {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe"); // telling selenium to find chrome driver
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("https://www.protrainingtech.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000); // wait time
		WebElement ContactField= driver.findElement(By.linkText("Contact us")); 
		ContactField.click();
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
		Thread.sleep(6000);
		//driver.navigate().back();
		WebElement HomePage=driver.findElement(By.linkText("Home"));
		HomePage.click();
		Thread.sleep(2000);
		WebElement CourseView=driver.findElement(By.xpath("//a[@data-icon='E']"));
		CourseView.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(150, 400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(400, 550)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(550, 800)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(800, 1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(1000, 1200)");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Actions Pt= new Actions(driver);
		WebElement Program=driver.findElement(By.linkText("Our Programs"));
		Pt.moveToElement(Program).build().perform();
		//driver.close();
		
		
		
		
		
	}

}
