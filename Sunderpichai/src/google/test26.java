package google;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test26 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
java.util.List<WebElement> l=driver.findElements(By.xpath("//input[@type='text]"));
System.out.println(l.size());	
}
}
