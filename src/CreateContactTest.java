// Generated by Selenium IDE
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
public class CreateContactTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createContact() throws InterruptedException {
    driver.get("https://batteriesplus-uat.repairq.io/site/login");
    driver.manage().window().setSize(new Dimension(1176, 743));
    driver.findElement(By.id("UserLoginForm_username")).click();
    driver.findElement(By.id("UserLoginForm_username")).sendKeys("l.costa@cinq.com.br");
    driver.findElement(By.id("UserLoginForm_password")).click();
    driver.findElement(By.id("UserLoginForm_password")).sendKeys("123");
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
    {
    	driver.findElement(By.cssSelector(".btn > .icon-plus")).click();
    	Thread.sleep(20000);
    }

    
  }
}
