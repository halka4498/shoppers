package shopstack;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pomclass.HomePageB4Login;
import Pomclass.HomepageAfterLogin;
import Pomclass.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	public static WebDriver driver;
	
	@org.testng.annotations.BeforeClass
		public void BeforeClass() throws EncryptedDocumentException, IOException {
		
			DataUtilities dataProperties = new DataUtilities();
			String BROWSER = dataProperties.dataFromPropertiesFile("C:/eclipse-workspace/shoppersstack/src/test/resources/data.properties", "BROWSER");
			if(BROWSER.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(BROWSER.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(BROWSER.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String URL = dataProperties.dataFromPropertiesFile("C:/eclipse-workspace/shoppersstack/src/test/resources/data.properties","url");
			driver.get(URL);
	}
	@BeforeMethod
	public void BeforeMethod() throws EncryptedDocumentException, IOException{
		DataUtilities dataProperties = new DataUtilities();
			String Email=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 1);
			String Pass=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 2);
			HomePageB4Login HBL= new HomePageB4Login(driver);
			HBL.getLoginMainButton().click();
			LoginPage LP = new LoginPage(driver);
			LP.getEmailTextFeild().sendKeys(Email);
			LP.getPasswordTextFeild().sendKeys(Pass);
			LP.getLoginButton().click();
			}
		@AfterMethod
		public void AfterMethod() throws InterruptedException {
			Thread.sleep(3000);
			HomepageAfterLogin HomepageEle = new HomepageAfterLogin(driver);
			HomepageEle.getAccountSettingIcon().click();
			HomepageEle.getLogoutIcon().click();
			}
		@org.testng.annotations.AfterClass
		public void AfterClass() {
			driver.quit();
		}
}
