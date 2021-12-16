package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class AdvancedFilter extends TestBase {

	@Test
	public void advFilter() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		account.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='checkard fixfilter']")).click();
		final WebElement category = driver.findElement(By.xpath("//*[@id=\"select2\"]"));
		final Select sel = new Select(category);
		sel.selectByVisibleText("Direct Client");
		Thread.sleep(4000);
		final WebElement industry = driver.findElement(By.xpath("//*[@id=\"select3\"]"));
		final Select se = new Select(industry);
		se.selectByVisibleText("Corporate Services");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
