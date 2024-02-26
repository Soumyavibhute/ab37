package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException 
	{   
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.findElement(By.id("email")).sendKeys("soumya.vibhute@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		
		
		/*Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("7406614855");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();*/
		
	}

}
