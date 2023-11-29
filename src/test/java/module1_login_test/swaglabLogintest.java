package module1_login_test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;    
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.baseClass;
import LibraryFiles.utilityClass;
import module1_login.SwagLabHomePage;
import module1_login.SwagLabLoginPage;
import module1_login.SwagLabMenuPage;



public class swaglabLogintest extends baseClass
{
	SwagLabLoginPage login;     //declare globally
	SwagLabHomePage home;           //declare globally
	SwagLabMenuPage menu;          //declare globally
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		  initilizebrowser();
		 
		  login= new SwagLabLoginPage(driver);       //initialize locally
		  home=new SwagLabHomePage(driver);          //initialize locally
		  menu=new SwagLabMenuPage(driver);            //initialize locally
		  
	}
	
	@BeforeMethod
	public void logintoApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.inpSwagLabLoginPageUN(utilityClass.getdataFromPF("UN"));
		Thread.sleep(2000);
		login.inpSwagLabLoginPagePWD(utilityClass.getdataFromPF("PWD"));
		Thread.sleep(2000);
		login.clickonLoginBtn();	
	}

   @Test
	public void verifyTitle() throws InterruptedException, EncryptedDocumentException, IOException
	{
	   TCID=101;
	   String actTitle=home.getSwagLabHomePageTitle();
	   String expTitle=utilityClass.testdata(0, 2);
	   Assert.assertEquals(actTitle, expTitle);
	   Thread.sleep(2000);
	}
   
	@AfterMethod
	public void logoutApp(ITestResult result) throws InterruptedException, IOException
	{
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			utilityClass.CaptureSS(driver,TCID);
		}
		
		home.clickSwagLabHomePageMenuBtn();
		Thread.sleep(3000);
		menu.ClickOnSwagLabMenuPageLogoutBtn();	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
