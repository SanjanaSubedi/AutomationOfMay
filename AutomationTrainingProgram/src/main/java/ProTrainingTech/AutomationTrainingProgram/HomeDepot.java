package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions Ad=new Actions(driver);
		WebElement AllDepartments=driver.findElement(By.xpath("//*[contains(@data-id,'departments')]"));
			Ad.moveToElement(AllDepartments).build().perform();
			Thread.sleep(2000);
			Actions Hd=new Actions(driver);
			WebElement HomeDecoration=driver.findElement(By.linkText("Decor & Furniture"));
			Hd.moveToElement(HomeDecoration).build().perform();
			Thread.sleep(3000);
			Actions Wd=new Actions(driver);
			WebElement WallDecor=driver.findElement(By.linkText("Wall Decor"));
			Wd.moveToElement(WallDecor).build().perform();
			Thread.sleep(3000);
			WebElement Art=driver.findElement(By.partialLinkText("Art"));
			Art.click();
			Thread.sleep(2000);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(2000);
			WebElement ArtByImage=driver.findElement(By.linkText("Kitchen"));
			ArtByImage.click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(4000);
			
			WebElement SearchField=driver.findElement(By.id("headerSearch"));
			SearchField.sendKeys("Furniture");
			Thread.sleep(3000);
			Actions sf=new Actions(driver);
			sf.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3000);
			SearchField.clear();
			WebElement Search=driver.findElement(By.id("headerSearch"));
			Search.sendKeys("Wall Mirror");
			WebElement SearchClick=driver.findElement(By.cssSelector("svg.SearchBox__buttonIcon"));
			Thread.sleep(2000);
			SearchClick.click();
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(250, 500)");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(500, 700)");
			Thread.sleep(3000);
			WebElement TopPage=driver.findElement(By.xpath("html/body/div/div/button/i"));
			TopPage.click();
			Thread.sleep(2000);
			
			WebElement shoppingstore=driver.findElement(By.cssSelector("svg.caret__myStore"));
			shoppingstore.click();
			Thread.sleep(2000);
			WebElement FindOtherStore=driver.findElement(By.linkText("Find Other Stores"));
			FindOtherStore.click();
			Thread.sleep(2000);
			WebElement EnterZipCode=driver.findElement(By.id("myStore-formInput"));
			EnterZipCode.sendKeys("22204");
			Thread.sleep(2000);
			WebElement EnterSearch=driver.findElement(By.className("localization__icn--search"));
			EnterSearch.click();
			Thread.sleep(2000);
			WebElement CrossMark=driver.findElement(By.className("localization__icn--close"));
					CrossMark.click();
					
					Thread.sleep(2000);
					js.executeScript("window.scrollBy(0, 250)");
					Thread.sleep(2000);
					WebElement RoundMirror=driver.findElement(By.xpath("//img[@alt='Round']"));
					RoundMirror.click();
					js.executeScript("window.scrollBy(0, 250)");
					Thread.sleep(2000);
					js.executeScript("window.scrollBy(250, 525)");
					Thread.sleep(2000);
					
					
					
			
			
			
			
			}

}
