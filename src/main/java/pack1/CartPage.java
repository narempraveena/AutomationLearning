package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	static WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement product() {
		return	driver.findElement(By.linkText("HP 22w 21.5-inch LED Monitor (Black Onyx)"));
	}
	public WebElement addtocart() {
		return driver.findElement(By.id("addCart"));
	}
	
	public WebElement carticon() {
		return driver.findElement(By.id("outer_cart"));
	}
	
	public WebElement viewcart() {
		return driver.findElement(By.linkText("View Cart"));
	}
}
