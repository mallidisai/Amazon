import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class skyscanner {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.skyscanner.co.in");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@class='bpk-button-30cpF bpk-button--secondary-lyMj0']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='bpk-select-2bJro']/option[94]")).click();
driver.findElement(By.xpath("//*[@id='culture-selector-locale']/option[6]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='culture-selector-currency']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='culture-selector-save']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='fsc-trip-type-selector-one-way']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='fsc-trip-type-selector-return']")).click();
}
}