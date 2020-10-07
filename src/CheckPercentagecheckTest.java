import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CheckPercentagecheckTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkPercentagecheck() throws InterruptedException {
    driver.get("https://teamshift-qa.crossknowledge.com/");
    driver.manage().window().setSize(new Dimension(1176, 743));
    
    
    {
    	driver.findElement(By.xpath("/html/body/main/header/nav/div[2]/div/div/button")).click();
    }
    {
    	WebElement usernameField = driver.findElement(By.id("login-form__login"));
		usernameField.click();
		usernameField.clear();
		usernameField.sendKeys("lucascosta21@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));
		passwordField.click();
		passwordField.clear();
		passwordField.sendKeys("outono123");

		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.id("UserLoginForm_password")).click();
		driver.findElement(By.cssSelector(".btn-new")).click();
		
		
    driver.findElement(By.cssSelector(".js-login-form-submit")).click();
    driver.findElement(By.cssSelector(".header__menu-item .achievement-donut__label")).click();
    driver.findElement(By.cssSelector(".achievement-side-step__container--highlighted > .achievement-side-step__title")).click();
    driver.findElement(By.cssSelector(".achievement-side-step__container--highlighted .glyphicon")).click();
    driver.findElement(By.linkText("Complete the personality assessment")).click();
    driver.findElement(By.cssSelector(".js-step-1 > .button-default--secondary")).click();
  }
}
