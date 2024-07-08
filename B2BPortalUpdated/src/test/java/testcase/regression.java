package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objects.elementDictionary;
import objects.loginPage;
import objects.homePage;
import objects.orderPage;

public class regression {

	@AfterMethod
	public void terminate() {

		elementDictionary.teardown();

	}

	@Test(priority = 1)
	public void EssilorPro_Amera() {
		
		elementDictionary.setup("https://www.essilorpro.io/amera/auth/login");
		elementDictionary.fillInput(loginPage.getUsernameField(), "AMERAPORTAL");
		elementDictionary.fillInput(loginPage.getPasswordField(), "Welcome_Dig202!");
		elementDictionary.clickElement(loginPage.getLoginButton());

		elementDictionary.clickElement(homePage.getAnnouncementCloseButton());

		elementDictionary.clickElement(homePage.getOrderNavigation());
		elementDictionary.clickElement("//span[contains(text(),'RX ORDERING')]");
		elementDictionary.switchToNextBrowserTab();
		
		elementDictionary.validate(orderPage.getOrderDropdown());
		String currentUrl = elementDictionary.getUrl();
		if (!currentUrl.contains("https://essilor-order.com/amera/order/single-pair")) {
			throw new AssertionError("Found: " + currentUrl);
		}

		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.clickElement(homePage.getOrderNavigation());
		elementDictionary.clickElement("//span[contains(text(),'TRACKING')]");
		elementDictionary.switchToNextBrowserTab();

		elementDictionary.validate(orderPage.getOrderDropdown());
		String currentUrl2 = elementDictionary.getUrl();
		if (!currentUrl2.contains("https://essilor-order.com/amera/tracking1")) {
			throw new AssertionError("Found: " + currentUrl2);
		}

		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();
		
	}
}
