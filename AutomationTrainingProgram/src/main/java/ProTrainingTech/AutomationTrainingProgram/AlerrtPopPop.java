package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerrtPopPop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().window().maximize();
			WebElement SimpleAlert=driver.findElement(By.name("alert"));
			SimpleAlert.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			WebElement Confirmation=driver.findElement(By.name("confirmation"));
			Confirmation.click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			Confirmation.click();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			Thread.sleep(3000);
			WebElement PromptField=driver.findElement(By.name("prompt"));
			PromptField.click();
			Thread.sleep(3000);
			driver.switchTo().alert().sendKeys("Accept");
			driver.switchTo().alert().accept();
	}

}
