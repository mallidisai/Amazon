
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test19 {
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
// get x,y,width and Height of requried Element
WebElement e=driver.findElement(By.xpath("//*[@name='q']"));
int x = e.getLocation().getX();
int y = e.getLocation().getY();
int w = e.getSize().getWidth();
int h = e.getSize().getHeight();
// take full screenshot and convert to image
File src = driver.getScreenshotAs(OutputType.FILE);
BufferedImage fullimg = ImageIO.read(src);
// get element screenshot from full screenshot
BufferedImage eless = fullimg.getSubimage(x, y, w, h);
ImageIO.write(eless, "png", src);
// save element screenshot in HDD
File dest = new File("C:\\selenium\\ess.png");
FileHandler.copy(src, dest);
Thread.sleep(5000);
driver.close();
}
{
}
}
