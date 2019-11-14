package com.justdial.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.lifeco.generic.CommonBasePage;

import junit.framework.Assert;
import utilities.CommonUtilities;
import utilities.LoggerHelper;
import utilities.WindowHandle;

public class FreeListingPage {
	WebDriver driver;
	CommonBasePage cbp;
	public Logger logs = LoggerHelper.getLogger(FreeListingPage.class); // check Imports properly
	
	public FreeListingPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
	  cbp=new CommonBasePage(driver);
	}
	
	@FindBy(id="txt_company")
	private WebElement businessName;
	
	@FindBy(id="city")
	private WebElement cityClick;
	
	@FindBy(id="txt_auto")
	private WebElement cityNameOrAreaName;
	
	@FindBy(xpath="//ul[@id='citysugg']/li/a/b")
	private WebElement firstCityAutoSugg;
	
	@FindBy(xpath="//ul[@id='areasugg']/li/a/b")
	private WebElement firstAreaAutoSugg;
	
	@FindBy(id="txt_contact_person")
	private WebElement contactPerson;
	
	@FindBy(id="fmb0")
	private WebElement mobileNum;
	
	@FindBy(id="txt_landline")
	private WebElement enterLandLine;
	
	@FindBy(id="area")
	private WebElement area;
	
	@FindBy(id="pin")
	private WebElement selectPin;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//span[text()='Create New Listing']")
	private WebElement createNewListingBtn;
	
	@FindBy(xpath="//a[@class='spvndrlnk']")
	private WebElement firstAutoSuggList;
	
	@FindBy(xpath="//span[text()='Edit this listing']")
	private WebElement editListingBtn;
	
	@FindBy(xpath="//a[text()=' I am a user ']")
	private WebElement iAmUser;
	
	@FindBy(id="usrname")
	private WebElement userName;
	
	@FindBy(id="usrmob")
	private WebElement userMobile;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginArrow;
	
	@FindBy(xpath="//span[text()='Upload Photos']")
	private WebElement uploadPhoto;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement photoFilePath;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement submit;
	
	@FindBy(xpath="//div[text()='report an issue']/following-sibling::div")
	private WebElement reportIssue;
	
	@FindBy(xpath="//span[@class='font13 cardtitle']")
	private WebElement firstRestaurantOption;
	
	@FindBy(xpath="//li[text()='...more']")
	private WebElement moreBtn;
	
	@FindBy(xpath="//input[@id='check1']/following-sibling::span")
	private WebElement phNumCheckBox;
	
	@FindBy(xpath="//input[@id='check2']/following-sibling::span")
	private WebElement addressCheckBox;
	
	@FindBy(xpath="//input[@id='check3']/following-sibling::span")
	private WebElement thisPlaceCloseDown;
	
	@FindBy(xpath="//textarea[@class='addcomments']")
	private WebElement addtionalComments;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitIssue;
	
	public void clickSubmitIssue()
	{
		cbp.click(submitIssue);
	}
	
	public void enterAddtionalComments(String comment)
	{
		cbp.sendKeys(addtionalComments, comment);
	}
	public void clickPhoneNumberCheckBox()
	{
		cbp.click(phNumCheckBox);
	}
	
	public void clickAddressCheckBox()
	{
		cbp.click(addressCheckBox);
	}
	
	public void clickThisPlaceCloseDownCheckBox()
	{
		cbp.click(thisPlaceCloseDown);
	}
	public void moveScrolltoMoreBtn()
	{
		cbp.scrollUpToTheElement(driver, moreBtn);
	}
	
	public void clickFirstRestaurantOption()
	{
		cbp.click(firstRestaurantOption);
	}
	public void clickOnReportIssue()
	{
		cbp.click(reportIssue);
	}
	
	public void clickSubmit()
	{
		cbp.click(submit);
	}
	
	public void enterPhotoFilePath(String imagePath)
	{
		cbp.sendKeys(photoFilePath, imagePath);
	}
	public void clickUploadPhoto()
	{
		cbp.click(uploadPhoto);
	}
	
	public void clickLoginArrow()
	{
		cbp.click(loginArrow);
	}
	
	public void enterUserMobile(String mobnum)
	{
		cbp.sendKeys(userMobile, mobnum);
	}
	public void enterUserName(String uname)
	{
		cbp.sendKeys(this.userName, uname);
	}
	
	public void clickIAmAuser()
	{
		WindowHandle wh=new WindowHandle(driver);
		wh.browserForward();
		cbp.click(iAmUser);
	}
	
	public void clickOnEditListing() throws InterruptedException
	{
		cbp.click(editListingBtn);
	}
	
	public void clickFirstAutoSuggListing()
	{
		cbp.click(firstAutoSuggList);
	}
	
	public void clickCreateNewListingBtn()
	{
		cbp.click(createNewListingBtn);
	}
	
	public void clickContinueBtn()
	{
		cbp.click(continueBtn);
	}
	
	public WebElement getElementToSelectPin()
	{
		return selectPin;
	}
	public void clickArea()
	{
		cbp.click(area);
	}
	
	public void enterLandLineNumber(String lnum)
	{
		cbp.sendKeys(enterLandLine, lnum);
	}
	public void enterMobileNumber(String mnum)
	{
		cbp.sendKeys(mobileNum, mnum);
	}
	
	public void enterContactPerson(String person)
	{
		cbp.sendKeys(contactPerson, person);
	}
	
	public void getFirstCityAutoSugg()
	{
		if(firstCityAutoSugg.getText().isEmpty()||firstCityAutoSugg.getText().equals("null")|| firstCityAutoSugg.getText().equals(""))
		{
			logs.info(" City ======= No Suggestions found ");
			Assert.fail();
		}
		else
		{
			cbp.click(firstCityAutoSugg);
		}
	}
	
	public void getFirstAreaAutoSugg()
	{
		if(firstAreaAutoSugg.getText().isEmpty()||firstAreaAutoSugg.getText().equals("null")|| firstAreaAutoSugg.getText().equals(""))
		{
			logs.info(" Area ======= No Suggestions found ");
			Assert.fail();
		}
		else
		{
			cbp.click(firstAreaAutoSugg);
		}
	}
	
	
	public void enterCityNameOrAreaName(String cityName)
	{
		cbp.sendKeys(this.cityNameOrAreaName, cityName);
	}
	
	public void clickOnCity()
	{
		cbp.click(cityClick);
	}
	
	public void enterBusinessName(String bName)
	{
		cbp.sendKeys(businessName, bName);
	}
	
	
	
	
}
