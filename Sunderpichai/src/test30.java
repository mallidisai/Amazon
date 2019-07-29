import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test30 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gmail.co.in");
//do login
driver.findElement(By.name("identifier")).sendKeys("mallidisai123@gmail.com");
driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("mallidi250");
driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
Thread.sleep(5000);
//Go to mainboxand getcountof mails(rows)
List<WebElement> l=driver.findElements(By.xpath("//*[@href='https://mail.google.com/mail/u/0/#inbox']"));
System.out.println(l.size());
//select checkbox in 5th row (mail)
driver.findElement(By.xpath("(//table)[4]/tbody/tr[5]/td[2]/div")).click();
Thread.sleep(5000);
//do log out
driver.findElement( By.xpath("//*[@class='gb_ab gbii']")).click();
Thread.sleep(5000);
//close site
driver.close();
}
}