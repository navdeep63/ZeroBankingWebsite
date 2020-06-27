package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003tranferfund {

	
	@Test
	public void verifyTransferfunds() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		// using X path 
		
    driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    
    //transfer funds
    
    driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		
		driver.findElement(By.xpath("//select[@id='tf_fromAccountId']")).sendKeys("1000");
		driver.findElement(By.xpath("//select[@id='tf_toAccountId']")).sendKeys("1000");
		
		driver.findElement(By.xpath("//input[@id='tf_amount']")).sendKeys("50");
		
		driver.findElement(By.xpath("//input[@id='tf_description']")).sendKeys("money market");
		driver.findElement(By.xpath("//button[@id='btn_submit']")).click();
	    driver.findElement(By.xpath("//button[@id='btn_submit']")).click();
	    
		Thread.sleep(5000);
		
	driver.quit();	
	}
}
