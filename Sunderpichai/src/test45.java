import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test45 {
public static void main(String[] args) {
//launch site
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryitasp?filename=tryhtml-select-multiple");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
//switch to frame
driver.switchTo().frame("i frame result");
//go to adropdown developed using select tag
WebElement e=driver.findElement(By.name("cars"));
Select s=new Select(e);
Actions a=new Actions(driver);
a.keyDown(Keys.CONTROL).click(s.getOptions().get(0)).click(s.getOptions().get(2)).click(s.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
//back to page
driver.switchTo().defaultContent();
//close site
driver.close();
	}
}
