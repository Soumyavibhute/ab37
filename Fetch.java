package selenium_prog;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fetch 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\Soumya\\Desktop\\Workspace\\Selenium_begining\\ExcelSheet\\Soumya_Excelsheet.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		Sheet s1= wb.getSheet("login");
		Row  r1= s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String str=	c1.getStringCellValue();
		System.out.println(str);
		Row r2=s1.getRow(1);
		Cell c2=r2.getCell(1);
		String pwd1=c2.getStringCellValue();
		System.out.println(pwd1);
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mrss-dev-app.pplplus.org/auth/login?returnUrl=%2Fdashboard");
		driver.manage().window().minimize();
		
		
		
		
		
		
	}

}
