package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pomclass.AddCartPage;
import Pomclass.HomepageAfterLogin;
import Pomclass.womens;
import shopstack.BaseClass;

@Listeners(shopstack.ListenerImplementation.class)
public class VerifyingWomens extends BaseClass{
	@Test
	public void Login_006() {
		HomepageAfterLogin HPAL = new HomepageAfterLogin(driver);
		HPAL.getWomenMenuLink().click();
		
		womens womensPom = new womens (driver);
		womensPom.getaddToCartWomenButton().click();
		HPAL.getMainCartIcon().click();
	
		AddCartPage cartPom=new AddCartPage(driver);
		String actualResult=cartPom.getrayonSleeveLength().getText();
	
		if(actualResult.contains("Fabric : Rayon")) {
			System.out.println("Test Case Pass");
		}
		else{
			System.out.println("Test Case Fail");
		}
	
	assertEquals(actualResult, "Fabric : Rayon");
	
	}
	@Test
	public void Women_04() throws Throwable {
		HomepageAfterLogin HPAL = new HomepageAfterLogin(driver);
		HPAL.getWomenMenuLink().click();
		
		Thread.sleep(2000);
		womens womensPom = new womens(driver);
		womensPom.getaddToCartWomenButton().click();
		System.out.println("done");
	}
}