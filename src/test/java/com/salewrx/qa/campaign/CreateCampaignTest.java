package com.salewrx.qa.campaign;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateCampaignTest extends TestBase {

	@Test

	public void createCampaignTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement contacts = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		contacts.click();
		driver.findElement(By.xpath("//a[normalize-space()='Mitchelli johnson']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Campaign']")).click();
		Thread.sleep(3000);
		final WebElement campaign = driver.findElement(By.xpath("//a[normalize-space()='Campaign']"));
		campaign.click();
		final WebElement composeMail = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/section/div/div/div[2]/h4/span/a/span/i[2]"));
		composeMail.click();
		Thread.sleep(3000);
		final WebElement campaignName = driver.findElement(By.xpath("//input[@name='campaignName']"));
		campaignName.sendKeys("Project Details");
		final WebElement emailTo = driver.findElement(By.xpath("//input[@name='recipient']"));
		emailTo.sendKeys("Laura Small(laurasmallrpa@gmail.com)");
		final WebElement subject = driver.findElement(By.xpath("//input[@placeholder='subject']"));
		subject.sendKeys("New Opportunities");
		final WebElement content = driver.findElement(By.xpath("//div[@ng-model='html']"));
		content.sendKeys("Contact person SiriG");
		Thread.sleep(5000);
		final WebElement send = driver.findElement(By.xpath("//button[normalize-space()='Send']"));
		send.click();
		Thread.sleep(3000);
		driver.navigate().back();
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement campaign1 = driver.findElement(By.xpath("//a[normalize-space()='Campaign']"));
		js.executeScript("window.scrollBy(0,250)", "campaign1");
		campaign1.click();

	}

}
