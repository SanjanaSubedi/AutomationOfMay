package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		WebElement Day=driver.findElement(By.id("d1-btn"));
		Day.click();
		Thread.sleep(3000);
		
	
		
	WebElement calender=driver.findElement(By.xpath("//button[@aria-label='May 8, 2022']"));
	calender.click();
	Thread.sleep(1000);
	
	WebElement EDay=driver.findElement(By.xpath("//button[@aria-label='May 13, 2022 selected, current check in date.']']"));
	EDay.click();
	
	}

}
