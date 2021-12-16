package com.salewrx.qa.contactpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class ContactPage extends TestBase {
	@Test

	public void contactPage() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement contactPage = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		contactPage.click();
		Thread.sleep(2000);
	}

}
