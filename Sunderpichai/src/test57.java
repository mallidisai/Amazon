import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class test57 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://semantic-ui.com/modules/dropdown.html");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
//click on multi select dropdown
driver.findElement(By.xpath("//*[contains(@class,'ui fluid dropdown')])[1]")).click();
Thread.sleep(5000);
List<WebElement> l=driver.findElements(By.xpath("//*[contains(@class,'active visible')]div[2]/div"));
for(int i=0;i<l.size();i++)
{
l.get(i).click();
Thread.sleep(5000);
//open dropdown for next item selection
driver.findElement(By.xpath("//*[contains(@class,'ui selection dropdown')])[1]")).click();
Thread.sleep(5000);
//to close dropdown
Actions a=new Actions(driver);
a.sendKeys(Keys.ESCAPE).build().perform();
Thread.sleep(5000);
//close site
driver.close();
}
{
}
}

}