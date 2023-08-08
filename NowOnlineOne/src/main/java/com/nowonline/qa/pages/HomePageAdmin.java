package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class HomePageAdmin extends TestBase{
	
	//Page factory OR Object repository
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/span")
	WebElement assignmentsTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	WebElement communityTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	WebElement matchTab;
	
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	//Initialization
	public HomePageAdmin() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public AssignmentsPageAdmin clickAssignmentsTab() {
		assignmentsTab.click();
		return new AssignmentsPageAdmin();
	}
	
	public CommunityPageAdmin clickCommunityPageAdmin() {
		communityTab.click();
		return new CommunityPageAdmin();
	}
	
	public MatchPageAdmin clickMatchTab() {
		matchTab.click();
		
		return new MatchPageAdmin();
	}
	
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	

}
