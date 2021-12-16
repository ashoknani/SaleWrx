package com.salewrx.qa.openactivity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class OpenActivityTest extends TestBase {
	@Test
	public void openActivityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();

		final WebElement openActivitiesTest = driver.findElement(By.xpath("//a[normalize-space()='Open Activities']"));
		openActivitiesTest.click();
		Thread.sleep(3000);

	}
}
