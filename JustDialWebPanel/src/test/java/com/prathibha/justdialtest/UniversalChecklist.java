package com.prathibha.justdialtest;

import org.testng.annotations.Test;

import com.lifeco.generic.BaseTest;
import com.prathibha.justdialpage.Autosug_SearcgPage;
import com.prathibha.justdialpage.Welcomepage;

public class UniversalChecklist extends BaseTest {
	
	@Test(priority=1,enabled=false)
	public void recentSearchSection() throws InterruptedException
	{
	logger=extent.createTest("Recent search section – Max 10 should be seen Also, the redirection should happen on respective pages");
	Welcomepage hm = new Welcomepage(driver);
	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
	hm.searchclick();
	aus.enterSearchText("Restaurants");
    hm.clicksrchbtn();
    Thread.sleep(3000);
    aus.clickbackArrowButton();
    Thread.sleep(1000); 
    hm.searchclick();
    aus.enterSearchText("Travel");
    hm.clicksrchbtn();
    aus.clickbackArrowButton();
    Thread.sleep(1000);
    hm.searchclick();
    aus.enterSearchText("Jewellery");
	hm.clicksrchbtn();
    aus.clickbackArrowButton();
    Thread.sleep(1000);
    hm.searchclick();
	aus.enterSearchText("Mobiles shops near me");
	 hm.clicksrchbtn();
    aus.clickbackArrowButton();
    Thread.sleep(1000); 
    hm.searchclick();
	aus.enterSearchText("Doctors");
	hm.clicksrchbtn();
   aus.clickbackArrowButton();
   Thread.sleep(1000);
   hm.searchclick();
   aus.enterSearchText("Beauty Shops"); 
   hm.clicksrchbtn();
   aus.clickbackArrowButton();
  Thread.sleep(1000);
  hm.searchclick();
 aus.enterSearchText("coffee shops  near me"); 
 hm.clicksrchbtn();
 aus.clickbackArrowButton();
 hm.searchclick();
 aus.enterSearchText("Gold Loans");
 hm.clicksrchbtn();
// aus.clickfirstAutosug();
 aus.clickbackArrowButton();
 Thread.sleep(1000); 
 hm.searchclick();
aus.enterSearchText("party halls");
hm.clicksrchbtn();
//aus.clickfirstAutosug();
aus.clickbackArrowButton();
 Thread.sleep(1000);
 hm.searchclick();
aus.enterSearchText("Bags");
hm.clicksrchbtn();
//aus.clickfirstAutosug();
aus.clickbackArrowButton();
Thread.sleep(3000);
hm.searchclick();
aus.getRecentSearcges();
		 
    
    
    
	
	}
	
	
@Test(priority=1,enabled=true)
public void singlebox()
{
	logger=extent.createTest("Single box: Category – Restaurants saket delhi Company – Taj Delhi Grouping – CCD Koramangala");
	Welcomepage hm = new Welcomepage(driver);
	 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
	 hm.searchclick();
	 aus.enterSearchText("Restaurants saketh");
	 hm.clicksrchbtn();
	 hm.getAutosug();
     aus.clickbackArrowButton();
     hm.searchclick();
	 aus.enterSearchText("Taj Delhi");
	 hm.clicksrchbtn();
	 hm.getAutosug();
	 aus.clickbackArrowButton();
	 hm.searchclick();
	 aus.enterSearchText("CCD Delhi");
	 hm.clicksrchbtn();
	 hm.getAutosug();
	
	 
	
}
	
	
}
