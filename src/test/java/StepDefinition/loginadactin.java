package StepDefinition;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pages.hotelAdactin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginadactin extends BaseClass {
	
	WebDriver driver;
	
	hotelAdactin h;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = launchBrowser();
		h= new hotelAdactin(driver);
	}

	@Given("Using URL open Adactinhotel loginpage")
	public void using_url_open_adactinhotel_loginpage() {
		opnURL("http://adactinhotelapp.com/");
	    
	}

	@When("Enter valid Username and Passwrd")
	public void enter_valid_username_and_passwrd() {
		sendValue(h.getUsername(), "Kavyashree");
		sendValue(h.getForgotpasswd(), "8kavya8");
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
		clicButton(h.getLogin());
		
	}
	   

	@When("Validate the successful login message")
	public void validate_the_successful_login_message() {
		
	    
	}


}
