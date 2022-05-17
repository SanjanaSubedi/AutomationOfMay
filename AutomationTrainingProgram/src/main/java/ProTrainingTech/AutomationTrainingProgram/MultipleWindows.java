package ProTrainingTech.AutomationTrainingProgram;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions ob=new Actions(driver);
			WebElement newRelease=driver.findElement(By.linkText("New Releases"));
			ob.keyDown(Keys.SHIFT).build().perform();
			newRelease.click();
			ob.keyUp(Keys.SHIFT).build().perform();
			//driver.getWindowHandle();
			Set<String> windowhandles=driver.getWindowHandles();
			Iterator<String> iterator=windowhandles.iterator();
		String Parentwindow=iterator.next();
		String secondwindow= iterator.next();
		System.out.println("This is parent window="+Parentwindow);
		System.out.println("This is Second window="+secondwindow);
		driver.switchTo().window(secondwindow);
		Thread.sleep(2000);
		WebElement NewWinow=driver.findElement(By.linkText("Amazon Basics"));
		NewWinow.click();
		
				}
			
	}


