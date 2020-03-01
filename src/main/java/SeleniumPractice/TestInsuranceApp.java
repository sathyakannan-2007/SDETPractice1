package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInsuranceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup(); //set up driver executable
			
			WebDriver driver = new chromedriver(); //launch chrome browser
			
			driver.get("http://demo.automationtalks.com/"); //navigating to the URL
			driver.manage().window().maximize(); //maximize the window
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}

}
