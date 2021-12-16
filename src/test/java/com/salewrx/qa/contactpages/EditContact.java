package com.salewrx.qa.contactpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class EditContact extends TestBase {
	@Test
	public void editAccountTest() throws InterruptedException, IOException {
		// LoginPage :
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();

		// Click On ContactPage:
		final WebElement contactPage = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		contactPage.click();
		Thread.sleep(3000);
		// Select Required CheckBox:
		final WebElement checkBox = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
		checkBox.click();
		// Click On Edit Contact:
		final WebElement editContact = driver.findElement(By.xpath("//i[@class='icon-compose']"));
		editContact.click();
		Thread.sleep(2000);
		// Required Details Modified and Update Details:
		final WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Dickson");
		final WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Nedra");
		Thread.sleep(2000);
		final WebElement jobTitle = driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
		jobTitle.sendKeys("Global Supplier Inclusion and Sustainability Lead");
		final WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phoneNumber.sendKeys("(675) 740-656");
		Thread.sleep(2000);
		final WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Decsription']"));
		description.sendKeys(
				"We will try Manpower next and reach out to Jamiel Saliba (Tapfin) Sr. VP.  Scheduled call for March 30th 9 AM EST - Call summary with Nedra Dickson - Accenture has 12 Tier 1 suppliers with 3 of them being major players - TEK Systems, Adecco and Manpower and the rest large diversity suppliers. These suppliers are contracted for 5 years. They are currently in their 4th year of the contract. So they are going out to RFP end of this year. These Tier 1 suppliers get every requirement that Accenture uses staffing suppliers for. This program also includes SOW opportunities. In addition, they have about 300 Tier 2 suppliers almost all diverse with very few job requirements getting past the Tier 1 group. These Tier 2 suppliers probably service only niche areas or difficult locations to staff or high profile/hard to find skillsets. Accenture manages their own supply base but utilizes Fieldglass as their VMS tool.");
		// Click On Updated Button:
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement update = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		js.executeScript("window.scrollBy(0,350)", "update");
		update.click();
	}
}
