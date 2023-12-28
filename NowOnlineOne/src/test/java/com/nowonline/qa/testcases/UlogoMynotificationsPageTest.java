package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.HomePageAdmin;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.UlogoMynotificationsPage;
import com.nowonline.qa.util.TestUtil;

public class UlogoMynotificationsPageTest extends TestBase{

	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMynotificationsPage uLogoMynotificationsPage;
	TestUtil testUtil;
	
	public UlogoMynotificationsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMynotificationsPage=new UlogoMynotificationsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitTwo();
		//homePageAdmin.clickMynotificationsTab();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void myNotificationsPage()throws Exception {
		//uLogoMynotificationsPage.ClickToOpenMail();
		//testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
}
