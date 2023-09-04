package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.HomePageAdmin;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.util.TestUtil;

public class UlogoMydashboardPageTest extends TestBase{

	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	
	public UlogoMydashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMydashboardTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitTwo();
		
	}
	
	@Test
	public void myDashboard() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
}
