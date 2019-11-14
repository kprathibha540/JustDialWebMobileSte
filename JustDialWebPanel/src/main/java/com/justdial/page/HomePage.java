package com.justdial.page;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.lifeco.generic.CommonBasePage;

import junit.framework.Assert;
import utilities.LoggerHelper;



public class HomePage {
	
	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(HomePage.class); // check Imports properly
  
	public HomePage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
	  cbp=new CommonBasePage(driver);
	}
  
  @FindBy(xpath="//div[@id='homePage']/div/ul/li/a")
  private List<WebElement> allLinks;
  
  @FindBy(xpath="//span[text()='Restaurants']/parent::a")
  private WebElement restaurantsLink;
  
  @FindBy(xpath="//span[text()='Travel']/parent::a")
  private WebElement travelLink;
  
  @FindBy(xpath="//div[@id='root']//input")
  private WebElement searchHome;
  
  @FindBy(xpath="//div[@class='mainwpr']/descendant::span[@class='adrswp']/span[@class='prdname font16']")
  private List<WebElement> searchLists;
  
  @FindBy(xpath="//div[@id='root']/div/div/div/header/div[@class='hdrSearchMain hdrSearchMainclr']/div/input")
  private WebElement searchClick;
  
  @FindBy(xpath="//div[@class='mainwpr']//li/span/span[@class='prdname font16']")
  private List<WebElement> searchResult; //ddd
  
  @FindBy(xpath="//div[@class='mainwpr']//li/span/span[@class='prdname font16'][1]")
  private List<WebElement> companySearchResult;
  
  @FindBy(id="srchInpId")
  private WebElement enterSearch;
  
  @FindBy(xpath="//span[@class='prdname font16']")
  private WebElement moviesResult;
  
  @FindBy(xpath="//span[text()='More']")
  private WebElement moreBtn;
  
  @FindBy(xpath="//span[text()='Movies']")
  private WebElement movies;
  
  @FindBy(xpath="//span[@class='movieinfoblock font12']")
  private WebElement anyMovie;
  
  @FindBy(xpath="//div[@class='iconbox hdrMnuIcn']")
  private WebElement menuBtn;
  
  @FindBy(xpath="//span[text()='Add a Business']")
  private WebElement addABusiness;
  
  
  public void clickAddABusiness()
  {
	  cbp.click(addABusiness);
  }
  public void clickMenuBtn()
  {
	  cbp.click(menuBtn);
  }
  
  public void clickMoviesLink()
  {
	  cbp.click(movies);
  }
  public void verifyAllLinksinJustDailHomePage(ExtentTest logger)
  {
	  logs.info(allLinks);
	  cbp.verifyUrlLinks(allLinks, logger);
	 
  }
  public void verifyResultCount()
  {
	  if(!(searchLists.size()==7))
	  {
		  logs.info(" Less than 7 suggestion is displayed "+searchLists.size());
		  Assert.fail();
	  }	 
	  else
		  logs.info(" Assertion Pass "+searchLists.size());
		  
  }
  public void enterSearchContent(String content)
  {
	  cbp.click(searchClick);
	  cbp.sendKeys(searchHome, content);
  }
  

  public void enterSearchElementSearchPage(String content)
  {
	  cbp.sendKeys(enterSearch, content);
  }
  
  public void clickSearch()
  {
	cbp.click(searchClick);
	
  }
  
  public void clickRestaurantsLink()
  {
	  cbp.click(restaurantsLink);
  }
  
  public void clickTravelLink()
  {
	  cbp.click(travelLink);
  }
  
  public void verifySingleCharcterAutoSuggest(String expected)
  {
	  cbp.verifySearchResult(searchResult, expected);
  }
  
  public void verifyCompanySearchResult(String expected)
  {
	  cbp.verifySearchResult(companySearchResult, expected);
  }
  
  public void clickFirstCategorySuggestion()
  {
	  cbp.click(moviesResult);
  }
  
  public void clickMoreBtn()
	{
		cbp.click(moreBtn);	
	}
  
  public void clickAnyMovie()
  {
	  cbp.click(anyMovie);
  }
  
}
