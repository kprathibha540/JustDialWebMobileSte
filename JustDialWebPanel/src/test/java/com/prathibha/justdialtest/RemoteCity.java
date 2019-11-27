package com.prathibha.justdialtest;

import org.testng.annotations.Test;


import com.lifeco.generic.BaseTest;
import com.lifeco.generic.CommonBasePage;
import com.lifeco.generic.DataProviderInput;
import com.prathibha.justdialpage.MainCitypage;
import com.prathibha.justdialpage.Welcomepage;

import utilities.ExcelData;


public class RemoteCity  extends BaseTest{
	@Test(priority=1,enabled=false)
	public void searchCCD()
	{
		try {
		CommonBasePage cbp = new CommonBasePage(driver);
		Welcomepage hm=new Welcomepage(driver);
		MainCitypage mcp = new MainCitypage(driver);
		ExcelData ex=new ExcelData();
		hm.searchclick();
		mcp.cliklocdropdown();
		Thread.sleep(5000);
		mcp.sendtext("Lucknow");
		Thread.sleep(5000);
		hm.clicksrchbtn();
		Thread.sleep(5000);
		hm.searchclick();
		mcp.checkloc();
		Thread.sleep(5000);
		mcp.sendtext("CCD");
		Thread.sleep(5000);
		mcp.clicksearch();
		hm.getAutosug();
			 
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//search by mcdonalds
		@Test(priority=1,enabled=false)
		public void searchMCD()
		{
			try {
			CommonBasePage cbp=new CommonBasePage(driver);
			Welcomepage hm=new Welcomepage(driver);
			MainCitypage mcp=new MainCitypage(driver);
			hm.searchclick();
		    mcp.cliklocdropdown();
			Thread.sleep(3000);
			mcp.sendtext("Lucknow");
			Thread.sleep(3000);
			hm.clicksrchbtn();
			Thread.sleep(3000);
			hm.searchclick();
			mcp.checkloc();
			Thread.sleep(3000);
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
			CommonBasePage cbp=new CommonBasePage(driver);
		    Welcomepage hm=new Welcomepage(driver);
		    MainCitypage mcp=new MainCitypage(driver);
		    hm.searchclick();
		    mcp.cliklocdropdown();
		    Thread.sleep(3000);
		    mcp.sendtext("Lucknow");
			Thread.sleep(3000);
			hm.clicksrchbtn();
			Thread.sleep(3000);
			hm.searchclick();
			mcp.checkloc();
			Thread.sleep(3000);
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
		@Test(priority=1,enabled=false)
		public void searchCA() 
		{
			try
			{
				CommonBasePage cbp=new CommonBasePage(driver);
				Welcomepage hm=new Welcomepage(driver);
				MainCitypage mcp = new MainCitypage(driver);
				//ExcelData ex=new ExcelData();
				hm.searchclick();
				mcp.cliklocdropdown();
				Thread.sleep(3000);
				mcp.sendtext("Lucknow");
				Thread.sleep(3000);
				hm.clicksrchbtn();
			    Thread.sleep(3000);
			    hm.searchclick();
				mcp.checkloc();
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
			CommonBasePage cbp=new CommonBasePage(driver);
		    Welcomepage hm=new Welcomepage(driver);
		    MainCitypage mcp=new MainCitypage(driver);
		    hm.searchclick();
		    mcp.cliklocdropdown();
		    Thread.sleep(3000);
		    mcp.sendtext("Lucknow");
			Thread.sleep(3000);
			hm.clicksrchbtn();
			Thread.sleep(3000);
			hm.searchclick();
			mcp.checkloc();
			Thread.sleep(3000);
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
				CommonBasePage cbp=new CommonBasePage(driver);
			    Welcomepage hm=new Welcomepage(driver);
			    MainCitypage mcp=new MainCitypage(driver);
			    hm.searchclick();
			    mcp.cliklocdropdown();
			    Thread.sleep(3000);
			    mcp.sendtext("Lucknow");
				Thread.sleep(3000);
				hm.clicksrchbtn();
				Thread.sleep(3000);
				hm.searchclick();
				mcp.checkloc();
				Thread.sleep(3000);
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
			 mcp.sendtext("Lucknow");
			Thread.sleep(3000);
			hm.clicksrchbtn();
			Thread.sleep(3000);
			hm.searchclick();
			mcp.checkloc();
		    Thread.sleep(3000);
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
