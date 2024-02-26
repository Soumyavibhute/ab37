package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_India {

	public static void main(String[] args) 
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://google.com/");
	  driver.manage().window().maximize();
	WebElement googlesearch_tf=  driver.findElement(By.name("q")); // google search text field
	googlesearch_tf.sendKeys("India");
	googlesearch_tf.sendKeys(Keys.ENTER);
		
		
	}

}
