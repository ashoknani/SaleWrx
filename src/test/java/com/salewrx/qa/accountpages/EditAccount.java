
package com.salewrx.qa.accountpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class EditAccount extends TestBase {

	@Test

	public void editAccontTest() throws InterruptedException, IOException {
		// LoginPage:
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {

			final WebElement amazon = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]"));
			amazon.click();
			Thread.sleep(2000);
			final WebElement editAccount = driver.findElement(By.xpath("//i[@class='icon-compose']"));
			editAccount.click();
			Thread.sleep(5000);
			final WebElement Select = driver.findElement(By.xpath("//select[@id='repeatSelect']"));
			final Select sel = new Select(Select);
			sel.selectByVisibleText("Rathnakar Reddy");
			// WebElement website =
			// driver.findElement(By.xpath("//input[@ng-blur='blurValidateCheck($event)']"));
			// website.click();
			// website.sendKeys("www.amazon.com");
			final WebElement employees = driver.findElement(By.xpath("//input[@type='number']"));
			employees.click();
			employees.sendKeys("2500");
			Thread.sleep(3000);
			final WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Decsription']"));
			description.click();
			Thread.sleep(3000);
			description.sendKeys("amazon is one of the Leading Business site");
			final JavascriptExecutor js = (JavascriptExecutor) driver;
			final WebElement updateButton = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
			js.executeScript("window.scrollBy(0,-350)", "");
			updateButton.click();
			Thread.sleep(5000);
		} catch (final Exception e) {

		}
	}

}
