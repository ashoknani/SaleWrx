package com.salewrx.qa.signinpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salewrx.qa.base.TestBase;

public class LoginPage extends TestBase {
	public static String filePath_File = ".\\src\\test\\java\\com\\salewrx\\qa\\config\\config.properties";

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginTest() throws InterruptedException, IOException {
		final Properties prop_Login = new Properties();
		final FileInputStream ip = new FileInputStream(filePath_File);
		prop_Login.load(ip);
		final WebDriverWait Wait = new WebDriverWait(driver, 20);
		final WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		Wait.until(ExpectedConditions.elementToBeClickable(email));
		email.click();
		email.sendKeys(prop_Login.getProperty("UserName"));
		Thread.sleep(5000);
		final WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Wait.until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		password.sendKeys(prop_Login.getProperty("password"));
		Thread.sleep(3000);
		final WebElement signIn = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value ='Sign In'][@type='submit']")));
		signIn.click();

	}
}
