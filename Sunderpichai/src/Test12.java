import org.openqa.selenium.chrome.ChromeDriver;
public class Test12 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/?affid=partnershi1");
Thread.sleep(5000);
driver.manage().window().maximize();
String x = driver.getCurrentUrl();
if (x.contains("https")) {
System.out.println("secured site");
} else 
{
System.out.println("unsecuredsite");
}
driver.close();
}
}