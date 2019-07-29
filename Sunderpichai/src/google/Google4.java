package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch site
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=b23490e7ca647b072234ca14650a6dd8");
		Thread.sleep(5000);
		// click register link
		driver.findElement(By.name("lastName")).sendKeys("mallidi");
		driver.findElement(By.name("phone")).sendKeys("9705427250");
		driver.findElement(By.name("userName")).sendKeys("mallidisai123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("anjinayastreet");
		driver.findElement(By.name("address2")).sendKeys("teldarpally");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("507170");
		// select INDIA
		WebElement e= driver.findElement(By.name("country"));
		Select s = new Select(e);
		s.selectByVisibleText("INDIA");
		// fill remaining fields
		driver.findElement(By.name("email")).sendKeys("afaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("C:\\selenium\\");
		driver.findElement(By.name("confirmPassword")).sendKeys("C:\\selenium\\");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		// close site
		driver.close();
}
}