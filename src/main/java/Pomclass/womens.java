package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womens {
	
	public womens(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"cartIcon\"]")
	private WebElement addToCartWomenButton;
	public WebElement getaddToCartWomenButton() {
		return addToCartWomenButton;
	}

}
