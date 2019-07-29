import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test35 {
public static void main(String[] args) {					
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();		
driver.get("https://accounts.google.com/ServiceLogin?");
// gmail login
driver.findElement(By.id("Email")).sendKeys("mallidisai123@gmail.com");
driver.findElement(By.id("next")).click();
//Thread.sleep(1000);
driver.findElement(By.id("Password")).sendKeys("mallidi970");

}
}