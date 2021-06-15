package com.cyient.cloud;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class DSAlgoAppTest {
	
	
	

		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			DesiredCapabilities caps = new DesiredCapabilities();

			// Set your access credentials
			caps.setCapability("browserstack.user", "mayankmishra_G0Ljei");
			caps.setCapability("browserstack.key", "E8DweHxVydbqubqsSKqe");

			// Set URL of the application under test
			caps.setCapability("app", "bs://8e2dd3d88e0cf4f5be71cff3f2e13c57ce864c5b");

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
driver.findElement(By.id("onanmobilesoftware.datastructuresandalgorithms:id/dsimagetable")).click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Data structures\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Data Structure Basics\")").click();

String visibleText = "Traversing";

driver.findElementByAndroidUIAutomator
("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();



      Thread.sleep(1000);
		driver.quit();

		}
	}


