package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTesting {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://easycom.quickeselling.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginpage= new LoginPage(driver);
		loginpage.username().sendKeys("testingtools10@gmail.com");
		loginpage.password().sendKeys("abcd@123");
		loginpage.login().click();
		 CartPage cart= new CartPage(driver);
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 cart.product().click();
		 cart.addtocart().click();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(cart.viewcart()));
		 
		 cart.carticon().click();
		 cart.viewcart().click();
		
		
		
	}

}
