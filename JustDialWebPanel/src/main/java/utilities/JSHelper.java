package utilities;

import configuration.ConfigObjReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSHelper extends AlertHelper {

    public JSHelper(WebDriver driver) {
        super(driver);
    }

    public Object executeScript(String script) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(script);
    }

    public Object executeScript(String script, Object... args) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(script, args);
    }

    public void scrollToElementAtXY(By by) {
        logger.info("Scroll to web element.");
        WebElement element = driver.findElement(by);
        waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
        executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
    }

    public void scrollToElement(By by) {
        logger.info("Scroll to web element.");
        WebElement element = driver.findElement(by);
        waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
        executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElement(By by) {
        logger.info("Click to web element.");
        timeInterval(1);
        WebElement element = driver.findElement(by);
        waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
        executeScript("arguments[0].click();", element);
    }

    public void sendKeysByJS(By by, String inputText) {
        WebElement element = driver.findElement(by);
        waitForElementVisible(element, ConfigObjReader.reader.getExplicitWait());
        executeScript("arguments[0].value='" + inputText + "'", element);
    }

}

