package selenium_prog;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");	
           driver.manage().window().maximize();
         driver.findElement(By.id("searchDropdownBox")).click();
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rich dad poor Dad");
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
         
	}
	
	
	

}
