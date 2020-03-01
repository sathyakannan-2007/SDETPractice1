package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start writting code -- selenium + Java
		
				//specify browser driver chrome.exe
				 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathyakannan\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				
				//1. Launch chrome browser
				WebDriver driver = new ChromeDriver();
				
				//2.Navigate the URL
				driver.get("http://demo.automationtalks.com/");
				
				//3.Verify Page Title
				String ExpectedPageTitle = "Fill Vehicle Data";
						
				//Actual Page Title
				String ActualPageTitle = driver.getTitle();
				
				System.out.println(ActualPageTitle);
				if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
		            System.out.println("Test Case Passed");
		        } else {
		            System.out.println("Test Case Failed");
		        }

		        //4. Close Browser
		        driver.close();
				
	}

}
