package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC002addpayee {

	
	
	@Test(dataProvider="credit")
	public void addPayee(String pname,String paddress,String paccount,String pdetail) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.MILLISECONDS);
			
	        WebElement signinbtn =driver.findElement(By.id("signin_button"));
	        
	        signinbtn.click();
	       driver.findElement(By.id("user_login")).sendKeys("username");
	       
	       driver.findElement(By.id("user_password")).sendKeys("password");
	       
	       driver.findElement(By.name("submit")).click();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();	       
	       driver.findElement(By.xpath("//a[contains(text(),'Add New Payee')]")).click();	      
	       driver.findElement(By.xpath("//input[@id='np_new_payee_name']")).sendKeys(pname);	       
	       driver.findElement(By.xpath("//textarea[@id='np_new_payee_address']")).sendKeys(paddress);	       
	       
	       driver.findElement(By.xpath("//input[@id='np_new_payee_account']")).sendKeys(paccount);	       
	       
	       driver.findElement(By.xpath("//input[@id='np_new_payee_details']")).sendKeys(pdetail);
	       
	       driver.findElement(By.xpath("//input[@id='add_new_payee']")).click();
	       
	       System.out.println(driver.getTitle());
	       Assert.assertTrue(driver.getTitle().contains("Zero - Pay Bills"));
	       
	       driver.quit();
	}
@DataProvider(name="credit")
	
public Object[][] passdata(){
	
	Object[][]data=new Object[3][4];
	data[0][0]="Scotia";
	data[0][1]="Brampton";
	data[0][2]="10234";
	data[0][3]="Loan paid";
	
	data[1][0]="BMO";
	data[1][1]="kitchner";
	data[1][2]="54321";
	data[1][3]="car Loan paid";
	
	data[2][0]="Td";
	data[2][1]="Hamilton";
	data[2][2]="654321";
	data[2][3]="House Loan paid";
	
	return data;
}
}	
	

	

