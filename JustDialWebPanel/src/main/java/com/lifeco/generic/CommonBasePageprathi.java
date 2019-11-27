package com.lifeco.generic;




	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.Reporter;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	public class CommonBasePageprathi { 
	
	private static Select sel;
	public WebDriver driver;
	public WebDriverWait wait;
	public Logger logs;
	private Actions actions;

	public CommonBasePageprathi(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
		logs = Logger.getLogger(this.getClass().getName());
	}
	public void CommonBasePage(WebDriver driver)
	{
		this.driver=driver;
		logs = Logger.getLogger(this.getClass().getName());
	}
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			logs.info("title is matching:"+eTitle);
		}
		catch(Exception e)
		{
			logs.info("title is not matching and the Expected title is:"+eTitle);
			logs.info("Actual title is "+driver.getTitle());
			Assert.fail();
		}
	}
	public void splitFindElementsSelect(String elements,List<WebElement> listElements)
	{
		String[] element=elements.split("\\|");
//		logs.info("***********************"+element[0]);
//		logs.info("**********************"+element[1]);
		
		for(int i=0;i<element.length;i++)
		{
			logs.info("*****************************" +element[i]);
			selectByText(listElements.get(i), element[i]);
		}
	}

	public void splitFindElementsSendKeys(String elements,List<WebElement> listElements)
	{
		String[] element=elements.split("\\|");
//		logs.info("***********************"+element[0]);
//		logs.info("**********************"+element[1]);
		
			for(int i=0;i<element.length;i++)
			{
				logs.info("*****************************" +element[i]);
				sendKeys(listElements.get(i), element[i]);
			}
		
	}

	public static void selectByText(WebElement element,String text)
	{
		try
				{
			    Thread.sleep(2000);
				Select sel=new Select (element);
				sel.selectByVisibleText(text);
				}
				catch(Exception e)
				{
					Reporter.log( "Selection TimeOUt " +e.getMessage());
				}
		
	}
	public static void selectByFirstText(WebElement element,String text)
	{
		try
		{
			Thread.sleep(2000);
			 Select sel=new Select(element);
			 sel.getFirstSelectedOption();
			 
		}
		catch(Exception e)
		{
			Reporter.log( "Selection TimeOUt " +e.getMessage());
		}
	}

	public void actionClick(WebElement element,WebDriver driver )
	{
		scrollUpToTheElement(driver, element);
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}


	private WebDriverWait getWait(int timeOutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
	    wait.ignoring(Throwable.class);
	    return wait;
	}

	public String getText(WebElement element)
	{
		waitForElementVisible(element, 10);
		return element.getText();
	}

	public String getAttributeValue(WebElement element , String attributeValue)
	{
		waitForElementVisible(element, 10);
		return element.getAttribute(attributeValue);
	}
	public void scrollDown(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	}

	public void scrollDownFull(WebDriver driver)

	{
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1500)");
	}
	public void getElementHighlight(final WebElement element) {
	    try {
	        Wait<WebDriver> wait = new WebDriverWait(driver,20);
	        wait.until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver webDriver) {
	                return element != null;
	            }
	        });
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].style.border='2px solid red'", element);
	    } catch (Exception e) {
	        logs.info("Fail to highlight the element:" + element);
	    }
	}


	private void moveToElement(WebElement element) {
	    try {
	        getElementHighlight(element);
	        actions.moveToElement(element).build().perform();
	        timeInterval(3);
	    } catch (Exception e) {
	        logs.info("Fail to move to element: " + element);
	    }
	}

	public void verifySearchResult( List<WebElement> searchResult,String expected)
	{
		  for(int i=0;i<searchResult.size();i++)
		  {
			  String actual=getText(searchResult.get(i));
			  if(actual.contains(expected))
			  {
				  logs.info(" Verification done actual vs expected "+actual);
			  }
			  else
			  {
				  logs.info("  Verification not done  Actual data  is =" +actual );
				  Assert.fail();
			  }
		  }
	}


	public void scrollUpToTheElement(WebDriver driver , WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);
		timeInterval(1);
	}

	// To Check Visibility
	public void waitForElementVisible(WebElement element, int timeInSec) {
		logs.info(" Element ************************* ="+element);
		logs.info("Waiting for " + element.toString() + " for " + timeInSec + " seconds.");
	    wait = getWait(timeInSec);
	    wait.until(ExpectedConditions.visibilityOf(element));
	    logs.info("Element is visible.");
	}

	public void waitForElementClickable(WebElement element, int timeInSec) {
		logs.info("Waiting for " + element.toString() + " for " + timeInSec + " seconds.");
	    wait = getWait(timeInSec);
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	    logs.info("Element is clickable.");
	}


	public void setAttribute(WebElement element, String attName, String attValue,WebDriver driver) {
	    ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
	            element, attName, attValue);
	}
	public void selectDateByJs(WebElement element, WebDriver driver, String date)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

	public void sendKeysByJs(WebElement element, WebDriver driver, CharSequence text)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+text+"'",element);
	}

	public void timeInterval(int sec) {
	    try {
	        Thread.sleep(1000 * sec);
	    } catch (Exception e) {
	        		e.printStackTrace();
	    }
	}


	public void multipleTextEnter(WebElement element, String string)
	{
		String[] array=string.split("\\|");
		for(int i=0;i<array.length;i++)
		{
			sendKeys(element, array[i]);
			timeInterval(3);
			sendKeys(element,Keys.ENTER);
		}
		
	}


	public void waitForAjaxControls(int timeoutInSeconds) {
	    logs.info("Querying active AJAX controls by calling jquery.active");
	    try {
	        if (driver instanceof JavascriptExecutor) {
	            JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	            for (int i = 0; i < timeoutInSeconds; i++) {
	                Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
	                // return should be a number
	                if (numberOfAjaxConnections instanceof Long) {
	                    Long n = (Long) numberOfAjaxConnections;
	                    logs.info("*********** Number of active jquery AJAX controls: ******** = "+ n);
	                    if (n == 0L)
	                     break;
	                }
	                timeInterval(1);
	            }
	        } else {
	            logs.info(" Web driver: " + driver + " can't run javascript.");
	        }
	    } catch (Exception e) {
	        logs.error("!!!!!!! Exception Occurred Inside 'Wait for Ajax Controls Method'  "+e.toString());
	        e.printStackTrace();
	        return;
	    }
	}
	public String verifyUrlLinks(List<WebElement> links, ExtentTest logger)
	{
		logs.info(" Inside Verify URL links method"+links);
		String url = "";
	    HttpURLConnection huc = null;
	    int respCode = 200;
		Iterator<WebElement> it = links.iterator();
	    
	    while(it.hasNext()){
	        
	    	logs.info(" Inside While");
	        url = it.next().getAttribute("href");
	        logs.info(url);
	        
	        if(url == null || url.isEmpty()){
	        
	        	logger.log(Status.WARNING," URL is not configured for Anchor Tag  OR It is EMPTY  ");
	        	                continue;
	        	            }
	        	            
//	        	            if(!url.startsWith(homePage)){
//	        	                logs.info("URL belongs to another domain, skipping it.");
//	        	                continue;
//	        	            }
	        	            
	        	            try {
	        	                huc = (HttpURLConnection)(new URL(url).openConnection());
	        	                
	        	                huc.setRequestMethod("HEAD");
	        	                
	        	                huc.connect();
	        	                
	        	                respCode = huc.getResponseCode();
	        	                
	        	                if(respCode >= 400){
	        	                	logger.log(Status.FAIL, url+" is a broken link " +respCode );
	        	                }
	        	                else{
	        	                	logger.log(Status.PASS, url+" is a valid link "+respCode);
	        	                }
	        	                    
	        	            } catch (MalformedURLException e) {
	        	                // TODO Auto-generated catch block
	        	                e.printStackTrace();
	        	                return " Something went Wrog ";
	        	            } catch (IOException e) {
	        	                // TODO Auto-generated catch block
	        	                e.printStackTrace();
	        	                return " Something went Wrog ";
	        	            }
	        	        }
		return "";
	    
	}


	public void waitForLoad(WebDriver driver)
	{
		ExpectedCondition<Boolean> pageLoadCondition=new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				//return 	((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
				int val=(Integer) ((JavascriptExecutor)driver).executeScript("return jQuery.active");
				return val==0;
				
			}};
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(pageLoadCondition);
	}

	public void setImplicitWait(long timeout, TimeUnit unit) {
	    Reporter.log("Set implicit wait to:" + timeout);
	    driver.manage().timeouts().implicitlyWait(timeout, unit);
	}
	public void pageLoadTime(long timeout, TimeUnit unit) {
	    Reporter.log("Wait for page to load for: " + timeout + " seconds.");
	    driver.manage().timeouts().pageLoadTimeout(timeout, unit);
	    Reporter.log("Page is loaded.");
	}

	public void jsClick(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}
	public String getTextElement(WebElement toPerform)
	{
		Boolean cond=true;
		int count=0;
		while(cond)
		{
			
			try
				{
				     logs.info(" Inside get text try "+toPerform.getText());
					 return toPerform.getText();
				}
				catch(Exception e)
				{
					logs.info(" Inside catch get text try"+e.getMessage());
					timeInterval(1);
					if(count>10)
					{
						logs.info(" There is problem in get test with element "+e.getMessage());
						Assert.fail();
					}
					else
					count++;
				}
		}
		return "";
	}

	public void click(WebElement toClick)
	{
		try {
				waitForElementVisible(toClick, 30);
				waitForElementClickable(toClick, 10);
				moveToElement(toClick);
				toClick.click();
			}
		catch(Exception e)
		{
			e.printStackTrace();
			logs.info(" ########## Click Exception #################");
			Assert.fail();
			
		}
		
	}
	public void sendKeys(WebElement toSend,CharSequence msg) 
	{
		try {		
				toSend.clear();	
				toSend.sendKeys(msg);
			}
			catch(Exception e)
			{
				timeInterval(2);
				sendKeysByJs(toSend, driver, msg);
			}
	}

		public void autosug(WebDriver driver)
		{
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		}
		
		
	}




