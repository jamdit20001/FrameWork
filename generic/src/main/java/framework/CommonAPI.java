package framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utility.reader.ConnectDB;
import utility.reader.DataReader;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by shazeda on 5/21/17.
 */
public class CommonAPI {

    protected WebDriver driver = null;

    protected DataReader dataReader = new DataReader();
    protected ConnectDB connectDB = new ConnectDB();

    private static final String browserstackUser = "shazedasharmin1";
    private static final String browserstackKey = "hs84HDzonhAEyst71vRQ";
    private static final String browserstackUrlFormat = "http://%s:%s@hub-cloud.browserstack.com/wd/hub";

    private static final String saucelabsUser = "shazedasharmin1";
    private static final String saucelabsKey = "26fac08b-2620-488c-8706-efa50e7583e1";
    private static final String saucelabsUrlFormat = "https://%s:%s@ondemand.saucelabs.com:443/wd/hub";

    @BeforeMethod
    @Parameters({"url", "browser", "platform", "env"})
    public void setup(String url, @Optional("chrome") String browser, @Optional("mac") String platform, @Optional("local") String env) throws Exception {

        if (env.equalsIgnoreCase("local")) {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
            } else {
                throw new Exception("Unsupported browser");
            }
        } else {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName(browser);

            if (platform.equalsIgnoreCase("mac")) {
                capabilities.setPlatform(Platform.MAC);

            } else if (platform.equalsIgnoreCase("windows")) {
                capabilities.setPlatform(Platform.WINDOWS);

            } else if (platform.equalsIgnoreCase("win8")) {
                capabilities.setPlatform(Platform.WIN8);

            } else if (platform.equalsIgnoreCase("vista")) {
                capabilities.setPlatform(Platform.VISTA);

            } else if (platform.equalsIgnoreCase("linux")) {
                capabilities.setPlatform(Platform.LINUX);

            } else {
                throw new Exception("Unsupported platform");
            }

            String hubUrl;

            if (env.equalsIgnoreCase("browserstack")) {
                hubUrl = String.format(browserstackUrlFormat, browserstackUser, browserstackKey);

            } else if (env.equalsIgnoreCase("saucelabs")) {
                hubUrl = String.format(saucelabsUrlFormat, saucelabsUser, saucelabsKey);

            } else {
                throw new Exception("Unsupported env");
            }

            driver = new RemoteWebDriver(new URL(hubUrl), capabilities);
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(ITestResult result) {
        if (!result.isSuccess()) {
            screenshot();
        }
        driver.quit();
    }

    public void waitToBeVisible(WebElement element) {
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitToBeClickable(WebElement element) {
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void screenshot() {
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            FileUtils.copyFile(file, new File("screenshots/screenshot-" + sdf.format(new Date()) + ".png"));
        } catch (Exception ex) {
            //ignore
        }
    }

    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void navigateForward(){
        driver.navigate().forward();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void mouseHover(WebElement element){
        try {
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch(Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    //handling Alert
    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element){
        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow(){
        driver.switchTo().defaultContent();
    }


}
