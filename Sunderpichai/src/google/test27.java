package google;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test27 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
List<WebElement> l=driver.findElements(By.xpath("//input[/@type='radio']"));
l.get(2).click();
}
}

