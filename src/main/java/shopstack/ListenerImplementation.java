package shopstack;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String failedMethod=result.getMethod().toString();
		System.out.println(failedMethod);
		
		
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver ;
		File tempfile =ts.getScreenshotAs(OutputType.FILE);
		String Timestamp=LocalDateTime.now().toString().replace(':', '-');
		File parmanentFile = new File("C:\\eclipse-workspace\\shoppersstack\\Screenshots"+Timestamp+"Failed.png");
		try {
			FileHandler.copy (tempfile, parmanentFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	}


