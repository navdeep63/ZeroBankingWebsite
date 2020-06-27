package regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004paybills {

	public static void main(String[] args) throws InterruptedException {
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
    
    //pay bills
		
	driver.findElement((By.xpath("//a[contains(text(),'Pay Bills')]"))).click();	
	driver.findElement(By.xpath("//select[@id='sp_payee']")).sendKeys("Apple");
	driver.findElement(By.xpath("//select[@id='sp_account']")).sendKeys("Loan");
	driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-05-05");
	driver.findElement(By.xpath("//input[@id='sp_description']")).sendKeys("Loan clear");
	driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();

	Thread.sleep(5000);
	driver.quit();	
		
	}

}
