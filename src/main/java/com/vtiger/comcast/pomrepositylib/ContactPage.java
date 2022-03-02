package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver;

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement clickContactImg;
	
	public  ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getClickContactImg() {
		return clickContactImg;
	}
	
	//BL
	public void clickContactImg() {
		clickContactImg.click();
	}
}
