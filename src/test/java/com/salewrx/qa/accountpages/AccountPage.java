package com.salewrx.qa.accountpages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class AccountPage extends TestBase {
@Test

	public void accountPageTest() throws Exception {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		account.click();
		Thread.sleep(2000);

	}

	
}
