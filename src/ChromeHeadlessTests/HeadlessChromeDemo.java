package ChromeHeadlessTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\RepairQTests\\RepairQtests\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1280,1024");
		//options.addArguments("screenshot");
		
		WebDriver driver = new ChromeDriver(options);  
		
				
		 driver.get("https://batteriesplus-uat.repairq.io/site/login");
		    driver.manage().window().setSize(new Dimension(1280, 1024));
		    driver.findElement(By.id("UserLoginForm_username")).click();
		    driver.findElement(By.id("UserLoginForm_username")).sendKeys("l.costa@cinq.com.br");
		    driver.findElement(By.id("UserLoginForm_password")).click();
		    driver.findElement(By.id("UserLoginForm_password")).sendKeys("123");
		    driver.findElement(By.cssSelector(".btn-new")).click();
		    driver.findElement(By.linkText("Check In")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"ticketCheckin\"]/div[2]/div/a[1]/div")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"appointmentModal\"]/div[3]/a")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.linkText("+")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("apt_customer")).click();
		    driver.findElement(By.id("apt_customer")).sendKeys("lucas");
		    Thread.sleep(10000);
		    driver.findElement(By.id("apt_customer")).click();
		    driver.findElement(By.id("apt_customer")).sendKeys(Keys.DOWN);
		    driver.findElement(By.id("apt_customer")).sendKeys("lucas");
		    driver.findElement(By.id("apt_customer")).sendKeys(Keys.ENTER);
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector(".add-on > .icon-calendar")).click();
		    driver.findElement(By.linkText("24")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector(".btn-save")).click();
		    Thread.sleep(5000);
		    System.out.println("Completed");
		
		
	}
	 

}
