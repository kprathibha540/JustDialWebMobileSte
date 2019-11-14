package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper extends DropDownHelper {

    public AlertHelper(WebDriver driver) {
        super(driver);

    }

    public Alert getAlert() {
        logger.info("Alert Popup:" + driver.switchTo().alert().getText());
        return driver.switchTo().alert();
    }

    public void acceptAlert() {
        getAlert().accept();
        logger.info("Accept alert");
    }

    public void dismissAlert() {
        getAlert().dismiss();
        logger.info("Dismiss alert");
    }

    public String getAlertText() {
        return getAlert().getText();
    }

    public void acceptAlertWithText(String txt) {
        getAlert().sendKeys(txt);
        acceptAlert();
    }

}
