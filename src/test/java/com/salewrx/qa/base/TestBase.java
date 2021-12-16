package com.salewrx.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static String filePath = ".\\src\\test\\java\\com\\salewrx\\qa\\config\\config.properties";

	@BeforeMethod
	public void testbase() throws InterruptedException {
		try {
			prop = new Properties();
			final FileInputStream ip = new FileInputStream(filePath);
			prop.load(ip);

		} catch (final FileNotFoundException e) {
			e.printStackTrace();

		} catch (final IOException e) {
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		System.out.println("Driver Initeated");
		Thread.sleep(3000);
		driver.get(prop.getProperty("url"));

	}

	@AfterMethod
	public void Teardown() {
		// Close the Browser;
		 driver.close();
		 driver.quit();

	}
}
