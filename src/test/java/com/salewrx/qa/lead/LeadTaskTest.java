package com.salewrx.qa.lead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class LeadTaskTest extends TestBase {
	@Test
	public void leadTaskTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		final WebElement openActivitiesTest = driver.findElement(By.xpath("//a[normalize-space()='Open Activities']"));
		openActivitiesTest.click();
		Thread.sleep(3000);
		final WebElement addActivities = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addActivities.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"task\"]/div[1]/div/input")).click();
		final WebElement leadName = driver.findElement(By.xpath("//*[@id=\"leads\"]"));
		leadName.sendKeys("James Smith");
		final WebElement activityType = driver.findElement(By.xpath("//*[@id='task']/div[4]/div/select"));
		final Select se = new Select(activityType);
		se.selectByVisibleText("Email");
		Thread.sleep(3000);
		final WebElement priority = driver.findElement(By.xpath("//*[@id='task']/div[5]/div/select"));
		final Select Se = new Select(priority);
		Se.selectByVisibleText("High");
		Thread.sleep(3000);
		final WebElement dueDate = driver.findElement(By.xpath("//*[@id=\"datepickerdue\"]"));
		dueDate.click();
		dueDate.sendKeys("08/31/2018");
		dueDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final WebElement status = driver.findElement(By.xpath("//*[@id=\"task\"]/div[7]/div/select"));
		final Select Sel = new Select(status);
		Sel.selectByVisibleText("Not started");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"repeatSelect\"]/option[1]")).click();
		final WebElement save = driver.findElement(By.xpath("//button[@ng-click='addTaskForm()']"));
		save.click();
		driver.navigate().back();
		Thread.sleep(2000);
		final WebElement leadTest = driver.findElement(By.xpath("//a[normalize-space()='Lead']"));
		leadTest.click();
		Thread.sleep(5000);
		final WebElement jamesSmith = driver.findElement(By.xpath("/html/body/div/div/div/div/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/a"));
		js.executeScript("window.scrollBy(0,-250)");
		jamesSmith.click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/section/div/div/div[2]/div[2]/div/div/ul/li[2]/label")).click();
		Thread.sleep(3000);

	}
}
