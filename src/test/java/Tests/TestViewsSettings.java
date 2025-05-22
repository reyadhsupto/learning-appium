package Tests;

import Pages.viewSettings;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

public class TestViewsSettings extends baseTest{
	
	public viewSettings views;
	
	@BeforeMethod
    public void initPageObjects() {
        views = new viewSettings(driver , wait);
    }
	
	@Test(priority = 1, description = "TC_002: Verify that Sample Menu is properly displayed if long pressed on People Names", enabled = false)
    public void testViewSetting() {
        String expectedText = "Sample menu";
        views.clickView();
        views.clickExpandableList();
        views.clickCustomAddapter();
        views.longPressPeopleNames();
        assertTrue(views.getSampleMenuisDisplayed(), "Sample Menu element not displayed");
        
        String actualText = views.getSampleMenuText();
        Assert.assertEquals(actualText, expectedText, "Sample Menu Item doesn't exist!");
    }
	
	
	@Test(priority = 2, description = "TC_003: Verify that user can scroll to view WebView option", enabled=false)
	public void testScrollToWebView() {
		String expectedText = "WebView";
		views.clickView();
		views.scrollToWebView(expectedText);
		assertTrue(views.getWebViewisDisplayed(), "WebView option not displayed");
	}
	
	
	@Test(priority = 3, description = "TC_003: Verify that user can swipe gallery photos", enabled=false)
	public void testSwipePhotos() {
		views.clickView();
		views.clickGallery();
		views.clickPhotos();
		
		Assert.assertEquals(views.getFirstPhoto(), "true", "First photo is not focused by defult!");
		views.swipeFirst();
		
		
		Assert.assertEquals(views.getFirstPhoto(), "false", "First photo is  still focused after swiping!");
		Assert.assertEquals(views.getSecondPhoto(), "true", "Second photo is not focused after swiping!");
	}
	
	@Test(priority = 4, description = "TC_043: Verify that user can drag and drop elements", enabled=true)
	public void testDragDrop() {
		views.clickView();
		String expectedText = "Dropped!";
		Assert.assertEquals(views.dragDrop(), expectedText, "Drag and Drop Not working properly!");
	}

}
