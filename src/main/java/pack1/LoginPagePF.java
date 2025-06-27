package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
	
	static WebDriver driver;
	public LoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Syntax
	// @FindBy(id = "foobar") WebElement foobar;
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="password") WebElement pwd;
	@FindBy(id="login") WebElement login;

	public WebElement uname() {
		return username;
	}
	public WebElement password() {
		return pwd;
	}
	public WebElement signin() {
		return login;
	}
}
