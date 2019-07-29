import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class test49 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/slider");
driver.manage().window().maximize();
//switch to frame
driver.switchTo().frame(0);
//oprerate horizontal slider
WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
Actions a=new Actions(driver);
Thread.sleep(5000);
//left to right
a.dragAndDropBy(e1,3000, 0).build().perform();
Thread.sleep(5000);
//back to page
driver.switchTo().defaultContent();
driver.findElement(By.linkText("verticalslider")).click();
Thread.sleep(5000);
//switch to frame
driver.switchTo().frame(0);
//operate vertical slider
WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
Thread.sleep(5000);
a.dragAndDropBy(e2,0,50).build().perform();
Thread.sleep(5000);
a.dragAndDropBy(e2,0,-100).build().perform();
Thread.sleep(5000);
//back to page
driver.switchTo().defaultContent();

}

}
