package batteriesplus;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomerTest {
	
	@Test
	public void createCustomerChrome() throws InterruptedException {
		createCustomer(new ChromeDriver());
	}
	
	
	public void createCustomerFirefox() throws InterruptedException {
		createCustomer(new FirefoxDriver());
	}
	

	public void createCustomerIE() throws InterruptedException {
		createCustomer(new InternetExplorerDriver());
	}

	private void createCustomer(WebDriver driver) throws InterruptedException {
		
	
		
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
		driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.id("addBtn")).click();

		
		Thread.sleep(4000);
		
		 driver.findElement(By.id("Customer_first_name")).click();
		 driver.findElement(By.id("Customer_first_name")).sendKeys("cuca");
		 driver.findElement(By.id("Customer_last_name")).click();
		 driver.findElement(By.id("Customer_last_name")).sendKeys("beludo");
		 driver.findElement(By.id("Customer_pri_phone")).click();
		 driver.findElement(By.id("Customer_pri_phone")).sendKeys("989898989");
		
		 Thread.sleep(2000);
		    {
		      WebElement element = driver.findElement(By.id("Customer_alt_phone"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		      Thread.sleep(5000);
		    }
		    
		    	driver.findElement(By.cssSelector(".btn > .icon-plus")).click();
		    	
		  	
		    	
		    }
				

}


