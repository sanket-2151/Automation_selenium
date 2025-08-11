package Sele_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practise-form");
		Thread.sleep(5000);
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Neeva");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Sharma");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
	}

}
