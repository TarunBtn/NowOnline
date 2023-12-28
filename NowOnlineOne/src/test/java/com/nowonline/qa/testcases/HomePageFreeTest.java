package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.AssignmentsPageFree;
import com.nowonline.qa.pages.HomePageFree;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.util.TestUtil;

public class HomePageFreeTest extends TestBase{
	
	LoginPage loginPage;
	HomePageFree homePageFree;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public HomePageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		assignmentsPageFree=new AssignmentsPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEight();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void clickAssignmentLinkTest()throws Exception {
		testUtil.testWaitEight();
		assignmentsPageFree=homePageFree.clickAssignmentsLink();
		testUtil.testWaitFour();
			
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
