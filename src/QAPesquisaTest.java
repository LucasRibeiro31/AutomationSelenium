
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
public class QAPesquisaTest {
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
   // driver.quit();
  }
  @Test
  public void qAPesquisa() throws InterruptedException {
    driver.get("http://www.lourencodemonaco.com.br/vvtest/");
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.cssSelector("#menu-item-226 > a")).click();
    driver.findElement(By.id("nf-field-5")).click();
    driver.findElement(By.id("nf-field-5")).sendKeys("Lucas");
    driver.findElement(By.id("nf-field-6")).sendKeys("Ribeiro");
    driver.findElement(By.id("nf-field-7")).sendKeys("lucascosta21@gmail.com");
    driver.findElement(By.id("nf-field-8")).sendKeys("lucascosta21@gmail.com");
    driver.findElement(By.id("nf-field-17")).click();
    driver.findElement(By.id("nf-field-17")).sendKeys("41999999999999");
    Thread.sleep(1000);
    driver.findElement(By.id("nf-label-class-field-10-1")).click();
    driver.findElement(By.id("nf-field-11")).click();
    {
      WebElement dropdown = driver.findElement(By.id("nf-field-11"));
      dropdown.findElement(By.xpath("//option[. = 'mais de 5 anos']")).click();
      
      Thread.sleep(1000);
      
      WebElement dropdown2 = driver.findElement(By.id("nf-field-12"));
      dropdown2.findElement(By.xpath("//option[. = 'Salário']")).click();
                      
        driver.findElement(By.id("nf-label-class-field-13-1")).click();
        driver.findElement(By.id("nf-field-14")).click();
        driver.findElement(By.id("nf-field-14")).sendKeys("java");
        driver.findElement(By.id("nf-field-15")).click();
        driver.findElement(By.id("nf-field-15")).sendKeys("teste");
        driver.findElement(By.id("nf-field-16")).click();
  }
}
  } 
          
        
       