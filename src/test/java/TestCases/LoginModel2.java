package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import shopstack.BaseClass;
@Listeners(shopstack.ListenerImplementation.class)
public class LoginModel2 extends BaseClass{
	
@Test	
	public void Login_001() {
	Pomclass.HomepageAfterLogin HMAL = new Pomclass.HomepageAfterLogin(driver);
		HMAL.getMenMenuLink().click();
		}
@Test
	public void Login_002() {
		Pomclass.HomepageAfterLogin HMAL = new Pomclass.HomepageAfterLogin(driver);
		HMAL.getWomenMenuLink().click();
		}
	public WebDriver driver;
	public void HomepageAfterLogin(WebDriver driver) {
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
