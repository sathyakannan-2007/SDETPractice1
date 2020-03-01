package PracticeExc1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeExc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Firefox
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FireFox();
		
		//Launch in IE
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new ie();
		
		//Launch Chrome
		WebDriverManager.chromedriver().setup(); //Setup chrome driver		
		WebDriver driver = new ChromeDriver(); //Launch chrome driver
		
		driver.get("http://qdpm.net/demo/v9/index.php"); //Navigate
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //implicit wait for 15 sec
		driver.manage().window().maximize(); //maximize the window
		
		
		String ExpectedPageTitle = "qdPM } Login"; //verifying the page title
		String Url = driver.getCurrentUrl(); //with getcurrentURL 

	    if (Url.equals("http://qdpm.net/demo/v9/index.php")) {
	        System.out.println("Test URL Passed");
	    } else {
	        System.out.println("Test URL Failed");
	    }

        // Close Browser
        driver.close();
				
	}

}
