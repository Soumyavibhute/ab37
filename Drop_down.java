package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) 
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement cat_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(cat_dd);
		//s1.selectByValue("search-alias=furniture");
	//	s1.selectByVisibleText("Books");
		s1.selectByIndex(4);
		
		
	}

}
