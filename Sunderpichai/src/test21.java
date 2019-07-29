import org.openqa.selenium.chrome.ChromeDriver;

public class test21 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selemium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
Thread.sleep(6000);
driver.close();
	}

}
