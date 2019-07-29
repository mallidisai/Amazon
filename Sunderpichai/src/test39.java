import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test39 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
//validation
if(driver.findElement(By.name("hiddenpassword")).isDisplayed()){
System.out.println("password is displayed");
}
else  
{
System.out.println("password is hidden");
//closesite
driver.close();
 }
}
}
