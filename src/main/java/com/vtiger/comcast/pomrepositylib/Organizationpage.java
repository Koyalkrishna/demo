package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	WebDriver driver;
	
	
	//Declaration	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgImg;

	
    //Initialization
	public  Organizationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
    }
	//Getter
	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrganization;
		
	public WebElement getCreateOrganizationplusLInk() {
		return createOrganization;
	}
	
	//Business library
	public void clickOnOrgImg() {
		createOrgImg.click();
	}
	
	
}