package com.prathibha.justdialpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lifeco.generic.CommonBasePage;

public class MainCitypage {
	WebDriver driver;
	CommonBasePage cbp;
	
	Logger logs = Logger.getLogger(this.getClass().getName());
	public MainCitypage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		cbp=new CommonBasePage(driver);
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement srch;
	@FindBy(xpath="//span[@class='hdrsearchIcon']") 
	private WebElement srchbtn;
	
	@FindBy(xpath="//input[@id='srchInpId']")
	private WebElement srcloc;
	
	//@FindBy(xpath="//div[@class='search-city mnsrchwpr']")
	@FindBy(xpath="//div[@id='middle_btn']")
	private WebElement locdd;
	
	@FindBy(xpath="//span[@class='hdradrs font16']")
   private WebElement loc;
	
	public void sendtext(String text)
	{
		
		cbp.sendKeys(srch, text);
	}
	
   
    public void clicksearch() {
    	cbp.click(srchbtn);
    }
    public void sendloc(String text)
    {
    	cbp.sendKeys(srcloc, text);
    }
    public void cliklocdropdown()
    {
    	cbp.click(locdd);
    }
    public void checkloc()
    {
    	String text = loc.getText();
    	if(text != null)
    	{
    		 text.compareToIgnoreCase("Lucknow");
    		 logs.info("expected text is present");
    	}
    	else
    		logs.info("expected text is not present ");
    }
    
    public void checkspecilcharloc()
    {

    	String text = loc.getText();
    	if(text != null)
    	{
    		 text.compareToIgnoreCase("Navi Mumbai,Mumbai");
    		 logs.info("expected text is present");
    	}
    	else
    		logs.info("expected text is not present");
    }
}
