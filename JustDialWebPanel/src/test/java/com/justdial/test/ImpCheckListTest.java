package com.justdial.test;

import org.testng.annotations.Test;

import com.justdial.page.CityChangePage;
import com.justdial.page.FreeListingPage;
import com.justdial.page.HomePage;
import com.justdial.page.ResultsPage;
import com.lifeco.generic.BaseTest;
import com.lifeco.generic.DataProviderInput;

import utilities.GenericUtils;

public class ImpCheckListTest extends BaseTest {

	@Test(priority = 1, dataProvider = "MovieSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void movieSearchCheckList23(String movieName) throws InterruptedException
	{
		logger=extent.createTest(" Movie Search  Check List  23   ");
		
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(movieName);
		hp.clickFirstCategorySuggestion();
		Thread.sleep(2000);
		rp.verifyMovieName(movieName);
		
	}
	

	@Test(priority = 2, dataProvider = "MovieAreaSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void movieSearchCheckListWithArea22(String movieWithArea) throws InterruptedException
	{
		logger=extent.createTest(" Movie Search  with area  Check List  22   ");
		String[] tempArray=GenericUtils.splitStringByPipeline(movieWithArea);
		String movieName=tempArray[0];
		String movieNameArea=tempArray[0]+" "+tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(movieNameArea);
		hp.clickFirstCategorySuggestion();
		Thread.sleep(2000);
		rp.verifyMovieName(movieName);
	
	}
	
	@Test(priority = 3, dataProvider = "SpecificProdSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void specificProductSearchCheckList21(String specificProd) throws InterruptedException
	{
		logger=extent.createTest(" specific Product Search  Check List  21   ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(specificProd);
		hp.clickFirstCategorySuggestion();
		rp.verifyProdName(specificProd);
		
	}
	
	@Test(priority = 4, dataProvider = "BrandProductSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void brandProductSearchCheckList20(String brandProd) throws InterruptedException
	{
		logger=extent.createTest("  Product Search   with a brand Check List  20  , 19  ");
		String[] tempArray=GenericUtils.splitStringByPipeline(brandProd);
		String brand=tempArray[0];
		String brandProduct;
		if(tempArray.length>1)
		{
			brandProduct=tempArray[0]+" "+tempArray[1];
		}
		else
		{
			brandProduct=tempArray[0];
		}
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(brandProduct);
		hp.clickFirstCategorySuggestion();
		rp.verifyProdBrand(brand);
	}
	
	@Test(priority = 5, dataProvider = "CategoryFreeTextSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void categoryFreeTextSearchCheckList28(String categoryFreeText) throws InterruptedException
	{
		logger=extent.createTest(" Category Free Text Search  Check List 28 ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(categoryFreeText);
		GenericUtils.pressEnter();
		rp.verifyCategoryResult();
		
		
	}
	
	@Test(priority = 6, dataProvider = "HotelFreeTextSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void hotelFreeTextSearchCheckList28(String hotelFreeText) throws InterruptedException
	{
		logger=extent.createTest(" Hotel Free Text Search  Check List 28 ");
		String[] tempArray=GenericUtils.splitStringByPipeline(hotelFreeText);
		String catName=tempArray[0];
		String options=tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(catName);
		GenericUtils.pressEnter();
		rp.enterToClickSpecificTypeHotel(options);
		rp.verifyCategoryResult();
		
	}
	

	@Test(priority = 7, dataProvider = "MovieFreeTextSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void movieFreeTextSearchCheckList29(String freeTextMovie) throws InterruptedException
	{
		logger=extent.createTest(" Movie Free Text Search  Check List 29 ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(freeTextMovie);
		GenericUtils.pressEnter();
		Thread.sleep(2000);
		rp.verifyMovieTitle(freeTextMovie);
		
		
	}
	
	@Test(priority = 8, dataProvider = "MovieFreeTextSearchArea", dataProviderClass = DataProviderInput.class , enabled = false)
	public void movieFreeTextSearchAreaCheckList30(String freeTextMovie) throws InterruptedException
	{
		logger=extent.createTest(" Movie Free Text Search  Check List 30 ");
		String[] tempArray=GenericUtils.splitStringByPipeline(freeTextMovie);
		String movName=tempArray[0];
		String movWithArea=tempArray[0]+" "+tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(movWithArea);
		GenericUtils.pressEnter();
		Thread.sleep(2000);
		rp.verifyMovieTitle(movName);
		
	}
	
	@Test(priority = 9, dataProvider = "ProductFreeTextSearch", dataProviderClass = DataProviderInput.class , enabled = false)
	public void productFreeTextSearchCheckList31(String freeTextMovie) throws InterruptedException
	{
		logger=extent.createTest(" Movie Free Text Search  Check List 31 ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(freeTextMovie);
		GenericUtils.pressEnter();
		rp.verifyProdResult(freeTextMovie);
		
	}
	
	@Test(priority = 10, dataProvider = "ProductFreeTextSearchArea", dataProviderClass = DataProviderInput.class , enabled = false)
	public void productFreeTextAreaSearchCheckList32(String freeTextMovieArea) throws InterruptedException
	{
		logger=extent.createTest(" Movie Free Text Search  Check List 32 ");
		String[] tempArray=GenericUtils.splitStringByPipeline(freeTextMovieArea);
		String prodName=tempArray[0];
		String prodWithArea=tempArray[0]+" "+tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(prodName);
		GenericUtils.pressEnter();
		rp.verifyProdResult(prodWithArea);
	
	}
	
	@Test(priority = 11, dataProvider = "ProductFreeTextBrand", dataProviderClass = DataProviderInput.class , enabled = false)
	public void productFreeTextBrandCheckList33(String productFreeTextBrand) throws InterruptedException
	{
		logger=extent.createTest(" Movie Free Text Search  Check List 33 ");
		String[] tempArray=GenericUtils.splitStringByPipeline(productFreeTextBrand);
		String prodWithBrand=tempArray[0]+" "+tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(prodWithBrand);
		GenericUtils.pressEnter();
		rp.verifyFreeTestBrand();
	
	}
	
	@Test(priority=12, dataProvider = "DefaultCitySuggest", dataProviderClass = DataProviderInput.class, enabled =false)
	public void defaultCitySuggestCheckList51(String cityName)
	{
		logger=extent.createTest(" This test is to verify default auto suggestion for City Search CheckList51 ");
		HomePage hp=new HomePage(driver);
		CityChangePage cp=new CityChangePage(driver);
		hp.clickSearch();
		cp.clickDropdownCity();
		cp.enterCityName(cityName);
		cp.verifyDetectedLocation(cityName);
		
	}
	
	@Test(priority=13, dataProvider = "SingleBoxAutoSuggest", dataProviderClass = DataProviderInput.class, enabled =false)
	public void singleBoxAutoSuggestCheckList52(String singleboxdata)
	{
		logger=extent.createTest(" This test is to verify auto suggestion for single box "+singleboxdata);
		String[] tempArray=GenericUtils.splitStringByPipeline(singleboxdata);
		String contractAndPlace;
		String contract=tempArray[0];
		String place=tempArray[1];
		if(place.toLowerCase().equals("Category".toLowerCase()))
		{
			contractAndPlace=tempArray[0];
			 
		}
		else
			contractAndPlace=tempArray[0]+" "+tempArray[1];
	
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(contractAndPlace);
		rp.verifySingleBoxAutoSuggest(contract, place);
		
		
	}
	
	@Test(priority=14, dataProvider = "FamousBrandAutoSuggest", dataProviderClass = DataProviderInput.class, enabled =false)
	public void famousBrandAutoSuggestCheckList53(String famousBranddata)
	{
		logger=extent.createTest(" This test is to verify Famous Brand  will redirect to mainland company result page ");
		String[] tempArray=GenericUtils.splitStringByPipeline(famousBranddata);
		//String categoryName=tempArray[0];
		String famousBrand=tempArray[1];
		String categoryBrand=tempArray[0]+" "+tempArray[1];
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.enterSearchContent(categoryBrand);
		hp.clickFirstCategorySuggestion();
		rp.verirfyBrandResultsPage(famousBrand);
		
	}
	
	@Test(priority=15, dataProvider = "ShopFrontProductBrand", dataProviderClass = DataProviderInput.class, enabled =true)
	public void shopfrontProductSearchCheckList86(String ProductSearch) throws InterruptedException
	{
		logger=extent.createTest(" This test is to verify Search products in Shopfront ");
		
		String brand;
		if(ProductSearch.contains("|"))
		{
			
			logs.info(" ---------------------------------------------**********------------------");
			String[] tempArray=GenericUtils.splitStringByPipeline(ProductSearch);
			//String product=tempArray[0];
			brand=tempArray[0];
			ProductSearch=tempArray[0]+" "+tempArray[1];
		}
		else
		{
		 brand=ProductSearch;
		}
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.clickMoreBtn();
		rp.clickShoppingBtn();
		Thread.sleep(3000);
		rp.clickShopFrontProductSearch();
		Thread.sleep(2000);
		hp.enterSearchElementSearchPage(ProductSearch);
		GenericUtils.pressEnter();
		Thread.sleep(2000);
		rp.verifyProdResult(brand);
	}
	
	@Test(priority=16, enabled =false)
	public void verifyShareFunctionaliyCheckList93() throws InterruptedException
	{
		
		logger=extent.createTest(" This test is to verify Share Functionality ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.clickMoreBtn();
		hp.clickRestaurantsLink();
		rp.clickAnyResturantContract();
		rp.clickShare();
		rp.printLogShareLinks();
		
	}
	

	@Test(priority=17, enabled =false)
	public void verifyShareFunctionaliyMoviesCheckList93() throws InterruptedException
	{
		logger=extent.createTest(" This test is to verify Share Functionality ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.clickMoreBtn();
		hp.clickMoviesLink();
		hp.clickAnyMovie();
		rp.clickShareTopKey();
		rp.verifyMovieName("");
	
		
	}
	
	@Test(priority = 18, dataProvider = "CreateFreeListingData", dataProviderClass = DataProviderInput.class, enabled = false)
	public void verirfyCreationOfFreeListingCheckList110(String createFreeListData)
	{
		logger=extent.createTest(" This test is to verify Free listing  ");
		String[] results = GenericUtils.splitStringByPipeline(createFreeListData);
		String businessName=results[0];
		String cityName=results[1];
		String contactPerson=results[2];
		String mobileNum=results[3];
		String landLine=results[4];
		String areaName=results[5];
		String pinCode=results[6];
		HomePage hp=new HomePage(driver);
		FreeListingPage flp=new FreeListingPage(driver);
		hp.clickMenuBtn();
		hp.clickAddABusiness();
		flp.enterBusinessName(businessName);
		flp.clickOnCity();
		flp.enterCityNameOrAreaName(cityName);
		flp.getFirstCityAutoSugg();
		flp.enterContactPerson(contactPerson);
		flp.enterMobileNumber(mobileNum);
		flp.enterLandLineNumber(landLine);
		flp.clickArea();
		flp.enterCityNameOrAreaName(areaName);
		flp.getFirstAreaAutoSugg();
		// GenericUtils.selectByValue(flp.getElementToSelectPin(), pinCode); // Not need when are defined properly 
		flp.clickContinueBtn();
		flp.clickCreateNewListingBtn();
		
	}
	
	@Test(priority = 19,  enabled = false)
	public void verirfyEditFreeListing() throws InterruptedException
	{
	
		logger=extent.createTest(" This test is to verify Edit listing ");
		HomePage hp=new HomePage(driver);
		FreeListingPage flp=new FreeListingPage(driver);
		hp.enterSearchContent(" Zxy Enterprises Pvt Ltd ");
		GenericUtils.pressEnter();
		flp.clickFirstAutoSuggListing();
		flp.clickOnEditListing();
		GenericUtils.pressF12();
		flp.clickIAmAuser();
		flp.enterUserName("Test");
		flp.enterUserMobile("7738176962");
		flp.clickLoginArrow();
	
	}
	
	@Test(priority=20, dataProvider = "UploadPhotoSearchData", dataProviderClass = DataProviderInput.class, enabled = false)
	public void verifyUploadPhotoDetailsCheckList119(String data)
	{
		logger=extent.createTest(" This test is to verify Upload Photo for Details ( Details Page Upload photo ");
		String[] results = GenericUtils.splitStringByPipeline(data);
		String search=results[0];
		String photoPath=results[1];
		HomePage hp=new HomePage(driver);
		FreeListingPage flp=new FreeListingPage(driver);
		hp.enterSearchContent(search);
		GenericUtils.pressEnter();
		flp.clickFirstAutoSuggListing();
		flp.clickUploadPhoto();
		flp.enterPhotoFilePath(photoPath);
		flp.clickSubmit();
	}
	
	@Test(priority = 21, dataProvider = "ReportIssueData", dataProviderClass = DataProviderInput.class, enabled= false)
	public void verifyReportIssueCheckList121(String msg) throws InterruptedException
	{
		logger=extent.createTest(" This test is to verify Report Issue is working or Not  Here I have take any Restaurant ");
		HomePage hp=new HomePage(driver);
		FreeListingPage flp=new FreeListingPage(driver);
		hp.clickRestaurantsLink();
		flp.clickFirstRestaurantOption();
		flp.moveScrolltoMoreBtn();
		flp.clickOnReportIssue();
		Thread.sleep(5000);
		flp.clickPhoneNumberCheckBox();
		flp.clickAddressCheckBox();
		flp.clickThisPlaceCloseDownCheckBox();
		flp.enterAddtionalComments(msg);
		flp.clickSubmitIssue();
		
	}
	
	@Test(priority = 22,dataProvider = "ShopFrontProductData", dataProviderClass = DataProviderInput.class, enabled= false)
	public void VerifyShopfrontProductSearchAndRedirectionCheckList85(String data) throws InterruptedException
	{
		logger=extent.createTest(" This test is to verify Shop Front Product Serarch and Redirection  ");
		HomePage hp=new HomePage(driver);
		ResultsPage rp=new ResultsPage(driver);
		hp.clickMoreBtn();
		rp.clickShoppingBtn();
		rp.clickShopFrontProductSearch();
		Thread.sleep(2000);
		hp.enterSearchElementSearchPage(data);
		rp.shopfrontProductNameVerification(data);
		Thread.sleep(10000);
		
	}
	
	
	
	
}
