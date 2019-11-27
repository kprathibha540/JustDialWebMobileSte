package com.prathibha.justdialtest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lifeco.generic.BaseTest;
import com.prathibha.justdialpage.Autosug_SearcgPage;
import com.prathibha.justdialpage.MainCitypage;
import com.prathibha.justdialpage.Welcomepage;

public class Autosuggdisplay extends BaseTest {
	
    @Test(priority=1,enabled=false)
	public void companySearchwithTajMahal_3() {
		logger=extent.createTest("Taj Mahal (Bannerghatta ) shoTAJ MAHAL (with one space) should be seen on Top_3");
		String expected1="Taj Mahal";
		String expected2="Bannerghatta Road";
		Welcomepage hm = new Welcomepage(driver);
		Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
		hm.searchclick();
		aus.enterSearchText("Taj Mahal ");
	    aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
		
	}
    @Test(priority=1,enabled=false)
    public void companySearchwithJW_4() {
    	logger=extent.createTest("J W (with one space) J W Marriot Hotel(Vittal Malya Road) should be seen on top_4");
    	String expected1="J W Marriot Hotel";
		String expected2="Vittal Mallya Road";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("J W ");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1,expected2 );
    	
    	
    }
    @Test(priority=1,enabled=false)
     public void companySearchwithRudra_6()
    {
    	logger=extent.createTest("Rudra (Without space) Dr. Rudrappa Hospital should be seen on Top_6");
    	String expected1="Dr. Rudrappa Hospital";
    	String expected2="Richmond Town";
        Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Rudra");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void companySearchwithMcDonalds_7()
    {
    	logger=extent.createTest("McDonalds bellandur should be seen on Top_7");
    	String expected1="McDonalds";
    	String expected2="Bellandur";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("McDonalds Bellandur");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void companySearchwithCCD_8()
    {
    	logger=extent.createTest("CCD Nagawara Should be seen on Top_8");
    	String expected1="CCD";
    	String expected2="Nagawara";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("CCD Nagawara");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=true)
    public void singleBoxCompanySearchwithTajHotel_9()
    {
    	logger=extent.createTest("Taj hotel Goa 62 Hotels in Goa should be seen on Top_9");
    	String expected1="Taj Hotels - Goa";
    	String expected2="62 Hotels In Goa";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Taj Hotel Goa ");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void categorywithRestaurants_10()
    {
    	logger=extent.createTest("Restaurants Near Me Should be seen on Top_10");
    	String expected="Restaurants Near Me";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Restaurants");
    	aus.verifyFirstAutosugforcatgorey(expected);
    }
    @Test(priority=1,enabled=false)
    public void categorywithPackers_11()
    {
    	logger=extent.createTest("Packers & Movers  Category should be seen on Top_11");
    	String expected="Packers & Movers";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Packers");
        aus.verifyFirstAutosugforcatgorey(expected);
    }
    @Test(priority=1,enabled=false)
    public void outletsearchwithDominos_12()
    {
    	logger=extent.createTest("Dominos pizza outlet search should be seen on Top_12");
    	String expected="Dominos-Pizza Outlets Near Me";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Dominos Pizza");
    	aus.verifyFirstAutosugforcatgorey(expected);
    }
    @Test(priority=1,enabled=false)
    public void movieonlineSearch_14()
    {
    	logger=extent.createTest("(Gully Boy 2019 (Hindi Movies)Should be seen on top_14");
    	String expected1="Gully Boy (2019) (Hindi Movie)";
    	String expected2="Online Movies";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Gully Boy");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void productSearchIphonex_15()
    {
    	logger=extent.createTest("IPhone X 64 GB, Space Grey Should be seen on Top_15");
    	String expected1="iphone Xs";
    	String expected2="Mobile Phones";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("iphone XS");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void productSearchwithColour_16()
    {
    	logger=extent.createTest("IPhone X 64 GB, Space Grey Should be seen on Top_16");
    	String expected1="iPhone X 64 GB, Space Grey";
    	String expected2="Mobile Phones";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("iphone x 64Gb grey");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
   
    @Test(priority=1,enabled=false)
    public void dishSearchwithDalKhichadi_17()
    {
    	logger=extent.createTest("Dal khichadi dish should be seen on Top_17");
    	String expected1="Dal Khichadi";
    	String expected2="Dish";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Dal Khichadi");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void NewsSearchwithviratKohliNews_18() throws InterruptedException
    {
    	logger=extent.createTest("Virat Kohli News should be seen on Top_18");
    	String expected1="Virat Kohli";
    	String expected2="News";
        Welcomepage hm = new Welcomepage(driver);
        Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
        hm.searchclick();
        aus.enterSearchText("Virat Kohli News ");
        Thread.sleep(1000);
        aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void AllSearchwithNarendraModi_19()
    {
    	logger=extent.createTest("Narendra Modi Political Leader should be seen on Top");
    	String expected1="Narendra Modi";
        String expected2="Political Leader";   			
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new  Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Narendra Modi");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void musicsearchwithTera_20()
    {
    	logger=extent.createTest("Thera Ghata song should be seen on top_20");
    	String expected1="Tera Ghata (Song)";
    	String expected2="Song";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Tera Ghata");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void travelSearchMumbaiBangalore_21()
    {
    	logger=extent.createTest("Mumbai Bangalore Flight,Mumbai Bangalore Train,Mumbai Bangalore Bus(Should be seen Respectively)");
    	String expected1="mumbai bangalore flight";
    	String expected2="Online Flight Ticketing";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Mumbai Bangalore");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void trainSearchKravanthiexpress_22()
    {
    logger=extent.createTest("Karnavati express Ahmedabad Junction- Mumbai Central -12934 should be seen on Top_22");
    String expected1="Karnavati Express";
    String expected2="Ahmedabad Junction-Mumbai Central-12934";
    Welcomepage hm = new Welcomepage(driver);
    Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    hm.searchclick();
    aus.enterSearchText("Karnavati Express ");
    aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void stockSearchManpasand_23()
    {
    	logger=extent.createTest("Manpasand share price NSE should be seen on Top");
    	String expected1="Manpasand share price";
    	String expected2="NSE";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Manpasand share price ");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
    }
    @Test(priority=1,enabled=false)
    public void moviesearchDD_13() throws InterruptedException
    {
    	logger=extent.createTest("Dilwale Dulhania Le Jayenge Hindi Movie should be seen on Top");
    	String expected1="Dilwale Dulhania Le Jayenge Hindi Movie Near Me";
    	String expected2="Movie";
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	MainCitypage mcp = new MainCitypage(driver);
    	hm.searchclick();
    	mcp.cliklocdropdown();
    	Thread.sleep(1000);
    	aus.enterSearchText("Mumbai");
    	Thread.sleep(3000);
    	hm.clicksrchbtn();
    	Thread.sleep(1000);
    	hm.searchclick();
    	aus.enterSearchText("Dilwale Dulhania");
    	aus.verifyFirstAutosuggesionNameandPalce(expected1, expected2);
        
    }
    @Test(priority=1,enabled=false)
    public void companysearchwithTajMahalalsoListedIn_24() throws InterruptedException
    {
    	logger=extent.createTest("TAJ MAHAL (with one space) Select Taj Mahal (Bannerghatta )  from Autosuggest See Tourist Attraction is seen under also listed in_24");
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	MainCitypage mcp = new MainCitypage(driver);
    	hm.searchclick();
    	aus.enterSearchText("Taj Mahal ");
    	aus.clickFirstAutosuggesion();
    	Thread.sleep(3000);
    	aus.verifyTouristAttraction();
    }
    @Test(priority=1,enabled=false)
    public void companysearchwithJWNumberFetched_25()
    {
    	logger=extent.createTest("J W (with one space) Select J W Marriot Hotel(Vittal Malya Road) from Autosuggest check if 080-67189999 number is fetched");
    	Welcomepage hm = new Welcomepage(driver);
    	Autosug_SearcgPage aus = new Autosug_SearcgPage(driver);
    	hm.searchclick();
    	aus.enterSearchText("J W ");
    	aus.clickFirstAutosuggesion();
    }
}
