package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestEnvironment {
	
	WebDriver driver;
	
	@Given("^User is on Tekschool of America Web page$")
	public void user_is_on_Tekschool_of_America_Web_page() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//.1 instantiate chromeDriver 
	 driver = new ChromeDriver();
		driver.get("https://tekschoolofamerica.com/");
	  
	}

	@When("^User navigate to test Environment$")
	public void user_navigate_to_test_Environment() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
		
	   
	}

	

	@Then("^Tek School is displayed$")
	public void tek_School_is_displayed() throws Throwable {
		String testEnvPageTitle = driver.getTitle();
		System.out.println(testEnvPageTitle);
	    
	}


}
