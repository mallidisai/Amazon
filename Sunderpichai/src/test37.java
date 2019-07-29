import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test37 {
public static void main(String[] args) throws InterruptedException {
//Launch site
System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3school.com");
Thread.sleep(5000);
//go to frame and clickbutton
driver.switchTo().frame("iframeresult");
driver.findElement( By.xpath(("*//*[text()='tryit']"))).click();
Thread.sleep(5000);
//switch to alert,gettext and close alert
String x=driver.switchTo().alert().getText();
System.out.println(x);
driver.switchTo().alert().dismiss();
//back to page and close
driver.switchTo().defaultContent();
driver.close();
}
}
