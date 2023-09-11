package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class UlogoUsermanagementPage extends TestBase{
	
	//Pagefactory OR Object Repository
		@FindBy(xpath="(//input[@id='filter-input'])[1]")
		WebElement searchName;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/button")
		WebElement resetSearchName;
		
		@FindBy(xpath="(//input[@id='filter-input'])[2]")
		WebElement emailAddress;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/button")
		WebElement resetEmailAddress;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div/div[1]/div[3]/div/label")
		WebElement exactSearch;
		
		@FindBy(id="initial-sort-select")
		WebElement clickRoleDropDown;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[2]")
		WebElement selectRole;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
		WebElement resetRole;
		
		@FindBy(xpath="(//select[@id='initial-sort-select'])[2]")
		WebElement clickEverythingDropDown;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
		WebElement selectEverything;
		
		@FindBy(xpath="(//option[@value='true'])[1]")
		WebElement selectOnlyAvailable;
		
		@FindBy(id="dropdown-vakgebied-btn")
		WebElement clickDesciplineDropDown;
		
		@FindBy(xpath="//*[@id=\"dropdown-vakgebied-profile\"]/div/form/div[7]/label")
		WebElement selectDescipline;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div/div[2]/div[3]/div/label")
		WebElement elevatorPitch;
		
		
		//Initialization
		public UlogoUsermanagementPage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void enterSearchName(String value) {
			searchName.sendKeys(value);
		}
		
		public void clickResetSearchName() {
			resetSearchName.click();
		}
		
		public void enterEmailAddress(String value) {
			emailAddress.sendKeys(value);
		}
		
		public void clickExactSearch() {
			exactSearch.click();
		}
		
		public void clickResetEmailAddress() {
			resetEmailAddress.click();
		}
		
		public void clickRoleDropDown() {
			clickRoleDropDown.click();
		}
		
		public void selectRole() {
			selectRole.click();
		}
		
		public void selectResetRole() {
			resetRole.click();
		}
		
		public void clickEverythingDropDown() {
			clickEverythingDropDown.click();
		}
		
		public void selectOnlyAvailable() {
			selectOnlyAvailable.click();
		}
		
		public void selectEverything() {
			selectEverything.click();
		}
		
		public void clickDesciplineDropDown() {
			clickDesciplineDropDown.click();
		}
		
		public void selectDescipline() {
			selectDescipline.click();
		}
		
		public void clickElevatorPitch() {
			elevatorPitch.click();
		}

}
