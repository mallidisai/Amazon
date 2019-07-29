import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldpress {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://wordpress.com/create-website/");
driver.manage().window().maximize();
}
}
