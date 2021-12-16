package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class ActivityHistory extends TestBase {
	@Test

	public void activityHistoryTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement amazon = driver.findElement(By.xpath("//a[normalize-space()='amazon.com']"));
		amazon.click();
		final WebElement activityHistory = driver.findElement(By.xpath("//label[normalize-space()='Activity History']"));
		activityHistory.click();
		// WebElement call =
		// driver.findElement(By.xpath("//a[normalize-space()='Call']"));
		// call.click();
		Thread.sleep(3000);
	}

}
