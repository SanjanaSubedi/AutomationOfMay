package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement Dropablelink=driver.findElement(By.linkText("Droppable"));
			Dropablelink.click();
			driver.switchTo().frame(0);
			WebElement dragable=driver.findElement(By.id("draggable"));
			WebElement Dropable=driver.findElement(By.id("droppable"));
			Actions ob=new Actions(driver);
			ob.dragAndDrop(dragable, Dropable).build().perform();
			driver.switchTo().parentFrame();
			Thread.sleep(2000);
			WebElement sortedLink=driver.findElement(By.linkText("Sortable"));
			sortedLink.click();
			
	}

}
