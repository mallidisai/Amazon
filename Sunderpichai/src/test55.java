import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test55 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://semantic-ui.com/modules/dropdown.html");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();	
//check for multi selection dropdown
String x=driver.findElement(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]")).getAttribute("class");
if(x.contains("multiple"))
{
System.out.println("multiselect drop-down");
}
else
{
System.out.println("single select dropdown");
}
}
//close site/
{
}
}