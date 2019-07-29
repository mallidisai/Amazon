import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class W2smstxtfile 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	//open text file for data reading
	File f1=new File("W2sms.txt");
	FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	//opentext file for results writing
	File f2=new File("w3.txt");
	FileWriter fw=new FileWriter(f2);
	BufferedWriter bw=new BufferedWriter(fw);
	//datadriven testing
	String l="";
	while((l=br.readLine())!=null)
	{
	  String[] p=l.split(",");
	  //launch site
	  System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.way2sms.com");
	  WebDriverWait w=new WebDriverWait(driver,20);
	  driver.manage().window().maximize();
	  w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
	  driver.findElement(By.name("mobileNo")).sendKeys(p[0]);
	  w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	  driver.findElement(By.name("password")).sendKeys(p[2]);
	  w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Login')])[1]")));
	  driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
	  Thread.sleep(5000);
	  //validations
	  try
	  {
		  if(p[0].length()==0 && driver.findElement(By.xpath("//b[text()='Enter your mobile number']")).isDisplayed())
		  {
			  bw.write("Blank mbno test passed"); 
			  bw.newLine();
		  }
		  else if(p[0].length()<10 && driver.findElement(By.xpath("//b[text()='Enter valid mobile number']")).isDisplayed())
		  {
			  bw.write("wrongsize mbno test passed");
			  bw.newLine();
		  }
		  else if(p[2].length()==0 && driver.findElement(By.xpath("(//b[text()='Enter password'])[1]")).isDisplayed())
		  {
			  bw.write("blank password test passed");
			  bw.newLine();
		  }
		  else if(p[1].equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//b[contains(text(),'not register')]")).isDisplayed())
		  {
			  bw.write("invalid mbno test passed");
			  bw.newLine();
		  }
		  else if(p[1].equalsIgnoreCase("valid") && p[3].equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//b[contains(text(),'Try Again.')]")).isDisplayed())
		  {
			  bw.write("invalid password test passed");
			  bw.newLine();
		  }
		  else if(p[1].equalsIgnoreCase("valid") && p[3].equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
		  
	  {
		  bw.write("login test passed");
		  bw.newLine();
	  }
		  else
		  {
			  SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
			     Date d=new Date();
			    String fname=sf.format(d)+".png";
			    File src= driver.getScreenshotAs(OutputType.FILE);
			   bw.write("login test failed and see"+fname);
		  }
	  }
	  catch(Exception ex)
	  {
		  bw.write(ex.getMessage());
		  bw.newLine();
	  }
	  //close site
	  driver.close();
	}//while loopending
	br.close();
	fr.close();
	bw.close();
	fw.close();
			   
			  
		  }
	  }
		  