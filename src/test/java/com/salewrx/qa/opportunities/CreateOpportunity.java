package com.salewrx.qa.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateOpportunity extends TestBase {
	@Test
	public void createOpportunityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement opportunites = driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunites.click();
		Thread.sleep(3000);
		final WebElement addOpportunity = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addOpportunity.click();
		final WebElement accountName = driver.findElement(By.xpath("//input[@placeholder='Account Name']"));
		accountName.sendKeys("Hcl.com");
		Thread.sleep(3000);
		final WebElement contactName = driver.findElement(By.xpath("//input[@placeholder='Contact Name']"));
		contactName.sendKeys("Mitchelli johnson");
		Thread.sleep(3000);
		final WebElement opportunityName = driver.findElement(By.xpath("//input[@placeholder='Opportunity Name']"));
		opportunityName.sendKeys("Electronics");
		final WebElement opportunityTechnology = driver.findElement(By.xpath("//input[@placeholder='Opportunity Tech']"));
		opportunityTechnology.sendKeys("VLSI");
		final WebElement closeDate = driver.findElement(By.xpath("//input[@id='datepicker']"));
		closeDate.click();
		closeDate.sendKeys("09/09/2018");
		closeDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final WebElement Type = driver.findElement(By.xpath("//select[@ng-model='addopportunity.type']"));
		final Select Sel = new Select(Type);
		Sel.selectByVisibleText("Old Customer");

		Thread.sleep(3000);
		final WebElement stage = driver.findElement(By.xpath("//select[@ng-model='addopportunity.stage']"));
		final Select sel = new Select(stage);
		sel.selectByVisibleText("Prospecting");

		Thread.sleep(3000);
		final WebElement campaginSource = driver.findElement(By.xpath("//input[@placeholder='Campaign Source']"));
		campaginSource.sendKeys("Web");
		final WebElement percentage = driver.findElement(By.xpath("//input[@placeholder='Percentage']"));
		percentage.sendKeys("19");
		final WebElement Budget = driver.findElement(By.xpath("//input[@name='budgetconformed']"));
		Budget.sendKeys("250000");
		final WebElement Amount = driver.findElement(By.xpath("//input[@placeholder='Amount']"));
		Amount.sendKeys("10000");
		final WebElement discoveryCompleted = driver.findElement(By.xpath("//input[@name='discoverycompleted']"));
		discoveryCompleted.sendKeys("Yes");
		Thread.sleep(2000);
		final WebElement lossReason = driver.findElement(By.xpath("//input[@placeholder='Reason']"));
		lossReason.sendKeys("Yes");
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		js.executeScript("window.scrollBy(0,250)", "saveButton");
		saveButton.click();
		driver.navigate();
		final WebElement accountPage = driver.findElement(By.xpath("//a[normalize-space()='Accounts']"));
		accountPage.click();
		final WebElement Hcl = driver.findElement(By.xpath("//a[normalize-space()='Hcl.com']"));
		Hcl.click();
		Thread.sleep(5000);
		final WebElement opportunityInformation = driver.findElement(By.xpath("//label[normalize-space()='Opportunity Information']"));
		opportunityInformation.click();
		final WebElement contactPage = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		contactPage.click();
		Thread.sleep(3000);
		final WebElement mitchelliJhonson = driver.findElement(By.xpath("//a[normalize-space()='Mitchelli johnson']"));
		mitchelliJhonson.click();
		final WebElement OpportunityInformation = driver.findElement(By.xpath("//label[normalize-space()='Opportunity Information']"));
		OpportunityInformation.click();
		Thread.sleep(3000);
	}

}
