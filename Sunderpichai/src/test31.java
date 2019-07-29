import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test31 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.mercurytravels.co.in");
Thread.sleep(5000);
//get images count
List<WebElement> l=driver.findElements(By.xpath("(//img)/(//input[@type='image'])"));
driver.manage().window().maximize();
System.out.println(l.size());
//close site
driver.close();	
}
}
