import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class test33 {		
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver  driver=new ChromeDriver();
driver.get("https://www.gmail.co.in");
driver.findElement(By.name("userid")).sendKeys("mallidisai123@gmail.com");
driver.switchTo().frame(0);
//goto 1st frame
driver.findElement(By.name("password")).sendKeys("mallidi250");
driver.switchTo().defaultContent();
//back to page
driver.findElement(By.name("ok")).click();
driver.close();
}
{
}
}
