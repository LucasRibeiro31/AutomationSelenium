package batteriesplus;

// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginRepairTest {

	public void loginrepairChrome() throws InterruptedException {
		loginrepair(new ChromeDriver());
	}

	public void loginrepairFirefox() throws InterruptedException {
		loginrepair(new FirefoxDriver());
	}

	public void loginrepairIE() throws InterruptedException {
		loginrepair(new InternetExplorerDriver());
	}


	// test login fail

	@Test
	public void WrongLoginChrome() throws InterruptedException {
		WrongLogin(new ChromeDriver());
	}

	public void WrongLoginFirefo() throws InterruptedException {
			WrongLogin(new ChromeDriver());
			
	}
			
	public void WrongLoginIE() throws InterruptedException {
				WrongLogin(new ChromeDriver());
	}

	private void loginrepair(WebDriver driver) throws InterruptedException {

		try {

			driver.get("https://batteriesplus-uat.repairq.io/site/login");
			driver.manage().window().setSize(new Dimension(1176, 743));

			WebElement usernameField = driver.findElement(By.id("UserLoginForm_username"));
			usernameField.click();
			usernameField.clear();
			usernameField.sendKeys("l.costa@cinq.com.br");

			WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));
			passwordField.click();
			passwordField.clear();
			passwordField.sendKeys("123");

			// TODO Set different password to check validation

			driver.findElement(By.id("UserLoginForm_password")).click();
			driver.findElement(By.id("UserLoginForm_password")).click();
			

		} finally {
			driver.quit();
		}

	}

	private void WrongLogin(WebDriver driver) throws InterruptedException {

		driver.get("https://batteriesplus-uat.repairq.io/site/login");
		driver.manage().window().setSize(new Dimension(1176, 743));

		WebElement usernameField = driver.findElement(By.id("UserLoginForm_username"));
		usernameField.click();
		usernameField.clear();
		usernameField.sendKeys("l.costa@cinq.combr");

		WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));
		passwordField.click();
		passwordField.clear();
		passwordField.sendKeys("123");

		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.cssSelector(".btn-new")).click();

	}

}
