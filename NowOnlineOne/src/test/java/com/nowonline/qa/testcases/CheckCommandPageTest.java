package com.nowonline.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.AddCommandPage;
import com.nowonline.qa.pages.CheckCommandPage;
import com.nowonline.qa.pages.CompleteAssignment;
import com.nowonline.qa.pages.HomePage;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.MyAssignmentsPage;
import com.nowonline.qa.util.TestUtil;

public class CheckCommandPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	
	public CheckCommandPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFour();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitFour();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitFour();
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitFour();
		addCommandPage.clickUploadFile();
		testUtil.testWaitFour();
							
	}
	
	@Test(priority=1)
	public void checkCommandPageTitleTest() {
		String title=checkCommandPage.checkCommandPageTitle();
		Assert.assertEquals(title, "Mijn opdrachten - Younited®");
	}
	
	@Test(priority=2)
	public void checkCommandPageTest()throws Exception {
		completeAssignment=checkCommandPage.clickFillInComplete();
		testUtil.testWaitFour();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
