import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class homePage extends base{
	
	public static void main(String args[]) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//String Toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		//name attribute for toast msg will have content
		
		//System.out.println(Toastmsg);
		
		


	}
}
