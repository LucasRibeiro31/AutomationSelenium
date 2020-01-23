package FirefoxHeadlessTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadlessMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxBinary FirefoxBinary = new FirefoxBinary();
		FirefoxBinary.addCommandLineOptions("--headless");
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\Geckodriver\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(FirefoxBinary);
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://batteriesplus-uat.repairq.io/site/login");
		String tittle = driver.getTitle();
		driver.manage().window().setSize(new Dimension(1129, 777));
	    driver.findElement(By.id("UserLoginForm_username")).click();
	    driver.findElement(By.id("UserLoginForm_username")).sendKeys("l.costa@cinq.com.br");
	    driver.findElement(By.id("UserLoginForm_password")).click();
	    driver.findElement(By.id("UserLoginForm_password")).sendKeys("123");
	    driver.findElement(By.cssSelector(".btn-new")).click();
		System.out.println("Completed");
	
	}

}
