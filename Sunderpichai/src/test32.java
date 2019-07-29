import java.sql.Array;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class test32 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","c://selenium//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
	
		
//Launching the site.				
    driver.get("http://demo.guru99.com/popup.php");			
driver.manage().window().maximize();		
 ArrayList x=new ArrayList(driver.getWindowHandles());
 driver.switchTo().window((String)x.get(1));
 driver.get("www.google.com");
 driver.close();
 driver.switchTo().window((String)x.get(0));




}
	}


