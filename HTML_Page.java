package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Page {

	public static void main(String[] args)
  {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Soumya/Desktop/learningHTML1-file.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Ram");
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("say hello");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("html@123");
	driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Samoa");
//	driver.findElement(By.xpath("((/html/body/form/input)[2])")).sendKeys("Vibhute");
	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
	driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	driver.findElement(By.xpath("/html/body/a")).click();
	}

}
