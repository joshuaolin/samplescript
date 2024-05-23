package objects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import setup2.global;

public class elementDictionary {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static SoftAssert softAssertion = new SoftAssert();

	public static void setup(String value) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(value);

	}

	public static void teardown() {

		driver.quit();

	}

	public static void validate(String xpath) {

		WebElement validate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		softAssertion.assertTrue(validate.isDisplayed());
		softAssertion.assertAll();

	}

	public static void fillInput(String selector, String value) {

		driver.findElement(By.xpath(selector)).sendKeys(value);

	}

	public static void clickElement(String selector) {

		driver.findElement(By.xpath(selector)).click();

	}

	public static void switchToNextBrowserTab() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}

	public static void switchToPreviousBrowserTab() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));

	}

	public static String getUrl() {

		return driver.getCurrentUrl();

	}

	public static void closeBrowserTab() {

		driver.close();

	}

	public static void login(String username, String password) {

		fillInput(loginPage.getUsernameField(), username);
		fillInput(loginPage.getPasswordField(), password);
		clickElement(loginPage.getLoginButton());

	}

	public static void navigateTo(String value) {

		clickElement(homePage.getOrderNavigation());
		clickElement("//span[contains(text(),'" + value + "')]");

	}

	public static void validateCurrentUrl(String expectedUrl) {

		String currentUrl = elementDictionary.getUrl();
		if (!currentUrl.contains(expectedUrl)) {
			throw new AssertionError("Found: " + currentUrl);
		}

	}

	public static void closeAnnouncement() throws InterruptedException {

		try {
			clickElement(homePage.getAnnouncementCloseButton());
		} catch (Exception e) {
			System.out.println("Announcement is not available, will proceed now to other steps.");
		}

	}
	
	public static void answerSurvey() throws InterruptedException {

		try {
			List<String> radioButtons = List.of("Smile", "Neutral", "Sad");

			Random random = new Random();
			int randomIndex = random.nextInt(radioButtons.size());
			String selectedRadioButton = radioButtons.get(randomIndex);

			switch (selectedRadioButton) {
			case "Smile":
				clickElement(homePage.getSmileEmoticon());
				clickElement(homePage.getSurveySubmitButton());
				clickElement(homePage.getSurveySubmitButton());
				break;
			case "Neutral":
				clickElement(homePage.getNeutralEmoticon());
				clickElement(homePage.getSurveySubmitButton());
				clickElement(homePage.getSurveySubmitButton());
				break;
			case "Sad":
				clickElement(homePage.getSadEmoticon());
				clickElement(homePage.getSurveySubmitButton());
				clickElement(homePage.getSurveySubmitButton());
				break;
			default:
				System.out.println("N/A");
			}
		} catch (Exception e) {
			System.out.println("Survey is not available, will proceed now to other steps.");
		}
		
	}
	
	public static void back() throws InterruptedException {

		driver.navigate().back();

	}

}
