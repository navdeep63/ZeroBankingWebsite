package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC007Accountactivity {
	
	
    
	@Test
	public void Accountactivity() throws InterruptedException
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		// using X path 
		
    driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    
		//Account activity.
		
	driver.findElement(By.xpath("//a[contains(text(),'Account Activity')]")).click();	
	driver.findElement(By.xpath("//select[@id='aa_accountId']")).sendKeys("Checking");	
		
		
		
	driver.quit();
	Thread.sleep(4000);
	}

}
