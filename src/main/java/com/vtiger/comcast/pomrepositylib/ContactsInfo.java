package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfo {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactVerify;
	
	
	public void ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactVerify() {
		return contactVerify;
	}
	//BL
	public String checkContacts() {
		return(contactVerify.getText());
	}
}
