package batteriesplus;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Assurant {

	
	public void AssurantChrome() throws InterruptedException {
		assurant(new ChromeDriver());
	}

	public void AssurantFirefox() throws InterruptedException {
		assurant(new FirefoxDriver());
	}

	public void AssurantIE() throws InterruptedException {
		assurant(new InternetExplorerDriver());
	}

	// Testing Error ( Customer Declined )
	@Test
	public void AssurantErrorChrome() throws InterruptedException {
		AssurantError(new ChromeDriver());
	}

	public void AssurantErrorFirefox() throws InterruptedException {
		assurant(new FirefoxDriver());
	}

	public void AssurantErrorIE() throws InterruptedException {
		assurant(new InternetExplorerDriver());
	}
	
	private void checkinWithAssurant(WebDriver driver) throws InterruptedException {
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

		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.cssSelector(".btn-new")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("0001")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Switch Location")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("location")).click();
		{
			WebElement dropdown = driver.findElement(By.id("location"));
			dropdown.findElement(By.xpath("//option[. = '0501']")).click();
			Thread.sleep(8000);
		}

		driver.findElement(By.linkText("Check In")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#ticketCheckin [href='#ticketCheckinNewModal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#serviceAuthorizers [data-integrated-name= 'assurant']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("claimNumber")).click();
		driver.findElement(By.id("claimNumber")).sendKeys("snstub__PPNN-151");
		driver.findElement(By.cssSelector(".claim-number-submit:nth-child(3)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#claimPreviewModal [href^='/ticket/edit/']")).click();
		Thread.sleep(4000);
	}

	// @SuppressWarnings("null")
	private void assurant(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			
			checkinWithAssurant(driver);
					
			driver.findElement(By.linkText("Yes")).click();
			Thread.sleep(8000);
			driver.findElement(By.linkText("Continue with Claim")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".check")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Continue")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#new-device-form [data-category-id='458']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#new-device-form [data-catalogitem-id='10527']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Continue with Claim")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Save & Submit")).click();
			Thread.sleep(10000);
			driver.findElement(By.name("87")).click();
			driver.findElement(By.cssSelector(".control-group:nth-child(4) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(6) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(10) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(14) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(15) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(17) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(19) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(21) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(22) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(23) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(29) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(30) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(33) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(34) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(38) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(41) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(43) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(45) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(46) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.cssSelector(".control-group:nth-child(47) .radio-inline:nth-child(2) > .required"))
					.click();
			driver.findElement(By.id("customField_80")).click();
			driver.findElement(By.id("customField_80")).sendKeys("n/a");
			driver.findElement(By.linkText("Save & Submit")).click();
			Thread.sleep(8000);
			driver.findElement(By.id("addBtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"ticket-item-form\"]/fieldset/div[2]/div[2]/div/div/div/div[2]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(".btn-large")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Create Estimate")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"claim-walkthrough-modal\"]/div[3]/a[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#claim [href^='/ticket/edit/']")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Start Repair")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Repair Complete")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Contact Notified")).click();
			Thread.sleep(8000);
			driver.findElement(By.linkText("Next: Send To RMS")).click();
			Thread.sleep(8000);
			driver.findElement(By.linkText("Send to RMS")).click();

		} finally {
			driver.quit();
		}
	}

	private void AssurantError(WebDriver driver) throws InterruptedException {
		
		checkinWithAssurant(driver);
		
		driver.findElement(By.linkText("No Match")).click();
		driver.findElement(By.cssSelector(".trigger-claim-decline:nth-child(2)")).click();
		driver.findElement(By.name("claimCannotRepairReason")).click();
		{
			WebElement dropdown = driver.findElement(By.name("claimCannotRepairReason"));
			dropdown.findElement(By.xpath("//option[. = 'Customer Request']")).click();
		}
		driver.findElement(By.name("claimCannotRepairReason")).click();
		driver.findElement(By.linkText("Cancel Claim")).click();
	}

}
