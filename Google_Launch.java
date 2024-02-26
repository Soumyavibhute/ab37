package selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Launch {

	public static void main(String[] args) 
	{
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	// System.out.println(driver.getWindowHandle()); 
     //System.out.println(driver.getWindowHandles());
	   System.out.println(driver.getTitle());
     
	}

}