package com.salewrx.qa.Import;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class ImportTest extends TestBase {

	// @org.testng.annotations.BeforeTest
	// public void BeforeTest()
	// {
	// System.out.println("Test Class Initiate!d");
	// }

	@Test
	public void importTest() throws InterruptedException, AWTException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement Import = driver.findElement(By.xpath("//a[normalize-space()='Import']"));
		Import.click();
		Thread.sleep(3000);
		final WebElement insertTo = driver.findElement(By.xpath("/html/body/div//section/div/div/div[2]/div[1]/div/div/select"));
		final Select sel = new Select(insertTo);
		sel.selectByVisibleText("Account");
		Thread.sleep(2000);
		final WebElement assignedTo = driver.findElement(By.xpath("//select[@name='repeatSelect']"));
		final Select se = new Select(assignedTo);
		se.selectByVisibleText("Rathnakar Reddy");
		final String filename = "‪C:\\Users\\ashok\\Downloads\\Test.csv";
		final WebElement fileUploadctrl = driver.findElement(By.xpath("//input[@type='file']"));
		fileUploadctrl.sendKeys(filename);
		Thread.sleep(6000);
		final WebElement SaveBtn = driver.findElement(By.xpath("//div[@ng-show='accountShow']//button[@type='submit'][text()='Save']"));
		final boolean SaveButton = SaveBtn.isDisplayed() && SaveBtn.isEnabled();
		if (SaveButton) {
			System.out.println("File Uploaded Successfully!.");
		} else {
			System.out.println("File Not Uploaded,Something went wrong,please check the logs.");
			Thread.sleep(2000);
		}
	}
}

// @org.testng.annotations.AfterTest
// public void AfterTest()
// {
// System.out.println("Test Class Executed Successfully!.");
// driver.close();
// driver.quit();
