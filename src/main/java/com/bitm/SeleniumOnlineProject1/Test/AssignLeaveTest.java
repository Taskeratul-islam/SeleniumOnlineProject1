package com.bitm.SeleniumOnlineProject1.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject1.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject1.Utils.XpathUtils;

public class AssignLeaveTest {
	
	private WebDriver driver = null;
	
	@Test
	public void assignleavetest()
	{
		driver = DriverManager.driver;
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.assignleaveModule.assignleavebtn)));
		
		driver.findElement(By.xpath(XpathUtils.assignleaveModule.assignleavebtn)).click();
	
	}

}
