package com.prathibha.justdialtest;

import org.testng.annotations.Test;

import com.justdial.page.CityChangePage;
import com.justdial.page.HomePage;
import com.justdial.page.RestaurantsPage;
import com.justdial.page.TravelPage;
import com.lifeco.generic.BaseTest;
import com.lifeco.generic.DataProviderInput;

import junit.framework.Assert;
import utilities.CommonUtilities;

public class HomePageTest extends CommonUtilities{

	// Verify Links of Homo
	@Test(priority = 1, enabled = false)
	public void verifyLinks()
	{
		logger=extent.createTest(" This Test is to verify all links present in Just Dail ");

		HomePage hp=new HomePage(driver);
		hp.verifyAllLinksinJustDailHomePage(logger);
		
		logger.pass("    Verification Done ");
	
	}
	
	@Test(priority=2, dataProvider = "DefaultAutoSuggest", dataProviderClass = DataProviderInput.class, enabled = false)
	public void defaultAutoSuggest(String data) throws InterruptedException
	{
		logger=extent.createTest(" This Test is to verify default suggestion is 7  ");
		
		HomePage hp=new HomePage(driver);
		hp.enterSearchContent(data);
		Thread.sleep(10000);
		hp.verifyResultCount();
	}
	
	@Test(priority=3, dataProvider = "RestaurantsLink", dataProviderClass = DataProviderInput.class, enabled = false)
	public void verifyRestaurants(String data)
	{
		logger=extent.createTest(" This Test is to verify  Restaurants link ");
		HomePage hp=new HomePage(driver);
		RestaurantsPage rp=new RestaurantsPage(driver);
		hp.clickRestaurantsLink();
		String rtext=rp.getResturantText();
		Assert.assertEquals(data,rtext); // It is to verify the text 
	}
	
	
	@Test(priority=4, dataProvider = "DefaultCitySuggest", dataProviderClass = DataProviderInput.class, enabled =false)
	public void defaultCitySuggest(String cityName)
	{
		logger=extent.createTest(" This test is to verify default auto suggestion for City Search ");
		HomePage hp=new HomePage(driver);
		CityChangePage cp=new CityChangePage(driver);
		hp.clickSearch();
		cp.clickDropdownCity();
		cp.enterCityName(cityName);
		cp.veriyDefaultAutoSuggestionList();
		
	}
	
	@Test(priority=5, dataProvider = "NotAvailableData", dataProviderClass = DataProviderInput.class, enabled =false)
	public void notAvailableData(String data)
	{
		logger=extent.createTest(" This test is to verify the  No Data  ---  Check list 10 ");
		HomePage hp=new HomePage(driver);
		hp.clickSearch();
		hp.enterSearchElementSearchPage(data);
	}
	
	@Test(priority = 6, dataProvider = "FreeTextData", dataProviderClass = DataProviderInput.class, enabled =false) 
	public void disableFreeTextSelection(String cityName)
	{
		logger=extent.createTest(" This test is to verify the disable free text selection  ");
		HomePage hp=new HomePage(driver);
		CityChangePage cp=new CityChangePage(driver);
		hp.clickSearch();
		cp.clickDropdownCity();
		cp.enterCityName(cityName);
		
	}
	
    @Test(priority = 7, enabled =false)
    public void verifyTravelClick()
	{
    	
		logger=extent.createTest(" This test is to verify the Travel link and 12 Tabs ");
		HomePage hp=new HomePage(driver);
		TravelPage tp=new TravelPage(driver);
		hp.clickTravelLink();
		tp.getAllTabs();
	}
    
    @Test(priority = 8 , enabled =false)
    public void verifyAnywhereInCity()
    {
    	logger=extent.createTest(" This test is to verify the click on Anywhere in city should fetch City Name ");
    	HomePage hp=new HomePage(driver);
    	CityChangePage cp=new CityChangePage(driver);
    	hp.clickSearch();
    	cp.clickDropdownCity();
    }
    
    
    @Test(priority=9, dataProvider = "HomePageData",dataProviderClass = DataProviderInput.class, enabled=false)
    public void verifyDetectMyLocation(String loc) throws InterruptedException
    {
    	logger=extent.createTest(" This test is to verify Detect My Location is proper or not ");
    	HomePage hp=new HomePage(driver);
    	CityChangePage cp=new CityChangePage(driver);
    	hp.clickSearch();
    	cp.clickDropdownCity();
  
    	cp.clickDetectMyLoc();

    	cp.verifyDetectedLocation(loc);
    	
    }
    
    @Test(priority=10, dataProvider = "CompanyData",dataProviderClass = DataProviderInput.class, enabled=false)
    public void verifyDetectedCityCompanyAutoSuggestDisplay(String compName) throws InterruptedException
    {
    	logger=extent.createTest(" This test is to verify Detected Location Company Auto Suggestion Display ");
    	HomePage hp=new HomePage(driver);
    	//CityChangePage cp=new CityChangePage(driver);
    	
    	hp.clickSearch();
    	hp.enterSearchElementSearchPage(compName);
    	Thread.sleep(5000);

    	
    }
    @Test(priority=11, dataProvider = "SingleCharacter",dataProviderClass = DataProviderInput.class, enabled=true)
    public void verifyAutoSuggestForSingleCharacter(String character)
    {
    	logger=extent.createTest(" This test is to verify Auto Suggestion Display  for Single Character ");
    	HomePage hp=new HomePage(driver);
    	//CityChangePage cp=new CityChangePage(driver);
    	
    	hp.clickSearch();
    	hp.enterSearchElementSearchPage(character);
    	hp.verifySingleCharcterAutoSuggest(character);
    }
    
}
