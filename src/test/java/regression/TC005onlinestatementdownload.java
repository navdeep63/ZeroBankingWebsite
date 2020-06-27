package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005onlinestatementdownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		// using X path 
		
    driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    	
		
		
		
		
		
	driver.quit();	
	}

}
