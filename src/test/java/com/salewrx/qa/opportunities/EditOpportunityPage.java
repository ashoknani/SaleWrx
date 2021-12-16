package com.salewrx.qa.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class EditOpportunityPage extends TestBase {
	@Test

	public void editOpportunityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement opportunites = driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunites.click();
		Thread.sleep(3000);
		final WebElement checkBox = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
		checkBox.click();
		Thread.sleep(3000);
		final WebElement editOpportunity = driver.findElement(By.xpath("//i[@class='icon-compose']"));
		editOpportunity.click();
		Thread.sleep(5000);
		final WebElement Type = driver.findElement(By.xpath("//select[@ng-model='opp.type']"));
		final Select Sel = new Select(Type);
		Sel.selectByVisibleText("New Customer");

		Thread.sleep(5000);
		final WebElement stage = driver.findElement(By.xpath("//select[@ng-model='opp.stage']"));
		final Select sel = new Select(stage);
		sel.selectByVisibleText("Perception Analysis");

		Thread.sleep(5000);
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement updateButton = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		js.executeScript("window.scrollBy(0,250)", "saveButton");
		updateButton.click();
	}
}
