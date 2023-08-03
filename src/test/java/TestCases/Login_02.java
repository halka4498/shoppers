package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclass.HomePageB4Login;
import Pomclass.LoginPage;
import shopstack.DataUtilities;

public class Login_02 {

	public static void Login_002() throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\shoppersstack\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DataUtilities dataProperties = new DataUtilities();
		String URL=dataProperties.dataFromPropertiesFile("C:\\eclipse-workspace\\shoppersstack\\src\\test\\resources\\data.properties","url");
		driver.get(URL);
		String Email=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 1);
		String Pass=dataProperties.dataFromExcel("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx","Sheet1", 1, 2);
		HomePageB4Login HBL= new HomePageB4Login(driver);
		HBL.getLoginMainButton().click();
		LoginPage LP = new LoginPage(driver);
		LP.getEmailTextFeild().sendKeys(Email);
		LP.getPasswordTextFeild().sendKeys(Pass);
		LP.getLoginButton().click();
		driver.close();
		Thread.sleep(5000);
		driver.close();
		
	}

	}


