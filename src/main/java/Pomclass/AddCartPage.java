package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage{
		public WebDriver driver;
		public AddCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath="//h3[text()='indianclothings']")
		private WebElement rayonSleeveLength;
		public WebElement getrayonSleeveLength() {
			return rayonSleeveLength;
		}
}
