package ProTrainingTech.AutomationTrainingProgram;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeHomeDepot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	/*options.addArguments("start-maximized");
	options.addArguments("disable-infobars");
	options.addArguments("--disable-extensions");*/
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.homedepot.com/");
		driver.navigate().to("https://www.homedepot.com/");
			driver.manage().window().maximize();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement MyAccount=driver.findElement(By.linkText("My Account"));
			MyAccount.click();
			Thread.sleep(2000);
			WebElement Register=driver.findElement(By.linkText("Register"));
			Register.click();
			Thread.sleep(2000);
			
			/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor")));*/
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 150)");
			Thread.sleep(1000);
			WebElement PersonalAcc=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
			PersonalAcc.click();
			Thread.sleep(2000);
			WebElement Email=driver.findElement(By.id("email"));
			Email.sendKeys("Sanjana123@gmail.com");
			Thread.sleep(2000);
			WebElement Password=driver.findElement(By.name("password"));
			Password.sendKeys("12345@abcde");
			Thread.sleep(2000);
			WebElement ZipCode=driver.findElement(By.id("zipCode"));
			ZipCode.sendKeys("22204");
			Thread.sleep(2000);
			WebElement PhoneNumber=driver.findElement(By.id("phone"));
			PhoneNumber.sendKeys("0123456789");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(1000);
			WebElement KeepLogIn=driver.findElement(By.xpath("//label[@for='kmsi-checkbox']"));
			KeepLogIn.click();
			Thread.sleep(1000);
			WebElement PhoneVerification=driver.findElement(By.xpath("//label[@for='verify-phone-checkbox']"));
			PhoneVerification.click();
			Thread.sleep(1000);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
			driver.switchTo().frame(0);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor")));
			WebElement reCaptcha=driver.findElement(By.id("recaptcha-anchor"));
			reCaptcha.click();
			
			driver.switchTo().parentFrame();
			Thread.sleep(5000);
			WebElement CreateAnAccount=driver.findElement(By.partialLinkText("Account"));
			CreateAnAccount.click();
			Thread.sleep(3000);
			
			
			Set<String> windowhandles=driver.getWindowHandles();
			System.out.println(windowhandles);
			Iterator<String> iterator=windowhandles.iterator();
		String parentwindow=	iterator.next();
		String childwindow= iterator.next();
		driver.switchTo().window(childwindow);
		
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
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(2000);
			WebElement ArtByImage=driver.findElement(By.linkText("Kitchen"));
			ArtByImage.click();
			Thread.sleep(3000);
			WebElement SearchField=driver.findElement(By.id("headerSearch"));
			SearchField.sendKeys("Furniture");
			Thread.sleep(3000);
			Actions sf=new Actions(driver);
			sf.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			SearchField.clear();
			WebElement Search=driver.findElement(By.id("headerSearch"));
			Search.sendKeys("Wall Mirror");
			Thread.sleep(2000);
			WebElement SearchClick=driver.findElement(By.cssSelector("svg.SearchBox__buttonIcon"));
			Thread.sleep(5000);
			SearchClick.click();
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(250, 500)");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(500, 700)");
			Thread.sleep(5000);
			WebElement TopPage=driver.findElement(By.xpath("html/body/div/div/button/i"));
			TopPage.click();
			Thread.sleep(3000);
			
			/*WebElement DeliveryZipCode=driver.findElement(By.className("caret__deliveryZip"));
			DeliveryZipCode.click();
			WebElement EnterZipCode=driver.findElement(By.cssSelector("input.DeliveryZipDropDown__input"));
			EnterZipCode.sendKeys("22204");
			EnterZipCode.sendKeys(Keys.ARROW_DOWN);
			EnterZipCode.sendKeys(Keys.ENTER);*/
			
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
			Thread.sleep(3000);
			WebElement CrossMark=driver.findElement(By.className("localization__icn--close"));
			CrossMark.click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(2000);
			WebElement RoundMirror=driver.findElement(By.xpath("//img[@alt='Round']"));
			RoundMirror.click();
			js.executeScript("window.scrollBy(0, 250)");
			
			
			
			
	}
}