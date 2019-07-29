import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test40 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://selenium//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		// validation
		if (driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
		} else {
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
			System.out.println("searchbox is displayed and enabled");
		}

		if (driver.findElement(By.name("q")).isEnabled()) {
			System.out.println("search is displayed but disabled");
		} else {
			System.out.println("searchbox is not displayed");
		}

		// closesite
		driver.close();
	}
}