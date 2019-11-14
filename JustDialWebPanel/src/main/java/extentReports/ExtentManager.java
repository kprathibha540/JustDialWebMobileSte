package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.LoggerHelper;

import org.apache.log4j.Logger;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExtentManager {

    private static ExtentReports extent;
    private static final Logger logger = LoggerHelper.getLogger(ExtentManager.class);
    private static final String windowsPath = System.getProperty("user.dir") + "\\Reports";
   

    public static ExtentReports getInstance() {
        if (extent == null)
            //Set HTML report file location
            return createHtmlReport();
        return extent;
    }

    private static ExtentReports createHtmlReport() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        File reportDirectory = new File(windowsPath);
        if (!reportDirectory.exists()) {
            reportDirectory.mkdir();
            logger.info("Report directory is created at " + windowsPath);
        }
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(windowsPath + "\\JustDialWebAutomation" + dateFormat.format(cal.getTime()) + ".html");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss a");
        htmlReporter.config().setDocumentTitle("Just Dial ");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Just Dial");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }
}
