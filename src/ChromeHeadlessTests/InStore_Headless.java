package ChromeHeadlessTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InStore_Headless {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1280,1024");
		//options.addArguments("screenshot");
		
		WebDriver driver = new ChromeDriver(options);  
		
				
		
				driver.get("https://batteriesplus-uat.repairq.io/site/login");
				driver.manage().window().setSize(new Dimension(1280, 1024));
				JavascriptExecutor js = (JavascriptExecutor) driver;

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

				WebElement btnCheckinNewModal = new WebDriverWait(driver, 5).until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#ticketCheckin [href='#ticketCheckinNewModal']")));

				btnCheckinNewModal.click();

				WebElement btnAssurant = new WebDriverWait(driver, 5).until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#serviceAuthorizers [data-integrated-name='bpb']")));

				btnAssurant.click();

				WebElement btnInStore = new WebDriverWait(driver, 5).until(
						ExpectedConditions.elementToBeClickable(By.cssSelector("#serviceProgram  [data-service-program='1']")));

				btnInStore.click();

				Thread.sleep(1000);
				driver.findElement(By.id("customerSearch")).click();
				driver.findElement(By.id("customerSearch")).sendKeys("lucas");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"customer-search-modal\"]/ul/li[1]/a")).click();
				Thread.sleep(8000);

				{

					driver.findElement(By.linkText("Dismiss")).click();
				}

				WebElement btnIcon = new WebDriverWait(driver, 5)
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary > .icon-ok")));

				btnIcon.click();

				WebElement btnCheck = new WebDriverWait(driver, 5)
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".check")));

				btnCheck.click();

				WebElement btnIcon1 = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary > .icon-ok")));

				btnIcon1.click();

				WebElement btnSamsung = new WebDriverWait(driver, 10).until(
						ExpectedConditions.elementToBeClickable(By.cssSelector("#new-device-form [data-category-id='508']")));

				btnSamsung.click();

				WebElement btnS9 = new WebDriverWait(driver, 10).until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#new-device-form [data-catalogitem-id='9986']")));

				btnS9.click();

				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[@id=\"claim-device-serial\"]")).sendKeys("123456");
				driver.findElement(By.id("claim-device-serial")).sendKeys(Keys.ENTER);
				driver.switchTo().frame(0);
				driver.findElement(By.cssSelector("p")).click();
				{
					WebElement element = driver.findElement(By.id("tinymce"));
					js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'testing'}",
							element);
				}
				driver.switchTo().defaultContent();

				WebElement btnContinueClaim = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue with Claim")));

				btnContinueClaim.click();

				Thread.sleep(8000);
				driver.findElement(By.linkText("Save & Submit")).click();

				WebElement btnradio = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
						By.cssSelector(".control-group:nth-child(2) .radio-inline:nth-child(3) > .required")));

				btnradio.click();

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
				driver.findElement(By.id("customField_80")).sendKeys("ok");
				driver.findElement(By.linkText("Save & Submit")).click();

				Thread.sleep(8000);
				
				
				WebElement btnaddBtn = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.id("addBtn")));

				btnaddBtn.click();

				WebElement btnRepair = new WebDriverWait(driver, 10).until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#ticket-item-form [data-catalogitem-id='38243']")));

				btnRepair.click();

				WebElement btnbtnlarge = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-large")));

				btnbtnlarge.click();

				WebElement btnCreateEstimate = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Estimate")));

				btnCreateEstimate.click();

				WebElement btnContinue = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue")));

				btnContinue.click();

				driver.findElement(By.cssSelector(".add-on > .icon-calendar")).click();
				driver.findElement(By.linkText("20")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".check")).click();
				driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(8000);

				WebElement btnStartRepair = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Start Repair")));

				btnStartRepair.click();

				WebElement btnRepairComplete = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Repair Complete")));

				btnRepairComplete.click();

				WebElement btnConfirmEstimate = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Confirm Estimate")));

				btnConfirmEstimate.click();

				Thread.sleep(15000);

				driver.findElement(By.xpath("//*[@id=\"claim\"]/div[2]/div[1]/div[4]/a")).click();

				Thread.sleep(5000);

				driver.findElement(By.id("claim-contact-notify-note")).click();
				driver.findElement(By.id("claim-contact-notify-note")).sendKeys("12");

				WebElement btnContact = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Notified")));

				btnContact.click();

				Thread.sleep(10000);
				driver.findElement(By.linkText("Next: Send To RMS")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Send to RMS")).click();

				System.out.println("Completed");

				 driver.quit();
			}
	{
		}
			
		}
		
	
	 


