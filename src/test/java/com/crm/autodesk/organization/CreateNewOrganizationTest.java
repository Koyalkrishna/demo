package com.crm.autodesk.organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.genericutility.ExcelUtility;
import com.crm.autodesk.genericutility.FileUtility;
import com.crm.autodesk.genericutility.JavaUtility;
import com.crm.autodesk.genericutility.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;
import com.vtiger.comcast.pomrepositylib.Organizationpage;

public class CreateNewOrganizationTest extends com.crm.autodesk.genericutility.BaseClass {

	@Test
	public void CreateNewOrganizationTest() throws Throwable {
	      //getRandom num
			int ranDomNum =jLib.getRandomNumber();
			
			//read test data from Excel File
			String orgName = eLib.getDataFromExcel("Sheet1",1,2)+ranDomNum;
			String contactName=eLib.getDataFromExcel("Sheet1",1,1)+ranDomNum;

	      //navigate to organization module
	        Home hp=new Home(driver);
		     hp.getOrganisationLink().click();

			//navigate to create organization page
		     Organizationpage op=new Organizationpage(driver);
			 op.getCreateOrganizationplusLInk().click();
			 
           //create new organization
			 CreateNewOrganization cno=new CreateNewOrganization(driver);
			 cno.createNewOrg(orgName);
}
}