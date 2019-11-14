package utilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import configuration.ConfigObjReader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;


public class BaseUtilities extends JSHelper {
    private static ExtentTest test;
    private Actions actions;

    public BaseUtilities(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public void getElementHighlight(final WebElement element) {
        try {
            Wait<WebDriver> wait = new WebDriverWait(driver, ConfigObjReader.reader.getExplicitWait());
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver webDriver) {
                    return element != null;
                }
            });
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='2px solid red'", element);
        } catch (Exception e) {
            logger.info("Fail to highlight the element:" + element);
        }
    }

    private void moveToElement(WebElement element) {
        try {
            getElementHighlight(element);
            actions.moveToElement(element).build().perform();
            timeInterval(3);
        } catch (Exception e) {
            logger.info("Fail to move to element: " + element);
        }
    }

    public void sendKeys(By by, String value) {
        WebElement element = null;
        try {
            element = driver.findElement(by);
            waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
            moveToElement(element);
            element.clear();
            element.sendKeys(value);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(false, "Fail to send keys from text box : " + element + " on page : " + e.getMessage());
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }

    public void click(By by) {
        WebElement element = driver.findElement(by);
        try {
            waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
            moveToElement(element);
            element.click();

        } catch (WebDriverException e) {
           test.log(Status.PASS, "Fail to click on link : " + by + " on page : " + driver.getCurrentUrl());
            Assert.assertTrue(false, "Fail to click on link : " + by + " on page : " + driver.getCurrentUrl());
        }
    }

    public boolean isDisplayed(By by) {
        WebElement element = null;
        try {
            element = driver.findElement(by);
            waitForElement(element, ConfigObjReader.reader.getExplicitWait());
            moveToElement(element);
            return element.isDisplayed();
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return false;
    }

    public String getText(By by) {
        WebElement element = null;
        try {
            element = driver.findElement(by);
            waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
            moveToElement(element);
        } catch (NoSuchElementException e) {
            logger.info(e.getMessage());
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return element.getText().trim();
    }

    public int getNumberOfListOfElements(By by) {
        List<WebElement> element = null;
        try {
            element = driver.findElements(by);
            return element.size();
        } catch (Exception e) {
            logger.info(e.getMessage());
            return 0;
        }
    }

    public List<WebElement> getListOfElements(By by) {
        try {
            List<WebElement> element = driver.findElements(by);
            return element;
        } catch (Exception e) {
            logger.info(e.getMessage());
            return null;
        }
    }

    public void sendKeysWait(By by, String value) {
        WebElement element = driver.findElement(by);
        waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
        try {
            moveToElement(element);
            element.clear();
            for (int i = 0; i < value.length(); i++) {
                element.sendKeys(String.valueOf(value.charAt(i)));
            }

        } catch (NoSuchElementException e) {
            Assert.assertTrue(false, "Fail to send keys from text box : " + by + " on page : " + e.getMessage());
        }
    }

    public void autoSuggestList(By textBox, String autoSuggestVal, By autoSuggestList) throws IOException {
        sendKeysWait(textBox, autoSuggestVal);
        WebElement autoSuggest = driver.findElement(autoSuggestList);
        waitForElementVisible(autoSuggest, ConfigObjReader.reader.getExplicitWait());
        if (isDisplayed(autoSuggestList)) {
            moveToElement(autoSuggest);
            timeInterval(1);
            click(autoSuggestList);
            timeInterval(1);
        } else {
            sendKeys(textBox, "\t");
        }
    }

    /**
     * Checks if is selected.
     *
     * @param by the by
     * @return true, if is selected
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public boolean isSelected(By by) throws IOException {
        WebElement element = driver.findElement(by);

        try {
            waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
            moveToElement(element);
            return element.isSelected();
        } catch (NoSuchElementException e) {
            logger.info(e.getMessage());
            return false;
        } catch (Exception e) {
            logger.info("Fail to check isSelected : " + by + " : " +e.getMessage());
            return false;
        }
    }


}
