package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass 
{

	public WebDriver driver; 
	public void initilizebrowser() throws IOException
	{
		driver=new ChromeDriver();             //initialize locally
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get(utilityClass.getdataFromPF("URL"));
	}
}
