package com.crm.autodesk.contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.autodesk.genericutility.ExcelUtility;
import com.crm.autodesk.genericutility.FileUtility;
import com.crm.autodesk.genericutility.JavaUtility;
import com.crm.autodesk.genericutility.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.ContactPage;
import com.vtiger.comcast.pomrepositylib.ContactsInfo;
import com.vtiger.comcast.pomrepositylib.CreateNewContactsPage;
import com.vtiger.comcast.pomrepositylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Organizationpage;

public class CreateContactWithOrganization extends com.crm.autodesk.genericutility.BaseClass{
	@Test
public void createContactWithOrganization()throws Throwable {

		int ranDomNum =jLib.getRandomNumber();

		//read test data from Excel File
		String orgName = eLib.getDataFromExcel("Sheet1",1,2)+ranDomNum;
		String contactName=eLib.getDataFromExcel("Sheet1",1,1)+ranDomNum;

		//step 2:navigate to organization module
		Home h=new Home(driver);
		h.clickOnOrgLink();
		//step 3:click on create organization button
		Organizationpage op=new Organizationpage(driver);
		op.clickOnOrgImg();

		//enter organization name
		CreateNewOrganization cno=new CreateNewOrganization(driver);
		cno.createNewOrg(orgName);;
		
		//step 4:navigate to contacts module
		h.clickContact();
		//step 5:create contact
		ContactPage cp=new ContactPage(driver);
		cp.clickContactImg();
		CreateNewContactsPage ccp=new CreateNewContactsPage(driver);
		ccp.createNewContacts(contactName, orgName);

		ContactsInfo ci=new ContactsInfo();
		ci.checkContacts();
	} 
}