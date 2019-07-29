import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test53 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://semantic-ui.com/modules/dropdown.html");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("(//div[@class='ui selection dropdown'])[1]")).click();
Thread.sleep(5000);
List<WebElement> l=driver.findElements(By.xpath("//*[@class'active visible')]/div[2]/div"));
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i).getText());	
}
{
//close site
driver.close();
}
	}

}
