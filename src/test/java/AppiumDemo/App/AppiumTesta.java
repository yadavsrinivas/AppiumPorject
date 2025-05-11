package AppiumDemo.App;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumTesta extends BaseTest{

	
	@Test
	public void WifiSettingName() throws MalformedURLException, URISyntaxException{
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Srinivas wifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
	/*public void AppiumTest() throws MalformedURLException, URISyntaxException
	{
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//sbsri//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")) 	.withIPAddress("127.0.0.1").usingPort(4723).build();
	  //  service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("SrinivasPhone");
		
		options.setApp("D://Projects//Appium//AppiumProject//src//test//java//resources//ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		driver.quit();
	//	service.stop();
	
		
	}*/
}

}