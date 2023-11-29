package module1_login;
//POM class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
  //declaration
    @FindBy(xpath = "//button[text()='Open Menu']")	private WebElement menu;
    WebDriver driver;               //global variable
	
	//initialization
    public SwagLabHomePage(WebDriver driver)
    {
    this.driver=driver;    //global variable=local variable
    PageFactory.initElements(driver, this);
    
    }
    
//    public void verifySwagLabHomePageTitle(String expTitle) {
//    	
//    	   String actTitle = driver.getTitle();
//    	    if(actTitle.equals(expTitle)) 
//    	    {
//    	    	System.out.println("TC PASS");
//    	    
//    	    }
//    	    else {
//    	    	System.out.println("TC FAIL");
//    	    }
//    	    
//    }
    
    
    public String verifySwagLabHomePagetitle()
    {
    	String actTitle = driver.getTitle();
    	return actTitle;
    }
    
    public String getSwagLabHomePageTitle()
    {
    	String actTitle = driver.getTitle();
    	return actTitle;
    }
    
    public void clickSwagLabHomePageMenuBtn() {
    	menu.click();
    }
    
	
}
