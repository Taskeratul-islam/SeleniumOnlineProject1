package com.bitm.SeleniumOnlineProject1.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class DriverManager {
	
	
	static {
		
	System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\chromedriver_win32 (2)\\chromedriver.exe");
	
	}
	
	public static WebDriver driver = new ChromeDriver();
	
	DriverManager()
	{
		
	}

}
