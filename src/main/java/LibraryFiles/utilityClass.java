package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class utilityClass
{

	public static String testdata(int row, int col) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\24june.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		  
		 String value = sh.getRow(row).getCell(col).getStringCellValue();
		 return value; 
	}
	
	public static void CaptureSS(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir")+"\\FailedTCesSS\\TestCaseID" +TCID + ".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static String getdataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		
     String value= p.getProperty(key);
     return value;
	}
	
}