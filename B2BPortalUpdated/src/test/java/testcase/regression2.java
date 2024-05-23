package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objects.elementDictionary;
import objects.loginPage;
import objects.homePage;
import objects.orderPage;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;

public class regression2 {

	@AfterMethod
	public void terminate() {

		elementDictionary.teardown();

	}

	@Test(priority = 1)
	public void EssilorPro_Amera() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/amera/auth/login");
		elementDictionary.login("AMERA_PORTAL", "WelcomeDig202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/amera/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/amera/tracking");

	}

	@Test(priority = 2)
	public void EssilorPro_MY() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/my/auth/login");
		elementDictionary.login("emsbtestuser", "WelcomeEMSB202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();

		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/my/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();

		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/my/tracking");

	}
	
	@Test(priority = 3)
	public void EssilorPro_ZA() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/za/auth/login");
		elementDictionary.login("TEST_ESA", "WelcomeESA202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/za/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/za/tracking");

	}

	@Test(priority = 4)
	public void EssilorPro_SG() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/sg/auth/login");
		elementDictionary.login("TEST_ESIN", "WelcomeESPL202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/sg/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/sg/tracking");

	}
	
	@Test(priority = 5)
	public void EssilorPro_PH() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/ph/auth/login");
		elementDictionary.login("TEST_EPODI", "WelcomeEPODI202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ph/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ph/tracking");

	}
	
	@Test(priority = 6)
	public void EssilorPro_IN() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/in/auth/login");
		elementDictionary.login("TEST_EIPL_PROD", "WelcomeEIPL202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/in/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/in/tracking");

	}
	
	@Test(priority = 7)
	public void EssilorPro_ID() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/id/auth/login");
		elementDictionary.login("test.user", "WelcomeOPI202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX Ordering");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/id/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("Tracking");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/id/tracking");

	}
	
	@Test(priority = 8)
	public void EssilorPro_TH() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/th/auth/login");
		elementDictionary.login("EDT_TEMP96", "WelcomeEDT202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("สั่งซื้อเลนส์ Prescription (RX)");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/th/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("สถานะการสั่งซื้อ");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/th/tracking");

	}
	
	@Test(priority = 9)
	public void EssilorPro_TR() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/tr/auth/login");
		elementDictionary.login("TESTOPAKPROD", "WelcomeOPAK202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX SİPARİŞİ");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate("//input[@value='Giriş Yap']");
		// Second assertion
		elementDictionary.validateCurrentUrl("https://www.opakoptik.net/");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

//		elementDictionary.navigateTo("สถานะการสั่งซื้อ");
//		elementDictionary.switchToNextBrowserTab();
//		// First assertion
//		elementDictionary.validate(orderPage.getOrderDropdown());
//		// Second assertion
//		elementDictionary.validateCurrentUrl("https://essilor-order.com/tr/tracking");

	}

	@Test(priority = 9)
	public void EssilorPro_MA() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/ma/auth/login");
		elementDictionary.login("TEST_LNO_2", "WelcomeLNO202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("commander mes verres");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ma/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("SUIVI");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ma/tracking");

	}
	
	@Test(priority = 10)
	public void EssilorPro_AE() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/ae/auth/login");
		elementDictionary.login("Essilor_Prod", "WelcomeEOS202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("RX ORDERING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ae/order/single-pair");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/ae/tracking");

	}
	
	@Test(priority = 11)
	public void EssilorPro_AU() throws InterruptedException {

		elementDictionary.setup("https://www.essilorpro.io/au/auth/login");
		elementDictionary.login("TEAM_ESSAU", "WelcomeEss202!");

		elementDictionary.answerSurvey();
		elementDictionary.closeAnnouncement();

		elementDictionary.navigateTo("TRACKING");
		elementDictionary.switchToNextBrowserTab();
		// First assertion
		elementDictionary.validate(orderPage.getOrderDropdown());
		// Second assertion
		elementDictionary.validateCurrentUrl("https://essilor-order.com/au/tracking");
		elementDictionary.closeBrowserTab();
		elementDictionary.switchToPreviousBrowserTab();
		
		elementDictionary.navigateTo("Essilink");
		// First assertion
		elementDictionary.validateCurrentUrl("https://www.essilorpro.io/au/visionweb/ordering");

	}
}
