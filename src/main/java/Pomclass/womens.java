package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womens {
	public WebDriver driver;
	
	public womens(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='women kurti']/parent::div/parent::div//button")
	private WebElement addToCartWomenButton;
	public WebElement getaddToCartWomenButton() {
		return addToCartWomenButton;
	}

}
