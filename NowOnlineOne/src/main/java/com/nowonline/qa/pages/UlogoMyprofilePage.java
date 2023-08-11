package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class UlogoMyprofilePage extends TestBase{
	//Pagefactory OR Object Repository
		@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
		WebElement generalTab;
		
		@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[3]/div/div/a")
		WebElement changeMyGeneralInformation;
		
		@FindBy(xpath="//*[@id=\"general-profile-edit\"]/div/form/div[8]/div/a")
		WebElement changeMyGeneralInformationCancel;
		
		@FindBy(xpath="//*[@id=\"profile-detailed\"]/div/div[1]/div[4]/div/div/a")
		WebElement fillInCompany;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[22]/div/a")
		WebElement fillInCompanyCancel;
		
		@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[2]")
		WebElement skillsTab;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[1]/input")
		WebElement enterSkillsValue;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/a[3]/div[2]/span")
		WebElement selectSkillsValue;
		
		@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[1]/div/form/div/button")
		WebElement saveAdditionalSkills;
		
		@FindBy(xpath="//*[@id=\"skills\"]/div/div/div/div[2]/ul/li[16]/div/a/span")
		WebElement clickRemoveSkills;
		
		@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[2]/button[1]")
		WebElement deleteSkills;
		
		//Initialization
		public UlogoMyprofilePage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void clickGeneralTab() {
			generalTab.click();
		}
		
		public void clickChangeMyGeneralInformation() {
			changeMyGeneralInformation.click();
		}
		
		public void clickChangeMyGeneralInformationCancel() {
			changeMyGeneralInformationCancel.click();
		}
		
		public void clickFillInCompany() {
			fillInCompany.click();
		}
		
		public void clickFillInCompanyCancel() {
			fillInCompanyCancel.click();
		}
		
		public void clickSkillsTab() {
			skillsTab.click();
		}
		
		public void enterSkillsValue(String value) {
			enterSkillsValue.sendKeys(value);
		}
		
		public void selectSkillsValue() {
			selectSkillsValue.click();
		}
		
		public void clickSaveAdditionalSkills() {
			saveAdditionalSkills.click();
		}
		
		public void clickRemoveSkills() {
			clickRemoveSkills.click();
		}
		
		public void clickDeleteSkills() {
			deleteSkills.click();
		}

}
