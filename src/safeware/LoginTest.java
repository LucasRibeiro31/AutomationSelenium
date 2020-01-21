package safeware;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	private WebDriver driver;
	JavascriptExecutor js;

	private static final String loginUrl = "http://scjonatas.rq.test/site/login";

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	public static void login(WebDriver driver) {
		login(driver, "admin", "q#!%XLS0H>l$zh<JZ]t)Jq+!3vf^w6R#");
	}

	private static void login(WebDriver driver, String username, String password) {
		if (!driver.getCurrentUrl().equals(loginUrl)) {
			driver.get(loginUrl);
			driver.manage().window().setSize(new Dimension(1176, 743));
		}

		WebElement usernameField = driver.findElement(By.id("UserLoginForm_username"));
		WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));

		usernameField.click();
		usernameField.clear();
		usernameField.sendKeys(username);

		passwordField.click();
		passwordField.clear();
		passwordField.sendKeys(password);
		passwordField.sendKeys(Keys.ENTER);
	}

	@Test
	public void loginTest() {
		/* Tries to login with incorrect credentials */
		login(driver, "test", "test");

		WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));
		WebElement ancestor = passwordField.findElement(By.xpath("./ancestor::div[contains(@class, 'control-group')]"));

		// Checks if the error class was added
		Assert.assertTrue(ancestor.getAttribute("class").contains("error"));

		/* Login with correct credentials */
		login(driver);
		/*
		 * Checks if the user was redirected to another page, so we assume that the
		 * login was successful
		 */
		Assert.assertFalse(driver.getCurrentUrl().equals(loginUrl));
	}
}
