package com.prathibha.justdialpage;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lifeco.generic.CommonBasePage;

import utilities.LoggerHelper;


public class RestaurantsPage {

	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(RestaurantsPage.class); // check Imports properly
	public RestaurantsPage(WebDriver driver) 
	{
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
		  cbp=new CommonBasePage(driver);
	}
		// To get the restaurant text 
	 	@FindBy(id="hdrinputotr")
	 	private WebElement resturantText;
	 	
	 	// To get the value present in Restaurant Text 
	 	public String getResturantText()
	 	{
	 		return cbp.getAttributeValue(resturantText, "value");
	 	}
	
}
