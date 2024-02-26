package selenium_prog;

//Get the title of flipkart.com and save each word in an array--Assignment-111

import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipcart_Assignment 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.flipkart.com");
		c1.manage().window().maximize();
		
		System.out.println(c1.getTitle());
		 String inputString = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	        // Split the string based on spaces
	        String[] wordsArray = inputString.split(" ");
	        // Print the words in the array
	        for (String word : wordsArray) 
	        {
	            System.out.println(word);
	        }
	}
}
