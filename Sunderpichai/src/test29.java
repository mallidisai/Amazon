import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test29 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.gmail.co.in");
List<WebElement> l=driver.findElements(By.xpath("(//table[2]/tbody/tn[5]/td[4]/input[@type='radio'][2]"));
driver.close();		
}
}
