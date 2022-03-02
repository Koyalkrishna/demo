package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericutility.ExcelUtility;
import com.crm.autodesk.genericutility.FileUtility;

public class Login {
	//declaration
	@FindBy(name="user_name")
	 private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	 private WebElement userpasswordEdt;
	
	@FindBy(id="submitButton")
	 private WebElement loginBtn;
	
	//Initialization
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Rule 4: Added getters
	public WebElement getUserNameEdt() { 
		return userNameEdt;
	}
	public WebElement getUserPasswordEdt() {
		return userpasswordEdt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//business library
	public void loginToApp(String userName,String password) {
		userNameEdt.sendKeys(userName);
		userpasswordEdt.sendKeys(password);
		loginBtn.click();
	}
	
	
//		public void LoginToApp(String url,String username,String password) {
//			FileUtility fLib=new FileUtility();
//			ExcelUtility eLib=new ExcelUtility();
//			driver.manage().window().maximize();
//			driver.get(url);
//			userNameEdt.sendKeys(username);
//			userpasswordEdt.sendKeys(password);
//			loginBtn.click();
//		}
	}	
	


