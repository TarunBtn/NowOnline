package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class CheckCommandPage extends TestBase{
	
	//Page factory or Object Repository
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/div/div[2]/button")
	WebElement fillInComplete;
		
	//Initialization
	public CheckCommandPage(){
		PageFactory.initElements(Driver, this);
	}
		
	//Action
	public String checkCommandPageTitle() {
		return Driver.getTitle();
	}
	
	public CompleteAssignment clickFillInComplete() {
		fillInComplete.click();
		return new CompleteAssignment();
	}

}
