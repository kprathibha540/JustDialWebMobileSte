package utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.justdial.page.HomePage;

public class GenericUtils 
{
	public static Logger logs = LoggerHelper.getLogger(GenericUtils.class);
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {

		//TakesScreenshot ts = (TakesScreenshot) driver;
		//String source =ts.getScreenshotAs(OutputType.BASE64);
		
		String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
      
		return base64Screenshot;
		
	}
	public static String[] splitStringByPipeline(String  value)
	{
		String[] element=value.split("\\|");
		return element;
	}
	public static void getScreenShot(WebDriver driver,String name)
	{
		try 
		{
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./screenshot/"+name+".png"));
		}
		catch (IOException e)
		{
	       Reporter.log("IO exception occures");
		}
		catch(Exception e)
		{
			Reporter.log(" some other error"+e.getMessage());
		}
	}
	public static void getReport(ExtentTest log, String name)
	{
		ExtentReports extent=new ExtentReports();
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(new File("./reports/Rep.html").getAbsolutePath());
		extent.attachReporter(reporter);
	}
	public static void pressEnter()
	{
		try {
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.delay(200);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void pressF12()
	{
		try
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_F12);
			robot.keyRelease(KeyEvent.VK_F12);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}


public static void selectByValue(WebElement element,String value)
{
	Select sel = new Select(element);
	sel.selectByValue(value);
}
public static void selectByText(WebElement element,String text)
{
	try
			{
		    Thread.sleep(2000);
		    logs.info(" Select By Text  "+text);
			Select sel=new Select (element);
			sel.selectByVisibleText(text);
			}
			catch(Exception e)
			{
				logs.info( "Selection TimeOUt " +e.getMessage());
			}
	
}

public static void scrollToTop(WebDriver driver)
{
	((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
}

public static void deselectAllSelect(WebElement element)
{
	Select sel=new Select(element);
	sel.deselectAll();
}
public static void selectByIndex(WebElement element,int index)
{
	Select sel=new Select (element);
	sel.selectByIndex(index);
}
public static List<String> getAllSelectOptions(WebElement element)
{
	List<String> alltext = new ArrayList<String>();
	Select sel = new Select(element);
	List<WebElement> allOptions = sel.getOptions();
	for (WebElement options:allOptions)
	{
		String text = options.getText();
		alltext.add(text);
	}
	return alltext;
}



}
