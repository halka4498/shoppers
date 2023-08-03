package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womens {
	
	public womens(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[1]/span[1]")
	private WebElement addToCartWomenButton;
	public WebElement getaddToCartWomenButton() {
		return addToCartWomenButton;
	}

}
