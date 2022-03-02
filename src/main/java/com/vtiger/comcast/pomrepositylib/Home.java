package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericutility.WebDriverUtility;

public class Home extends WebDriverUtility{
	WebDriver driver;
	@FindBy(linkText ="Calendar")
	private WebElement calanderLink;
	
	@FindBy(linkText ="Leads")
	private WebElement leadsLink;
	
	
	@FindBy(linkText ="Organizations")
	private WebElement organisationLink;
	
	@FindBy(linkText ="Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText ="Products")
	private WebElement ProductsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	//Initialization
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCalanderLink() {
		return calanderLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganisationLink() {
		return organisationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}
	public WebElement getSignoutLink() {
		return signoutLink;
	}
	
//Business Libery 
	public void clickContact()
	{
		contactsLink.click();
	}
	public void clickOnOrgLink() {
		organisationLink.click();
	}
	public void clickOnProductsLnk() {
		 ProductsLink.click();
	}	 
	public void signout(WebDriver driver) {
		mouseOverOnElement(driver, administratorImg);
	}
	
	public void logout() {
		Actions act=new Actions(driver);
		act.moveToElement(administratorImg).perform();
		signoutLink.click();
	}

}