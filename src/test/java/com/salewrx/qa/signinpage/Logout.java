package com.salewrx.qa.signinpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;

public class Logout extends TestBase {

	@Test
	public void logOutTest() throws Exception {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {
			final WebDriverWait Wait = new WebDriverWait(driver, 20);
			final String getUser = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown']")).getText();
			System.out.println(getUser);
			Assert.assertEquals(getUser, "Ramaprakash");
			final WebElement ramPrakash = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown']//a[@data-toggle='dropdown']"));
			Wait.until(ExpectedConditions.elementToBeClickable(ramPrakash));
			ramPrakash.click();
			Thread.sleep(5000);
			final WebElement logout = driver.findElement(By.xpath("//header//nav//div//ul//ul[@role='menu']//a[@ng-click='logout()']"));
			logout.click();

		} catch (final Exception e) {
		}
	}
}
