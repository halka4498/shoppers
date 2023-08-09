package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		 
	}
	@FindBy(id="Email")
	private WebElement EmailTextFeild;
	@FindBy(id="Password")
	private WebElement PasswordTextFeild;
	@FindBy(xpath="//button[@id='Login']")
	private WebElement LoginButton;
	
	public WebElement getEmailTextFeild() {
		return EmailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return PasswordTextFeild;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
