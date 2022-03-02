package com.orm.autodesk.producttest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.crm.autodesk.genericutility.BaseClass;

public class ApproveTheExistingCustomizedFilter extends BaseClass {
	public void approveTheExistingCustomizedFilterthrows() throws Throwable{
		/*
		//read common data from properties file
		FileInputStream fis = new FileInputStream("./data/commonData.properties"); 
		Properties pobj = new Properties();
		pobj.load(fis);
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		String BROWSER = pobj.getProperty("browser");
		//getRandom number
		Random ran = new Random();
		*/
		
		int ranDomNum =jLib.getRandomNumber();
		/*
		//read test data from Excel File
		FileInputStream fis_e = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis_e);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		*/
		//String orgName = row.getCell(2).getStringCellValue();
		/*
		WebDriver driver;
		if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(BROWSER.equals("ie")){
			driver = new InternetExplorerDriver();
		}else {
			driver = new ChromeDriver();
		}
		//step 1 :login
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(URL);
	//step 2:user name & password
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		*/
		
		//step 3:click on product link
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		//step 4:choose existing filter from filter drop down
		driver.findElement(By.name("selected_id")).click();
		//step 5:click on approve link
		driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
		//step 6:filter get approved
		//alert handling
		Alert alt = driver.switchTo().alert();
		String altmessage = alt.getText();
		if(altmessage.equals("ok")) {
			System.out.println("pass");
		}else {
			System.out.println("cancel");
		}
		alt.accept();
		/*
		//step 7:sign out
		
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 driver.quit();
		 */
		}
		
}
	
	


