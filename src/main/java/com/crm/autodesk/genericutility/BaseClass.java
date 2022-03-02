package com.crm.autodesk.genericutility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.crm.autodesk.genericutility.ExcelUtility;
import com.crm.autodesk.genericutility.FileUtility;
import com.crm.autodesk.genericutility.JavaUtility;
import com.crm.autodesk.genericutility.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class BaseClass { 
	/**
	 * @author Koyal
	 */

	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	
	/**
	 *  used to launch the browser
	 * @throws Throwable 
	 */
	
	@BeforeClass(groups = {"smoketest","regressiontest"})
	public void launchBrowser() throws Throwable {
		String browser=fLib.getPropertyKeyValue("browser");
		String url=fLib.getPropertyKeyValue("url");

		System.out.println(browser);
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			}
		else if(browser.equals("firefox")) {
         driver=new FirefoxDriver();			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		sdriver=driver;
	
		System.out.println("browser launched");
	}
	
	/**
	 * used to login into application
	 * @throws Throwable 
	 * 
	 */
	@BeforeTest
	public void login() throws Throwable {
	//	String url=fLib.getPropertyKeyValue("url");
		String username=fLib.getPropertyKeyValue("username");
		String password=fLib.getPropertyKeyValue("password");
		
		Login lp=new Login(driver);
		lp.loginToApp(username, password);
		System.out.println("Login successfull");
				
	}
	
	/**
	 * used to logout from application
	 * 
	 */
	@AfterTest
	public void logout() {
		Home hp=new Home(driver);
		hp.logout();
		System.out.println("Logout successfull");
	}
	
	/**
	 * used to close the browser
	 */
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	
}
