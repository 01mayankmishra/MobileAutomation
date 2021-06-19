package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test
public class JavaCodesAppTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "mayankmishra_G0Ljei");
		caps.setCapability("browserstack.key", "E8DweHxVydbqubqsSKqe");

		// Set URL of the application under test
		caps.setCapability("app", "bs://d72eddcb16a6bf3be0babd8bd368655a0e8c7fcc");

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.herokuapp.javaprograms400:id/collapse_button")).click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Programs\")").click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while (driver.findElementsByXPath("//*[contains(@text,'Final Keyword')]").size() == 0) {
			// scroll
			Map<String, String> map = new HashMap<String, String>();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
		}

		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Final Keyword\")").click();
		Thread.sleep(3000);

		String visibleText = "Floyd Triangle";

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(newUiSelector().scrollable(true).instance(0)).scrollIntoView(newUiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
		Thread.sleep(5000);
		driver.quit();

	}
}

