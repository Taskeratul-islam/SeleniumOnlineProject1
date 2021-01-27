package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/a")).click();
		
		WebElement downloadbtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/a")) ;
		String sourceurl = downloadbtn.getAttribute("href"); 
		String wgetcommand = "cmd /c C:\\\\Wget\\\\wget.exe -P E: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe "+sourceurl;
	
		try {
			
			Process execution = Runtime.getRuntime().exec(wgetcommand);
			
			System.out.println("File has successfully downloded....");
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
