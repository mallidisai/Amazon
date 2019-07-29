import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test43 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");		
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.mercurytravels.co.in");
//check drop-down
WebElement e=driver.findElement(By.name("nights"));
Select s=new Select(e);
if(s.isMultiple())
{
System.out.println("multiselect");	
}
else
{
System.out.println("sigleselect");
}
//close site
driver.close();
}
}
