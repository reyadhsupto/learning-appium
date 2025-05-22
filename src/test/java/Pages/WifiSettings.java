package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import SimpleApp.AppiumTry.BasePage;

public class WifiSettings extends BasePage{
	
	private By preference = AppiumBy.xpath("//android.widget.TextView[@content-desc='Preference']");
	private By preference_dependencies = AppiumBy.accessibilityId("3. Preference dependencies");
	
	private By wifi_check = AppiumBy.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]");
	private By wifi_name = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]");
	
	private String ssid = "ReyadWifi";
	
	private By wifi_textbox = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]\n");
	private By ok_button = AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]\n");
	
	private By get_wifitext = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]\n");
	
	
	public WifiSettings(AppiumDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actionChain = new Actions(driver);
    }
	
	
	public String FillWifiSettings(String actualText) {
		ClickElement(preference);
		ClickElement(preference_dependencies);
		ClickElement(wifi_check);
		ClickElement(wifi_name);
		
		actionChain.moveToElement(GetElement(wifi_textbox)).click().sendKeys(ssid).perform();
		
		ClickElement(ok_button);
		
		ClickElement(wifi_name);
		String actual_text = GetElement(wifi_textbox).getDomAttribute("text");
		return actual_text;
		
		
		
//		ClickElement("xpath" , "//android.widget.TextView[@content-desc=\"Preference\"]");
//		
//		ClickElement("accessibilityId" , "3. Preference dependencies");
//		ClickElement("xpath" , "//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]");
//		ClickElement("xpath" , "(//android.widget.RelativeLayout)[2]");
//		
//		WebElement textbox = GetElement("xpath", "//android.widget.EditText[@resource-id=\"android:id/edit\"]\n");
//		textbox.click();
//		textbox.sendKeys(actualText);
//		ClickElement("xpath" , "//android.widget.Button[@resource-id=\"android:id/button1\"]\n");
//		
//		ClickElement("xpath" , "(//android.widget.RelativeLayout)[2]");
//		
//		String expectedText = GetElement("xpath", "//android.widget.EditText[@resource-id=\"android:id/edit\"]\n").getDomAttribute("text");
//		return expectedText;
		
	}

}
