import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class vbcabledriver1 {

	public static void main(String[] args) throws InterruptedException {
//get text
Scanner sc=new Scanner(System.in);
System.out.println("Enter text");
String x=sc.nextLine();
//suggest to chrome to use virtualmedia
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--use-fake-ui-for-media-stream=1");
ChromeDriver driver=new ChromeDriver(co);
//launch google site
driver.get("http://www.google.co.in");
WebDriverWait w=new WebDriverWait(driver,20);
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='q']")));
driver.manage().window().maximize();
//click on micicon in googlepage
driver.findElement(By.xpath("//*[@class='voice_search_button']/span")).click();
Thread.sleep(3000);
//convert into voice
System.setProperty("mbrola.base", "C://selenium//mbr301d");
VoiceManager vm=VoiceManager.getInstance();
Voice v=vm.getVoice("mbrola-us1");
v.allocate();
v.speak(x);
v.deallocate();
Thread.sleep(1000);
//close site

	}
}
