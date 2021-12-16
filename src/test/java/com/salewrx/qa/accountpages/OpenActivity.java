package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class OpenActivity extends TestBase {
	@Test

	public void openActivityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement amazonName = driver.findElement(By.xpath("//a[normalize-space()='amazon.com']"));
		amazonName.click();
		final WebElement openActivity = driver.findElement(By.xpath("//label[normalize-space()='Open Activity']"));
		openActivity.click();
		Thread.sleep(2000);
	}

}
