package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Date;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Sendsms;

import java.io.File;
import java.text.SimpleDateFormat;
public class Mainclasses 
{

	public WebDriver driver;
	public WebDriverWait wait;
	public Homepage hp;
	public Sendsms sp;
	
	@Test (priority=1)
	public void launch() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		hp=new Homepage(driver);
		sp=new Sendsms(driver);
		
		driver.get("http://www.way2sms.com");
		wait=new WebDriverWait(driver, 20);
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	@Parameters({"m","p"})
	public void login(String m,String p) throws Exception
	{
	hp.fillmbno(m);
	wait.until(ExpectedConditions.visibilityOf(hp.pwd));
	hp.fillpwd(p);
	wait.until(ExpectedConditions.elementToBeClickable(hp.loginbtn));
	hp.clicklogbtn();
	Thread.sleep(1000);
	}

	@Test(priority=3)
	@Parameters({"m","mc","p","pc"})
	public void validations(String m,String mc,String p,String pc)
	{
		
		try
		{
			if(m.length()==0&&hp.blankpwderr.isDisplayed())
     {
				Reporter.log("Blank mobile number test passed");
				Assert.assertTrue(true);
	
         }
			
			else if(m.length()<10 && hp.wrongsizembnoerr.isDisplayed())
			{
				Reporter.log("wrong size mbno test passed");
				Assert.assertTrue(true);
			}
			else if(p.length()==0 && hp.blankpwderr.isDisplayed())
			{
				Reporter.log("Blank password test passd");
				Assert.assertTrue(true);
			}
			else if(mc.equalsIgnoreCase("invalid") && pc.equalsIgnoreCase("valid") &&hp.invalidmbnoerr.isDisplayed())
			{
				Reporter.log("invalid mbno test passed");
				Assert.assertTrue(true);
			}
			else if(mc.equalsIgnoreCase("valid")&&pc.equalsIgnoreCase("invalid") && hp.invalidmbnoerr.isDisplayed())
			{
				Reporter.log("wrong password testpassed");
				Assert.assertTrue(true);
				wait.until(ExpectedConditions.elementToBeClickable(sp.logoutbtn));
			    sp.clicklogoutbtn();			    
            }
			else
			{
		        SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
		        Date d=new Date();
		        String fname=sf.format(d)+".png";
		        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        File dest=new File(fname);
		        FileHandler.copy(src, dest);
		        Reporter.log("login test failed");
		        String path="F:\\Selenium\\W2smstesting\\"+fname;
		        String code="<img src=\"file:///"+path+"/\" alt=\"\"/>";
		        Reporter.log(code);
		        Assert.assertTrue(true);
			}
		}
		
		catch (Exception ex)
		{
			Reporter.log(ex.getMessage());
			Assert.assertTrue(true);

		}
	}
	@Test (priority=4)
	public void closesite()
	{
		driver.close();
	}
}

