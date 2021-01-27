package com.bitm.SeleniumOnlineProject1.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject1.DTO.LoginDTO;
import com.bitm.SeleniumOnlineProject1.DataProvider.LoginDataProvider;
import com.bitm.SeleniumOnlineProject1.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject1.Utils.TestNGReporting;
import com.bitm.SeleniumOnlineProject1.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject1.Utils.XpathUtils;


@Listeners(TestNGReporting.class)
public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void homepagetitleverify() 
	{

		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.baseUrl);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.homepageTitle);
		System.out.println("Homepage title verified!");
	}

	@Test(dependsOnMethods = "homepagetitleverify",dataProvider = "loginData",dataProviderClass = LoginDataProvider.class)

	public void logintest(List<LoginDTO> logdata) {

		for (LoginDTO login : logdata) {
			driver.findElement(By.xpath(XpathUtils.LoginModule.username)).sendKeys(login.getUsername());
			driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys(login.getPassword());
			driver.findElement(By.id(XpathUtils.LoginModule.LoginBtn)).click();

			//Implicit wait
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			System.out.println("Logged in Successfully");

		}
	}
}
