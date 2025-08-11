package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {
	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException {
		System.out.println("Manual Testing....."+testexecution);
		Thread.sleep(5000);
		
		WebElement user = driver.findElement(By.name("username"));
		user.click();
		user.sendKeys(user1);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys(pass1);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("welcome to Orange HRM Login Page");
		loginStep(driver,"456758","admin123","Unable to login");
		loginStep(driver,"Admin","(&^*$dgsh","Unable to login");
		loginStep(driver,"bsd837258","8492619hsja","Unable to login");
		loginStep(driver,"","","Unable to login");
		loginStep(driver,"Admin","admin123","User is able to login successfully !!");
	}

}