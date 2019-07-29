import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class test22 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
int w=driver.manage().window().getSize().getWidth();
int h=driver.manage().window().getSize().getHeight();
System.out.println(w+""+h);
Dimension d=new Dimension(400,300);
int x=driver.manage().window().getPosition().getX();
int y=driver.manage().window().getPosition().getY();
System.out.println(x+"  "+y);
Point p=new Point(400, 100);
driver.manage().window().setPosition(p);
Thread.sleep(5000);
//close site
driver.close();

	}

}
