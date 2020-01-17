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
public class CreateEstimatebuttonTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void createEstimatebutton() {
    driver.get("https://batteriesplus-uat.repairq.io/ticket/edit/6060");
    driver.manage().window().setSize(new Dimension(1305, 858));
    driver.findElement(By.id("claim-create-shipment-shipper")).click();
    {
      WebElement dropdown = driver.findElement(By.id("claim-create-shipment-shipper"));
      dropdown.findElement(By.xpath("//option[. = 'UPS']")).click();
    }
    driver.findElement(By.id("claim-create-shipment-shipper")).click();
    driver.findElement(By.id("claim-create-shipment-method")).click();
    {
      WebElement dropdown = driver.findElement(By.id("claim-create-shipment-method"));
      dropdown.findElement(By.xpath("//option[. = 'Standard']")).click();
    }
    driver.findElement(By.id("claim-create-shipment-method")).click();
    driver.findElement(By.linkText("Create Shipment")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Print Shipping Label")).click();
    vars.put("win23", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win23").toString());
    driver.switchTo().window(vars.get("root").toString());
  }
}
