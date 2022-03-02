package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericutility.WebDriverUtility;

public class CreateNewContactsPage extends WebDriverUtility {
	WebDriver driver;
	//declaration
	
	@FindBy(name="lastname")
	private WebElement contNameEdt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	//Initialization
	public CreateNewContactsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//add getters
	public WebElement getContNameEdt() {
		return contNameEdt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	 
	  @FindBy(xpath="//img[@alt='Select']")
		private WebElement clickplus;
	
	//Business liberry	
	public void createNewContacts(String contactLastName) {
		contNameEdt.sendKeys(contactLastName);
		saveBtn.click();
	}
	
	public void createNewContacts(String contactLastName,String orgName) {
		contNameEdt.sendKeys(contactLastName);
		clickplus.click();
		switchToWindow(driver, "Accounts");
		 CreateNewOrganization cno=new CreateNewOrganization(driver);
		 cno.getSearchBox().sendKeys(orgName);
		 cno.getSearchBtn().click();
		 WebElement wb= driver.findElement(By.xpath("//a[text()='"+orgName+"']"));
		   switchToWindow(driver, "Contacts");
		   saveBtn.click();
	}

}
