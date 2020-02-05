package safeware;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnableSafewareTest {
	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void enableSafewareTest() {
		LoginTest.login(driver);

		
		// Código para fazer mouseover e esperar o elemento aparecer
		
		WebElement settingsMenu = driver.findElement(By.cssSelector(".nav a[href^='/settings']"));

		new Actions(driver).moveToElement(settingsMenu).perform();

		WebElement locationSettingsMenu = new WebDriverWait(driver, 5).until(
				ExpectedConditions.elementToBeClickable(By.cssSelector(".nav a[href^='/settings/overview?global=0']")));
		locationSettingsMenu.click();

		driver.findElement(
				By.cssSelector(".settings-overview a[href='/settings/application-settings/integration?global=0']"))
				.click();

		driver.findElement(By.cssSelector(".content-main a[href='#safeware_settings']")).click();

		/* Checks "Dealer Number" required validation */
		WebElement dealerNumberField = driver.findElement(By.id("safeware.dealer_number"));
		dealerNumberField.clear();

		WebElement submitButton = driver.findElement(By.cssSelector("#safeware_settings .submit"));
		submitButton.click();

		WebElement dealerNumberFieldContainer = driver
				.findElement(By.cssSelector("[data-id='safeware.dealer_number']"));
		Assert.assertTrue(dealerNumberFieldContainer.getAttribute("class").contains("error"));

		/* Enable Safeware Integration */
		dealerNumberField.sendKeys("1");
		
		WebElement enabledField = driver.findElement(By.id("safeware.enabled_val"));
		WebElement participatingLwField = driver.findElement(By.id("safeware.participating_lw_val"));
		
		enabledField.click();
		participatingLwField.click();
		submitButton.click();
		
		// Refresh page to check if the SW was really enabled
		driver.get(driver.getCurrentUrl());
		
		Assert.assertTrue(enabledField.isSelected());
		Assert.assertTrue(participatingLwField.isSelected());
	}
}
