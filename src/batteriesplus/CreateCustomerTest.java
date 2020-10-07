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

public class CreateCustomerTest extends RepairQTest {
	
	@Test
	public void createCustomerChrome() throws InterruptedException {
		WebDriver driver = this.driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		this.rqLogin("admin", "outono123");
	
				
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a")).click();
		driver.findElement(By.id("addBtn")).click();

		
		Thread.sleep(4000);
		
		 driver.findElement(By.id("Customer_first_name")).click();
		 driver.findElement(By.id("Customer_first_name")).sendKeys("Lucas");
		 driver.findElement(By.id("Customer_last_name")).click();
		 driver.findElement(By.id("Customer_last_name")).sendKeys("costa");
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
		    	
		    	Thread.sleep(10000);
		    	
		  
		    	
		    }
				

}


