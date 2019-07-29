package google;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Google6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter browser name");
String x = sc.nextLine();
WebDriver driver;// declare object to interface
if (x.equals("chrome")) {
// define object to corresponding concreteclass
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
driver = new ChromeDriver();
} else if (x.equals("firefox")) {
System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
driver = new FirefoxDriver();
} else if (x.equals("ie")) {
System.setProperty("webdriver.driver", "C:\\selenium\\chromedriver.exe");
driver = new InternetExplorerDriver();
} else
{
}
// launch site
}
}