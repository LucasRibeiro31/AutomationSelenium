package FirefoxHeadlessTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class FirefoxHeadlessMode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxBinary FirefoxBinary = new FirefoxBinary();
		FirefoxBinary.addCommandLineOptions("--headless");
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\Geckodriver\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(FirefoxBinary);
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://batteriesplus-uat.repairq.io/site/login");
		driver.manage().window().setSize(new Dimension(1129, 777));
		
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

		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector(".btn-new")).click();
		    driver.findElement(By.linkText("Opportunities")).click();
		    driver.findElement(By.id("addBtn")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("Customer_first_name")).click();
		    driver.findElement(By.id("Customer_first_name")).sendKeys("lucas");
		    driver.findElement(By.id("Customer_last_name")).click();
		    driver.findElement(By.id("Customer_last_name")).sendKeys("costaaa");
		    driver.findElement(By.id("Customer_pri_phone")).click();
		    driver.findElement(By.id("Customer_pri_phone")).sendKeys("989898989");
		    Thread.sleep(5000);
		    {
		      WebElement element = driver.findElement(By.id("Customer_alt_phone"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		      Thread.sleep(5000);
		    }
		    
		    	driver.findElement(By.cssSelector(".btn > .icon-plus")).click();
		    	Thread.sleep(20000);
		    	
		    	System.out.println("Completed");
		    	driver.quit();

		    	{
	
}
	}


}

		  	


