import org.openqa.selenium.chrome.ChromeDriver;
public class test42 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
Thread.sleep(5000);
//go to gmail
driver.navigate().to("http://www.gmail.com");
Thread.sleep(5000);
//back to google
driver.navigate().back();
Thread.sleep(5000);
//forward to gmail
driver.navigate().forward();
Thread.sleep(5000);
//refresh page
driver.navigate().refresh();
}
}
