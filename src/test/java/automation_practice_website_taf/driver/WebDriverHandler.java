package automation_practice_website_taf.driver;

import automation_practice_website_taf.utilities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;

public class WebDriverHandler {

    private static WebDriver webDriver;

    private static final String chromeDriverPath = "drivers/chromedriver.exe";
    private static String chromeDriverType = "webdriver.chrome.driver";

    private static final String edgeDriverPath = "/drivers/msedgedriver.exe";
    private static String edgeDriverType = "webdriver.edge.driver";

    private static String browserType = "./resources/configBrowser.properties";
    private String currentDriverPath = "driverPath";

    DesiredCapabilities caps = new DesiredCapabilities();

    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserType);
        currentDriverPath = configBrowser.getProperty("driverPath");

            switch (currentDriverPath) {
            case chromeDriverPath:
                System.setProperty(chromeDriverType, chromeDriverPath);
                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                caps.setCapability("resolution",configBrowser.getProperty("browserResolution") );
                break;

            case edgeDriverPath:
                System.setProperty(edgeDriverType, edgeDriverPath);
                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                System.setProperty("webdriver.edge.verboseLogging", "true");
                caps.setCapability("resolution",configBrowser.getProperty("browserResolution") );
                break;

        }
    }

    public static WebDriver getWebDriver() { return webDriver;}
    public void navigateToUrl(String link) {
        webDriver.navigate().to(link);
    }
    public void resetCache() {webDriver.manage().deleteAllCookies();}
    public void close() {webDriver.quit();}

}

