package com.salewrx.qa.emailtemplates;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class ActiveInactiveRecords extends TestBase {

	@Test(priority = 1)
	public void inActiveRecords() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		account.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/section//tr[3]/td[1]/input")).click();
		final WebElement inActivateAccount = driver.findElement(By.xpath("/html/body//div[1]/div/section//div[2]/div[1]/h4/span[2]/a[2]/i"));
		inActivateAccount.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"delete\"]/div/div/div/div/div[2]/a")).click();
		driver.navigate().back();
		final WebElement Account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		Account.click();
		Thread.sleep(2000);
		final WebElement ActivateAccount = driver.findElement(By.xpath("/html/body/div[1]//div[1]/div/section//div[2]/div[1]/h4/span[1]/a[2]/i"));
		ActivateAccount.click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/section/div/div/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/section/div/div/div[2]/h4/span[2]/a/i")).click();
		Thread.sleep(3000);
		final WebElement activeType = driver.findElement(By.xpath("//*[@id=\"delete\"]/div/div/div/div/div[2]/a"));
		activeType.click();
		Thread.sleep(3000);

	}

	@Test(priority = 0)
	public void searchTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		account.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-search5']")).click();
		Thread.sleep(2000);
		final WebElement searchByAccount = driver.findElement(By.xpath("//input[@id='tags']"));
		searchByAccount.sendKeys("amazon");

	}
}
