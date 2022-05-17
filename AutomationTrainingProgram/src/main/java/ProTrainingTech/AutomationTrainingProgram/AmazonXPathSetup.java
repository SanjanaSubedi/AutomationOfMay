package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXPathSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			/*WebElement Search= driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/input"));
			Search.sendKeys("Toys");
			WebElement SearchButton=driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/span/input"));
			SearchButton.click();*/
			WebElement Search= driver.findElement(By.xpath("//input[@aria-label='Search']"));
			Search.sendKeys("toys");
			Thread.sleep(1000);
			WebElement SearchButton= driver.findElement(By.xpath("//input[@type='submit']"));
			SearchButton.click();
			WebElement Coupens=driver.findElement(By.xpath("//a[text()='books']"));
			Coupens.click();
					
			
			
	}

}
