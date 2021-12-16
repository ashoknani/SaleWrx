package com.salewrx.qa.lead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class LeadEventTest extends TestBase {
	@Test
	public void leadEventTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement openActivitiesTest = driver.findElement(By.xpath("//a[normalize-space()='Open Activities']"));
		openActivitiesTest.click();
		Thread.sleep(3000);
		final WebElement addActivities = driver.findElement(By.xpath("//i[@class='fa fa-plus fa-stack-1x']"));
		addActivities.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[1]/section/div/div/div[2]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[1]/div/input")).click();
		final WebElement leadName = driver.findElement(By.xpath("//*[@id=\"leadss\"]"));
		leadName.sendKeys("James Smith");
		final WebElement activityType = driver.findElement(By.xpath("//*[@id=\"event\"]/div[4]/div/select"));
		final Select Sel = new Select(activityType);
		Sel.selectByVisibleText("Email");
		Thread.sleep(3000);
		final WebElement outCome = driver.findElement(By.xpath("//*[@id='event']/div[5]/div/select"));
		final Select Sel1 = new Select(outCome);
		Sel1.selectByVisibleText("Show");
		Thread.sleep(3000);
		final WebElement startDate = driver.findElement(By.xpath("//*[@id=\"datepickerstart\"]"));
		startDate.click();
		startDate.sendKeys("09/01/2018");
		startDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		final WebElement endDate = driver.findElement(By.xpath("//*[@id=\"datepickerend\"]"));
		endDate.click();
		endDate.sendKeys("09/01/2018");
		endDate.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[1]")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[2]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[9]/div/select[3]")).sendKeys("pM");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[1]")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[2]")).sendKeys("15");
		driver.findElement(By.xpath("//*[@id=\"event\"]/div[10]/div/select[3]")).sendKeys("PM");
		Thread.sleep(5000);
		final WebElement priority = driver.findElement(By.xpath("//*[@id='event']/div[11]/div/select"));
		final Select Se = new Select(priority);
		Se.selectByVisibleText("High");
		Thread.sleep(3000);
		final WebElement status = driver.findElement(By.xpath("//*[@id=\"event\"]/div[12]/div/select"));
		final Select se = new Select(status);
		se.selectByVisibleText("Not Started");
		Thread.sleep(2000);
		final WebElement description = driver.findElement(By.xpath("//*[@id='event']/div[13]/div/textarea"));
		description.sendKeys("Lead Event: Email need to sent about budget");
		Thread.sleep(2000);
		final WebElement assignedTo = driver.findElement(By.xpath("//*[@id='event']/div[14]/div/select"));
		final Select sel1 = new Select(assignedTo);
		sel1.selectByVisibleText("Srinivas D");
		Thread.sleep(2000);
		final WebElement save = driver.findElement(By.xpath("//*[@id=\"event\"]/div[15]/div/div/div[2]/button"));
		save.click();
		driver.navigate().back();
		Thread.sleep(2000);
		final WebElement leadTest = driver.findElement(By.xpath("//a[normalize-space()='Lead']"));
		leadTest.click();
		Thread.sleep(2000);

	}

}
