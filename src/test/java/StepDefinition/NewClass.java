package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {

	public WebDriver driver;
	@Given("Launch the Browser and click on New register user")
	public void launch_the_browser_and_click_on_new_register_user() {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("http://adactinhotelapp.com/");
		 driver.findElement(By.linkText("New User Register Here")).click();
		
	    
	}

	@When("Pass the details")
	public void pass_the_details() {
		
		driver.findElement(By.id("username")).sendKeys("usernme");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("re_password")).sendKeys("confirmpassword");
		driver.findElement(By.id("full_name")).sendKeys("FullName");
		driver.findElement(By.id("email_add")).sendKeys("Email ID");
	 
	}

	@When("click the register button")
	public void click_the_register_button() {
	 
	}

	@Then("validate whether the new user is able to create or not")
	public void validate_whether_the_new_user_is_able_to_create_or_not() {
	  
	}

}
