package com.nowonline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nowonline.qa.base.TestBase;

public class MatchPageAdmin extends TestBase{
	
	//Page factory or Object repository
	@FindBy(id="filter-search-input")
	WebElement valueFilter;
		
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div/span")
	WebElement clickCancelValueFilter;
		
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[1]")
	WebElement clickAssignmentDropDown;
		
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[3]/ul/li[7]/span/span")
	WebElement selectAssignmentValue;
	
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/span")
	WebElement cancelAssignment;
	
	@FindBy(xpath="//*[@id=\"dropdown-beschikbaar\"]/button")
	WebElement availabilityDropDown;
	
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[2]/label")
	WebElement selectOnlyAvailable;
	
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[3]/label")
	WebElement selectNotAvailable;
	
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[1]/label")
	WebElement selectEverything;
	
	@FindBy(id="dropdown-location")
	WebElement location;
	
	@FindBy(id="map")
	WebElement enterLocation;
	
	@FindBy(id="dropdown-location-and-distance-apply")
	WebElement applyFilter;
	
	@FindBy(id="dropdown-location-and-distance-reset")
	WebElement resetFilter;
	
	@FindBy(id="dropdown-location-and-distance-cancel")
	WebElement clickCancel;
	
	@FindBy(id="dropdown-work-btn")
	WebElement workThinkingLevelDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-work-thinking-level\"]/div/form/div[4]/label")
	WebElement selectWorkThinkingLevel;
	
	@FindBy(id="dropdown-uren-btn")
	WebElement hours;
	
	@FindBy(xpath="//*[@id=\"dropdown-uren\"]/div/form/div[1]/div/div[2]/div[2]/div[1]")
	WebElement selectHours;
	
	@FindBy(id="dropdown-uren-apply")
	WebElement clickApplyFilterHours;
	
	@FindBy(id="dropdown-uren-reset")
	WebElement resetFilterHours;
	
	@FindBy(id="dropdown-uren-cancel")
	WebElement cancelHours;
	
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/button")
	WebElement descipline;
	
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/div/form/div[8]/label")
	WebElement selectDescipline;
	
	@FindBy(id="dropdown-skills-btn")
	WebElement skill;
	
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[2]/div[6]/div/form/div[1]/div/div/div[1]/input")
	WebElement enterValueSkill;
	
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[2]/div[6]/div/form/div[1]/div/div/div[2]/a/div[2]/span/span")
	WebElement selectTooltipSkill;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/button")
	WebElement applyFilterSkill;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/a[2]")
	WebElement resetFilterSkill;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/a[1]")
	WebElement cancelSkill;
	
	@FindBy(xpath="//*[@id=\"toggle-saved\"]/button")
	WebElement stored;
	
	
	
	//Initialization
	public MatchPageAdmin() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickValueFilter() {
		valueFilter.click();
	}
	
	public void enterValueFilter(String value) {
		valueFilter.sendKeys(value);
	}
	
	public void clickCancelValueFilter() {
		clickCancelValueFilter.click();
	}
	
	public void clickAssignmentDropDown() {
		clickAssignmentDropDown.click();
	}
	
	public void selectAssignmentValue() {
		selectAssignmentValue.click();
	}
	
	public void clickCancelAssignmentValue() {
		cancelAssignment.click();
	}
	
	public void clickAvailabilityDropDown() {
		availabilityDropDown.click();
	}
	
	public void selectOnlyAvailable() {
		selectOnlyAvailable.click();
	}
	
	public void selectNotAvailable() {
		selectNotAvailable.click();
	}
	
	public void selectEverything() {
		selectEverything.click();
	}
	
	public void clickLocationDropDown() {
		location.click();
	}
	
	public void enterLocationValue(String value) {
		enterLocation.sendKeys(value);
	}
	
	public void clickApplyFilterLocation() {
		applyFilter.click();
	}
	
	public void resetFilterLocation() {
		resetFilter.click();
	}
	
	public void clickCancelLocation() {
		clickCancel.click();
	}
	
	public void clickWorkThinkingLevelDropDown() {
		workThinkingLevelDropDown.click();
	}
		
	public void selectWorkThinking() {
		selectWorkThinkingLevel.click();
	}
		
	public void clickHoursDropDown() {
		hours.click();	
	}
	
	public void selectHours() {
		selectHours.click();
	}
	
	public void clickApplyFilterHours() {
		clickApplyFilterHours.click();
	}
	
	public void clickResetFilterHours() {
		resetFilterHours.click();
	}
	
	public void clickCancelHours() {
		cancelHours.click();
	}
	
	public void clickDesciplineDropDown() {
		descipline.click();
	}
	
	public void selectDescipline() {
		selectDescipline.click();
	}
	
	public void clickSkillTab() {
		skill.click();
	}
	
	public void clickEnterValueSkill() {
		enterValueSkill.click();
	}
	
	public void enterValueSkill(String value) {
		enterValueSkill.sendKeys(value);
	}
	
	public void selectTooltipSkill() {
		selectTooltipSkill.click();
	}
	
	public void clickApplyFilterSkill() {
		applyFilterSkill.click();
	}
	
	public void clickResetFilterSkill() {
		resetFilterSkill.click();
	}
	
	public void clickCancelSkill() {
		cancelSkill.click();
	}
	
	public void clickStored() {
		stored.click();
	}
	
	

}
