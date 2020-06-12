package com.mycareai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static WebDriverWait wait;
	private static EnhancedAndroidDriver<MobileElement> driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static BufferedReader contents;
	public static InputStreamReader BufferedReader;
	public static InputStreamReader reader;

	public static Logger log = Logger.getLogger("devpinoyLogger");

	public static EnhancedAndroidDriver<MobileElement> Capabilities() throws MalformedURLException {

		PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/log4j.properties");

		File appDir = new File("src");
		File app = new File(appDir, "/app-release.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "foo");
		//capabilities.setCapability(MobileCapabilityType.APP, "C:\\Maven\\Maven\\app-release.apk");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 2913);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mycareai");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
		//capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		return Factory.createAndroidDriver(url, capabilities);
	}
	

//	@BeforeClass
//	public static void setUp() {
//		if (driver == null) {
//			try {
//				fis = new FileInputStream(System.getProperty("user.dir") + "/src/OR.properties");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}					
//			try {
//				OR.load(fis);
//				//log.debug("OR file loaded !!!");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
//	}



	public boolean isElementPresent(By by) {

		try {

			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {

			return false;

		}

	}

	@SuppressWarnings("unused")
	public void log4j_demo() {
		Logger log = Logger.getLogger("log4j_demo");
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/log4j.properties");
	}

	@After
	public void after() throws Exception {
		if (driver != null) {
			driver.label("Stopping App");
			driver.quit();
		}
	}

}
