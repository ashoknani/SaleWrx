package com.salewrx.qa.accountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class PasswordMustBeSame extends TestBase {

	@Test
	public void passwordMustBeSameTest() throws Exception {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebDriverWait Wait = new WebDriverWait(driver, 20);
		final WebElement dropDown = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown']//a[@class='dropdown-toggle ng-binding']"));
		dropDown.click();
		final WebElement updateUser = driver.findElement(By.xpath("//li[@class='dropdown user-dropdown open']//ul[@role='menu']//li//a[normalize-space()='Update Password']"));
		updateUser.click();
		final WebElement oldPswrd = driver.findElement(By.xpath("//input[@placeholder='Old Password']"));
		Thread.sleep(5000);
		Wait.until(ExpectedConditions.elementToBeClickable(oldPswrd));
		oldPswrd.click();
		oldPswrd.sendKeys("rama");
		final WebElement newPswrd = driver.findElement(By.xpath("//input[@placeholder='New Password']"));
		Wait.until(ExpectedConditions.elementToBeClickable(newPswrd));
		newPswrd.click();
		newPswrd.sendKeys("Nani");
		final WebElement reEnterNewPswrd = driver.findElement(By.xpath("//input[@placeholder='Retype Password']"));
		Wait.until(ExpectedConditions.elementToBeClickable(reEnterNewPswrd));
		reEnterNewPswrd.click();
		reEnterNewPswrd.sendKeys("nani");
		final WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
		saveButton.click();
		Thread.sleep(3000);
	}

}
