package com.salewrx.qa.quotes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class QuoteCreationTest extends TestBase {

	@Test

	public void quoteCreation() throws InterruptedException, IOException {
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
		final WebElement addProduct = driver.findElement(By.xpath("//a[normalize-space()='Add Product']"));
		addProduct.click();
		js.executeScript("window.scrollBy(0,550)", "addProduct");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);

	}
}