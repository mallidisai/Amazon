import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class test48 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in");
driver.manage().window().maximize();
//switch to farme
driver.switchTo().frame(0);
//perform drag and drop
WebElement e1=driver.findElement(By.id("dragable"));
WebElement e2=driver.findElement(By.id("droppable"));
Actions a=new Actions(driver);
Thread.sleep(5000);
a.dragAndDrop(e1,e2).build().perform();
//back to page
driver.switchTo().defaultContent();
driver.close();
}
}
