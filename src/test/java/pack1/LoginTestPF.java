package pack1;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://easycom.quickeselling.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPagePF loginpagepf= new LoginPagePF(driver);
		loginpagepf.uname().sendKeys("testingtools10@gmail.com");
		loginpagepf.password().sendKeys("abcd@123");
		loginpagepf.signin().click();
		System.out.println("Hi");
		

	}

}
