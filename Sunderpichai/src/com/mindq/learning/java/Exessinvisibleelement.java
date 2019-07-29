package com.mindq.learning.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exessinvisibleelement {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
WebDriver driver = new ChromeDriver();
//launch site
driver.get("http://semantic-ui.com/modules/dropdown.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
//collect invisible elements

	}

}
