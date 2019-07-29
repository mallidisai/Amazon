import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class windowbased1 {
public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
driver.manage().window().maximize();
//right click onlink(SWD)
WebElement e=driver.findElement(By.xpath("//*[text()='Download']"));
Actions a=new Actions(driver);
a.contextClick(e).build().perform();
//select 2nd option in window-menu(javarobot)
Thread.sleep(5000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(5000);
//close browser window(SWD)
driver.quit();
}
}
