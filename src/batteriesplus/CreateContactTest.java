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




 public class CreateContactTest extends RepairQTest {
	
	@Test
	public void createContactChrome() throws InterruptedException {
		WebDriver driver = this.driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		this.rqLogin("admin", "outono123");
		
	
	
    
    WebElement btnnew = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-new")));

	btnnew.click();
    
    
    
    driver.findElement(By.linkText("Opportunities")).click();
    
    WebElement btnadd = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.elementToBeClickable(By.id("addBtn")));

	btnadd.click();
       
          
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
    
  

