import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class test17 {
public static void main(String[] args) throws InterruptedException {
//launch site
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.gmail.com");
Thread.sleep(5000);
//do log in
driver.findElement(By.name("username")).sendKeys("mallidisai123");
driver.findElement(By.xpath("//*[text()='text']")).click();
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("mallidi970");
driver.findElement(By.xpath("//*[text()='text']")).click();
Thread.sleep(5000);
driver.findElement(By.name("to")).sendKeys("narenbaka2@gmail.com");
driver.findElement(By.xpath("//*[@aria-label='messageBody'])[2]")).sendKeys("good night");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()='send']")).click();
Thread.sleep(5000);
//do logout
driver.findElement(By.xpath("//*[contains(@aria-label,'googleaccount')]/span")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("signout")).click();
Thread.sleep(5000);
//close site
driver.close();
}
}
