import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class test44 {
public static void main(String[] args) {
//LAUNCH SITE
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.mercurytravels.co.in");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//go to dropdown developed using select tag
WebElement e=driver.findElement(By.name("nights"));
Select s=new Select(e);
//collect all items in dropdown display
List<WebElement> l=s.getOptions();
int n=l.size();
System.out.println(n);
for(int i=0;i<n;i++)
{	
System.out.println(l.get(i).getText());
}
//close
driver.close();
}
}