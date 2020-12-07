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
public class Progressbar2Test {
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
  public void progressbar2() {
    driver.get("https://teamshift-qa.crossknowledge.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector(".visible-lg-block .button-default")).click();
    driver.findElement(By.id("login-form__login")).click();
    driver.findElement(By.id("login-form__login")).sendKeys("lucascosta21@gmail.com");
    driver.findElement(By.cssSelector(".js-login-form-submit")).click();
    driver.findElement(By.id("login-form__password")).click();
    driver.findElement(By.id("login-form__password")).sendKeys("WLS2020qa");
    driver.findElement(By.cssSelector(".js-login-form-submit")).click();
    driver.findElement(By.cssSelector(".visible-lg-block .button-default")).click();
    driver.findElement(By.id("login-form__login")).click();
  }
}