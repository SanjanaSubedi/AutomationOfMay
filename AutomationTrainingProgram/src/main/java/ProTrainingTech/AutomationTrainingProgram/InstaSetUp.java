package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaSetUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe" );
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement Name=driver.findElement(By.name("username"));
Name.sendKeys("sanzana_subedi");
Thread.sleep(1000);
WebElement Password= driver.findElement(By.name("password"));
Password.sendKeys("abcde");
Thread.sleep(2000);
WebElement Login=driver.findElement(By.xpath("html/body/div/section/main/div/div/div/div/form/div/div"));
Login.click();
Thread.sleep(2000);
WebElement Signup=driver.findElement(By.linkText("Sign up"));
Signup.click();
Thread.sleep(1000);
WebElement Email=driver.findElement(By.name("emailOrPhone"));
Email.sendKeys("Sanzana.sbdy@gmail.com");
Thread.sleep(1000);
WebElement FullName=driver.findElement(By.name("fullName"));
FullName.sendKeys("Mia Leo");
Thread.sleep(1000);
WebElement UserName=driver.findElement(By.name("username"));
UserName.sendKeys("Mia_Leo");
Thread.sleep(1000);
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("12345@abcde");
Thread.sleep(3000);
WebElement Register=driver.findElement(By.xpath("html/body/div/section/main/div/div/div/form/div/div"));
Register.click();

	}

}
