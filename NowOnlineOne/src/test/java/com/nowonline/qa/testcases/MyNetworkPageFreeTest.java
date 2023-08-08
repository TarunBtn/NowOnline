package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.CommunityPageFree;
import com.nowonline.qa.pages.HomePageFree;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.MyNetworkPageFree;
import com.nowonline.qa.util.TestUtil;

public class MyNetworkPageFreeTest extends TestBase{

	LoginPage loginPage;
	HomePageFree homePageFree;
	CommunityPageFree communityPageFree;
	MyNetworkPageFree myNetworkPageFree;
	TestUtil testUtil;
	
	
	public MyNetworkPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		communityPageFree=new CommunityPageFree();
		myNetworkPageFree=new MyNetworkPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEight();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickCommunityTab();
		testUtil.testWaitFour();
		communityPageFree.clickMyNetworkBtn();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void myNetworkPageFreeTest()throws Exception {
		myNetworkPageFree.clickMyNetworkTab();
		testUtil.testWaitFour();
		myNetworkPageFree.clickMyRequestsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myNetworkPageFree.clickSuggestionsForYouTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myNetworkPageFree.clickAreaOfInterest();
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
}
