package ChromeBrowser;
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
public class CustomerSearchTest {
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
  public void customerSearch() throws InterruptedException {
    driver.get("https://batteriesplus-uat.repairq.io/site/login");
    driver.manage().window().setSize(new Dimension(1176, 743));
    driver.findElement(By.id("UserLoginForm_username")).click();
    driver.findElement(By.id("UserLoginForm_username")).sendKeys("l.costa@cinq.com.br");
    driver.findElement(By.id("UserLoginForm_password")).click();
    driver.findElement(By.id("UserLoginForm_password")).sendKeys("123");
    driver.findElement(By.cssSelector(".btn-new")).click();
    driver.findElement(By.linkText("Check In")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".flex:nth-child(2) > .flex-cell:nth-child(2) > .image-container")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("customerSearchModalInput")).click();
    driver.findElement(By.id("customerSearchModalInput")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("customerSearchModalInput")).sendKeys("pozzi");
    driver.findElement(By.id("customerSearchModalInput")).sendKeys(Keys.ENTER);
    Thread.sleep(10000);
  }
}