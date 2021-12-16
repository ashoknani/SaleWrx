package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class RelatedLists extends TestBase {
	@Test

	public void relatedListsTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement amazon = driver.findElement(By.xpath("//a[normalize-space()='amazon.com']"));
		amazon.click();
		final WebElement files = driver.findElement(By.xpath("//label[normalize-space()='Files']"));
		files.click();
		Thread.sleep(3000);
		final WebElement childAccount = driver.findElement(By.xpath("//label[normalize-space()='Child Accounts']"));
		childAccount.click();
		Thread.sleep(3000);
		final WebElement contactInformation = driver.findElement(By.xpath("//label[normalize-space()='Contact Information']"));
		contactInformation.click();
		Thread.sleep(3000);
		final WebElement opportunityInformation = driver.findElement(By.xpath("//label[normalize-space()='Opportunity Information']"));
		opportunityInformation.click();
		final WebElement openActivity = driver.findElement(By.xpath("//label[normalize-space()='Open Activity']"));
		openActivity.click();
		final WebElement activityHistory = driver.findElement(By.xpath("//label[normalize-space()='Activity History']"));
		activityHistory.click();
		Thread.sleep(5000);

	}

}
