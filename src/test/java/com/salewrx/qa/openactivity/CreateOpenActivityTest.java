package com.salewrx.qa.openactivity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CreateOpenActivityTest extends TestBase {
	@Test
	public void createOpenActivityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement openActivitiesTest = driver.findElement(By.xpath("//a[normalize-space()='Open Activities']"));
		openActivitiesTest.click();
		Thread.sleep(3000);
		final WebElement addActivities = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addActivities.click();
		Thread.sleep(3000);
		final WebElement leadName = driver.findElement(By.xpath("//input[@id='acnts']"));
		leadName.sendKeys("Amazon.com");
		leadName.click();
		final WebElement cntName = driver.findElement(By.xpath("//input[@ng-keydown='keyParser($event)']"));
		cntName.sendKeys("Michel Jhonson");
		final WebElement opportunityName = driver.findElement(By.xpath("//input[@id='opps']"));
		opportunityName.sendKeys("ITS");
		opportunityName.click();
		Thread.sleep(2000);
		final WebElement actType = driver.findElement(By.xpath("//*[@id='task']/div[4]/div/select"));
		final Select sel = new Select(actType);
		sel.selectByVisibleText("Back Office");
		Thread.sleep(3000);
		final WebElement priority = driver.findElement(By.xpath("//div[@id='task']/div[5]/div/select"));
		final Select se = new Select(priority);
		se.selectByVisibleText("High");
		Thread.sleep(3000);
		final WebElement dueDate = driver.findElement(By.xpath("//input[@id='datepickerdue']"));
		dueDate.click();
		dueDate.sendKeys("09/30/2018");
		dueDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='remindme']")).click();
		Thread.sleep(2000);
		final WebElement status = driver.findElement(By.xpath("//div[@id='task']/div[7]/div/select"));
		final Select Se = new Select(status);
		Se.selectByVisibleText("Not started");
		Thread.sleep(3000);
		final WebElement description = driver.findElement(By.xpath("//*[@id=\"task\"]/div[8]/div/textarea"));
		description.sendKeys("Even I Discuss about project");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@ng-selected='addtask.taskAssigneeVO.includes(option.id)'][normalize-space()='Ramaprakash R']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click='addTaskForm()']")).click();
		driver.navigate();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		Thread.sleep(3000);

	}

}
