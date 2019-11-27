package com.prathibha.justdialpage;

import org.testng.Assert;
import org.testng.AssertJUnit;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lifeco.generic.CommonBasePage;
import com.lifeco.generic.CommonBasePageprathi;

import utilities.JSHelper;
import utilities.LoggerHelper;

public class Autosug_SearcgPage {

	WebDriver driver;
	CommonBasePageprathi cbp;
	JSHelper js;
	public Logger logs = LoggerHelper.getLogger(CityChangePage.class); // check Imports properly
	 
	public Autosug_SearcgPage (WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
		  cbp=new CommonBasePageprathi(driver);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement srch;
	
	
	@FindBy(xpath="//span[@class='hdrsearchIcon']")
	private WebElement clicksrch;
	
	@FindBy(xpath="//div[@class='viewwrapper']")
	private List<WebElement> resstatus;
	
	@FindBy(xpath="//div[@id='istview']")
	private List<WebElement> allresults;
			
	@FindBy(xpath="//*[@id=\"appWrapper\"]/div/div/div/ul/li[1]/span/span[1]")
	private WebElement   htl; 
	
	@FindBy(xpath="//div[@class='rcntsrd']")
	private List<WebElement> htlautosug;
	
	@FindBy(xpath="//span[@class='rslthdnw fonts15'])[19]")
	private By secondreus;
	
	@FindBy(xpath="(//span[@class='hpiconouter'])[3]")
	private WebElement docicon;
	
	@FindBy(xpath="//*[@id='shell']/div[2]/div/div/ul/li[2]/span[2]/span[1]")
	private WebElement doctcat;
	
	@FindBy(xpath="//span[@class='hpicon newhpmoreicon']")
	private WebElement more;
	
	@FindBy(xpath="//a[@href='/Mumbai/58/Education_fil?srcterm=Education']")
	private WebElement eduicon;
	
	@FindBy(xpath="(//span[@class='catnameicnwp'])[1]")
	private WebElement schl;
	
	@FindBy(xpath="//li/span/span[.='Boarding Schools']")
	private WebElement boardingschl;
	
	@FindBy(xpath="//li/span/span[.='All Options']")
	private WebElement alloptions;
	
	@FindBy(xpath="//span[@class='filtnwicon font12']")
	private WebElement filter;
	
	@FindBy(xpath="(//span[@class='rslthdnw fonts15'])[1]")
	private WebElement listele;
	
	@FindBy(xpath="//button[@class='competitoricon']")
	private WebElement plusicon;
	
	@FindBy(xpath="(//span[@class='rsltcell rsltinfo'])[1]")
	private WebElement details;
	
	@FindBy(xpath="//button[@class='dpodronbtn fonts15']")
	private WebElement opennow;
	
	@FindBy(xpath="//div[@class='rcntsrd']")
	private List<WebElement> srchres;
	
	@FindBy(xpath="//div[@class='iconbox hdrMnuback']")
	private WebElement backArrow;
	
	@FindBy(xpath="//span[@class='dpshareicongreen']")
	private WebElement share;
	
	@FindBy(xpath="(//div[@class='defaultsliderimg'])[1]")
	private WebElement img;
	
	@FindBy(xpath="//span[@class='fonts16 midtxt midtxtCrop']")
	private WebElement galleryPageText;
	
	@FindBy(xpath="//*[@id=\"shell\"]/div[2]/div/div[2]/a/div/div[2]")
	private WebElement jdlogothumb;
	
	@FindBy(xpath="(//div[@class='countsection font11'])[1]")
	private WebElement photocount;
	
	@FindBy(xpath="//*[@id='favorite']")
	private WebElement favorioteIcon;
	
	@FindBy(xpath="//div[@class='dphtadrs']")
	private WebElement contractName;
	
	@FindBy(xpath="//ul/li[@class='cmnftract']")
	private WebElement home;
	
	@FindBy(xpath="//div[@class='iconbox hdrMnuIcn']")
	private WebElement menu;
	
	@FindBy(xpath="//span[.='Favourites']")
	private WebElement menuFaverioute;
	
	@FindBy(xpath="//span[@class='favotitename']")
	private WebElement favlist;
	
	@FindBy(xpath="//div[@class='favoritetxt']")
	private WebElement manufavText;
	
	
	@FindBy(xpath="(//span[@class='rsltcell rsltinfo'])[1]")
	private WebElement secondres;
	
	
	
	@FindBy(xpath="//span[@class='dptpoint dpoint font15']")
	private WebElement ratings;
	
	@FindBy(xpath="//span[@class='dptpoint dpoint font15']")
	private WebElement call;
	
	@FindBy(xpath="//span[@class='dpmapdirection']")
	private WebElement map;
	
	@FindBy(xpath="//span[@class='dptbrstr']")
	private WebElement rates;
	
	@FindBy(xpath="//span[@class='tstarotr']")
	private List<WebElement> prefillrates;
	
	
	@FindBy(xpath="//div[@class='dpotr']")
	private WebElement prefillrate;
	
	@FindBy(xpath="//button[@class='witebtn font16']")
	private WebElement submit;
	
	
	@FindBy(xpath="//span[text()='Advertise']")
	private WebElement adv;
	
	@FindBy(xpath="//span[contains(text(),'Advertise')]")
	private WebElement advpage;
	
	@FindBy(xpath="//input[@id='txt_company']")
	private WebElement businessName;
	
	
	@FindBy(xpath="//input[@class='free-input jd_rule']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='txt_auto']")
	private WebElement textCity;
	
	@FindBy(xpath="//input[@id='txt_contact_person']")
	private WebElement cntctName;
	
	@FindBy(xpath="(//input[@type='tel'])[1]")
	private WebElement mobnum;
	
	@FindBy(xpath="//input[@name='area']")
	private WebElement area;
	
	@FindBy(xpath="//input[@id='txt_auto']")
	private WebElement areatext;
	
	@FindBy(xpath="//div[@id='continue']")
	private WebElement cont;
	
	@FindBy(xpath="//div[@id=\"continue2\"]")
	private WebElement contbtn;
	
	
	@FindBy(xpath="//ul[@class='autoUl']")
	private List<WebElement> autosug;
	
	
	@FindBy(xpath="(//ul[@id='citysugg']/li/a)[1]")
	private WebElement citysugg;
	
   @FindBy(xpath="(//ul[@id='areasugg']/li/a)[2]")
   private WebElement areasugg;
   
   @FindBy(xpath="//span[contains(text(),'Finish')]")
   private WebElement finishbtn;
   
   @FindBy(xpath="//a[@id='thnkupg']")
   private WebElement thankbtn;
   
   @FindBy(xpath="//span[contains(text(),\"Create New Listing\")]")
   private WebElement newlistbtn;
   
   @FindBy(xpath="//*[@id=\"shell\"]/div[2]/div/div[12]/span/span[2]")
   private WebElement editlist;
   
   @FindBy(xpath="//a[contains(text(),' I am a user ')]")
   private WebElement user;
   
   @FindBy(xpath="(//div[@class='rcntsrd']/ul/li/span)[2]")
   private WebElement autoiti;
   
   @FindBy(xpath="(//span[@class='rsltcell rsltinfo'])[1]")
   private WebElement iti;
   
   
   //@FindBy(xpath="//span[@class='dpodronachr']/button")
  @FindBy(xpath="//button[contains(text(),'Best Deal')]")
   private WebElement bestdealbutton;
   
   
   @FindBy(xpath="(//span[@class='adrswp'])[1]")
   private WebElement austozxystores;
   
   @FindBy(xpath="(//span[@class='rslthdnw fonts15'])[8]")
   private WebElement itiele;
   
   @FindBy(xpath="//input[@class='enquiresubmit']")
   private WebElement bestdealresultsubmit;
   
   @FindBy(xpath="//*[@id='listview']/div[2]/div[2]/div/div[13]/div/div/input")
   private WebElement getbestdeaL;
   
   @FindBy(xpath="//span[text()='Get Best Deal']")
   private WebElement bestdealText; 
   
   @FindBy(xpath="//input[@value='Submit']")
   private WebElement submitval;
   
   @FindBy(xpath="//input[@value=\"Search\"]")
   private WebElement search;
   
   @FindBy(xpath="//input[@placeholder='Name']")
   private WebElement Name;
   
   @FindBy(xpath="//input[@placeholder='Mobile']")
   private WebElement mobile;
   
   @FindBy(xpath="(//span[@class='rsltcell rsltinfo'])[1]")
   private WebElement storeName;
   
   //@FindBy(xpath="//span[contains(text(),'Open Now')]")
   @FindBy(xpath="//span[@class='dptimgwp']")
   private WebElement openNow;
  
   @FindBy(xpath="//li[text()='...more']")
   //@FindBy(xpath="//*[@id='shell']/div[2]/div/div[27]/div/ul/li[5]")
   private WebElement listedInmore;
   
   @FindBy(xpath="(//ul[@class='dphrsoptul']/li/a[contains(text(),'Restaurants')])[2]")
   private WebElement listedRes;
   
   
   @FindBy(xpath="//div[contains(text(),'report an issue')]")
   private WebElement reportanIssue;
   
   @FindBy(xpath="//a[.='Home Delivery Restaurants']")
   private WebElement homeRes;
   
   @FindBy(xpath="//a[.='Restaurants']")
   private WebElement restaurants;
   
   @FindBy(xpath="//span[@class='hdrvend page_animaterestfilter']")
   private WebElement homeDeliveryResText;
   
   
   @FindBy(xpath="//span[@class='dpvstephnum']")
   private WebElement contactNumber_VN;
 
   @FindBy(xpath="//a[contains(text(),'Home Delivery Restaurants')]")
   private WebElement HDR;
   
   @FindBy(xpath="//span[@class='rsltcell rsltinfo']//span[contains(text(),'Have More Punjabi Restaurant')]")
   private WebElement nonpaidcontact;
   
   
   @FindBy(xpath="//li[@class='hpli']/a/span[text()='Movies']")
   private WebElement moviesIcon;
  
   
   @FindBy(xpath="(//div[@class='autoSrchWpr'])[1]")
   private WebElement autsugmovie;
   
   @FindBy(xpath="//ul[@class='lctname']/div/li[.='Mumbai']")
   private WebElement autosuMumbai;
   
   
   @FindBy(xpath="//div[@class='moviefilterblock']")
   private WebElement movieFilter;
   
   @FindBy(xpath="//span[text()='A-Z']")
   private  WebElement sortByAtoZ;
   
   @FindBy(xpath="//div[@class='mvrowDiv']")
   private List<WebElement> highestMovie;
   
   @FindBy(xpath="(//span[@class='mvimg'])[1]")
   private WebElement banner;
   
   @FindBy(xpath="//span[.='Kalidaasa Kannada Meshtru (Kannada Movie)']")
   private WebElement bannerMovieName;
   
   @FindBy(xpath="//span[.='Bala']")
	private WebElement movieName;	   
   
   @FindBy(xpath="//span[@class='hdrvend page_animaterestfilter']")
   private WebElement bannerText;
   
   @FindBy(xpath="//select[@id='selecDate']")
   private  WebElement selectdate;
   
   @FindBy(xpath="//span[@class='selectblock']")
   private WebElement Todaydate;
   
   @FindBy(xpath="//span[.='English']")
   private WebElement sortbyenglish;
   
   @FindBy(xpath="//span[.='Comedy']")
   private WebElement sortComedy;
   
   @FindBy(xpath="//button[@class='apply_fxd_btn font15 ripple']")
   private WebElement applybtn;
   
   @FindBy(xpath="//div[@class='mvrowDiv']")
   private List<WebElement> movieres;
   
   @FindBy(xpath="//span[.='Tamil']")
   private WebElement langTamil;
   
   @FindBy(xpath="//span[.='English']")
   private WebElement langEng;
   
   @FindBy(xpath="//span[.='Hindi']")
   private WebElement langhindi;
   
   @FindBy(xpath="//span[.='Malayalam']")
   private WebElement langmalayalam;
   
   @FindBy(xpath="//span[.='Telugu']")
   private WebElement langtelugu;
   
   @FindBy(xpath="//span[.='Kannada']")
   private WebElement langkanada;
   
   @FindBy(xpath="//span[.='Gujarati']")
   private WebElement langGujarathi;
   
   @FindBy(xpath="//ul[@id='mvrestabs']/li")
   private List<WebElement> movieTabs;
   
   @FindBy(xpath="//div[@class='autoSrchWpr']")
   private WebElement autosugmovie;
   
   @FindBy(xpath="//li[@id='Tickets']")
   private WebElement tickets;
   
   @FindBy(xpath="//li[@id='Reviews']")
   private WebElement reviews;
   
   @FindBy(xpath="//li[@id='Videos']")
   private WebElement vedios;
   
   
   @FindBy(xpath="//li[@id='Top Stories']")
   private WebElement topstories;
   
   @FindBy(xpath="//li[@id='Synopsis']")
   private WebElement  synopsis;
   
   @FindBy(xpath="//i[@class='selectarrowblock']")
   private WebElement datedropdown;
   
   @FindBy(xpath="(//b[.='Bangalore'])[1]")
   private WebElement bangloc;
   
   @FindBy(xpath="//span[@class='iconbox hdrMnuback']")
   private WebElement backarrowbtn;
   
   @FindBy(xpath="//span[.='Fly Dining']")
   private WebElement flydining;
   
   @FindBy(xpath="(//span[@class='adrswp'])[1]")
   private WebElement firstautisug;
   
   
   @FindBy(xpath="//ul[@class='rntsrchs']")
   private  List<WebElement> recentsearch;
   
   @FindBy(xpath="(//span[@class='adrswp'])[1]")
   private WebElement firtautosug;
   
   @FindBy(xpath="(//div[@class='mainwpr']//span/span)[1]")
   private WebElement searchName;
   
   @FindBy(xpath="(//div[@class='mainwpr']//span/span)[2]")
   private WebElement placeName;
   
   @FindBy(xpath="(//span[@class='rsltcell rsltinfo'])[1]")
   private WebElement contrcat;
   
   
   @FindBy(xpath="(//span[@class='adrswp'])[1]")
   private WebElement searchfriestautosugg;
   
   @FindBy(xpath="//ul[@class='dphrsoptul']")
   private WebElement TouristAttraction;
   
   
   @FindBy(xpath="(//span[@class='adrswp'])[2]")
   private WebElement itisugg;
   
	public void enterSearchText(String text) {
		cbp.sendKeys(srch, text);
		
	}
	
	public void clickDoctorCategory()
	{
		cbp.click(doctcat);
		logs.info("clicking on doctor category as Ayurvedic");
	}
	
	public void clickonSearch()
	{
		cbp.click(clicksrch);
	}
	
	public void clickalloptions()
	{
		cbp.click(htl);
	}
	
	public void clickdoctoricon()
	{
		cbp.click(docicon);
		logs.info("clicking on doctor icon");
	}
	
	public void clickMoreIcon() {
		cbp.click(more);
		cbp.scrollDown(driver);
		logs.info("clicking on more icon");
	}
	
	public void clickeducationicon()
	{
		cbp.click(eduicon);
		logs.info("clicking on Education icon");
	}
	
	public void clickSchollCategory()
	{
		cbp.click(schl);
		logs.info("clicking on Scholl category");
	}
	
	public void clickBoardingSchool()
	{
		cbp.click(boardingschl);
		logs.info("clicking on Boarding school category");
		
	}
	public void clickAllOptions()
	{
		cbp.click(alloptions);
		logs.info("clicking on Alloptions");
	}
	public void   verifyFiltertab()
	{
		cbp.waitForElementVisible(filter, 10);
		
	}
	public void verifyListElemnt()
	{
		cbp.waitForElementVisible(listele, 10);
	}
	
	
	public void Click() {
		cbp.click(plusicon);
	}
	
	public void clickonlawersDetailsPage()
	{
		cbp.click(details);
	}
	
	public void VerifyOpennowispresent()
	{
		cbp.waitForElementVisible(opennow, 10);
		cbp.click(opennow);
	}
	
    public void verifyBackArrow() {
    	cbp.waitForElementVisible(backArrow,10);
    	logs.info("Back Arrow is visible in image seen");
    }
    public void clickbackArrowButton()
    {
    	cbp.waitForElementVisible(backArrow,10);
    	cbp.click(backArrow);
    }
    
    public void verifyShare() {
    	cbp.waitForElementVisible(share, 10);
    	logs.info("Share option is visible");
    }
    
    public void clickImage()
    {
    	cbp.click(img);
    	logs.info("image is clicking and navigating to Gallery page");
    }
    
    public void verifyGallerText()
    {
    	cbp.getText(galleryPageText);
    	logs.info("Text of Gallery page"+galleryPageText);
    	
    }
    
    public void verifyJDlogothumb()
    {
    	cbp.waitForElementVisible(jdlogothumb, 10);
    }
    
    public void getPhotoCountText()
    {
    	cbp.waitForElementVisible(photocount, 10);
    	logs.info(cbp.getText(photocount));
    }
    
    public void clikMenuButton()
    {
    	cbp.click(menu);
    }
    public void clickFavorioteIcon()
    {
    	if(favorioteIcon.isEnabled())
    	{
    	cbp.waitForElementClickable(favorioteIcon, 10);
    	logs.info("favorite icon is clicking");
    	
    	}
    	else
    		logs.info("favorite icon is not cliking");
    		
    }
    
    
    public void getTextforContract()
    {
    	String fav1 = cbp.getText(contractName);
    	logs.info(fav1);
    }
    public void clickHomeButton()
    {
    	cbp.click(home);
    }
    
    public void clickMenuFavirioute()
    {
    	//cbp.waitForElementClickable(menuFaverioute, 10);
    	cbp.click(menuFaverioute);
    }
    
    public void clickonFavourList()
    {
    	cbp.waitForElementClickable(favlist, 10);
    }
    public void verifyMenuFaviText()
    {
    	String fav2 = cbp.getText(manufavText);
    	logs.info(fav2);
    }
    
    public void compareFavouritebyMenuAndContractPage()
    {
    	String fav1 = cbp.getText(contractName);
    	String fav2 = cbp.getText(manufavText);
       if(fav1.equalsIgnoreCase(fav2))
       {
    	   logs.info("both are sale");
       }
       else 
       {
    	   logs.info("both are bot same");
       }
    }
    
    public void verifyRatingsIspresent()
    {
    	cbp.waitForElementVisible(ratings, 10);
    	logs.info(cbp.getText(ratings));
    }
    public void verifyCallIspresent()
    {
      cbp.waitForElementVisible(call, 10);	
      logs.info(cbp.getText(call));
    }
    
    public void verifyMapIspresent()
    {
    	cbp.waitForElementVisible(map, 10);
    	logs.info(cbp.getText(map));
    }
    
    public void ClickonRatings() {
    	cbp.click(rates);
    }
    
    public void clickonPrefillRatings()
    {
    	List<WebElement> list = prefillrates;
    	for(int i=0;i<list.size();i++)
    	{
    		list.get(4).click();
    		logs.info("clicking on 4 times");
    	}
    }
    
    public void clickprefillrate()
    {
    	cbp.click(prefillrate);
    }
    
    public void clickSubmitButton()
    {
    	cbp.click(submit);
    }
    
    public void clickadvertise()
    {
    	cbp.click(adv);
    }
    
    public void verifyTextAdvertise()
    {
    	logs.info(cbp.getText(advpage));
    	
    }
    public void enterBusinessName(String text)
    {
    	cbp.sendKeys(businessName, text);
    }
    
    public void clickCity()
    {
    	cbp.click(city);
    }
    
    public void enterCity(String text) {
    	cbp.sendKeys(textCity, text);
    }
    
    public void clickenterCity() {
    	cbp.click(textCity);
    }
    
    public void EnterContactName(String text)
    {
    	cbp.sendKeys(cntctName,text);
    }
    
    public void EnterNumber(String no)
    {
    	cbp.sendKeys(mobnum, no);
    }
    public void clickarea()
    {
    	cbp.click(area);
    }
    public void enterAreaname(String text)
    {
    	cbp.sendKeys(areatext, text);
    	
    }
    public void clickenterAreaName()
    {
    	cbp.click(areatext);
    }
    public void clickContinueButtton()
    {
    	cbp.click(cont);
    }
    
    
    
    public void clickcityAtosugg()
    {
    	cbp.click(citysugg);
    }
    
    public void clickAreasugg()
    {
    	cbp.click(areasugg);
    }
    
    
    public void clickFinshButton()
    {
    	cbp.click(finishbtn);
    }
    
    
    public void clickThankButton()
    {
    	cbp.click(thankbtn);
    }
    
    public void clickCreateNewlistButton()
    {
    	cbp.click(newlistbtn);
    }
    
    public void clickContinueButton2()
    {
    	cbp.click(contbtn);
    }
    
    
    public void clickEditList() {
    	cbp.click(editlist);
    }
    
    public void clickIamUser()
    {
    	cbp.click(user);
    }
    
    public void clickAutoITIsug()
    {
    	cbp.click(autoiti);
    }
    
    public void clickInstuiteName()
    {
    	cbp.click(iti);
    }
    
    public void clickBestDealButton()
    {
    	cbp.waitForElementVisible(bestdealbutton, 10);
    	cbp.click(bestdealbutton);
    }
    
    public void clickBestdealResultSubmit()
    {
    	cbp.click(bestdealresultsubmit);
    }
  
   public void clickBestDeal()
   {
	   cbp.waitForElementClickable(getbestdeaL, 10);
	  // cbp.click(getbestdeaL);
   }
    public void verifyBestDeal()
    {
    	cbp.getText(bestdealText);
    }
    
    public void clickSubmit()
    
    {
    	cbp.click(submitval);
    }
    
    public void clickrestuarants()
    {
    	cbp.click(restaurants);
    }
    
    public void clickSearch()
    {
    	cbp.click(search);
    }
    
    public void enterBestDealName(String text)
     {
    	cbp.sendKeys(Name, text);
     }
    
    public void enterBestDealMobile(String text)
    {
    	cbp.sendKeys(mobile, text);
    }
    
    public void clickStoreName()
    {
    	cbp.waitForElementVisible(storeName, 10);
    	cbp.click(storeName);
    }
    
    
    public void clickNonPaidConract()
    {
    	cbp.click(nonpaidcontact);
    }
    public void verifyTextHomeDeliveryRestauraunt()
    {
    	cbp.getText(homeDeliveryResText);
    }
    public void clickAutosugMumbai()
    {
    	cbp.click(autosuMumbai);
    }
    
    public void clickBanner()
    {
    	cbp.click(banner);
    }
    
    public void clickMovieBanner()
    {
    	cbp.click(bannerMovieName);
    }
    
    public void verifyBannerText()
    {
    	logs.info(cbp.getText(bannerText));
    	logs.info("displaying Banner Text");
    }
    
    public void clickBangloreLocation()
    {
    	cbp.click(bangloc);
    }
    
    public void clickonsecondRestuarant()
    {
    	cbp.click(secondres);
    }
    public String clickAdvAutosug()
    {
    	List<WebElement> list = autosug;
		
		 for(int i=0;i<list.size();i++)
		 {    
			// list.get(1).click();
			 logs.info(list.get(0).getText());
			 logs.info("Auto suuest List ::"+list.size());
			 break;
		 }
		return null;
    }
    public void getTextHighestMovies()
    {
    	List<WebElement> list = highestMovie;
    	logs.info("Auto Suggest List ::"+ list.size());
    	for(int i=0;i<list.size();i++)
    	{
    		
    		if(!highestMovie.isEmpty())
    		{
    		logs.info(list.get(i).getText());
    		logs.info("Highest Movies are displaying");
    	    }
    		else
    		{
    			logs.info("Highest Movies are not displaying");
    		}
    }
    }
	public String verifyAutosugforLawernce() {
		 
		
		List<WebElement> list = resstatus;
		 logs.info("Auto Suggest List ::" + list.size());
	
	
		for(int i=0;i<list.size();i++)
		{
			String atual=list.get(i).getText();
			logs.info(atual);
			String expected="Lawrence & Mayo";
			logs.info(expected);
			logs.info("no of results"+list.size());
			if(atual.contains(expected))
             {
				
		      logs.info("Results contains the same data"+atual);
	
             }
			else
				logs.info("Results are not containing the same data"+expected);
		
			break;
			 
	   }
		return null;
		
	}
	
	
	public void scrollDownElemnet()
	{
	 cbp.scrollUpToTheElement(driver, getbestdeaL);
	}
	
	public void ScrollToMore() {
		cbp.waitForElementVisible(HDR, 30);
		cbp.scrollUpToTheElement(driver, HDR);
		logs.info("more option is visible");
	}
	
	
	public void clickActionForMore()
	{
		cbp.actionClick(listedInmore, driver);
		logs.info("scrolling  to more elemnt and performing action");
		//cbp.click(listedInmore);
	}
	public void clickMoreOption()
	{
		//cbp.waitForElementClickable(listedInmore, 30);
		cbp.click(listedInmore);
		logs.info("more option is clicking");
	}
	public void scrolltoopenNow()
	{
		cbp.waitForElementVisible(openNow, 10);
		cbp.scrollUpToTheElement(driver, openNow);
		logs.info("scrolling to openNow");
	}
	public void verifyOpenNowText()
	{
		logs.info(cbp.getText(openNow));
	}
	
	public void clickHomeDeliveryRes()
	{
		cbp.click(homeRes);
		logs.info("Home Deleivery resturaunt is clicking");
	}
	
	public void clickMoviesIcon()
	{
		cbp.waitForElementVisible(moviesIcon, 10);
		cbp.click(moviesIcon);
	}
	
	
	public void clickAutoSuggMovie() {
		cbp.click(autsugmovie);
		cbp.getText(autsugmovie);
	}
	
	public void clickSortAtoZ()
	{
		//cbp.click(sortByAtoZ);
		cbp.actionClick(sortByAtoZ, driver);
		//cbp.jsClick(sortByAtoZ);
	}
	public void clickSortByLanguage()
	{
		cbp.actionClick(sortbyenglish, driver);
		//cbp.click(sortbyenglish);
	}
	
	public void clickSortByhindi()
	{
		cbp.actionClick(langhindi, driver);
	}
	public void clickSortByGenre()
	{
		cbp.actionClick(sortComedy, driver);
		//cbp.click(sortComedy);
	}
	
	public void clickApplyButton()
	{
		cbp.click(applybtn);
	}
	
	public void verifyContactNumberforPaid()
	{
		
		cbp.waitForElementVisible(contactNumber_VN, 30);
		logs.info(cbp.getText(contactNumber_VN));
		String actual = cbp.getText(contactNumber_VN);
		String exp="91";
        if(actual.contains(exp))
		{
		   logs.info("vertual Number contains 91");
		}
		else
		logs.info("vertual Number is not contains 91");
	}
	
	
	public void verifyContactforNonPadid()
	{
		cbp.waitForElementVisible(contactNumber_VN, 30);
		logs.info(cbp.getText(contactNumber_VN));
		String actual = cbp.getText(contactNumber_VN);
		String exp="0";
		if(actual.contains(exp))
		{
			logs.info("Non paid contracts starts with 0");
		}
		else
			logs.info("Non paid contracts are not starting with 0");
	}
	
	
	public void clickMovieFilter()
	{
		cbp.click(movieFilter);
	}
	
	public void getSelectedScheduledate()
	{
	     String text = cbp.getText(selectdate); 
	     logs.info(text);
		 cbp.selectByFirstText(selectdate,text);
		 
		// logs.info(cbp.getText(Todaydate));
	}
	
	public void clickAutosearchMovie()
	{
		cbp.waitForElementVisible(autosugmovie, 10);
		cbp.click(autosugmovie);
	}
	public void clickMovieName()
	{
		cbp.click(movieName);
	}
	
	public void clickandVerifyTicket() throws InterruptedException
	{
		//cbp.waitForElementClickable(tickets, 10);
		cbp.click(tickets);
		Thread.sleep(1000);
	    logs.info(cbp.getText(tickets));
	}
	public void clickandverifyReviews() throws InterruptedException
	{
		cbp.click(reviews);
		Thread.sleep(1000);
		//cbp.waitForElementClickable(reviews, 10);
		logs.info(cbp.getText(reviews));
	}
	
	public void clickandverifyvedios() throws InterruptedException
	{   
		cbp.click(vedios);
		Thread.sleep(1000);
		//cbp.waitForElementClickable(vedios, 10);
	    logs.info(cbp.getText(vedios));
	}
	
	public void clickandverifyTopstories() throws InterruptedException
	{
		cbp.click(topstories);
		Thread.sleep(1000);
		//cbp.waitForElementClickable(topstories, 10);
	    logs.info(cbp.getText(topstories));
	}
	
	public void clickandverifySynopsis() throws InterruptedException
	{   
		cbp.click(synopsis);
		Thread.sleep(1000);
		//cbp.waitForElementClickable(synopsis, 10);
		logs.info(cbp.getText(synopsis));
	}
	
	public void  clickDropdownandselect()
	{
		cbp.click(datedropdown);
	}
	
	public void clickBackArrowButton()
	{
		//cbp.waitForElementVisible(backarrowbtn, 10);
		cbp.click(backarrowbtn);
	}
	
	public void clickcontractName()
	{   
	    cbp.waitForElementVisible(flydining, 30);
		cbp.click(flydining);
	}
	
	public void clickAutozxysotes()
	{
		cbp.click(austozxystores);
	}
	
	public void clickswasthaStrore()
	{
		cbp.waitForElementVisible(contrcat, 30);
		cbp.scrollUpToTheElement(driver, contrcat);
		cbp.click(contrcat);
	}
	
	
	public void clickFirstAutosuggesion()
	{
		cbp.click(searchfriestautosugg);
	}
	
	public void verifyTouristAttraction()
	{
		cbp.scrollDown(driver);
		cbp.waitForElementVisible(TouristAttraction, 10);
		logs.info(cbp.getText(TouristAttraction));
	}
	
	public void clickITIsugg()
	{
		cbp.click(itisugg);
	}
	public void verifyFirstAutosugforcatgorey(String expected)
	{
		cbp.waitForElementVisible(firtautosug,10);
		logs.info(cbp.getText(firtautosug));
		String actual = cbp.getText(firtautosug);
		logs.info(expected);
        if(actual.contains(expected))
		{
		   logs.info("Both are same");
		}
		else
		logs.info("Both are not same");
	}

	public void verifyFirstAutosuggesionNameandPalce(String expected1,String expected2)
	{
		
		cbp.waitForElementVisible(searchName, 10);
		String actual1=cbp.getText(searchName);
		logs.info(actual1);
		cbp.waitForElementVisible(placeName, 10);
		 String actual2=cbp.getText(placeName);
		logs.info(actual2);
		logs.info(actual1 +  actual2);
		
		if(actual1.equalsIgnoreCase(expected1))
		{
			logs.info("both are same");
		}
		else 
		{
			logs.info("both are not same");
		   Assert.fail("both are not same");
		}
		
		if(actual2.equalsIgnoreCase(expected2))
		{
			logs.info("both are same");
		}
		else 
		{
			logs.info("both are not same");
		   Assert.fail("both are not same");
		}
		
		
		
	}
	public void clickfirstAutosug()
	{
		 List<WebElement> list = htlautosug;
		
		 for(int i=0;i<=list.size();i++)
		 {    
			 list.get(1).click();
			 logs.info(list.get(1).getText());
			 logs.info("Auto suuest List ::"+list.size());
			 break;
		 }
		
	}
	
	public void clickSearchfirstAutosug()
	{
		 List<WebElement> list = srchres;
		 if(!srchres.isEmpty())
		 {
			 for(int i=0;i<=list.size();i++)
			 {
				 list.get(1).click();
				 logs.info(list.get(1).getText());
				 logs.info("clicking on first Auto suggesion");
				 logs.info("Auto suuest List ::"+list.size());
				 break;
			 }
		 }
		 else
		 {
			 AssertJUnit.fail("Results are not displaying");
		 }
	}
	
	
	public String getscropllAutosug() throws InterruptedException
	{
		List<WebElement> list =resstatus;
		//if(resstatus==null||resstatus.size()<1)
		if(!resstatus.isEmpty())
		{
			for(int i=0;i<list.size();i++)
			{
				logs.info(list.get(i).getText());
				logs.info("results are displaying");
				cbp.scrollDown(driver);
				logs.info("scroll to the element");
				Thread.sleep(3000);
				logs.info(list.get(i).getText());
				
				logs.info("second set of results are displaying");
				
			}
		}
		else
		{
			AssertJUnit.fail();
			logs.info("results are not displaying ");
		}
		return null;
	}
	
	
	public void getFilterMovieResults()
	{
		List<WebElement> list = movieres;
		if(!movieres.isEmpty())
		{
			
			for(int i=0;i<list.size();i++)
			{ 
				logs.info(list.get(i).getText());
				logs.info("Movie results are displaying");
			}
		}
		else
		{
			logs.info("Movies results are not displaying");
		}
	}
	
	 
    public void getRecentSearcges()
    {
    	List<WebElement>list = recentsearch;
    	logs.info("Auto Suggest List ::"+list.size());
    	for(int i=0;i<list.size();i++)
    	{
    				if(!recentsearch.isEmpty())
    				{
    					logs.info(list.get(i).getText());
    					logs.info("Recent searches are displaying");
    				}
    				else
    				{
    					logs.info("Recent searches are  not displaying");
    				}
    	}
    }
	
	public String getAutosuggwithOpenNow() throws InterruptedException
	{
		List<WebElement> list = resstatus;
		if(!resstatus.isEmpty())
		{
			for(int i=0;i<list.size();i++)
			{
				if(list.contains("Open now"));
				{
					logs.info(list.get(i).getText());
					logs.info("results are displaying");
					cbp.scrollDown(driver);
					logs.info("scroll to the element");
					Thread.sleep(3000);
					logs.info(list.get(i).getText());
				}
				
			}
		}
		else
		{
			AssertJUnit.fail();
			logs.info("Results are not displaying");
		}
		
		return null;
		
	}
	
	public void verifySortByLanguage()
	{
		
		cbp.actionClick(langTamil, driver);
		cbp.actionClick(langEng, driver);
		cbp.actionClick(langhindi, driver);
		cbp.actionClick(langmalayalam, driver);
		//cbp.actionClick(langtelugu, driver);
		//cbp.actionClick(langkanada, driver);
		//cbp.actionClick(langGujarathi, driver);
		cbp.click(applybtn);
	}
	
	public void verifyMovieTabs() {
	 List<WebElement> list = movieTabs;
	 
	for(int i=0;i<list.size();i++)
	{
		list.get(i).click();
       logs.info("tabs are clicking one by one");
	}
}
}
	

