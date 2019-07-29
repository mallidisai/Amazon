import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test58 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// click on multi select dropdown
		driver.findElement(By.xpath("//*[contains(@class, 'ui fluid dropdown')][1]")).click();
		Thread.sleep(5000);
		List<WebElement> l = driver.findElements(By.xpath("//*[contains(@class,'active visible')]/div[2]/div"));
		// select 1st,4th,10th items
		l.get(0).click();
		Thread.sleep(5000);
		l.get(3).click();
		Thread.sleep(5000);
		l.get(10).click();
		// close drop-down
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		// close site
		driver.close();
	}

}
