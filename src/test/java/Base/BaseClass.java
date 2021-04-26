package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
 public WebDriver launchBrowser()
 {
	 WebDriverManager.chromedriver().setup();
	  return driver= new ChromeDriver();
 }

 public void opnURL(String URL)
 {
 
	 driver.get(URL);
 }
 
 public void sendValue(WebElement element, String value) 
 
 {
	 element.sendKeys(value);
 }
 
 public void clicButton(WebElement element)
 {
	 element.click();
 }
 
 
}
