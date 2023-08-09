package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageB4Login {
	
	WebDriver driver;
	public HomePageB4Login(WebDriver driver){
		PageFactory.initElements(driver,this);	
	}
	//@FindBy(id="loginBtn")
	@FindBy(xpath="//*[@id=\"loginBtn\"]")
	private WebElement loginMainButton;
	
	public WebElement getLoginMainButton() {
		return loginMainButton;
		
	}
}
	
	


