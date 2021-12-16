package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class InvalidPassword extends TestBase {

	@Test
	public void invalidPasswordTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {
			final WebDriverWait Wait = new WebDriverWait(driver, 20);
			final WebElement dropDown = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown']//a[@class='dropdown-toggle ng-binding']"));
			dropDown.click();
			final WebElement updateUser = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown open']//ul[@role='menu']//li//a[normalize-space()='Update Password']"));
			updateUser.click();
			final WebElement oldPassWord = driver.findElement(By.xpath("//input[@placeholder='Old Password']"));
			oldPassWord.click();
			Wait.until(ExpectedConditions.elementToBeClickable(oldPassWord));
			oldPassWord.sendKeys("Nani");
			final WebElement newPassword = driver.findElement(By.xpath("//input[@placeholder='New Password']"));
			Wait.until(ExpectedConditions.elementToBeClickable(newPassword));
			newPassword.click();
			Thread.sleep(3000);
			newPassword.sendKeys("rama");
			final WebElement reTypePassword = driver.findElement(By.xpath("//input[@placeholder='Retype Password']"));
			reTypePassword.click();
			reTypePassword.sendKeys("rama");
			final WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
			save.click();
			Thread.sleep(2000);

		} catch (final Exception e) {
		}
	}
}
