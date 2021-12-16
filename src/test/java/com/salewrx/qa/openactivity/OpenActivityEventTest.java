package com.salewrx.qa.openactivity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class OpenActivityEventTest extends TestBase {
	@Test

	public void openActivityEventTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement openActivitiesTest = driver.findElement(By.xpath("//a[normalize-space()='Open Activities']"));
		openActivitiesTest.click();
		Thread.sleep(3000);
		final WebElement addActivities = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addActivities.click();
		driver.findElement(By.xpath("//a[normalize-space()='Event']")).click();
		final WebElement accountName = driver.findElement(By.xpath("//input[@id='acntss']"));
		accountName.sendKeys("Amazon.com");
		accountName.click();
		Thread.sleep(3000);
		final WebElement cntName = driver.findElement(By.xpath("//*[@id=\"event\"]/div[2]/div[2]/div/multiple-autocomplete/div/ul/li/input"));
		cntName.sendKeys("Michel Jhonson");
		Thread.sleep(3000);
		final WebElement opportunityName = driver.findElement(By.xpath("//input[@id='opps1']"));
		opportunityName.click();
		opportunityName.sendKeys("Electronics");
		Thread.sleep(3000);
		final WebElement actType = driver.findElement(By.xpath("//*[@id=\"event\"]/div[4]/div/select"));
		final Select sel = new Select(actType);
		sel.selectByVisibleText("Call");
		Thread.sleep(5000);
		final WebElement outCome = driver.findElement(By.xpath("//*[@id=\"event\"]/div[5]/div/select"));
		outCome.sendKeys("Show");
		final WebElement startDate = driver.findElement(By.xpath("//*[@id=\"datepickerstart\"]"));
		startDate.click();
		startDate.sendKeys("09/30/2018");
		startDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final WebElement endDate = driver.findElement(By.xpath("//*[@id=\"datepickerend\"]"));
		endDate.click();
		endDate.sendKeys("09/30/2018");
		endDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[1]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[2]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[3]")).sendKeys("AM");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[1]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[2]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[3]")).sendKeys("PM");
		Thread.sleep(5000);
		final WebElement priority = driver.findElement(By.xpath("//*[@id=\"event\"]/div[11]/div/select"));
		priority.sendKeys("High");
		final WebElement Status = driver.findElement(By.xpath("//*[@id=\"event\"]/div[12]/div/select"));
		Status.sendKeys("In Progress");
		final WebElement description = driver.findElement(By.xpath("//*[@id=\"event\"]/div[13]/div/textarea"));
		description.sendKeys("Task Modifing at the Office");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[15]/div/div/div[2]/button")).click();

	}

}
