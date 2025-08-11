package Sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firsttest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is first automations script");
		// setup browser (Chrome driver, firefox driver)

		//create object for browser
		WebDriver driver = new ChromeDriver();
		//set webapplication url
		
		driver.get("https://www.selenium.dev");
		System.out.println("Page load Successfully");
		
		String expectedtitle = "Selenium";
		String actualtitle = driver.getTitle();
		System.out.println("Expected Title:"+expectedtitle);
		
		System.out.println("Actual Title:"+actualtitle);
		 
		driver.manage().window().maximize();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title Validation sucessfull");
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		driver.close();
		
	}
}