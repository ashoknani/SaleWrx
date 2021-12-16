package com.salewrx.qa.emailtemplates;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class EmailTemplatesTest extends TestBase {

	@Test
	public void emailTemplatesTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement emailTemplates = driver.findElement(By.xpath("//a[normalize-space()='Email Templates']"));
		emailTemplates.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']")).click();
		final WebElement TemplateName = driver.findElement(By.xpath("/html/body//form/div//section//div[2]/div[1]/div/input"));
		TemplateName.sendKeys("Projects Informariona");
		Thread.sleep(3000);
		final WebElement Subject = driver.findElement(By.xpath("//input[@ng-model='addtemplate.subject']"));
		Subject.sendKeys("New Opportunities listout");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);

	}
}
