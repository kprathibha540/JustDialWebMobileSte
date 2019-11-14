package com.justdial.page;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lifeco.generic.CommonBasePage;

import junit.framework.Assert;
import utilities.LoggerHelper;

public class CityChangePage {

	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(CityChangePage.class); // check Imports properly
	 
	public CityChangePage(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
		  cbp=new CommonBasePage(driver);
	}
	
	  // This xpath to click on dropdown which is change location or city
	  @FindBy(xpath="//div[@id='middle_btn']/span[@class='hdrdropdown transform11']")
	  private WebElement cityDropdown;
	  
	  
	  // This xpath is to enter city name in search field 
	  @FindBy(id="srchInpId")
	  private WebElement cityName;
	  
	  //This xpath is to check to how many autoSuggestion we got after entering the city name
	  
	  @FindBy(xpath="//div[@class='rcntsrd']/ul[@class='lctname']/div/li/span[@class='lctnarea font15']/b[1]")
	  private List<WebElement> cityNames;
	  
	  
	  // This xpath is click on Detect my location
	  @FindBy(xpath="//span[text()='Detect my location']")
	  private WebElement detectMyLoc;
	  
	  
	  // This xpath is to find the location which is dectected or location entered 
	  @FindBy(xpath="//ul[@class='lctname']/div/li/span[@class='lctnarea font15']")
	  private WebElement detectedLoc;
	  
	  public void clickDetectMyLoc()
	  {
		  cbp.click(detectMyLoc);
	  }
	  
	  public void verifyDetectedLocation(String msg)
	  {
		  if(cbp.getText(detectedLoc).equals(msg))
		  {
			  logs.info(" Detected City/Loc ="+detectedLoc.getText()+"  Matched with Given City  ="+msg);
		  }
		  else
		  {
			  logs.info(" Detected City/Loc  Not Matched with Given City/Loc  ");
			  Assert.fail(" Detected City/Loc Not Matched with Given City/Loc ");
		  }
	  }
	  
	  public void enterCityName(String name)
	  {
		cbp.sendKeys(cityName, name);  
	  }
	  
	  public void clickDropdownCity()
	  {
		  cbp.click(cityDropdown);
	  }
	  
	  public void veriyDefaultAutoSuggestionList()
	  {
		  if(cityNames.size()==15)
		  {
			 logs.info(" Valid Count of Suggestion displayed "+cityNames.size());
		  }
		  else
			  logs.info(" Invalid count of suggestions Displayed "+cityNames.size());
	  }
	
}
