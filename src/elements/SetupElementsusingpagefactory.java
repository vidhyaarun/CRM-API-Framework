package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupElementsusingpagefactory {
	
	@FindBy(xpath = "//*[@id='navigation']/ul/li[2]/a/span")
	public static WebElement  clicksetupmenu;
	
	@FindBy(xpath = "//html/body/app-root/ngx-package/ngx-one-column-layout/nb-layout/div/div/div/nb-sidebar/div/div/nb-menu/ul/li[2]/a/span")
	public static WebElement clickcreatepackagemenu;
	
	@FindBy(xpath ="html/body/app-root/ngx-package/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/app-package-add/section/form/div[1]/div/div[1]/input")
	public static WebElement enterpackagename;
	
	
	
	
	/*public static WebElement clicksetupmenu(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[2]/a/span"));
	}
	public static WebElement clickcreatepackagemenu(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/ngx-package/ngx-one-column-layout/nb-layout/div/div/div/nb-sidebar/div/div/nb-menu/ul/li[2]/a/span"));
	}
	
	public static WebElement entercreatepackagename(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/ngx-package/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/app-package-add/section/form/div[1]/div/div[1]/input"));
		
	}*/

}
