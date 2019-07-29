import org.openqa.selenium.chrome.ChromeDriver;

public class test41 {
public static void main(String[] args) throws InterruptedException {
//delete all existing cookies
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
Thread.sleep(5000);
//validate cookies
if(driver.manage().getCookies().size()!=0)
{System.out.println("cookies test passed");
}
else {
{System.out.println("cookies test failed");
{
//close site
driver.close();
}
{		}
}
}
}
}