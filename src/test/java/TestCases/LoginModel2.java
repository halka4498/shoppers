 package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import shopstack.BaseClass;

@Listeners(shopstack.ListenerImplementation.class)
public class LoginModel2 extends BaseClass{
	
	
@Test	
	public void Login_001() throws InterruptedException {
	Thread.sleep(5000);
	Pomclass.HomepageAfterLogin HMAL = new Pomclass.HomepageAfterLogin(driver);
		HMAL.getMenMenuLink().click();
		}
@Test
	public void Login_002() throws InterruptedException {
	Thread.sleep(5000);
		Pomclass.HomepageAfterLogin HMAL = new Pomclass.HomepageAfterLogin(driver);
		HMAL.getWomenMenuLink().click();
		}
//	public WebDriver driver;
//	public void HomepageAfterLogin(WebDriver driver) throws InterruptedException {
//		Thread.sleep(5000);
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(id="men")
//	private WebElement MenMenuLink;
//	
//	@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']")
//	private WebElement AccountSettingIcon;
//	
//	@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']")
//	private WebElement LogoutIcon;
//	
//	@FindBy(xpath="//a[text()='Women']")
//	private WebElement WomenMenuLink;
//	
//	public WebElement getAccountSettingIcon() {
//		return AccountSettingIcon;
//	}
//	
//	public WebElement getLogoutIcon() {
//		return LogoutIcon;
//	}
//	
//	public WebElement getMenMenuLink() {
//		return MenMenuLink;
//	}
//		
//		public WebElement getWomenMenuLink() {
//			return WomenMenuLink;
//		}
	
}
