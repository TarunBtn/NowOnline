package com.nowonline.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
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

public class CompleteAssignmentTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	public CompleteAssignmentTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();				
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitEight();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();		
		myAssignmentsPage=homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
		myAssignmentsPage=new MyAssignmentsPage();	
		testUtil.testWaitFour();
		addCommandPage=new AddCommandPage();
		addCommandPage=myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitFour();			
		checkCommandPage=new CheckCommandPage();		
		completeAssignment=new CompleteAssignment();					
		testUtil.testWaitFour();
		addCommandPage.clickChooseFile();		
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitFour();
		addCommandPage.clickUploadFile();
		testUtil.testWaitFour();
		checkCommandPage.clickFillInComplete();
		testUtil.testWaitFour();
	}
	
	@Test
	public void completeAssignmentTest()throws Exception {
		completeAssignment.selectCompany();
		testUtil.testWaitFour();
		completeAssignment.selectSectorDropDown();
		testUtil.testWaitFour();
		completeAssignment.selectWorkLocation();
		testUtil.testWaitFour();
		try {
			Driver.findElement(By.id("startdatumopdracht")).sendKeys("01-06-2023");
				
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
	
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitEleven();
		//Generate description
		completeAssignment.clickGenerateDescription();
		testUtil.testWaitEleven();
		testUtil.testWaitEleven();
		completeAssignment.clickUseThisText();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Select start date
		completeAssignment.selectStartDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectStartMonth();
		testUtil.testWaitTwo();
		completeAssignment.selectStartMonth();
		testUtil.testWaitTwo();
		completeAssignment.selectStartDate();
		testUtil.testWaitFour();
		//Select end date
		completeAssignment.selectEndDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		completeAssignment.selectEndDate();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//NumberofHours
		completeAssignment.selectNumberOfHours();
		testUtil.testWaitFour();
		//selectWorkingThinkingLevel
		completeAssignment.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		//Select FieldOfExpertise
		completeAssignment.clickFieldOfExpertise();
		testUtil.testWaitFour();
		completeAssignment.selectFieldOfExpertise();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//completeAssignment.clickSaveButton();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
