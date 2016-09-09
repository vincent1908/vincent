package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {

  public static void main(String[] args) throws InterruptedException {
	  
	  System.setProperty("webdriver.firefox.marionette", "D:\\Users\\gamirtha\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

	
	  	WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.co.in");

		//Thread.sleep(10000);

	//	driver.quit();
	  
	  System.out.println("test");
	  
  }
  

}
