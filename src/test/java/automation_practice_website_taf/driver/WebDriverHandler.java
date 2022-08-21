package automation_practice_website_taf.driver;

import automation_practice_website_taf.utilities.ConfigProperties;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;
import java.io.IOException;

public class WebDriverHandler {

    private static WebDriver webDriver;

    private static final String chromeDriverPath = "../drivers/chromedriver.exe";
    private static String chromeDriverType = "webdriver.chrome.driver";

    private static final String edgeDriverPath = "../drivers/msedgedriver.exe";
    private static String edgeDriverType = "webdriver.edge.driver";

    private static String browserType = "resources/configBrowser.properties";
    private String driverPath = "driverPath";

    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserType);
        driverPath = configBrowser.getProperty(driverPath);
        Dimension dimension = new Dimension(1024, 768);

        switch (driverPath) {
            case chromeDriverPath:
                System.setProperty(chromeDriverType, chromeDriverPath);
                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                webDriver.manage().window().setSize(dimension);
                break;

            case edgeDriverPath:
                System.setProperty(edgeDriverType, edgeDriverPath);
                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                System.setProperty("webdriver.edge.verboseLogging", "true");
                webDriver.manage().window().setSize(dimension);
                break;
        }
    }

    public static WebDriver getWebDriver() { return webDriver;}

    public static void navigateTo(String link) {webDriver.navigate().to(link);}

    public static void close() {webDriver.quit();}

}

