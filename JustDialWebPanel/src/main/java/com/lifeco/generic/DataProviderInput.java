package com.lifeco.generic;


import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

import utilities.ExcelData;
import utilities.LoggerHelper;
import utilities.ResourceHelper;

public class DataProviderInput extends BaseTest{
	public static Logger logs = LoggerHelper.getLogger(DataProviderInput.class);
	Properties inputDataProperty=ResourceHelper.intializeInputData();
	String inputPath=inputDataProperty.getProperty("inputfilepath");
	
	
	public String[][] getData(String sheetname, String module, int cellIndex)
	{
		try {
			int row=ExcelData.getRowCount(module, inputDataProperty.getProperty(sheetname), cellIndex-1);
		    //int cell=ExcelData.getCellCount(module, inputDataProperty.getProperty(sheetname) , row);
			
			logs.info(row);
		    String[][] data=new String[row][1];
		   
		    for(int i=1;i<=row;i++)
		    {
		    	    String cellValue=ExcelData.getData(module, inputDataProperty.getProperty(sheetname), i, cellIndex-1);
		    	    logs.info("      Value of Cell is ==== "+cellValue+"      row size "+row);
		    	    if(cellValue.isEmpty()||cellValue.equals("null")||cellValue.equals(""))
		    	    {
		    	    	 logs.info("      Inside If  ==== "+cellValue);
		    	    	break;
		    	    }
		    	    else
		    	    {
		    		data[i-1][0]=cellValue;
		    	    }
		    		//System.out.println("i value "+i+"    j value"+j+"  given data  ="+data[i-1][j]);
		    	
		    }
		    return data;
			}
			catch(Exception e)
			{
				logger.fail(e.getMessage()+" Problem Occured while reading form Excel ");
				return null;
			}
	}
	


	
	
	// DATA PROVIDER FOR VERIFY DEFAULT AUTO SUGGESTION SENDING INPUT 
	@DataProvider(name="DefaultAutoSuggest")
	public String[][] getDefaultAutoSuggestData()
	{
		return getData("homepage",inputPath,1);
	}
	
	
	@DataProvider(name="RestaurantsLink")
	public String[][] getRestaurantLinkData()
	{
		return getData("homepage",inputPath,2);
	}
	
	@DataProvider(name="DefaultCitySuggest")
	public String[][] getDefaultCitySuggestData()
	{
		return getData("homepage",inputPath,3);
	}
	
	
	@DataProvider(name="NotAvailableData")
	public String[][] getNotAvailableData()
	{
		return getData("homepage",inputPath,4);
	}
	

	@DataProvider(name="FreeTextData")
	public String[][] getFreeTextDataData()
	{
		return getData("homepage",inputPath,5);
	}
	
	// DATA PROVIDER FOR DETECT LOCATION BY PASSING EXPECTED DATA  
	
		@DataProvider(name="HomePageData")
		public String[][] getJustDailHomePageData() 
		{
			logs.info(" Inside getJustDailHomePageData()  inputPath =" +inputPath);
			return getData("homepage",inputPath,6);
		}
	
	@DataProvider(name="CompanyData")
	public String[][] getCompanyData()
	{
		return getData("homepage",inputPath,7);
	}
	
	
	
	@DataProvider(name="SingleCharacter")
	public String[][] getSingleCharacterData()
	{
		return getData("homepage",inputPath,8);
	}
	
	@DataProvider(name="MovieSearch")
	public String[][] getMovieSearchData()
	{
		return getData("homepage",inputPath,9);
	}
	
	@DataProvider(name="MovieAreaSearch")
	public String[][] getMovieAreaSearchData()
	{
		return getData("homepage",inputPath,10);
	}
	
	
	@DataProvider(name="SpecificProdSearch")
	public String[][] getSpecificProdSearchData()
	{
		return getData("homepage",inputPath,11);
	}
	
	
	@DataProvider(name="BrandProductSearch")
	public String[][] getBrandProductSearchData()
	{
		return getData("homepage",inputPath,12);
	}
	
	
	@DataProvider(name="CategoryFreeTextSearch")
	public String[][] getCategoryFreeTextSearchData()
	{
		return getData("homepage",inputPath,13);
	}
	
	@DataProvider(name="HotelFreeTextSearch")
	public String[][] getHotelFreeTextSearchData()
	{
		return getData("homepage",inputPath,14);
	}

	@DataProvider(name="MovieFreeTextSearch")
	public String[][] getMovieFreeTextSearchData()
	{
		return getData("homepage",inputPath,15);
	}
	

	@DataProvider(name="MovieFreeTextSearchArea")
	public String[][] getMovieFreeTextSearchAreaData()
	{
		return getData("homepage",inputPath,16);
	}
	
	
	@DataProvider(name="ProductFreeTextSearch")
	public String[][] getProductFreeTextSearchData()
	{
		return getData("homepage",inputPath,17);
	}
	
	@DataProvider(name="ProductFreeTextSearchArea")
	public String[][] getProductFreeTextSearchAreaData()
	{
		return getData("homepage",inputPath,18);
	}
	
	@DataProvider(name="ProductFreeTextBrand")
	public String[][] getProductBrandData()
	{
		return getData("homepage",inputPath,19);
	}
	
	@DataProvider(name="SingleBoxAutoSuggest")
	public String[][] getSingleBoxAutoSuggestData()
	{
		return getData("homepage",inputPath,20);
	}
	
	@DataProvider(name="FamousBrandAutoSuggest")
	public String[][] getFamousBrandAutoSuggestData()
	{
		return getData("homepage",inputPath,21);
	}
	
	@DataProvider(name="ShopFrontProductBrand")
	public String[][] getShopFrontProductBrandData()
	{
		return getData("homepage",inputPath,22);
	}
	
	@DataProvider(name="CreateFreeListingData")
	public String[][] getCreateFreeListingData()
	{
		return getData("homepage",inputPath,23);
	}
	
	//UploadPhotoSearchData
	
	@DataProvider(name="UploadPhotoSearchData")
	public String[][] getUploadPhotoSearchData()
	{
		return getData("homepage",inputPath,24);
	}
	
	//ReportIssueData
	@DataProvider(name="ReportIssueData")
	public String[][] getReportIssueData()
	{
		return getData("homepage",inputPath,25);
	}
	
	//ShopFrontProductData
	
	@DataProvider(name="ShopFrontProductData")
	public String[][] getShopFrontProductData()
	{
		return getData("homepage",inputPath,26);
	}
	
	
}
