package com.prathibha.justdialtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



import com.lifeco.generic.BaseTest;
import com.lifeco.generic.CommonBasePageprathi;

import com.lifeco.generic.DataProviderInput;
import com.prathibha.justdialpage.Autosug_SearcgPage;
import com.prathibha.justdialpage.MainCitypage;
import com.prathibha.justdialpage.Welcomepage;

import utilities.WindowHandle;

public class Short_checkList extends BaseTest {
	
  

//@Test(priority=1,dataProvider="SearchInput",dataProviderClass=DataProviderInput.class,enabled=false)
	
   @Test(priority=1,enabled=false)
	public void  CompanySpecialcharacter_15() throws InterruptedException
	{
		
	 logger=extent.createTest("This  Test is to verify the search by  company with specialcharacter");
		
	    logs.info(driver);
		Welcomepage hm = new Welcomepage(driver);
		Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		hm.searchclick();
		Thread.sleep(3000);
		//aus.enterSearchText(data);
		String text="Lawrence & Mayo";
		aus.enterSearchText(text);
		Thread.sleep(3000);
		hm.clicksrchbtn();
	   // hm.getfirstAutosug();
	     Thread.sleep(3000);
	     hm.getAutosug();
	     aus.verifyAutosugforLawernce();
	
		
		
	}
	
   @Test(priority=2,enabled=false)
   public void Categorywithoutarea_Hotels_16()
   {
	   try
	   {
		   logger=extent.createTest("This test is to verify search by Hotels");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		   hm.searchclick();
		   Thread.sleep(3000);
		   String text="Hotels";
		   aus.enterSearchText(text);
		   Thread.sleep(3000);
		  //aus.clickfirstAutosug();
		   hm.clicksrchbtn();
		   Thread.sleep(3000);
		   aus.clickalloptions();
		   Thread.sleep(3000);
		   hm.getAutosug();
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
   @Test(priority=3,enabled=false)
   public void Categorywitharea_Movers_17()
   {
	   try
	   {
		   logger=extent.createTest("This test is to verify search by 24 Hours Packers & Movers Malad West");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   MainCitypage mcp = new MainCitypage(driver);
		   Autosug_SearcgPage aug = new Autosug_SearcgPage(driver);
		   hm.searchclick();
		   Thread.sleep(3000);
		   mcp.cliklocdropdown();
		   aug.enterSearchText("Bangalore");
		   Thread.sleep(3000);
		   hm.clicksrchbtn();
		   Thread.sleep(3000);
		   hm.searchclick();
		   Thread.sleep(3000);
		   aug.enterSearchText("24 Hours Packers & Movers Malad West");
		   Thread.sleep(3000);
		   hm.clicksrchbtn();
		   hm.getAutosug();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }

   @Test(priority=4,enabled=false)
   public void Verify2ndsetofResults_35_res()
   {
	   try {
	  logger=extent.createTest("This test is to verify 2nd set of results for search by categorey for Restuaurant");
	   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
	   Welcomepage hm = new Welcomepage(driver);
	   MainCitypage mcp = new MainCitypage(driver);
	   Autosug_SearcgPage aug = new Autosug_SearcgPage(driver);
	   hm.clickresticon();
	   //Thread.sleep(3000);
	   hm.clicktrend();
	   Thread.sleep(3000);
	   aug.getscropllAutosug();
	   //hm.getAutosug();
	   
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	   
	   
   }
   
   @Test(priority=5,enabled=false)
   public void verify2ndsetofResults_35_Doctors()
   {
	   try
	   {
		   logger=extent.createTest("This test is to verify 2 nd set of results foe search by categorey for Doctors");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		   aus.clickdoctoricon();
		   aus.clickDoctorCategory();
		   aus.getscropllAutosug();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   @Test(priority=6,enabled=false)
   public void verify2ndsetofresults_35_Education()
   {
	   try
	   {
		   extent.createTest("This Test is to verify 2nd set of results for search by category for education");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		   aus.clickMoreIcon();
		   Thread.sleep(3000);
		   cbp.scrollDown(driver);
		   aus.clickeducationicon();
		   aus.clickSchollCategory();
		   aus.clickBoardingSchool();
		   aus.clickBoardingSchool();
		   aus.clickAllOptions();
		   aus.getscropllAutosug();
		 }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   @Test (priority=7,enabled=false)
   public void filterTab_36()
   {
	   try
	   {
		   logger= extent.createTest("This test is to verify Filter tab is vosible or not ");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		   hm.clickresticon();
		   hm.clicktrend();
		   aus.verifyFiltertab();
		 
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
   @Test(priority=8,enabled=false)
   public void  resultpageasListview_37()
   {
	   try
	   {
		   logger= extent.createTest("This Test is to verify list view is displaying or not");
		   CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		   Welcomepage hm = new Welcomepage(driver);
		   Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		   hm.clickresticon();
		   hm.clicktrend();
		   aus.verifyListElemnt();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
	 @Test(priority=9,enabled=false)
	public void  categoreyEnquireNow_43()
	{
		try
		{
			//This Test case will  also cover for Highway Hospital Thane west order now
			logger=extent.createTest("This Test is to verify Category with Enquire for lawyers open Now ");
			CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
			Welcomepage hm = new Welcomepage(driver);
			Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
			hm.searchclick();
			//hm.send("Highway Hospital Thane west");
			hm.send("Lawyers");
			Thread.sleep(1000);
			hm.getfirstAutosug();
			Thread.sleep(1000);
			hm.clicksrchbtn();
			aus.clickonlawersDetailsPage();
			aus.VerifyOpennowispresent();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   
	 @Test(priority=10,enabled=false)
	 public void imageComapnydetailspage_55()
	 {
		 logger= extent.createTest("Back & share button seen on Images – If click on image will redirect to gallery page");
		CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		Welcomepage hm = new Welcomepage(driver);
		Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		hm.clickresticon();
		hm.clicktrend();
		aus.clickonlawersDetailsPage();
		aus.verifyBackArrow();
		aus.verifyShare();
		aus.clickImage();
		aus.verifyGallerText();
		
	 }
	 
	 @Test(priority=11,enabled=false)
	 public void verifyJDlogoandPhotoCount_56() throws InterruptedException
	 {
		 logger=extent.createTest("JD verified logo if present and photo counts");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 hm.clickresticon();
		 hm.clicktrend();
	    // aus.clickonlawersDetailsPage();
	     aus.clickonsecondRestuarant();
	     Thread.sleep(3000);
		 aus.verifyJDlogothumb();
		 aus.getPhotoCountText();
		 
	 }
	 @Test(priority=12,enabled=false)
	 //bug is their for favourite icon Requierd login functionality
	 public void verifyContractFavouriteiconAndarea_57() throws InterruptedException
	 {
		 logger=extent.createTest("Contract name along with favourite icon and area name");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 MainCitypage mcp=new MainCitypage(driver);
		 hm.searchclick();
		 mcp.cliklocdropdown();
		 Thread.sleep(3000);
		 aus.enterSearchText("Bangalore");
		 hm.clicksrchbtn();
		 aus.clickBackArrowButton();
		 Thread.sleep(3000);
		 hm.clickresticon();
		 hm.clicktrend();
		// aus.clickonlawersDetailsPage();
		// aus.clickcontractName();
		 aus.clickNonPaidConract();
		 aus.clickFavorioteIcon();
		 aus.getTextforContract();
		/*
		 * aus.clickHomeButton(); Thread.sleep(3000); aus.clikMenuButton();
		 * aus.clickMenuFavirioute(); aus.verifyMenuFaviText();
		 * aus.compareFavouritebyMenuAndContractPage();
		 */
	 }
	 @Test(priority=13,enabled=false)
	 public void verifyDetailsRCMS_58()
	 {
		 logger=extent.createTest("Under details tab – reviews, Call, directions, message & Share are seen");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 hm.clickresticon();
		 hm.clicktrend();
		 aus.clickonlawersDetailsPage();
		 aus.verifyRatingsIspresent();
		 aus.verifyCallIspresent();
		 aus.verifyMapIspresent();
		 aus.verifyShare();
		 
		 
	 }

	/*
	 * //prefilled rating is not working
	 * 
	 * @Test(priority=1,enabled=false) public void tapPrefillRatings_59() {
	 * logger=extent.
	 * createTest("Tap to rate with stars prefilled incase already rated");
	 * CommonBasePageprathi cbp = new CommonBasePageprathi(driver); Welcomepage hm = new
	 * Welcomepage(driver); Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
	 * hm.clickresticon(); hm.clicktrend(); aus.clickonlawersDetailsPage();
	 * //aus.clickonPrefillRatings(); aus.clickprefillrate();
	 * aus.clickSubmitButton(); }
	 */
	 @Test(priority=14,enabled=false)
	 public void Advertise_111()
	 {
		 try {
		 logger=extent.createTest("createing the Advertise form");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 aus.clikMenuButton();
		 Thread.sleep(3000);
		 aus.clickadvertise();
		 aus.verifyTextAdvertise();
		 aus.enterSearchText("ABC Enterprices");
		 aus.clickCity();
		 aus.enterCity("Bang");
		 Thread.sleep(1000);
		 aus.clickcityAtosugg();
		 Thread.sleep(1000);
		// aus.clickenterCity();
		 aus.EnterContactName("Arya");
		 Thread.sleep(1000);
		 aus.EnterNumber("9740369994");
		 Thread.sleep(1000);
		 aus.clickarea();
		 aus.enterAreaname("Manyata");
		 Thread.sleep(1000);
		 aus.clickAreasugg();
		 Thread.sleep(3000);
		  aus.clickContinueButtton(); 
		  Thread.sleep(1000);
		  aus.clickCreateNewlistButton();
		  Thread.sleep(3000);
		  aus.clickContinueButton2();
		  Thread.sleep(3000);
		  aus.clickFinshButton();
		  Thread.sleep(3000);
		  aus.clickThankButton();
	    
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority=15,enabled=false)
	 public void BestDealResultpage_128()
	 {
		 try
		 {
			 logger=extent.createTest("Best Deal – Result Page ");
			 Welcomepage hm = new Welcomepage(driver);
			 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
			 WindowHandle wh = new WindowHandle(driver);
			 hm.searchclick();
			 hm.send("Institues for ITI");
			 Thread.sleep(1000);
			 aus.clickAutoITIsug();
			// aus.scrollDownElemnet();
			 aus.clickBestDeal();
			 aus.enterBestDealName("test");
			 aus.enterBestDealMobile("7738176962");
			 //aus.clickBestdealResultSubmit();
			
			 aus.verifyBestDeal();
			
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 @Test(priority=16,enabled=false)
	public void BestDealDetailpage_129() throws InterruptedException
	{
		logger=extent.createTest("Best Deal - Detail Page");
		CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		Welcomepage hm = new Welcomepage(driver);
		MainCitypage mcp = new MainCitypage(driver);
		Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		hm.searchclick();
		mcp.cliklocdropdown();
		Thread.sleep(3000);
		aus.enterSearchText("Bangalore");
		Thread.sleep(3000);
		hm.clicksrchbtn();
		Thread.sleep(3000);
		hm.searchclick();
		hm.send("Zxy kailash stores");
		Thread.sleep(3000);
		aus.clickAutozxysotes();
		/*
		 * //hm.clicksrchbtn(); Thread.sleep(1000); aus.clickStoreName();
		 */
		Thread.sleep(1000);
		aus.clickBestDealButton();
		aus.verifyBestDeal();
		
	}
	 @Test  (priority=17,enabled=false)
	 public void openNowforRestaurants_64() throws InterruptedException
	 {
		 logger=extent.createTest("Hours of operation with Open now & closed now seen for limited categories like Restaurants,etc");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 MainCitypage mcp=new MainCitypage(driver);
		 hm.searchclick();
		 mcp.cliklocdropdown();
		 Thread.sleep(3000);
		 aus.enterSearchText("Manyata Tech park");
		 hm.clicksrchbtn();
		 aus.clickBackArrowButton();
		 Thread.sleep(3000);
		 hm.clickresticon();
		 hm.clicktrend();
		// aus.clickStoreName();
		 Thread.sleep(3000);
		 aus.clickswasthaStrore();
		 aus.scrolltoopenNow();
		 aus.verifyOpenNowText();
		 
		} 
	 //not scrolling fully
	 @Test(priority=18,enabled=false)
	 public void verifyMoreLinkRedirectionCategory_67() throws InterruptedException 
	 {
		 
		 logger=extent.createTest("Also listed in with more link – Check redirection of categories");
		  CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		  Welcomepage hm = new Welcomepage(driver);
		  Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		  MainCitypage mcp=new MainCitypage(driver);
		  hm.searchclick();
		  mcp.cliklocdropdown();
		  Thread.sleep(3000);
		  aus.enterSearchText("Bangalore");
		  hm.clicksrchbtn();
		  aus.clickBackArrowButton();
		  Thread.sleep(3000);
		  hm.clickresticon();
		  hm.clicktrend();
		  //aus.clickonlawersDetailsPage();
		  aus.clickswasthaStrore();
		  //aus.clickStoreName();
		  Thread.sleep(3000);
		  aus.clickActionForMore();
          //aus.clickHomeDeliveryRes();
		  aus.clickrestuarants();
		  Thread.sleep(3000); 
		  aus.verifyTextHomeDeliveryRestauraunt();
		 
		 
	}
	
	 @Test(priority=19,enabled=false)
	 public void contactNumberwithVNForPaid_65()
	 {
		 try
		 {
			 logger=extent.createTest("Contact numbers along with VN & actual are seen which should be dialable for paid contracts");
			 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
			  Welcomepage hm = new Welcomepage(driver);
		      Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		      hm.clickresticon();
		      hm.clicktrend();
		      aus.clickonlawersDetailsPage();
		      Thread.sleep(3000);
		      cbp.scrollDown(driver);
		      aus.verifyContactNumberforPaid();
		      
		      
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 @Test(priority=20,enabled=false)
	 public void contactNumberwithForNonPaid_65()
	 {
		 try
		 {
			 logger=extent.createTest("Contact numbers along with VN & actual are seen which should be dialable for non paid conracts");
			 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
			 Welcomepage hm = new Welcomepage(driver);
			 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
			 hm.clickresticon();
			 hm.clicktrend();
			 aus.clickNonPaidConract();
			 Thread.sleep(3000);
			 cbp.scrollDown(driver);
			 aus.verifyContactforNonPadid();
			
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 @Test(priority=21,enabled=false)
	 public void MovieAutosugg_75()
	 {
		
	 logger=extent.createTest("Movie name in autosuggest along with star ratings (if available) and check its redirection");
	 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
	 Welcomepage hm = new Welcomepage(driver);
	 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
	 MainCitypage mcp = new MainCitypage(driver);
     aus.clickMoreIcon();
     aus.clickMoviesIcon();
     aus.getTextHighestMovies();
	}
	 
	 @Test(priority=22,enabled=false)
	 public void MovieBannerDetailPage_77()
	 {
		logger =extent.createTest("Movie filter page – Banner will redirect to movie details page");
		CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		Welcomepage hm = new Welcomepage(driver);
		Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		aus.clickMoreIcon();
		aus.clickMoviesIcon();
		//aus.clickBanner();
		aus.clickMovieBanner();
		aus.verifyBannerText();
	 }
	 @Test(priority=23,enabled=false)
	 public void DisplayMovieSchedule_78() throws InterruptedException
	 {
		 logger=extent.createTest("Movie Results Page – Movie schedules displaying with Todays date");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 aus.clickMoreIcon();
		 aus.clickMoviesIcon();
		 //aus.clickBanner();
		 aus.clickMovieBanner();
		 Thread.sleep(3000);
		 aus.getSelectedScheduledate();
	 }
	 
	 @Test(priority=24,enabled=true)
	 public void VerifyFiltersonMovie_83() throws InterruptedException
	 {
		 logger=extent.createTest("Check filters on movie");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 aus.clickMoreIcon();
		 aus.clickMoviesIcon();
		 aus.clickMovieFilter();
		 Thread.sleep(3000);
		 aus.clickSortAtoZ();
	     aus.clickSortByLanguage(); 
	     aus.clickSortByGenre();
	     aus.clickApplyButton();
		 aus.getFilterMovieResults();
		 
	 }
	 @Test(priority=25,enabled=false)
	 public void verifyMovieLanguageSorting_83() throws InterruptedException
	 {
		 logger=extent.createTest("language sorting");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 aus.clickMoreIcon();
		 aus.clickMoviesIcon();
		 aus.clickMovieFilter();
		 Thread.sleep(3000);
		 aus.verifySortByLanguage();
		 aus.getFilterMovieResults();
		 
	 }
	 
	 @Test(priority=26,enabled=false)
	 public void verifyDetailspagefunctionality_83() throws InterruptedException
	 {
		 logger=extent.createTest("On result page tickets /Reviews/synopsis /videos / top stories functionality");
		 CommonBasePageprathi cbp = new CommonBasePageprathi(driver);
		 Welcomepage hm = new Welcomepage(driver);
		 Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		 aus.clickMoreIcon();
		 aus.clickMoviesIcon();
		 hm.searchclick();
		 aus.enterSearchText("Bala");
		 hm.clicksrchbtn();
		 aus.clickAutosearchMovie();
		 Thread.sleep(3000);
		 aus.clickandVerifyTicket();
		 aus.clickandverifyReviews();
		 aus.clickandverifyvedios();
		 aus.clickandverifyTopstories();
		 aus.clickandverifySynopsis();
	    
	 }
	/*
	 * @Test(priority=1,enabled=false) public void verifyShowsAsperDate_83() throws
	 * InterruptedException {
	 * logger=extent.createTest("check shows as per date sorting"); CommonBasePageprathi
	 * cbp = new CommonBasePageprathi(driver); Welcomepage hm = new Welcomepage(driver);
	 * Autosug_SearcgPage aus = new Autosug_SearcgPage(driver); aus.clickMoreIcon();
	 * aus.clickMoviesIcon(); hm.searchclick(); aus.enterSearchText("Bala");
	 * hm.clicksrchbtn(); aus.clickAutosearchMovie(); Thread.sleep(3000);
	 * 
	 * }
	 */
	 
	
	 }
