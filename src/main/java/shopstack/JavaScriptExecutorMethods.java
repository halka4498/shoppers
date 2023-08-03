package shopstack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorMethods{
	
	
		public void JavaScriptClickOnElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		}
		
		public void JavaScriptSendKeys(WebDriver driver,WebElement ele) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='hello';", ele);
		}
		
		public void JavaScriptSendData(WebDriver driver,WebElement ele,String dataToSend) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+dataToSend+"';", ele);
		}
		
		public void JavaScriptHighLigthElement(WebDriver driver,WebElement ele) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].style.border='4px solid blue';", ele);
		}

		public void JavaScriptScroll(WebDriver driver) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("scrollBy(0,400);");

		}
		public void JavaScriptVerifingTitle(WebDriver driver,String actualTitle) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			String expectedTitle=(String) jse.executeScript("return document.title;");
			if(actualTitle.equals(expectedTitle)) {
				System.out.println("The Title is matching");
			}
			else {
				System.out.println("The Title is not matching");
			}

		}
		public void JavaScriptVerifingUrl(WebDriver driver,String expectedUrl) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			String actualUrl=(String) jse.executeScript("return document.URL");
			if(actualUrl.equals(expectedUrl)) {
				System.out.println("The url is matching");
			}
			else {
				System.out.println("The url is not matching");
			}
			driver.manage().window().maximize();
		}
}
