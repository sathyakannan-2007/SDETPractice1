package SelAutoLocators1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import SeleniumPractice.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("LOG IN")).click(); //click on login link
		//driver.findElement(By.xpath("//a[@class='shopbar-button']")).click(); //clicking login
		
		//xpath for register
		driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.xpath("//a[contains(@class, 'register-button')]")).click(); 
		//driver.findElement(By.xpath("//a[@class ='btn btn-warning btn-lg btn-block register-button']")).click(); 
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
		//driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Hauge");
		//driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[text() = '13']")).click();
		//driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text() = 'August']")).click();
		//driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[text() = '1989']")).click();
		//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("JohnHauge@gmail.com");
		//driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("JohnH1");

		//with web element firstname
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.click();
		fname.sendKeys("John");
		//last name
		WebElement lname = driver.findElement(By.id("LastName"));
		lname.click();
		lname.sendKeys("Huage");
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[text() = '13']")).click();
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text() = 'August']")).click();
		driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[text() = '1989']")).click();
		//Email
		WebElement email = driver.findElement(By.id("Email"));
		email.click();
		email.sendKeys("Johnguage@gmail.com");
		//User
		WebElement user = driver.findElement(By.id("Username"));
		user.click();
		user.sendKeys("Sathya");
		//Pwd
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.click();
		pwd.sendKeys("Sathya@Test1");
		//confirm pwd
		WebElement confirmpwd = driver.findElement(By.id("Confirm password"));
		confirmpwd.click();
		confirmpwd.sendKeys("Sathya@Test1");
		//Company Name	
		WebElement cname = driver.findElement(By.id("Company name"));
		cname.click();
		cname.sendKeys("iPivot Inc");
		//Newsletter
		WebElement Nletter = driver.findElement(By.id("NewsLetter"));
		Nletter.click();
		// Register button
		driver.findElement(By.name("Register-button")).click();
		
		//Verify Title and Continue button
		
		String Title = null;
		driver.findElement(By.xpath("//a[@class ='btn btn-secondary register-continue-button']")).click();
		String expected = null;
		Assert.assertEquals(Title, expected, "Unexpected Title");		
		
		
		driver.findElement(By.id("Continue")).click();
		
		driver.close();
	}
	
		
}
