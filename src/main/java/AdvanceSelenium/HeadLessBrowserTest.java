package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowserTest {
	
	public static void main(String[] args) {

		WebDriver htmlunitdriver = new HtmlUnitDriver();
		htmlunitdriver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Get title of the page
		System.out.println("Page title is : " + htmlunitdriver.getTitle());
		
		// Admin Login
		htmlunitdriver.findElement(By.name("txtUsername")).sendKeys("Admin");
		htmlunitdriver.findElement(By.name("txtPassword")).sendKeys("admin123");
		htmlunitdriver.findElement(By.name("Submit")).click();
		
		//Click On
		htmlunitdriver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")).click();
		System.out.println("Clicked on ASSIGN LEAVE");
		System.out.println("Executed through HtmlUnit Driver");


	}
}
