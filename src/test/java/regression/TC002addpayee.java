package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002addpayee {

	
	
	@Test
	public void addPayee() {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
			
	        WebElement signinbtn =driver.findElement(By.id("signin_button"));
	        
	        signinbtn.click();
	       driver.findElement(By.id("user_login")).sendKeys("username");
	       
	       driver.findElement(By.id("user_password")).sendKeys("password");
	       
	       driver.findElement(By.name("submit")).click();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();	       
	       driver.findElement(By.xpath("//a[contains(text(),'Add New Payee')]")).click();	      
	       driver.findElement(By.xpath("//input[@id='np_new_payee_name']")).sendKeys("CIBC");	       
	       driver.findElement(By.xpath("//textarea[@id='np_new_payee_address']")).sendKeys("2101 fleminng road");	       
	       
	       driver.findElement(By.xpath("//input[@id='np_new_payee_account']")).sendKeys("1010923");	       
	       
	       driver.findElement(By.xpath("//input[@id='np_new_payee_details']")).sendKeys("electicitybill");
	       
	       driver.findElement(By.xpath("//input[@id='add_new_payee']")).click();
	       
	       System.out.println(driver.getTitle());
	       Assert.assertTrue(driver.getTitle().contains("Zero - Pay Bills"));
	       
	       driver.quit();
	}

}
