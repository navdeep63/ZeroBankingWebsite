package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001logindatadriven {

	
	@Test(dataProvider="credential")
	public  void login(String uname,String pword) {
		// TODO Auto-generated method stub

		
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
        WebElement signinbtn =driver.findElement(By.id("signin_button"));
        
        signinbtn.click();
       driver.findElement(By.id("user_login")).sendKeys(uname);
       
       driver.findElement(By.id("user_password")).sendKeys(pword);
       
       driver.findElement(By.name("submit")).click();
       
       driver.quit();
       
            
       
	}

	@DataProvider(name="credential")
	public Object[][] passdata(){
	//create 2D array name data with 3 rows and 2 column
	Object[][] data = new Object[3][2];
	//we have input data 	
	data[0][0]="username";
	data[0][1]="password";
	
	data[1][0]="Tye";
	data[1][1]="tutorial";	
	
	data[2][0]="username";
	data[2][1]="password";
	return data;
	}

	
}
