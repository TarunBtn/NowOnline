package com.nowonline.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nowonline.qa.base.TestBase;
import com.nowonline.qa.pages.HomePageAdmin;
import com.nowonline.qa.pages.LoginPage;
import com.nowonline.qa.pages.UlogoMyprofilePage;
import com.nowonline.qa.util.TestUtil;


public class UlogoMyprofilePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyprofilePage uLogoMyprofilePage;
	TestUtil testUtil;
	
	public UlogoMyprofilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyprofilePage=new UlogoMyprofilePage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyProfileTab();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void UlogoMyProfilePage()throws Exception {
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();		
		uLogoMyprofilePage.clickChangeMyGeneralInformation();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickChangeMyGeneralInformationCancel();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickFillInCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickFillInCompanyCancel();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickSkillsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Enter skill value
		uLogoMyprofilePage.enterSkillsValue("Account");
		testUtil.testWaitEight();
		uLogoMyprofilePage.selectSkillsValue();
		testUtil.testWaitFour();
		//Save additional skills
		uLogoMyprofilePage.clickSaveAdditionalSkills();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Remove skills
		uLogoMyprofilePage.clickRemoveSkills();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteSkills();
		testUtil.testWaitFour();
		//Work experience
		uLogoMyprofilePage.clickWorkExperienceTab();
		testUtil.testWaitEight();
		uLogoMyprofilePage.clickAddWorkExperience();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFunction("Quality Assurance");
		testUtil.testWaitFour();
		uLogoMyprofilePage.enterCompany("TCS");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescription("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartDateCalender();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartDate();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEndDateCalender();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEndDate();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterProfile("Quality Assurance Engineer");
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectProfile();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickSaveBtn();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEditWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.deleteWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteWorkExperience();
		testUtil.testWaitFour();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
