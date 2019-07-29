import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class test38 {	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
Thread.sleep(5000);
//validation
if(driver.findElement(By.name("q")).isDisplayed())
{
System.out.println("google site launch test passed");
}
else
{
System.out.println("google site launch test failed");
}
//closesite
}
}