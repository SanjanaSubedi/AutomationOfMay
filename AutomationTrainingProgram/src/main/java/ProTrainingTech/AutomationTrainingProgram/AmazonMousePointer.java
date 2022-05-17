package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonMousePointer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Actions sn= new Actions(driver);
			WebElement Signin= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			sn.moveToElement(Signin).build().perform();
			Thread.sleep(1000);
			WebElement PrimeMembership=driver.findElement(By.linkText("Prime Membership"));
			sn.moveToElement(PrimeMembership).click().build().perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 150)");
			Thread.sleep(1000);
			WebElement ImageClick=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/a/div/img"));
			ImageClick.click();
			
			
					
					
					
			
	}

}
