import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test25 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		List<WebElement> l=driver.findElements(By.xpath("(//table)[4]/tbody"));
		System.out.println(l.size());
}
}
