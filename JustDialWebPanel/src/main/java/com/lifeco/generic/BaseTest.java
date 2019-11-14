package com.lifeco.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.justdial.browserconfig.ChromeBrowser;
import com.justdial.browserconfig.FirefoxBrowser;
import com.justdial.browserconfig.HeadlessBrowser;
import com.justdial.browserconfig.JustDailMail;

import extentReports.ExtentManager;
import utilities.GenericUtils;
import utilities.LoggerHelper;
import utilities.ResourceHelper;


@Listeners({RetryListnerClass.class})
public  class BaseTest
	{
		public WebDriver driver;
		public Properties browser;
		public ExtentReports extent;
		public ExtentHtmlReporter reporter;
		public ExtentEmailReporter email;
		public ExtentTest logger;
		public FileInputStream excelDataPath;
		public WebDriverWait wait;
		DataProviderInput dp;
		Calendar cal;
		SimpleDateFormat dateFormat;
		public Logger logs = LoggerHelper.getLogger(BaseTest.class); // check Imports properly
		
		 public BaseTest() {
		        PropertyConfigurator.configure("log4j.properties");
		 }
		@BeforeTest(alwaysRun = true)
		public void intialize() throws FileNotFoundException, IOException
		{
			try {
					//Initialize Browser Properties
					browser=ResourceHelper.intializeBrowserProperties();
					
					// Initialize Extent Reports
					extent = ExtentManager.getInstance();
					
					//JustDailMail.sendMailStart();     //*********************************************
					
					logs.info(" Intialization Success ");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					logs.error(" Exception occured while intializing "+e.getMessage());
				}
	
		}
		@BeforeMethod(alwaysRun = true)
		@Parameters("DeviceName")
		public void openApplication(String deviceName) throws Exception
		{ 
			
			logs.info(" Browser Name ="+browser.getProperty("brw")+"  URL ="+browser.getProperty("url"));
			launchBrowser(browser.getProperty("brw"), browser.getProperty("url"), deviceName);
			
			 
		}
		
		
		@AfterMethod(alwaysRun = true)
		public void zpostcondition(ITestResult res)
		{
			logs.info(" Inside Post Condition ");
			try {
					int status = res.getStatus();
					if(status==ITestResult.FAILURE)
					{
						String name =res.getName();
						logs.info("failed method "+name);
						String screenshotPath = GenericUtils.getScreenshot(driver, name);
						logger.log(Status.FAIL, MarkupHelper.createLabel(name, ExtentColor.RED).getMarkup(),MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
						logger.fail(res.getThrowable());
						//JustDailMail.sendFailureMail(name);  //*********************************************
						//GenericUtils.getScreenShot(driver,name + " FAIL");
					}
					else if(res.getStatus()==ITestResult.SUCCESS)
					{
						String name =res.getName();
						String screenshotPath = GenericUtils.getScreenshot(driver, name);
						logger.log(Status.PASS,  MarkupHelper.createLabel(res.getName(), ExtentColor.GREEN).getMarkup(), MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
						//GenericUtils.getScreenShot(driver,name+" SUCCESS");
					}
					else if(status==ITestResult.SKIP)
					{
						logger.log(Status.SKIP, MarkupHelper.createLabel(res.getName(), ExtentColor.YELLOW));
						logger.skip(res.getThrowable());
					}
					
			}
			catch(Exception e)
			{
				logs.info("  Exception occured  @AfterMethod Execution "+e.getMessage());
				
			}
			extent.flush();
			driver.manage().deleteAllCookies();
			driver.close();
			logs.info(" \n After Close ");
		}
		public WebDriver getBrowserObj(String browser, String deviceName) throws Exception {
	        try {
	        	logs.info(" Inside getBrowserObj method   browser="+browser);
	            switch (browser) {
	                case "Chrome":
	                	logs.info(" Inside Chrome switch ");
	                    ChromeBrowser chrome = ChromeBrowser.class.newInstance();
	                    ChromeOptions options = chrome.getChromeOptions(deviceName);
	                    return chrome.getChromeDriver(options);

	                case "Firefox":
	                	logs.info(" Inside Mozilla Switch");
	                    FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
	                    //logs.info(" Return Value = "+firefoxBrowser.getFirefoxDriver(firefoxBrowser.getFirefoxOptions()));
	                    return firefoxBrowser.getFirefoxDriver(firefoxBrowser.getFirefoxOptions());
	                    
	                case "HeadLessChrome":
	                	logs.info("  Inside HTML unit Browser");
	                	HeadlessBrowser headLessBrowser=new HeadlessBrowser();
	                	return headLessBrowser.getHeadLessChromeDriver(headLessBrowser.getChromeOptions());
	                	
	                default:
	                    throw new Exception("Driver not found:" + browser);
	            }
	        } catch (Exception e) {
	            logs.info(e.getMessage());
	            throw e;
	        }
	    }

	    public void launchBrowser(String browserName, String url, String deviceName) throws Exception {
	    	logs.info(" Inside launch browser method ");
	        driver = getBrowserObj(browserName, deviceName);
	        logs.info(" Driver object value "+driver);
	        logs.info("Initialize Webdriver...");
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS );
	        driver.manage().window().maximize();
	        logs.info(" Before Open URL ="+url);
	        driver.get(url);	
	    }
		
		
}
