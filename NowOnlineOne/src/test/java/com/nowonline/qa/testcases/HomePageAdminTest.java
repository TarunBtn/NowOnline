package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.AssignmentsPageAdmin;
import com.nowonline.qa.pages.HomePageAdmin;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.util.TestUtil;

public class HomePageAdminTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public HomePageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();		
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
	}
	
	@Test
	public void test()throws Exception {
		testUtil.testWaitEight();
		assignmentsPageAdmin=homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
