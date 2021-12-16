package com.salewrx.qa.reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class UpdatedDateTest extends TestBase {

	@Test
	public void updatedDateTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement report = driver.findElement(By.xpath("//a[normalize-space()='Reports']"));
		report.click();
		Thread.sleep(3000);
		final WebElement reportOf = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		final Select select = new Select(reportOf);
		select.selectByVisibleText("Accounts");
		Thread.sleep(3000);
		final WebElement users = driver.findElement(By.xpath("//option[@value='98']"));
		users.click();
		final WebElement dateField = driver.findElement(By.xpath("//select[@ng-model='report.dateField']"));
		final Select se = new Select(dateField);
		se.selectByVisibleText("Updated Date");
		Thread.sleep(3000);
		final WebElement from = driver.findElement(By.xpath("//input[@id='datepickerfrom']"));
		from.click();
		from.sendKeys("08/01/2018");
		from.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final WebElement to = driver.findElement(By.xpath("//input[@id='datepickerto']"));
		to.click();
		to.sendKeys("08/17/2018");
		to.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement runReport = driver.findElement(By.xpath("//button[@class='btn btn-primary runreportbtn']"));
		js.executeScript("window.scrollBy(0,-250)", "runReport");
		runReport.click();
		Thread.sleep(3000);

	}
}
