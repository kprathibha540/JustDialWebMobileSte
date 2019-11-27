package com.prathibha.justdialtest;

import org.testng.annotations.Test;



import com.lifeco.generic.BaseTest;
import com.lifeco.generic.CommonBasePage;
import com.lifeco.generic.DataProviderInput;
import com.prathibha.justdialpage.MainCitypage;
import com.prathibha.justdialpage.Welcomepage;

import utilities.ExcelData;




public class MainCityTest extends BaseTest{
	//search by ccd
	@Test(priority=1,enabled=false)
	public void searchCCD()
	{
		try {
		logger=extent.createTest("This Test is to verify search by location and ccd");
		CommonBasePage cbp = new CommonBasePage(driver);
		Welcomepage hm=new Welcomepage(driver);
		MainCitypage mcp = new MainCitypage(driver);
		hm.searchclick();
		mcp.cliklocdropdown();
		Thread.sleep(3000);
		mcp.sendtext("Bangalore");
		Thread.sleep(3000);
		mcp.clicksearch();
		Thread.sleep(3000);
		hm.clicksrchbtn();
		mcp.sendtext("CCD");
		Thread.sleep(3000);
		mcp.clicksearch();
		hm.getAutosug();
			 
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//search by mcdonalds
	@Test(priority=1,enabled=true)
	public void searchMCD()
	{
		try {
		extent.createTest("This Test is to verify search by location and Mcdonlands");
		CommonBasePage cbp=new CommonBasePage(driver);
		Welcomepage hm=new Welcomepage(driver);
		MainCitypage mcp=new MainCitypage(driver);
		hm.searchclick();
	    mcp.cliklocdropdown();
		Thread.sleep(3000);
		mcp.sendtext("Bangalore");
		Thread.sleep(3000);
		hm.clicksrchbtn();
		mcp.sendtext("Mcdonalds");
		Thread.sleep(3000);
		mcp.clicksearch();
		hm.getAutosug();
		//hm.getresultCount();;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	//search by mainland
	@Test(priority=1,enabled=false)
	public void searchMainLand()
	{
		try {
	logger	=extent.createTest("This Test is to verify search by location and main land china restaurant");
		CommonBasePage cbp=new CommonBasePage(driver);
	    Welcomepage hm=new Welcomepage(driver);
	    MainCitypage mcp=new MainCitypage(driver);
	    hm.searchclick();
	    mcp.cliklocdropdown();
	    Thread.sleep(3000);
	    mcp.sendtext("Bangalore");
	    Thread.sleep(3000);
	    hm.clicksrchbtn();
	    mcp.sendtext("Mainland China Restaurant");
	    Thread.sleep(3000);
		mcp.clicksearch();
		hm.getAutosug();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//search by category
	@Test(priority=1,dataProvider="DefaultAutoSuggest", dataProviderClass = DataProviderInput.class, enabled =true)
	public void searchCA(String data) 
	{
		try
		{
		 logger=extent.createTest("This Test is to verify search by location and CA ")	;
			CommonBasePage cbp=new CommonBasePage(driver);
			Welcomepage hm=new Welcomepage(driver);
			MainCitypage mcp = new MainCitypage(driver);
			hm.searchclick();
			mcp.cliklocdropdown();
			Thread.sleep(3000);
		    mcp.sendtext(data);
			Thread.sleep(3000);
		    hm.clicksrchbtn();
		    Thread.sleep(3000);
		    mcp.sendtext("CA"); 
		    Thread.sleep(3000);
		    mcp.clicksearch();
			hm.getAutosug();
			 
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	@Test(priority=1,enabled=false)
	public void searchENT()
	{
		try {
	   logger=extent.createTest("This Test is to verify loc and ENT ");
		CommonBasePage cbp=new CommonBasePage(driver);
	    Welcomepage hm=new Welcomepage(driver);
	    MainCitypage mcp=new MainCitypage(driver);
	    hm.searchclick();
	    mcp.cliklocdropdown();
	    Thread.sleep(3000);
	    mcp.sendtext("Bangalore");
	    Thread.sleep(3000);
	    hm.clicksrchbtn();
	    mcp.sendtext("ENT Specialist Packers & Movers");
	    Thread.sleep(3000);
		mcp.clicksearch();
		hm.getAutosug();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test(priority=1,enabled=false)
	
		public void searchAcrepairs()
		{
		try {
			logger=extent.createTest("This Test is to verify loc and Voltas-AC");
			CommonBasePage cbp=new CommonBasePage(driver);
		    Welcomepage hm=new Welcomepage(driver);
		    MainCitypage mcp=new MainCitypage(driver);
		    hm.searchclick();
		    mcp.cliklocdropdown();
		    Thread.sleep(3000);
		    mcp.sendtext("Bangalore");
		    Thread.sleep(3000);
		    hm.clicksrchbtn();
		    mcp.sendtext("Voltas-Ac Repairs & Services");
		    Thread.sleep(3000);
			mcp.clicksearch();
			hm.getAutosug();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	@Test(priority=1,enabled=false)
	public void searchBanners()
	{
		try {
		CommonBasePage cbp=new CommonBasePage(driver);
		Welcomepage hm = new Welcomepage(driver);
		MainCitypage mcp = new MainCitypage(driver);
		hm.searchclick();
		mcp.cliklocdropdown();
		Thread.sleep(3000);
		mcp.sendtext("Bangalore");
		Thread.sleep(3000);
		hm.clicksrchbtn();
		mcp.sendtext("Bananers");
		Thread.sleep(3000);
		mcp.clicksearch();
		hm.getAutosug();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

