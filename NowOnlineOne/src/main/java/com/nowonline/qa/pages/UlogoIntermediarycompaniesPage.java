package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class UlogoIntermediarycompaniesPage extends TestBase{
	//Pagefactory OR Object Repository
		@FindBy(id="filter-input")
		WebElement searchCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[1]/div[2]/div/div/input")
		WebElement cancelSearch;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/div[1]/a")
		WebElement addNewCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/section/div/div/form/div[1]/div[2]/div/div[1]/input")
		WebElement companyName;
		
		@FindBy(xpath="/html/body/div[1]/main/div/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
		WebElement selectCompanyTooltip;
		
		@FindBy(id="websitelink")
		WebElement enterWebsite;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[15]/div/button")
		WebElement clickSaveBtn;
		
		//Initialization
		public UlogoIntermediarycompaniesPage() {
			PageFactory.initElements(Driver, this);
		}

		//Actions
		public void enterSearchCompany(String value) {
			searchCompany.sendKeys(value);
		}
		
		public void clickSearchCompany() {
			searchCompany.click();			
		}
		
		public void clickCancelSearch() {	
			cancelSearch.click();	
		}
		
		public void clickAddNewCompany() {
			addNewCompany.click();
		}
		
		public void enterCompanyName(String value) {
			companyName.sendKeys(value);
		}
		
		public void selectCompanyTooltip() {
			selectCompanyTooltip.click();
		}
			
		public void enterWebsite(String value) {
			enterWebsite.sendKeys(value);
		}
		
		public void clearWebsiteValue() {
			enterWebsite.clear();
		}
		
		public void clickSaveBtn() {
			clickSaveBtn.click();
		}

}
