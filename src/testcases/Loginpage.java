package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.LoginElementsusingpagefactory;

public class Loginpage {

	@Test
	
	public void emailid()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Foyer\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		driver.get("http://crmfarm.in/superadmin");
		
		PageFactory.initElements(driver, LoginElementsusingpagefactory.class);
		
		LoginElementsusingpagefactory.username.sendKeys("superadmin@crmfarm.com");
		LoginElementsusingpagefactory.password.sendKeys("123456");
		LoginElementsusingpagefactory.submit.click();
		
		
		//LoginElementsusingpagefactory LoginElementsusingpagefactory = new LoginElementsusingpagefactory();

		/*LoginElementsusingpagefactory.username(driver).sendKeys("superadmin@crmfarm.com");
		LoginElementsusingpagefactory.password(driver).sendKeys("123456");
		LoginElementsusingpagefactory.submit(driver).click();*/
		
	}
}
