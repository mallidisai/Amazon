import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolingpage {
	// launch site
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// scroll to bottom
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		// scroll to top
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		// scroll to specific element
		WebElement e = driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);
	}
}