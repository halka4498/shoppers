package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageAfterLogin {
	
	public WebDriver driver;
	
	public HomepageAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="men")
	private WebElement MenMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']")
	private WebElement AccountSettingIcon;
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']")
	private WebElement LogoutIcon;
	
	@FindBy(id="women")
	private WebElement WomenMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @id='cartIcon']")
	private WebElement MainCartIcon;
	
	public WebElement getMainCartIcon() {
		return MainCartIcon;
	}

	public WebElement getAccountSettingIcon() {
		return AccountSettingIcon;
	}

	public WebElement getLogoutIcon() {
		return LogoutIcon;
	}

	public WebElement getMenMenuLink() {
		return MenMenuLink;
	}

	public WebElement getWomenMenuLink() {
		return WomenMenuLink;
	}
}
