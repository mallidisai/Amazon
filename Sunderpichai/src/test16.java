import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test16 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://www.google.co.in");
Thread.sleep(5000);
List<WebElement> l = driver.findElements(By.xpath("//a"));
System.out.println(l.size());
driver.close();
}
}
