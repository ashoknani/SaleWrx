package com.salewrx.qa.campaign;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class CampaignPage extends TestBase {
	@Test
	public void campaignPage() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement campaign = driver.findElement(By.xpath("//a[normalize-space()='Campaign']"));
		campaign.click();
		Thread.sleep(3000);
	}
}
