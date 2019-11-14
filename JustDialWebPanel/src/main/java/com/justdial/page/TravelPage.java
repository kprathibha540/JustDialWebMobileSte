package com.justdial.page;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lifeco.generic.CommonBasePage;

import utilities.LoggerHelper;

public class TravelPage {


	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(HomePage.class); // check Imports properly
	public TravelPage(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
		  cbp=new CommonBasePage(driver);
	}
  
	 @FindBy(xpath="//ul[@class='catOption divUp']/li/span[@class='catnameicnwp']/span[@class='catName font14']")
	  private List<WebElement> linkResult;
	 
	 
	 public void getAllTabs()
	 {
		 for(int i=0;i<linkResult.size();i++)
		 {
			 logs.info(linkResult.get(i).getText());
		 }
		 
	 }
}
