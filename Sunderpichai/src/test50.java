import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test50 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/css/css_tooltip.asp");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
//get tooltip ofan element
//here tool-tip is tittle attribute value
WebElement e1=driver.findElement(By.linkText("JAVASCRIPT"));
String x=e1.getAttribute("tittle");
System.out.println(x);
Thread.sleep(5000);
//get tool-tip of an element
//here tooltip is  a childelement to element
WebElement e2=driver.findElement(By.xpath("//div[@class='tooltip'(contains(text(),'Bottom')])"));
Actions a=new Actions(driver);
a.moveToElement(e2).build().perform();
WebElement e3=driver.findElement(By.xpath("//*[@class='tooltiptext tooltip-bottom']"));
a.clickAndHold(e3).build().perform();
String y=e3.getText();
System.out.println(y);
a.release().build().perform();
//close site
driver.close();


	}

}
