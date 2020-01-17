package IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserExecution {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium Drivers\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		WebDriver  driver=new InternetExplorerDriver(); 
		
		  driver.get("https://batteriesplus-uat.repairq.io/site/login");
		    driver.manage().window().setSize(new Dimension(1936, 1056));
		    driver.findElement(By.id("UserLoginForm_username")).click();
		    driver.findElement(By.id("UserLoginForm_username")).sendKeys("l.costa@cinq.com.br");
		    driver.findElement(By.id("UserLoginForm_password")).click();
		    driver.findElement(By.id("UserLoginForm_password")).sendKeys("123");
		    driver.findElement(By.cssSelector(".btn-new")).click();
		    driver.findElement(By.linkText("Check In")).click();
		    Thread.sleep(5000);
 
	}

}
 