import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test15 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.Chrome.driver", "C:\\selenium\\ChromeDriver.exe");
WebDriver Driver=new ChromeDriver();
Driver.get("https://www.google.co.in");
Thread.sleep(5000); 
List<WebElement> element = Driver.findElements(By.xpath("//*"));
System.out.println(element.size());
	}
}