package FirefoxBrowser;
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
public class Mail_In_StartNewTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void startNew() throws InterruptedException {
    driver.get("https://batteriesplus-uat.repairq.io/site/login");
    driver.manage().window().setSize(new Dimension(1280, 1024));
    
    
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
    driver.findElement(By.cssSelector(".btn-new")).click();
    driver.findElement(By.linkText("Check In")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#ticketCheckin [href='#ticketCheckinNewModal']")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#serviceAuthorizers [data-integrated-name='bpb']")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#serviceProgram [data-service-program = '2']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("customerSearch")).click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    driver.findElement(By.id("customerSearch")).sendKeys("lucas");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id=\"customer-search-modal\"]/ul/li[1]/a")).click();
    Thread.sleep(5000);
   
    {
      Thread.sleep(5000);
     
      driver.findElement(By.linkText("Dismiss")).click();
   }
    // Caso a tela do dismiss n�o apare�a usar esse comando 
  //  driver.findElement(By.xpath("//*[@id=\"claim-walkthrough-modal\"]/div[3]/a[2]")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".btn-primary > .icon-ok")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".check")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".btn-primary > .icon-ok")).click();
    Thread.sleep(35000);
    driver.findElement(By.cssSelector("#new-device-form [data-category-id='508']")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#new-device-form [data-catalogitem-id='9986']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("claim-device-serial")).sendKeys("123456");
    Thread.sleep(5000);
    driver.findElement(By.id("claim-device-serial")).sendKeys(Keys.ENTER);
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector("p")).click();
    {
      WebElement element = driver.findElement(By.id("tinymce"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'testing'}", element);
    }
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Continue with Claim")).click();
    Thread.sleep(10000);
    driver.findElement(By.linkText("Save & Submit")).click();
    Thread.sleep(10000);
    driver.findElement(By.cssSelector(".control-group:nth-child(2) .radio-inline:nth-child(3) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(7) .radio-inline:nth-child(2) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(9) .radio-inline:nth-child(3) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(11) .radio-inline:nth-child(3) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(12) .radio-inline:nth-child(4) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(13) .radio-inline:nth-child(2) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(24) .radio-inline:nth-child(2) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(25) .radio-inline:nth-child(2) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(27) .radio-inline:nth-child(2) > .required")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(28) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(32) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(36) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(39) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(40) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(43) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(45) .radio-inline:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".control-group:nth-child(46) .radio-inline:nth-child(2)")).click();
    driver.findElement(By.id("customField_80")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("customField_80")).sendKeys("ok");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Save & Submit")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("addBtn")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#ticket-item-form [data-catalogitem-id='38243']")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".btn-large")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Create Estimate")).click();
    Thread.sleep(10000);
    driver.findElement(By.linkText("Continue")).click();
    driver.findElement(By.cssSelector(".add-on > .icon-calendar")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("30")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Continue")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".check")).click();
    Thread.sleep(10000);
    driver.findElement(By.linkText("Continue")).click();
    Thread.sleep(10000);
    driver.manage().window().setSize(new Dimension(1176, 743));
    driver.findElement(By.id("claim-create-shipment-shipper")).click();
    Thread.sleep(5000);
    {
      WebElement dropdown = driver.findElement(By.id("claim-create-shipment-shipper"));
      dropdown.findElement(By.xpath("//option[. = 'UPS']")).click();
      Thread.sleep(5000);
    }
    driver.findElement(By.id("claim-create-shipment-shipper")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("claim-create-shipment-method")).click();
    {
      WebElement dropdown = driver.findElement(By.id("claim-create-shipment-method"));
      Thread.sleep(5000);
      dropdown.findElement(By.xpath("//option[. = 'Standard']")).click();
      Thread.sleep(5000);
    }
    driver.findElement(By.id("claim-create-shipment-method")).click();
    Thread.sleep(5000);
 
  } 

}

