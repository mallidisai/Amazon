

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
Thread.sleep(5000);
String t = driver.getTitle();
System.out.println(t);
String s = driver.getPageSource();
System.out.println(s);
driver.close();
}
}
