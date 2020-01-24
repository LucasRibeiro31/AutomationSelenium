package batteriesplus;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class LoginRepairTest {
	
	@Test
	public void loginrepairChrome() throws InterruptedException {
		loginrepair(new ChromeDriver());
	}
	
	@Test
	public void loginrepairFirefox() throws InterruptedException {
		loginrepair(new FirefoxDriver());
	}
	
	@Test
	public void loginrepairIE() throws InterruptedException {
		loginrepair(new InternetExplorerDriver());
	}

	private void loginrepair(WebDriver driver) throws InterruptedException {
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
    Thread.sleep(10000);
  
    driver.quit();
  }
  
  
}
