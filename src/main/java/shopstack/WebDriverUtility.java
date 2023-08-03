package shopstack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	
	public void takingScreenshotOfWebPage(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile =ts.getScreenshotAs(OutputType.FILE);
		String Timestamp=LocalDateTime.now().toString().replace(':', '-');
		File parmanentFile = new File("./Screenshots/"+Timestamp+"WebPage.png");
		FileHandler.copy (tempfile, parmanentFile);
		}
		public void takingScreenshotOfWebPage(WebDriver driver,WebElement element) throws IOException {
			
			File tempfile =element.getScreenshotAs(OutputType.FILE);
			String Timestamp=LocalDateTime.now().toString().replace(':', '-');
			File parmanentFile = new File("./Screenshots/"+Timestamp+"WebPage.png");
			FileHandler.copy (tempfile, parmanentFile);
		}
		public void waitTillElementVisible(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
}
		public void waitTillAlertPopUpPresent(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
}
		public void waitTillElementToBeClickable(WebDriver driver,WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
}
		public void waitTillElementToBeMatched(WebDriver driver,String Url) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlMatches(Url));}
			
		public void mouseOverElement(WebElement ele,WebDriver driver) {
			Actions action=new Actions(driver);
			action.moveToElement(ele).build().perform();
}
		public void dragAndDrop(WebElement fromElement,WebElement toElement,WebDriver driver) {
			Actions action=new Actions(driver);
			action.dragAndDrop(fromElement, toElement)
			.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
			
}
		public void SingleOrMultipleDropdown(WebElement SelectTagElement ) {
		Select ref = new Select (SelectTagElement);
		Boolean verify=ref.isMultiple();
		if(verify==true) {
			System.out.println("Multiple");
		}
		else {
			System.out.println("Single");
		}
}
		public void dropDownByVisibleText(WebElement SelectTagElement,String Completetext ) {
			Select ref = new Select (SelectTagElement);
			ref.selectByVisibleText(Completetext);
		}
		public void dropDownByIndex(WebElement SelectTagElement,int index ) {
			Select ref = new Select (SelectTagElement);
			ref.selectByIndex(index);
		}
		public void dropDownByValue(WebElement SelectTagElement,String valueOfAttribute ) {
			Select ref = new Select (SelectTagElement);
			ref.selectByVisibleText(valueOfAttribute);
		}
		public void keysUpDown(WebElement ele,WebDriver driver) {
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL);
		action.contextClick(ele).perform();
		}
		public void keysMoving(WebElement ele,WebDriver driver) {
		ele.sendKeys("Hello");
		Actions action=new Actions(driver);
		action.moveByOffset(1078,237).click().perform();
		ele.sendKeys("BYE");
}
}