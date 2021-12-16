package com.salewrx.qa.accountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class Profile extends TestBase {
	@Test
	public void profileTest() throws Exception {

		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {
			final WebElement dropDown = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown']//a[@class='dropdown-toggle ng-binding']"));
			dropDown.click();
			Thread.sleep(2000);
			final WebElement myAccount = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown open']//ul[@role='menu']//li//a[normalize-space()='My Account']"));
			myAccount.click();
			Thread.sleep(3000);
			final WebElement edit = driver.findElement(By.xpath("//button[@ng-click='editUser()']"));
			edit.click();
			final JavascriptExecutor js = (JavascriptExecutor) driver;
			final WebElement updateUser = driver.findElement(By.xpath("//button[text()='Update']"));
			js.executeScript("arguments[0].scrollIntoView(true);", updateUser);
			Thread.sleep(2000);
			updateUser.click();
		} catch (final Exception e) {

		}
	}

}
