import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test60 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.way2sms.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	((JavascriptExecutor)driver).executeScript("document.getElementBy.id('mobile no').getAttribute('disabled','true');");
	Thread.sleep(5000);
//back to enable
	((JavascriptExecutor)driver).executeScript("document.getElementBy.id('mobile no').removeAttribute('disabled')");
	}

}
