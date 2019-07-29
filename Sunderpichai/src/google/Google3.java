package google;

import org.openqa.selenium.opera.OperaDriver;

public class Google3 {
public static void main(String[] args){
System.setProperty("webdriver.opera.driver","C:\\selenium\\operadriver_win64\\operadriver.exe");
OperaDriver kumar=new OperaDriver();
System.out.println(kumar.location());
	}
}
