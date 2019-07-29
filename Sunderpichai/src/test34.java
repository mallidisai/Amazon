import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class test34 {		
public static void main(String[] args) {	
System.setProperty("webdriver.chrome.driver","c://selenium//chrome.driver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.gmail.com");
driver.switchTo().frame(0);
//go to firstframe in page
driver.switchTo().frame(0);
//go to firstframe in first frame ofpage
driver.findElement(By.name("userid")).sendKeys("mallidisai1232@gmail.com");
driver.switchTo().parentFrame();
//back to 1st frame of page
driver.switchTo().frame(1);
//goto secondframe in first of page
driver.switchTo().defaultContent();
//back to page
driver.findElement(By.name("ok")).click();	
}
}
