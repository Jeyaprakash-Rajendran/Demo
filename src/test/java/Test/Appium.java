package Test;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Appium {

	
	public static AndroidDriver<MobileElement> driver;

	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
		  
		  
	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "MI A1");
	    caps.setCapability("os_version", "7.0");
	    caps.setCapability("app", "<app_url>");
	    URL url = new URL("http://127.0.0.1:4723/wd/hub");

	   driver = new AndroidDriver<MobileElement>(url, caps);

	   
	    //AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

	  	    driver.quit();
	  }
}



