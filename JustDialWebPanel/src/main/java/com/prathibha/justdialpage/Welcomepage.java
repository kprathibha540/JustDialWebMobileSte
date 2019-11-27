package com.prathibha.justdialpage;

import java.util.List;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.lifeco.generic.CommonBasePage;
import com.lifeco.generic.CommonBasePageprathi;

public class Welcomepage  {
	WebDriver driver;
	CommonBasePageprathi cbp;
	
	Logger logs = Logger.getLogger(this.getClass().getName());
	public Welcomepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		cbp=new CommonBasePageprathi(this.driver);
		
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement srch;
	
	@FindBy(xpath="//div[@class='mainwpr']/descendant::span[@class='adrswp']/span[@class='prdname font16']")
	  private List<WebElement> searchLists;
	
	@FindBy(xpath="//span[@class='prdname font16']")
	private List<WebElement> auto;
	
	
	@FindBy(xpath="//*[@id=\"homePage\"]/div[1]/ul/li[1]/a/span[2]")
	private WebElement resicon;
	
	@FindBy(xpath="(//i[@class='hpicdblock restoicons'])[1]")
	private WebElement trending;
	
	
	@FindBy(xpath="//div[@class='viewwrapper']")
	private List<WebElement>  resstatus;
	
	@FindBy(xpath="//div[@class='iconbox hdrMnuback']")
	private WebElement backword;
	
	@FindBy(xpath="//span[@class='newjdlogo']")
	private WebElement logo;
	
	@FindBy(xpath="//div[@class='iconbox hdrMnuIcn']")
	private WebElement menu;
	
	@FindBy(xpath="//span[@class='prfltd']")
	private WebElement user;
	@FindBy(xpath="//span[@class='closesidemenu']")
	private  WebElement closebtn;
	
	@FindBy(xpath="//div[@class='iconbox hdrNtfyIcn']")
	private WebElement blicon;
	
	@FindBy (xpath="//span[@class='hdrsearchIcon']")
	private WebElement srchbtn;
	
	public void send(String text)
	{
		cbp.sendKeys(srch, text);
		
	}
	
    public String  getAutosug()
    {
       List<WebElement> list = resstatus;
		   
		   logs.info("Auto Suggest List ::" + list.size());
	    if(!resstatus.isEmpty())
	     {
		for(int i=0;i<list.size();i++)
		{
			logs.info(list.get(i).getText());
			logs.info("no of results"+list.size());
			break;
			
	    }
	  }
		return null;
		
    }

    
    
   
    public void getfirstAutosug()
    {
    	List<WebElement> list = resstatus;
		   
		   logs.info("Auto Suggest List ::" + list.size());
	
		for(int i=0;i<list.size();i++)
		{
			list.get(1).click();
			logs.info(list.get(1).getText());
			logs.info("no of results"+list.size());
			break;
			
	   }
    }
   
    public void verifyResultCount()
    {
    	  if(!(searchLists.size()==7))
  	  {
  		  logs.info(" Less than 7 suggestion is displayed "+searchLists.size());
  		  Assert.fail();
  	  }	 
  	  else
  		  logs.info("Assertion Pass "+searchLists.size());
    	  
    }
   
    public void getresultCount()
    {
		/*
		 * List<WebElement> list = resstatus; int size=0;
		 * 
		 * while(list.listIterator(size) != null) { size++;
		 * System.out.println("get all the count"+size); }
		 */
    	
    	
    	 int rowCount = 0;
        
		while ( resstatus.iterator() != null) {
              rowCount++;
         }
         logs.info("Total number of rows in ResultSet object = "+rowCount);
    	
     }
    public void searchclick()
    {
    	cbp.click(srch);
    }
    public void clickresticon()
    {
    	cbp.click(resicon);
    }
    
    public void clicktrend()
    {
    	cbp.click(trending);
    }
    public void resultStatus()
    {
    	cbp.autosug(driver);
    }
    
    public void redirectpage()
    {
    	if(backword.isEnabled())
    	{
    		cbp.click(backword);
    	}
    	else
    	{
    		System.out.println("backword arrow is not enabled");
    	}
    }
   
    public void jdlogo()
    {
    	if(logo.isDisplayed())
    	{
    		 Assert.assertTrue(true,"logo is presnt");
    		 logs.info("logo is present");
    		 
    	}
    }
    public void contextMenu() {
    	cbp.click(menu);
    }
    
    
    public void clickuser()
    {
    	cbp.click(user);
    }
    
    public void closeButton()
    {
    	cbp.click(closebtn);
    }
    
    public void clickbelicon()
    {
    	cbp.click(blicon);
    }
    
    public void clicksrchbtn()
    {
    //cbp.waitForElementClickable(srchbtn, 10);
    	cbp.click(srchbtn);
		logs.info("search button is clicking");
    }
}
