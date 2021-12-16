package com.salewrx.qa.accountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateAccount extends TestBase {
	@Test
	public void createAccountTest() throws Exception {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {
			final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
			account.click();
			Thread.sleep(3000);
			final WebElement addAccount = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
			addAccount.click();
			final WebElement accountName = driver.findElement(By.xpath("//input[@name='accountname']"));
			accountName.click();
			accountName.sendKeys("Amazon.com");
			Thread.sleep(1000);
			final WebElement Select = driver.findElement(By.xpath("//select[@id='repeatSelect']"));
			final Select sel = new Select(Select);
			sel.selectByVisibleText("Srinivas D");
			final WebElement accountCategory = driver.findElement(By.xpath("//option[@value='Automation Anywhere']"));
			accountCategory.click();
			final WebElement webSite = driver.findElement(By.xpath("//input[@placeholder='www.example.com']"));
			webSite.click();
			webSite.sendKeys("www.amazon.com");
			final WebElement dropDown = driver.findElement(By.xpath("/html/body/div/div/form/div/div/section/div/div/div[2]/div/div/div[8]/div/select"));
			final Select Sel = new Select(dropDown);
			Sel.selectByVisibleText("Utilities");
			final WebElement employees = driver.findElement(By.xpath("//input[@placeholder='Employees']"));
			employees.click();
			employees.sendKeys("2000");
			Thread.sleep(3000);
			final WebElement anualRevenue = driver.findElement(By.xpath("//input[@placeholder='Annual Revenue']"));
			anualRevenue.click();
			anualRevenue.sendKeys("250,00,000");
			final WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
			description.click();
			description.sendKeys("Amazon is one of the Leading Business site");
			final WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
			saveButton.click();
			driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();
			Thread.sleep(5000);

		} catch (final Exception e) {

		}

	}
}