package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class ContactInformation extends TestBase {

	@Test

	public void contactInformationTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement amazon = driver.findElement(By.xpath("//a[normalize-space()='amazon.com']"));
		amazon.click();
		final WebElement contactInformation = driver.findElement(By.xpath("//label[normalize-space()='Contact Information']"));
		contactInformation.click();
		final WebElement mitchelJhonson = driver.findElement(By.xpath("//a[normalize-space()='Mitchel jhonson']"));
		mitchelJhonson.click();
		Thread.sleep(3000);
	}
}
