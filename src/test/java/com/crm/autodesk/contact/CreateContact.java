package com.crm.autodesk.contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.comcast.pomrepositylib.ContactPage;
import com.vtiger.comcast.pomrepositylib.ContactsInfo;
import com.vtiger.comcast.pomrepositylib.CreateNewContactsPage;
import com.vtiger.comcast.pomrepositylib.Home;

public class CreateContact extends com.crm.autodesk.genericutility.BaseClass {
	@Test
	public void createContact() throws Throwable {
		
				int ranDomNum =jLib.getRandomNumber();
			
				String contactName=eLib.getDataFromExcel("Sheet1",1,1)+ranDomNum;
	            
				
				Home h = new Home(driver);
				h.clickContact();
				
				ContactPage cp = new ContactPage(driver);
				cp.clickContactImg();
				
				CreateNewContactsPage ccp = new CreateNewContactsPage(driver);
				ccp.createNewContacts(contactName);
				
				ContactsInfo ci = new ContactsInfo();
				 String ActMsg = ci.checkContacts();
				 
				 if(ActMsg.contains(contactName))
				 {
					 System.out.println("contact is sucessfully ...pass");
				}else
					System.out.println("contact is not created");
	}

	
}
