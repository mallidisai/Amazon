import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test14 {
private static final String W = null;
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.google.co.in");
Thread.sleep(5000);
driver.manage().window().maximize();
// get x & y coordinates and width&height
WebElement e = driver.findElement(By.linkText("Gmail"));
int x = e.getLocation().getX();
int y = e.getLocation().getY();
System.out.println(x + y);
driver.close();
}
}
