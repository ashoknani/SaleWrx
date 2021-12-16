package com.salewrx.qa.quotes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;
import com.salewrx.test.helpers.Xls_Reader;

public class NewQuoteTest extends TestBase {
	@Test

	public void newQuoteTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement quotes = driver.findElement(By.xpath("//a[normalize-space()='Quotes']"));
		js.executeScript("window.scrollBy(0,250)", "quotes");
		quotes.click();
		Thread.sleep(5000);
		final WebElement addQuote = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addQuote.click();
		Thread.sleep(5000);
		// get test data from excel:
		final Xls_Reader reader = new Xls_Reader(".\\src\\test\\java\\com\\salewrx\\test\\data\\New Quote.xlsx");
		final String RFQ = reader.getCellData("Sheet1", "RFQ", 2);
		driver.findElement(By.xpath("//input[@placeholder='RFQ']")).sendKeys(RFQ);
		final String Phone = reader.getCellData("Sheet1", "Phone", 2);
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys(Phone);
		Thread.sleep(3000);
		final String Fax = reader.getCellData("Sheet1", "Fax", 2);
		driver.findElement(By.xpath("//input[@placeholder='Fax-Number']")).sendKeys(Fax);
		final String Email = reader.getCellData("Sheet1", "Email", 2);
		driver.findElement(By.xpath("//input[@placeholder='test@mail.com']")).sendKeys(Email);
		final String Tax = reader.getCellData("Sheet1", "Tax", 2);
		driver.findElement(By.xpath("//input[@placeholder='Tax']")).sendKeys(Tax);
		Thread.sleep(2000);
		final String PaymentTerms = reader.getCellData("Sheet1", "PaymentTerms", 2);
		driver.findElement(By.xpath("//input[@placeholder='Payment terms net validity days']")).sendKeys(PaymentTerms);
		final String ExpirationDate = reader.getCellData("Sheet1", "ExpirationDate", 2);
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(ExpirationDate);
		final String EstimatedDelivery = reader.getCellData("Sheet1", "EstimatedDelivery", 2);
		driver.findElement(By.xpath("//input[@placeholder='Estimated Delivery in days']")).sendKeys(EstimatedDelivery);
		Thread.sleep(2000);
		final WebElement addProduct = driver.findElement(By.xpath("//a[normalize-space()='Add Product']"));
		addProduct.click();
		Thread.sleep(3000);
		final WebElement save = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
		js.executeScript("window.scrollBy(0,550)", "save");
		save.click();
		Thread.sleep(3000);
	}

}
