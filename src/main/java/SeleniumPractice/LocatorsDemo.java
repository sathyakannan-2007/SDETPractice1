package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automation.talks.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Cylindercapacity"));
		
		WebElement cyclap = driver.findElement(By,id("Cylindercapacity")).click()
				
		
	}

}
