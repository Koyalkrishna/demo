package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.autodesk.genericutility.WebDriverUtility;

public class CreateNewOrganization extends WebDriverUtility {
	
	@FindBy(name="accountname")
	private WebElement orgNameEdt;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	public CreateNewOrganization(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	@FindBy(name="search")
	private WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
}
	@FindBy(id="search_txt")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public void createNewOrg(String orgName) {
		orgNameEdt.sendKeys(orgName);
		saveBtn.click();
	}
	public void organizationDetailWithIndustryAndType(String orgName,String industryType,String type) {
		orgNameEdt.sendKeys(orgName);
	    selectDropDown(industryDropDown, industryType);
	    selectDropDown(typeDropDown, type);
		saveBtn.click();
	}
}
