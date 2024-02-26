package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hover_over {

	public static void main(String[] args) throws InterruptedException
	{ 
		EdgeDriver driver= new EdgeDriver();//launch empty browser
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.flipkart.com/");
	//	driver.manage().window().maximize();
		Thread.sleep(1000);
	//    WebElement fs=driver.findElement(By.linkText("Fashion"));
		//fs.click();
         driver.navigate().back();		
         Thread.sleep(1000);
         driver.navigate().forward();
         Thread.sleep(1000);
         driver.navigate().refresh();
         
         
	}

	
}
