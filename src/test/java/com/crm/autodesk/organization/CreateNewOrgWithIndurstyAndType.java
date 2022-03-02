package com.crm.autodesk.organization;

import org.testng.annotations.Test;

import com.crm.autodesk.genericutility.BaseClass;
import com.vtiger.comcast.pomrepositylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositylib.Organizationpage;

 
@Test
public class CreateNewOrgWithIndurstyAndType extends BaseClass{
	public void createNewOrgWithIndustryAndType() throws Throwable {
		
		int ranDomNum =jLib.getRandomNumber();
		
		String orgName = eLib.getDataFromExcel("Sheet1",1,2)+ranDomNum;
        String industry = eLib.getDataFromExcel("sheet1", 1, 4);		
        String type = eLib.getDataFromExcel("sheet1", 1, 5);	
		 Home hp=new Home(driver);
	     hp.getOrganisationLink().click();
	     
	     
	     Organizationpage op = new Organizationpage(driver);
	     op.clickOnOrgImg();
	     
	     CreateNewOrganization cnop = new CreateNewOrganization(driver);
	     cnop.organizationDetailWithIndustryAndType(orgName, industry, type);  
	}
}
