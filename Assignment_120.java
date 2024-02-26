package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_120 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Automate me")).click();
		driver.findElement(By.id("data-elementor-id=\"228044")).click();

	}

}
