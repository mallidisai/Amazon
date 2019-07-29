import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import freemarker.template.SimpleDate;

public class Way2sms {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mbno = sc.nextLine();
		System.out.println("Enter mobile number cretria");
		String mbnoc = sc.nextLine();
		System.out.println("Enter pass word");
		String pwd = sc.nextLine();
		System.out.println("Enter password cretria");
		String pwdc = sc.nextLine();
		// create results file
		ExtentReports er = new ExtentReports("w2smstestres.html", false);
		ExtentTest et = er.startTest("w2sms log in test");
		// launch site
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2sms.com");
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
		driver.findElement(By.name("mobileNo")).sendKeys(mbno);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.name("password")).sendKeys(pwd);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Login')])[2]")));
		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[2]")).click();
		Thread.sleep(5000);
		// validations
		try {
			if (mbno.length() == 0
					&& driver.findElement(By.xpath("//*[@placeholder='Enter mobile number']")).isDisplayed())

			{

				et.log(LogStatus.PASS, "Blank mbno test passed");
			}

			else if (mbno.length() < 10
					&& driver.findElement(By.xpath("//*[@placeholder='Enter mobile number']")).isDisplayed())

			{
				et.log(LogStatus.PASS, "wrong size mbno test passed");
	             		}

			else if (pwd.length() == 0
					&& driver.findElement(By.xpath("//*[@placeholder='Enter password']")).isDisplayed()) {

				et.log(LogStatus.PASS, "blank pwd test passed");
			} 
			else if (mbnoc.equalsIgnoreCase("invalid")
					&& driver.findElement(By.xpath("//*[@class='error']")).isDisplayed()) {
				et.log(LogStatus.PASS, "Invalid mbno testpassed");
			} 
			else if (mbnoc.equalsIgnoreCase("valid") && pwdc.equalsIgnoreCase("invalid")
					&& driver.findElement(By.xpath("//*[contains(text(),'TrtAgain'A)])[1]")).isDisplayed()) {
				et.log(LogStatus.PASS, "Invalid pwdtest passed");
			} 
			else if (mbnoc.equalsIgnoreCase("valid") && pwdc.equalsIgnoreCase("valid")
					&& driver.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed()) {
				et.log(LogStatus.PASS, "Login test passed");
			}
			else 
			{
				SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
				Date d = new Date();
				String fname = sf.format(d) + ".png";
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File(fname);
				FileHandler.copy(src, dest);
				et.log(LogStatus.FAIL, "w2sms login test failed" + et.addScreenCapture(fname));
			}
		    } 
		     catch (Exception ex) {
			  System.out.println(ex.getMessage());
			  et.log(LogStatus.ERROR, ex.getMessage());
		}
		// close site
		driver.close();
		// save changes in html file
		er.endTest(et);
		er.flush();
	}

}
