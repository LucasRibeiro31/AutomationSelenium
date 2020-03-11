package repairq;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RepairQTest {
    static protected List<String> supportedBrowsers = Arrays.asList(new String[] { "chrome", "firefox", "ie11" });
    protected WebDriver driver;

    private String apiKey = null;

    @BeforeEach
    public void createWebDriver() throws MalformedURLException, Exception {
        Boolean use_hub = Boolean.parseBoolean(System.getProperty("repairq.driver.use_hub"));
        if (use_hub)
            this.createRemoteWebDriver();
        else
            this.createLocalWebDriver();
    }

    @AfterEach
    public void destroyWebDriver() {
        this.driver.quit();
        this.driver = null;
    }

    public String getLoginUrl() {
        return this.rqUrl("/site/login");
    }

    public String rqUrl(String url) {
        String base_url = System.getProperty("repairq.base_url");
        return base_url + url;
    }

    public void rqLogin(String username, String password) {
        String loginUrl = this.getLoginUrl();
        if (!this.driver.getCurrentUrl().equals(loginUrl)) {
            this.driver.get(loginUrl);
            this.driver.manage().window().setSize(new Dimension(1176, 743));
        }

        WebElement usernameField = driver.findElement(By.id("UserLoginForm_username"));
        WebElement passwordField = driver.findElement(By.id("UserLoginForm_password"));

        usernameField.click();
        usernameField.clear();
        usernameField.sendKeys(username);

        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);

        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    public void rqLoginAsAdmin() {
        this.rqLogin("admin", "q#!%XLS0H>l$zh<JZ]t)Jq+!3vf^w6R#");
    }

    public Map apiPost(String url, String data) {
        this.checkApiKey();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI(this.rqUrl(url))).setHeader("X-API-KEY", this.apiKey)
                    .POST(HttpRequest.BodyPublishers.ofString(data)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // System.out.println("code:" + response.statusCode() + "," + response.body());
            String responseData = response.body();
            Gson gson = new Gson();
            Map map = gson.fromJson(response.body(), Map.class);
            return map;
        } catch (Exception ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
        return null;
    }

    public void apiGet(String url) {
        this.checkApiKey();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI(this.rqUrl(url))).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("code:" + response.statusCode() + "," + response.body());
        } catch (Exception ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }

    public Map bpbFakeQueueFromTestDataFile(String testDataFilePath) {
        try {
            return this.apiPost(
                "/api/integrationQueue/fakeQueue/",
                new String(Files.readAllBytes(Paths.get(testDataFilePath)))
            );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    private void checkApiKey() {
        // TODO: this will eventually change after Maykonn's security compliance changes are rolled out
        if (this.apiKey == null) {
            this.apiKey = "YWRtaW4=:cSMhJVhMUzBIPmwkemg8SlpddClKcSshM3ZmXnc2UiM=:1";
        }
    }

    private String serializeObjectToJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    private String checkAndGetBrowserName() throws Exception {
        String browser = !"".equals(System.getProperty("repairq.driver.browser")) ? System.getProperty("repairq.driver.browser") : "chrome";
        if (!RepairQTest.supportedBrowsers.contains(browser)) throw new Exception("Browser not supported: " + browser);
        return browser;
    }
    private void createRemoteWebDriver() throws MalformedURLException, Exception {
        String browser = this.checkAndGetBrowserName();
        URL url = new URL("http://selenium_hub:4444/wd/hub");
        switch(browser) {
            case "chrome":
                this.driver = new RemoteWebDriver(url, new ChromeOptions());
                break;
            case "firefox":
                this.driver = new RemoteWebDriver(url, new FirefoxOptions());
                break;
            case "ie11":
                throw new Exception("Hub does not currently support IE11");
        }
    }
    private void createLocalWebDriver() throws Exception {
        throw new Exception("NotImplemented : createLocalWebDriver()");
    }
}