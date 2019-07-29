import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test59 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// launch site
		// click on multi select dropdown
		driver.findElement(By.xpath("//*[contains(@class, 'ui fluid dropdown')][1]")).click();
		Thread.sleep(5000);

		// select items are after other
		List<WebElement> l = driver.findElements(By.xpath("//*[contains(@class,' visible')]/div[2]/div"));

		Thread.sleep(5000);
		// select 1st,4th,10th items
		l.get(0).click();
		Thread.sleep(5000);
		l.get(3).click();
		Thread.sleep(5000);
		l.get(10).click();

		// deselect selected items
		List<WebElement> l2 = driver.findElements(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]/a/i"));
		for (int i = 0; i < l2.size(); i++) {
			l2.get(i).click();
Thread.sleep(5000);
}
// close site
driver.close();

	}
}