package com.salewrx.qa.signinpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;

public class ForgetMyPassword extends TestBase {
	@Test

	public void forgetPasswordTest() {
		try {

			final WebElement iForgotPswd = driver.findElement(By.xpath("//a[normalize-space()='I forgot my password?']"));
			iForgotPswd.click();
			Thread.sleep(5000);
			final WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
			email.sendKeys("ramaprakash.p@aitacs.com");
			email.submit();
			Thread.sleep(2000);
			final WebElement okButton = driver.findElement(By.xpath("//a[@class='btn btn-reset btn-block']"));
			okButton.submit();
			Thread.sleep(5000);
		} catch (final Exception e) {

		}

	}
}
