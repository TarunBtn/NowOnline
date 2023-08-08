package com.nowonline.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.HomePage;
import com.nowonline.qa.pages.HomePageFree;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.MyAssignmentsPage;
import com.nowonline.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	HomePageFree homePageFree;
	MyAssignmentsPage myAssignmentsPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		homePageFree=new HomePageFree();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		testUtil.testWaitEight();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();
				
	}
	
	@Test(priority=1)
	public void homePageTitleTest()throws Exception {
		String title=homePage.verifyHomePageTitle();
		testUtil.testWaitFour();
		Assert.assertEquals(title, "Younited®");
		testUtil.testWaitFour();
	}
	
	@Test(priority=2)
	public void verifyImageLogoTest()throws Exception {
		Boolean logo=homePage.verifyImageLogo();
		testUtil.testWaitFour();
		Assert.assertTrue(logo);
		testUtil.testWaitFour();
	}
	
	@Test(priority=3)
	public void clickMyAssignmentsLinkTest()throws Exception {
		myAssignmentsPage=homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
