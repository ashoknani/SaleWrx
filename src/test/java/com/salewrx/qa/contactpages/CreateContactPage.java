package com.salewrx.qa.contactpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateContactPage extends TestBase {

	@Test

	public void createContactPageTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		try {
			final Actions action = new Actions(driver);
			final WebElement contactPage = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
			contactPage.click();
			Thread.sleep(3000);
			final WebElement addAccount = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
			addAccount.click();
			Thread.sleep(3000);
			final WebElement accountName = driver.findElement(By.xpath("//input[@id='tags']"));
			accountName.click();
			accountName.sendKeys("amazon.com");
			final WebElement prefix = driver.findElement(By.xpath("//input[@placeholder='Salutation']"));
			prefix.sendKeys("Mr");
			final WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstName.sendKeys("Sallman");
			Thread.sleep(3000);
			final WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastName.sendKeys("Deborah");
			final WebElement jobTitle = driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
			jobTitle.sendKeys("Senior Manager Procuremet-indirect");
			final WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			email.sendKeys("dsallman@directs.com");
			Thread.sleep(3000);
			final WebElement mobileNumber = driver.findElement(By.xpath("//input[@placeholder='Mobile']"));
			mobileNumber.sendKeys("(848) 710-1210");
			Thread.sleep(3000);
			final WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
			phoneNumber.sendKeys("(414) 760-8994");
			final WebElement alternativePhoneNumber = driver.findElement(By.xpath("//input[@placeholder='Alternate Phone Number']"));
			alternativePhoneNumber.sendKeys("(484) 710-1210");
			final WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
			description.sendKeys("One Of The Leading e commerce company");
			Thread.sleep(5000);
			final JavascriptExecutor js = (JavascriptExecutor) driver;
			final WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
			js.executeScript("window.scrollBy(0,350)", "SaveButton");
			action.click(saveButton).build().perform();
			Thread.sleep(5000);

		} catch (final InterruptedException e) {
			e.printStackTrace();
		}

	}
}
