package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import SimpleApp.AppiumTry.BasePage;

public class viewSettings extends BasePage{
	
	private By view = AppiumBy.accessibilityId("Views");
	private By expandableLists = AppiumBy.accessibilityId("Expandable Lists");
	private By customAddapter = AppiumBy.accessibilityId("1. Custom Adapter");
	private By peopleNames = AppiumBy.xpath("//android.widget.TextView[@text='People Names']");
	private By sampleMenu = AppiumBy.id("android:id/title");
	
	private By webView = AppiumBy.id("android:id/text1");
	
	private By gallery = AppiumBy.accessibilityId("Gallery");
	private By photos = AppiumBy.accessibilityId("1. Photos");
	private By firstPhoto = AppiumBy.xpath("(//android.widget.ImageView)[1]");
	private By secondPhoto = AppiumBy.xpath("(//android.widget.ImageView)[2]");
	
	private final By dragandDrop = AppiumBy.xpath("//android.widget.TextView[@content-desc='Drag and Drop']");
	private final By firstDot = AppiumBy.xpath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']");
	private final By secondDot = AppiumBy.xpath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_2']");
	private final By dropResult = AppiumBy.xpath("//android.widget.TextView[@resource-id='io.appium.android.apis:id/drag_result_text']");
	
	
	public viewSettings(AppiumDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actionChain = new Actions(driver);
    }
	
	//For test case 001(long press)
	public void clickView() {
		ClickElement(view);
	}
	
	public void clickExpandableList() {
		ClickElement(expandableLists);
	}
	
	public void clickCustomAddapter() {
		ClickElement(customAddapter);
	}
	
	public void longPressPeopleNames() {
		LongPress(peopleNames, 3);
	}
	
	public Boolean getSampleMenuisDisplayed() {
		return GetElement(sampleMenu).isDisplayed();
	}
	
	public String getSampleMenuText() {
		String elementText = GetElement(sampleMenu).getText();
		return elementText;
	}
	
	//For test case 002(scrolling)
	public void scrollToWebView(String visibleText) {
		ScrollToText(visibleText);
	}
	
	public Boolean getWebViewisDisplayed() {
		return GetElement(webView).isDisplayed();
	}
	
	//For test case 003(swipe)
	public void clickGallery() {
		ClickElement(gallery);
	}
	
	public void clickPhotos() {
		ClickElement(photos);
	}
	
	public String getFirstPhoto() {
		return GetElement(firstPhoto).getDomAttribute("focusable");
	}
	
	public void swipeFirst() {
		SwipeByCoordinates(firstPhoto, "left", 300);
	}
	
	public String getSecondPhoto() {
		return GetElement(secondPhoto).getDomAttribute("focusable");
	}
	
	//For Test Case 004(drag and drop)
	public String dragDrop() {
		ClickElement(dragandDrop);
		DragAndDropElement(firstDot, secondDot);
		return GetElement(dropResult).getText();
		
	}
	

}
