import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test52 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://semantic-ui.com/modules/dropdown.html");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//get count of items in<div>tag drop-down
List<WebElement> l=driver.findElements(By.xpath("(//*[@class='ui selection dropdown'])[1]/div[2]/div"));
System.out.println(l.size());
//close site
driver.close();
}
}
