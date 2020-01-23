package ChromeHeadlessTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1280,1024");
		//options.addArguments("screenshot");
		
		WebDriver driver = new ChromeDriver(options);  
		
				
		driver.get("https://batteriesplus-uat.repairq.io/");
	    driver.manage().window().setSize(new Dimension(1311, 912));
	    
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
	    Thread.sleep(10000);
	    System.out.println("Completed");
	    
	    driver.quit();
		
	}
	 

}
