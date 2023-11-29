package module1_login;
//POM class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage
{
	//declaration
  @FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
  
	///initialization
    public SwagLabMenuPage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    	
    }
    
    //usage
    public void ClickOnSwagLabMenuPageLogoutBtn() {
    	
    	logout.click();
    }
	
	
}
