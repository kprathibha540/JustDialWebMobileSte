package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

import java.util.concurrent.TimeUnit;

public class WaitHelper{

    public static WebDriver driver;
    public Logger logger;
    private WebDriverWait wait;

    public WaitHelper(WebDriver driver) {
        PropertyConfigurator.configure("log4j.properties");
        this.driver = driver;
        logger = Logger.getLogger(this.getClass().getName());
    }

    /**
     * This method is for implicit wait.
     *
     * @param timeout
     * @param unit
     */
    public void setImplicitWait(long timeout, TimeUnit unit) {
        logger.info("Set implicit wait to:" + timeout);
        driver.manage().timeouts().implicitlyWait(timeout, unit);
    }

    /**
     * This method is for explicit wait.
     *
     * @param timeOutInSeconds
     * @return
     */
    private WebDriverWait getWait(int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.ignoring(Exception.class);
        return wait;
    }

    /**
     * This method is for visibility of element.
     *
     * @param element
     * @param timeInSec
     */
    public void waitForElementVisible(WebElement element, int timeInSec) {
        logger.info("Waiting for " + element.toString() + " for " + timeInSec + " seconds.");
        wait = getWait(timeInSec);
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.info("Element is visible.");
    }

    public void waitUntilElementDisplays(final By element) {
        int i = 1;
        do {
            try {
                driver.findElement(element).isDisplayed();
                i++;
            } catch (NoSuchElementException e) {
                timeInterval(1);
                logger.info("waiting for element : " + element.toString() + " :  Waiting Time [ " + i + " ] out of " + 5);
                break;
            } catch (StaleElementReferenceException ser) {
                driver.navigate().refresh();
            }
        }
        while (!driver.findElement(element).isDisplayed());
    }

    /**
     * This method is wait for element to be clickable.
     *
     * @param element
     * @param timeInSec
     */
    public void waitForElementClickable(WebElement element, int timeInSec) {
        logger.info("Waiting for " + element.toString() + " for " + timeInSec + " seconds.");
        wait = getWait(timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        logger.info("Element is clickable.");
    }

    /**
     * @param element
     * @param timeInSec
     */
    public void waitForElement(WebElement element, int timeInSec) {
        logger.info("Waiting for " + element.toString() + " for " + timeInSec + " seconds.");
        wait = getWait(timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        logger.info("Element is clickable.");
    }

    /**
     * This method is for web page load time.
     *
     * @param timeout
     * @param unit
     */
    public void pageLoadTime(long timeout, TimeUnit unit) {
        logger.info("Wait for page to load for: " + timeout + " seconds.");
        driver.manage().timeouts().pageLoadTimeout(timeout, unit);
        logger.info("Page is loaded.");
    }

    public void timeInterval(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    public void waitForAjaxControls(int timeoutInSeconds) {
        logger.info("Querying active AJAX controls by calling jquery.active");
        try {
            if (driver instanceof JavascriptExecutor) {
                JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
                for (int i = 0; i < timeoutInSeconds; i++) {
                    Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
                    // return should be a number
                    if (numberOfAjaxConnections instanceof Long) {
                        Long n = (Long) numberOfAjaxConnections;
                        logger.info("Number of active jquery AJAX controls: " + n);
                        if (n.longValue() == 0L)
                            break;
                    }
                    timeInterval(1);
                }
            } else {
                logger.info("Web driver: " + driver + " can't run javascript.");
            }
        } catch (Exception e) {
            logger.info(e);
        }
    }
}
