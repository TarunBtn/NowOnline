package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.HomePageAdmin;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.UlogoAllassignmentsPage;
import com.nowonline.qa.util.TestUtil;

public class UlogoAllassignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllassignmentsPage uLogoAllassignmentsPage;
	TestUtil testUtil;
	
	public UlogoAllassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllassignmentsPage=new UlogoAllassignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickAllassignmentsTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoAllassignmentsPage()throws Exception {
		uLogoAllassignmentsPage.enterSearchCompany("QA EngineerEight");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickResetCompany();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickFilterDropDown();
		testUtil.testWaitTwo();
		uLogoAllassignmentsPage.selectFilterDropDown();
		testUtil.testWaitEight();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
