import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class upload1G {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
WebDriverWait w=new WebDriverWait(driver,20);
w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
driver.manage().window().maximize();
//do login
driver.findElement(By.name("identifier")).sendKeys("mallidisai123");
w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
driver.findElement(By.xpath("//*[text()='Next']")).click();
//wait for password
w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
driver.findElement(By.name("password")).sendKeys("mallidi970");
w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
driver.findElement(By.xpath("//*[text()='Next']")).click();
w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Compose']")));
//Handle webnotification if exists
//click compose and fill fields
try
{
driver.findElement(By.xpath("//*[@class='bBr']")).click();	
}
catch(Exception ex)
{	
}
driver.findElement(By.xpath("//*[text()='Compose']")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
driver.findElement(By.name("to")).sendKeys("mallidisai123@gmail.com");
driver.findElement(By.name("subjectbox")).sendKeys("think logically");
driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("former is a great person");
driver.findElement(By.xpath("(//*[@aria-label='Attach files']/descendant::*[3])")).click();
//handle file upload window(javaRobot)
StringSelection x=new StringSelection("C:\\Users\\MavenPC1\\Pictures\\Saved Pictures\\12.jpg");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a1 aaA aMz af2')")));
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='send']"))).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Messagesent')]")));
//do logout
driver.findElement(By.xpath("//*[contains[@aria-label='GoogleAccount']/span")).click();
w.until(ExpectedConditions.elementToBeClickable(By.linkText("signout")));
driver.findElement(By.linkText("signout")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//close site
driver.close();

	}
}










