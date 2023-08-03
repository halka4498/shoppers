package TestCases;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import shopstack.JavaScriptExecutorMethods;
import shopstack.WebDriverUtility;

public class TC_Login_1 {

	public static void main(String[] args) throws IOException,Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\shoppersstack\\src\\main\\resources\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			File file = new File("C:\\eclipse-workspace\\shoppersstack\\DataExcell.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fileInput);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row=sheet.getRow(1);
			Cell cell = row.getCell(1);
			String URL=cell.getStringCellValue();
			System.out.println(URL);
//			String PASS=sheet.getRow(1).getCell(2).getStringCellValue();
			
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			
//			File file =new File("C:\\eclipse-workspace\\shoppersstack\\src\\test\\resources\\data.properties");
//			FileInputStream fileInput=new FileInputStream(file);
//			Properties pro = new Properties();
//			pro.load(fileInput);
//			
//			String URL = pro.getProperty("url");
//			String USERNAME = pro.getProperty("username");
//			String PASSWORD = pro.getProperty("password"); 
//			
//			System.out.println("URL");
//			System.out.println("USERNAME");
//			System.out.println("PASSWORD");
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			
//			driver.get("https://www.facebook.com/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			WebDriverUtility util = new WebDriverUtility();
//			util.takingScreenshotOfWebPage(driver);
			
//			WebElement loginButton=driver.findElement(By.linkText("Forgotten password?"));
//			Actions action=new Actions(driver);
//			action.keyDown(Keys.CONTROL).click(loginButton).keyUp(Keys.CONTROL).build().perform();
			
//			JavaScriptExecutorMethods jaU=new JavaScriptExecutorMethods();
//			jaU.JavaScriptHighLigthElement(driver, loginButton);
//			jaU.JavaScriptClickOnElement(driver, loginButton);
			driver.close();
			
	}
}
