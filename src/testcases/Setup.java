package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.LoginElementsusingpagefactory;
import elements.SetupElementsusingpagefactory;

public class Setup {

	@Test

	public void setupmenu() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Foyer\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://crmfarm.in/superadmin");

		PageFactory.initElements(driver, LoginElementsusingpagefactory.class);

		LoginElementsusingpagefactory.username.sendKeys("superadmin@crmfarm.com");
		LoginElementsusingpagefactory.password.sendKeys("123456");
		LoginElementsusingpagefactory.submit.click();

		Thread.sleep(3000);

		PageFactory.initElements(driver, SetupElementsusingpagefactory.class);

		SetupElementsusingpagefactory.clicksetupmenu.click();
		SetupElementsusingpagefactory.clickcreatepackagemenu.click();
		SetupElementsusingpagefactory.enterpackagename.sendKeys("12345");




		/*//SetupElementsusingpagefactory s = new SetupElementsusingpagefactory();

		SetupElementsusingpagefactory.clicksetupmenu(driver).click();
		SetupElementsusingpagefactory.clickcreatepackagemenu(driver).click();
		SetupElementsusingpagefactory.clickcreatepackagemenu(driver).sendKeys("pack123");*/

	}


}
