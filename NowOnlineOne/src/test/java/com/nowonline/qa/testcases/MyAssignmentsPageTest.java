package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.AddCommandPage;
import com.nowonline.qa.pages.HomePage;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.MyAssignmentsPage;
import com.nowonline.qa.util.TestUtil;

public class MyAssignmentsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	//CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();	
		testUtil=new TestUtil();		
		loginPage=new LoginPage();		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitEight();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();
		myAssignmentsPage=new MyAssignmentsPage();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
		addCommandPage=new AddCommandPage();
		//checkCommandPage=new CheckCommandPage();		
													
	}
	
	@Test
	public void myAssignmentsPageTest()throws Exception {
		myAssignmentsPage.enterValueInFilter();
		testUtil.testWaitFour();
		myAssignmentsPage.clickResetFilter();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectCompany();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
