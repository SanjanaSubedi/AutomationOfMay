package IListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonCodeClass.Utility;

public class IListerners extends Utility implements ITestListener {
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utility)result.getInstance()).driver;
		  Date dt=new Date();
		  System.out.println(dt);
		  String it=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(it);
		  
		  File BabyPageShot= ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(BabyPageShot, new File("C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Images\\ImagesOfbabyPage"+it+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		  Date dt=new Date();
		  System.out.println(dt);
		  String it=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(it);
		  
		  File BabyPageShot= ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(BabyPageShot, new File("C:\\Users\\sanza\\eclipse-workspace\\AutomationTrainingProgram\\Images\\ImagesOfbabyPage"+it+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
 