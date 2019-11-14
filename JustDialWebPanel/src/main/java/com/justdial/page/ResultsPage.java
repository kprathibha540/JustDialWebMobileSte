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

public class ResultsPage {

	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(ResultsPage.class); // check Imports properly
  
	public ResultsPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
	  cbp=new CommonBasePage(driver);
	}
	
	@FindBy(xpath="//span[@class='prdname font16']")
	private List<WebElement> prodNameVer;
	
	@FindBy(xpath="//span[@class='movienamewrap font18']")
	 private List<WebElement> movieNames;
	
	@FindBy(xpath="//span[@class='wrpr100 prdnm fonts15']")
	private WebElement prodName;
	
	
	@FindBy(xpath="//span[@class='font16 titleblock']")
	private WebElement titleBlockProdBrand;
	
	
	@FindBy(xpath="//span[@class='rslthdnw fonts15']")
	private List<WebElement> categoryResult;
	
	@FindBy(xpath="//span[@class='prdname font14']")
	private List<WebElement> hotelOptions;
	
	@FindBy(xpath="//span[@class='adrswp']/span")
	private WebElement movieTitle;
	
	@FindBy(xpath="//span[@class='wrpr100 prdnm fonts15']")
	private List<WebElement> prodNames;
	
	@FindBy(xpath="//span[@class='prdname font16']/b")
	private WebElement contractNameEle;
	
	@FindBy(xpath="//span[@class='prdlctn font12']")
	private WebElement contractPlaceEle;
	
	@FindBy(xpath="//span[@class='dptlhdtxt font20']/span")
	private WebElement verifyBrandResultPage;
	
	@FindBy(xpath="//span[text()='More']")
	private WebElement moreBtn;
	
	@FindBy(xpath="//span[text()='Shopping']")
	private WebElement shoppingBtn;
	
	@FindBy(id="hdrinputotr")
	private WebElement shopFrontProductSearch;
	
	@FindBy(xpath="//span[@class='font13 cardtitle']")
	private WebElement anyResContractsClick;
	
	@FindBy(xpath="//span[text()='share']")
	private WebElement share;
	
	@FindBy(xpath="//span[@class='sharepopupcell font15']")
	private List<WebElement> shareLinks;
	
	@FindBy(xpath="//span[@class='sharepopupcell font15' and text()='More options']")
	private WebElement moreOptions;
	
	
	@FindBy(xpath="//div[@class='iconbox hdrMnushare']")
	private WebElement clickShareTopKey;
	
	
	public void shopfrontProductNameVerification(String productName)
	{
		cbp.verifySearchResult(prodNameVer, productName);
	}
	public void clickShare()
	{
		cbp.click(share);
	}
	
	
	public void clickShareTopKey()
	{
		cbp.click(clickShareTopKey);
	}
	public void verifyCategoryResult()
	{
		if(categoryResult.isEmpty())
		{
			Assert.fail();
		}
		else
		{
			for(int i=0;i<categoryResult.size();i++)
			{
				logs.info(categoryResult.get(i).getText());
			}
		}
		
	}
	public void verifyMovieName(String expected)
	{
		cbp.verifySearchResult(movieNames, expected);
	}
	  
	
	public void verifyProdName(String expected)
	{
		cbp.verifySearchResult(prodName, expected);
	}
	
	public void verifyProdBrand(String expected)
	{
		cbp.verifySearchResult(titleBlockProdBrand, expected);
	}
	
	public void enterToClickSpecificTypeHotel(String ho)
	{
		for(int i=0;i<hotelOptions.size();i++)
		{
			if(hotelOptions.get(i).getText().equals(ho))
			{
				cbp.click(hotelOptions.get(i));
			}
		}
	}
	
	public void verifyMovieTitle(String movName)
	{
		cbp.verifySearchResult(movieTitle, movName);
	}
	
	public void verifyProdResult(String prodName)
	{
		if(prodNames.isEmpty())
		{
			Assert.fail();
		}
		else
		{
			for(int i=0;i<prodNames.size();i++)
			{
				logs.info(" Category Result "+prodNames.get(i).getText());
			}
		}
	}
	
	public void verifyFreeTestBrand()
	{
		verifyCategoryResult();
	}
	
	public void verifySingleBoxAutoSuggest(String contractName, String place)
	{
		cbp.verifySearchResult(contractNameEle, contractName);
		cbp.verifySearchResult(contractPlaceEle, place);
	}
	
	public void verirfyBrandResultsPage(String brandN)
	{
		
		cbp.verifySearchResult(verifyBrandResultPage, brandN);
	}
	
	public void clickMoreBtn()
	{
		cbp.click(moreBtn);	
	}
	
	public void clickShoppingBtn()
	{
		cbp.click(shoppingBtn);
	}
	
	public void clickShopFrontProductSearch()
	{
		cbp.click(shopFrontProductSearch);
	}
	
	public void clickAnyResturantContract()
	{
		cbp.click(anyResContractsClick);
	}
	
	public void printLogShareLinks()
	{
		for(int i=0;i<shareLinks.size();i++)
		{
			if(shareLinks.isEmpty())
			{
				logs.info(" Nothing in the List ");
				Assert.fail();
			}
			else
			{
				logs.info(" Share Links are "+shareLinks.get(i).getText());
			}
			
		}
	}
	
	public void clickMoreOptions()
	{
		cbp.click(moreOptions);
	}
}
