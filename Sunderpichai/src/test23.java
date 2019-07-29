import org.openqa.selenium.chrome.ChromeDriver;
public class test23 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in");
Thread.sleep(5000);
 //maximize
driver.manage().window().maximize();
Thread.sleep(5000);
//get size and change size	
}
}
