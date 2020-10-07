package batteriesplus;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import repairq.RepairQTest;

public class CustomerSearch extends RepairQTest {

	@Test
	public void customerSearchChrome() throws InterruptedException {
		WebDriver driver = this.driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		this.rqLogin("admin", "outono123");
		
				
	
		driver.findElement(By.cssSelector(".btn-new")).click();
		
		driver.findElement(By.linkText("Check In")).click();
		
		WebElement btnSearch = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ticketCheckin [href='#customerSearchModal']")));

		btnSearch.click();
		
				
		Thread.sleep(2000);
		driver.findElement(By.id("customerSearchModalInput")).click();
		driver.findElement(By.id("customerSearchModalInput")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("customerSearchModalInput")).sendKeys("pozzi");
		driver.findElement(By.id("customerSearchModalInput")).sendKeys(Keys.ENTER);
		
		WebElement btnSearch1 = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customerSearchModal [href= '/customer']")));

		btnSearch1.click();
		
			
				
		
	}
}
