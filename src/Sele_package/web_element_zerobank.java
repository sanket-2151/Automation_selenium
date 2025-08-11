package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element_zerobank {
	public static void Loginstep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException
	{
		System.out.println("Manual test-->"+testexecution);
		
		WebElement user = driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		WebElement pass = driver.findElement(By.id("user_password"));
		pass.sendKeys(pass1);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank login page");
		Loginstep(driver,"56778","password","Unable to login");
		Loginstep(driver,"username","677888","Unable to login");
		Loginstep(driver,"","","Unable to login");
		Loginstep(driver,"username","password","User is able to login successfully");
		

	}

}
