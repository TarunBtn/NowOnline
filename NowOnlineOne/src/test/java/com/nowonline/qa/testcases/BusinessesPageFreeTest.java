package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.BusinessesPageFree;
import com.nowonline.qa.pages.HomePageFree;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.util.TestUtil;

public class BusinessesPageFreeTest extends TestBase{

	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;
	
	public BusinessesPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		businessesPageFree=new BusinessesPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEight();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickBusinessesTab();
		testUtil.testWaitFour();
				
	}
	
	@Test
	public void businessesPageFree()throws Exception {
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		businessesPageFree.sortingZtoA();
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationZtoA();
		testUtil.testWaitEight();
		businessesPageFree.sortingAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}
}
