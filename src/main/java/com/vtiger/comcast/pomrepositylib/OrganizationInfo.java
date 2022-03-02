package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfo {
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement orgHeaderText;

	public void Organizations(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgHeaderText() {
		return orgHeaderText;
	}
	
	public String grtOrgInfo()
	{
		return(orgHeaderText.getText());
	}
	//BL
	public void checkOrg() {
		String checkOrg = orgHeaderText.getText();
	}
	
	
	
	
	

}
