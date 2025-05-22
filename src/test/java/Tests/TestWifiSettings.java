package Tests;
import Pages.WifiSettings;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestWifiSettings extends baseTest{
	
	public WifiSettings settings;

    @BeforeClass
    public void initPageObjects() {
        settings = new WifiSettings(driver , wait);
    }

    @Test(priority = 1, description = "TC_001: Verify that user is able to Fill and save Wifi SSID", enabled = true)
    public void testWifiSetting() {
        String expectedSSID = "ReyadWifi";
        String actualSSID = settings.FillWifiSettings(expectedSSID);
        Assert.assertEquals(actualSSID, expectedSSID, "WiFi SSID mismatch!");
    }
	
	
	

}
