package module1_login;
//POM class 1
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{

	//step1: declaration 
  @FindBy(xpath = "//input[@id='user-name']")  private WebElement  UN;
   @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
   @FindBy(xpath = "//input[@id='login-button']") private WebElement login;
   
 //step2: initialization
   
	public SwagLabLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:usage
	public void inpSwagLabLoginPageUN(String username) 
	{
		UN.sendKeys(username);
	}
	
     public void inpSwagLabLoginPagePWD(String password) {
    	 PWD.sendKeys(password);
     }
	
	public void clickonLoginBtn() {
		
		login.click();
	}
	
	
	
}
