package com.prathibha.justdialtest;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.lifeco.generic.BaseTest;
import com.lifeco.generic.CommonBasePage;
import com.prathibha.justdialpage.Welcomepage;


public class HomeTest extends BaseTest{
	
	
	@Test(priority=1,enabled=false)
	public void searchengine() throws Exception
	{
		logger=extent.createTest("welcome to justdial webview");
		com.prathibha.justdialpage.Welcomepage hm = new com.prathibha.justdialpage.Welcomepage(driver);
		CommonBasePage cbp = new CommonBasePage(driver);
		hm.searchclick();
	  //String text = "Restaurant";
		hm.send("Restaurant");
		Thread.sleep(10000);
		hm.verifyResultCount();
	}
	@Test(priority=1,enabled=false)
	public void iconclick()
	
	{
		try {
		//click on result icon and trend 
		logger =extent.createTest("clicking on icon");
		Welcomepage hm = new Welcomepage(driver);
		CommonBasePage cbp = new CommonBasePage(driver);
		hm.clickresticon();
		Thread.sleep(3000);
		hm.clicktrend();
		hm.getAutosug();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Back arrow to redirect to previous page
	@Test(priority=1,enabled=false)
	public void backArrow()
	{
		try {
		logger=extent.createTest("redirect arrow");
		Welcomepage hm = new Welcomepage(driver);
		CommonBasePage cbp = new CommonBasePage(driver);
		hm.clickresticon();
        Thread.sleep(3000);
        hm.redirectpage();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//verifing logo
    @Test(priority=1,enabled=false)
    public void Jdlogo()
    
    {
    	try
    	{
    		logger=extent.createTest("jd logo");
    		Welcomepage hm = new Welcomepage(driver);
    		CommonBasePage cbp = new CommonBasePage(driver);
    		hm.jdlogo();
    		
    	}
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    @Test(priority=1,enabled=false)
    public void contextMenuresult()
    {
    	try
    	{
    		logger=extent.createTest("context menu  to result page");
    		Welcomepage hm=new Welcomepage(driver);
    		CommonBasePage cbp = new CommonBasePage(driver);
    		hm.contextMenu();
    		hm.clickuser();
			/*
			 * Thread.sleep(3000); hm.redirectpage(); hm.closeButton();
			 */
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
// Not possible to automate asking for login
    @Test(priority=1,enabled=false)
    public void bellIcon()
    {
    	logger=extent.createTest("context menu  to result page");
		Welcomepage hm=new Welcomepage(driver);
		CommonBasePage cbp = new CommonBasePage(driver);
		hm.clickbelicon();
		hm.redirectpage();
    }
}
