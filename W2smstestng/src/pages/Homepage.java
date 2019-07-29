package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Homepage
{
	public WebDriver driver;
	
	@FindBy(name="mobileNo")
	public WebElement mbno;
	
	@FindBy(id="password")
	public WebElement pwd;
	
	@FindBy(xpath="(//*[contains(text(),'Login')])[2]")
	public WebElement loginbtn;
	
	@FindBy(xpath="//*[text()='Enter your mobile number']")
	public WebElement mbnoerr;
	
	@FindBy(xpath="//*[text()='Enter valid mobile number']")
	public WebElement wrongsizembnoerr;
	
	@FindBy(xpath="//*[text()='Invalid Mobile Number']")
	public WebElement invalidmbnoerr;
	
	@FindBy(xpath="(//*[text()='Enter password'])[2]")
	public WebElement blankpwderr;
	
	@FindBy(xpath="(//*[contains(text(),'Try Again')])[1]")
	public WebElement invalidpwderr;
	
	public Homepage() {
		
	}
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  void fillmbno(String x)
	{
		mbno.sendKeys(x);
	
	}
	public void fillpwd(String x)
	{
		pwd.sendKeys(x);
	}
	public void clicklogbtn()
	{
		loginbtn.click();
	
}

}


















     
