package utilities;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandle {

    private WebDriver driver;
    private Logger logger = LoggerHelper.getLogger(WaitHelper.class);

    public WindowHandle(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * This method is use for go to default window.
     */
    public void switchToParentWindow() {
        logger.info("Switching to parent window.");
        driver.switchTo().defaultContent();
    }

    /**
     * This method is for switch to multiple window.
     *
     * @param index
     */
    public void switchToWindow(int index) {
        logger.info("Switching to parent window.");
        Set<String> windows = driver.getWindowHandles();
        int i = 1;
        for (String window : windows) {
            if (i == index) {
                logger.info("Switch to " + index + " window.");
                driver.switchTo().window(window);
            }
            i++;
        }
    }

    /**
     * This method is navigate the page back.
     */
    public void browserBack() {
        logger.info("Navigate to backward.");
        driver.navigate().back();
    }

    /**
     * This method is navigate the page forward.
     */
    public void browserForward() {
        logger.info("Navigate to forward.");
        driver.navigate().forward();
    }
}
