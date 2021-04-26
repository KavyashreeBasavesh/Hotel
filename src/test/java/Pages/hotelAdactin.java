package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class hotelAdactin extends BaseClass {
	
	public hotelAdactin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	



	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(linkText="Forgot Password?")
	private WebElement Forgotpasswd;
	
	@FindBy(linkText="New User Register Here")
	private WebElement Newuser;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotpasswd() {
		return Forgotpasswd;
	}

	public WebElement getNewuser() {
		return Newuser;
	}

	
	
	
}
