package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginElementsusingpagefactory {
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-auth/app-login/div/div/form/div[1]/input")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@type = 'password']")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/app-auth/app-login/div/div/form/button")
	public static WebElement submit;
	
	



	/*public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/form/div[1]/input"));
	}

	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@type = 'password']"));
	}
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/form/button"));
	}*/


}
