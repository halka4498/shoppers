package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(shopstack.ListenerImplementation.class)
public class LoginModel {
	@Test(dependsOnMethods ="Tclogin2()",enabled=false)
	public static void Tclogin1() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\shoppersstack\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.close();
		
	}
	@Test(priority = 1,enabled = false)
	public static void Tclogin2() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\shoppersstack\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		Thread.sleep(5000);
		driver.close();
	
	}
	@Test(priority =2,enabled = false)
	public static void Tclogin3() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\shoppersstack\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
