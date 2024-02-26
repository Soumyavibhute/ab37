package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_clickonlinks {

	public static void main(String[] args) 
	{
	  EdgeDriver driver=new EdgeDriver();
	  String links[]= {"Arab Emirates","United Kingdom","United stat"};
	  
	  for(int i=0;i<links.length;i++)
	  {
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText(links[i])).click();
	  }
	  
	driver.close();	
		
		
	}

}
