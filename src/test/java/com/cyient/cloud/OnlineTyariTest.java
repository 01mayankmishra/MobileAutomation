//package com.cyient.cloud;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//
//public class OnlineTyariTest {
//
//	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
//			    
//		      DesiredCapabilities caps = new DesiredCapabilities();
//		      
//		      // Set your access credentials
//		      caps.setCapability("browserstack.user", "mayankmishra_G0Ljei");
//		      caps.setCapability("browserstack.key", "E8DweHxVydbqubqsSKqe");
//		      
//		      // Set URL of the application under test
//		      caps.setCapability("app", "bs://6d19295692c83017952278c230d5dcc10de860d2");
//		      
//		      // Specify device and os_version for testing
//		      caps.setCapability("device", "Google Pixel 3");
//		      caps.setCapability("os_version", "9.0");
//		        
//		      // Set other BrowserStack capabilities
//		      caps.setCapability("project", "First Java Project");
//		      caps.setCapability("build", "Java Android");
//		      caps.setCapability("name", "first_test");
//		        
//		      
//		      // Initialise the remote Webdriver using BrowserStack remote URL
//		      // and desired capabilities defined above
//		        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
//		            new URL("http://hub.browserstack.com/wd/hub"), caps);
//				  
//		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		        driver.findElementByAndroidUIAutomator("UiSelector().text(\"ENGLISH\")").click();
//		        driver.findElementByAndroidUIAutomator("UiSelector().text(\"SSC\")").click();
//		        driver.findElementByAndroidUIAutomator("UiSelector().text(\"SKIP FOR NOW\")").click();
//		        driver.findElementByAndroidUIAutomator("UiSelector().text(\"MOCK Tests\")").click();
//		        
//		        //driver.findElement(By.id("com.hinkhoj.questionbank:id/my_inbox")).click();
//		        driver.findElementByAndroidUIAutomator("UiSelector().text(\"10 Full Length Tests\")").click();
//				//String visibleText = "SSC Steno";
//
//		        //driver.findElementByAndroidUIAutomator
//		        //("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
//		        
//		        
//		       //
//
//		      /* Write your Custom code here */
//		        
//		        
//		      // Invoke driver.quit() after the test is done to indicate that the test is completed.
//		      
//		    
//		    
//		      
//
//
//Thread.sleep(5000);
//driver.quit();

//
//	}
//
//}
