package com.salewrx.qa.lead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salewrx.qa.base.TestBase;
import com.salewrx.qa.signinpage.LoginPage;

public class LeadPage extends TestBase {
	@Test
	public void leadPageTest() throws InterruptedException, IOException {
		final LoginPage lpage = new LoginPage();
		lpage.loginTest();
		final WebElement leadTest = driver.findElement(By.xpath("//a[normalize-space()='Lead']"));
		leadTest.click();
		Thread.sleep(3000);
	}

}
