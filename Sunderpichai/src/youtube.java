import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
public class youtube {
public static void main(String[] args) throws InterruptedException, FindFailed {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com");
driver.manage().window().maximize();
//search video
driver.findElement(By.name("search_query")).sendKeys("Google CEO Sundar Pichai grilled by lawmakers on data privacy and political bias by CBS News 1 week ago 8 minutes, 52 seconds 88,366 views");
Thread.sleep(1000);
driver.findElement(By.id("search-icon-legacy")).click();
}
}