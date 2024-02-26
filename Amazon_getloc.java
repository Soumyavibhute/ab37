package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_getloc {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	   WebElement country_canada= driver.findElement(By.linkText("Canada"));
	   Point location=country_canada.getLocation();
	   int x=location.getX();
	   int y=location.getY();
	   System.out.println(x);
	   System.out.println(y);
	   JavascriptExecutor jse=driver;
	 //  jse.executeScript("window.scrollBy(0,"+y+")");
		
	   
	   
	   
	}

}
