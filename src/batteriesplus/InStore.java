package batteriesplus;

// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InStore {

	@Test
	public void inStoreChrome() throws InterruptedException {
		inStore(new ChromeDriver());
	}

	@Test
	public void inStoreFirefox() throws InterruptedException {
		inStore(new FirefoxDriver());
	}

	@Test
	public void inStoreIE() throws InterruptedException {
		inStore(new InternetExplorerDriver());
	}

	private void inStore(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://batteriesplus-uat.repairq.io/site/login");
		driver.manage().window().setSize(new Dimension(1280, 1024));

		WebElement usernameField = driver.findElement(By.id("UserLoginForm_username"));
		usernameField.click();
		usernameField.clear();
		usernameField.sendKeys("l.costa@cinq.com.br");

		WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));
		passwordField.click();
		passwordField.clear();
		passwordField.sendKeys("123");

		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.cssSelector(".btn-new")).click();
		driver.findElement(By.linkText("Check In")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#ticketCheckin [href='#ticketCheckinNewModal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#serviceAuthorizers [data-integrated-name='bpb']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#serviceProgram  [data-service-program='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("customerSearch")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("customerSearch")).sendKeys("lucas");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"customer-search-modal\"]/ul/li[1]/a")).click();
		Thread.sleep(8000);

		{

			driver.findElement(By.linkText("Dismiss")).click();
		}

		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".btn-primary > .icon-ok")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".check")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".btn-primary > .icon-ok")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#new-device-form [data-category-id='508']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#new-device-form [data-catalogitem-id='9986']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("claim-device-serial")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("claim-device-serial")).sendKeys(Keys.ENTER);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("p")).click();
		{
			WebElement element = driver.findElement(By.id("tinymce"));
			js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'testing'}",
					element);
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Continue with Claim")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Save & Submit")).click();
		Thread.sleep(15000);
		driver.findElement(By.cssSelector(".control-group:nth-child(2) .radio-inline:nth-child(3) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(7) .radio-inline:nth-child(2) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(9) .radio-inline:nth-child(3) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(11) .radio-inline:nth-child(3) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(12) .radio-inline:nth-child(4) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(13) .radio-inline:nth-child(2) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(24) .radio-inline:nth-child(2) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(25) .radio-inline:nth-child(2) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(27) .radio-inline:nth-child(2) > .required"))
				.click();
		driver.findElement(By.cssSelector(".control-group:nth-child(28) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(32) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(36) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(39) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(40) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(43) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(45) .radio-inline:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".control-group:nth-child(46) .radio-inline:nth-child(2)")).click();
		driver.findElement(By.id("customField_80")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("customField_80")).sendKeys("ok");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Save & Submit")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#ticket-item-form [data-catalogitem-id='38243']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".btn-large")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Estimate")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".add-on > .icon-calendar")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".check")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Start Repair")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Repair Complete")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Confirm Estimate")).click();
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("#claim [href^='/ticket/edit/']")).click(); // A op��o Href^ serve para poder
																						// encontrar o inicio da frase.
																						// ex /ticket.......
		Thread.sleep(5000);
		driver.findElement(By.id("claim-contact-notify-note")).click();
		driver.findElement(By.id("claim-contact-notify-note")).sendKeys("12");
		driver.findElement(By.linkText("Contact Notified")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Next: Send To RMS")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Send to RMS")).click();
		Thread.sleep(12000);
		
		driver.quit();
	}

}