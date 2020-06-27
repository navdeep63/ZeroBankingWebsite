package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondautomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.quit();

	}

}
