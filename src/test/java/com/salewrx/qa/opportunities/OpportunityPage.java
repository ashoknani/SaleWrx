package com.salewrx.qa.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class OpportunityPage extends TestBase {
	@Test
	public void OpportunityTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement opportunites = driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunites.click();
		Thread.sleep(3000);
	}

}
