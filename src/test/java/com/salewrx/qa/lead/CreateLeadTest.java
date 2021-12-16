package com.salewrx.qa.lead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateLeadTest extends TestBase {
	@Test
	public void createLeadTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement leadTest = driver.findElement(By.xpath("//a[normalize-space()='Lead']"));
		leadTest.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']")).click();
		final WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/section/div/div/div[2]/div/div/div[1]/div/input"));
		firstName.sendKeys("James");
		final WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Smith");
		Thread.sleep(3000);
		final WebElement webSite = driver.findElement(By.xpath("//input[@placeholder='www.example.com']"));
		webSite.sendKeys("www.smithinfo.com");
		final WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='0123456789']"));
		mobile.sendKeys("(851)651-1234");
		Thread.sleep(3000);
		final WebElement email = driver.findElement(By.xpath("//input[@placeholder='abcde@aitacs.com']"));
		email.sendKeys("jamessmith@jsinfo.com");
		final WebElement company = driver.findElement(By.xpath("//input[@placeholder='Company Name']"));
		company.sendKeys("James Construction");
		final WebElement leadSource = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/section/div/div/div[2]/div/div/div[8]/div/select"));
		final Select se = new Select(leadSource);
		se.selectByVisibleText("Web");
		Thread.sleep(3000);
		final WebElement leadStatus = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/section/div/div/div[2]/div/div/div[11]/div/select"));
		final Select Se = new Select(leadStatus);
		Se.selectByVisibleText("Prospect");
		Thread.sleep(3000);
		final WebElement addressLine = driver.findElement(By.xpath("//input[@name='street']"));
		addressLine.sendKeys("182 Wall Street");
		final WebElement city = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/section/div/div/div[2]/div/div/div[13]/div/input"));
		city.sendKeys("Redwood City");
		final WebElement state = driver.findElement(By.xpath("/html/body/div[1]/div/form//div[2]/div/div/div[14]/div/input"));
		state.sendKeys("California");
		final WebElement country = driver.findElement(By.xpath("//input[@placeholder='Country']"));
		country.sendKeys("United States");
		final WebElement zip = driver.findElement(By.xpath("//input[@placeholder='555555']"));
		zip.sendKeys("1701444");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}

}
