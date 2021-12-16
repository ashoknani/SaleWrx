package com.salewrx.qa.accountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;
import com.salewrx.test.helpers.Xls_Reader;

public class DataDrivenTest extends TestBase {
	@Test
	public void CreateAccountTest() throws Exception {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		account.click();
		final WebElement addAccount = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addAccount.click();
		// get test data from excel:
		final Xls_Reader reader = new Xls_Reader(".\\src\\test\\java\\com\\testdata\\CreateNewTestData.xlsx");
		final String accountName = reader.getCellData("Sheet1", "AccountName", 2);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(accountName);
		Thread.sleep(2000);
		final String assignedTo = reader.getCellData("Sheet1", "AssignedTo", 2);
		driver.findElement(By.xpath("//select[@id='repeatSelect']")).sendKeys(assignedTo);
		Thread.sleep(2000);
		final WebElement accountCategory = driver.findElement(By.xpath("//option[@value='Automation Anywhere']"));
		accountCategory.click();
		final String website = reader.getCellData("Sheet1", "Website", 2);
		driver.findElement(By.xpath("//input[@placeholder='www.example.com']")).sendKeys(website);
		Thread.sleep(2000);
		final String industry = reader.getCellData("Sheet1", "Industry", 2);
		System.out.println(industry);
		driver.findElement(By.xpath("/html/body/div/div/form/div/div/section/div/div/div[2]/div/div/div[8]/div/select")).sendKeys(industry);
		final String employees = reader.getCellData("Sheet1", "Employees", 2);
		System.out.println(employees);
		driver.findElement(By.xpath("//input[@placeholder='Employees']")).sendKeys(employees);
		Thread.sleep(2000);
		final String annualRevenue = reader.getCellData("Sheet1", "AnnualRevenue", 2);
		driver.findElement(By.xpath("//input[@placeholder='Annual Revenue']")).sendKeys(annualRevenue);
		Thread.sleep(2000);
		final String description = reader.getCellData("Sheet1", "Description", 2);
		driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys(description);
		final WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		saveButton.click();
		Thread.sleep(3000);
	}

}
