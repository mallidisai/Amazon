package google;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
public class Test8 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.sentia.in/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[contains(@src,'pay_online.jpg')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//*[contains(@href,'transportfee')])[1])")).click();
Thread.sleep(5000);
driver.quit();
}
}