package resources;
import java.io.File;

public class AppUtils {
	
	public static String getAppPath() {
        String appRelativePath = "src/test/java/resources/ApiDemos-debug.apk"; // Change as needed
        File appFile = new File(System.getProperty("user.dir"), appRelativePath);
        return appFile.getAbsolutePath();
    }

}

/**
{
  "app": "/Users/reyad/eclipse-workspace/AppiumTry/src/test/java/resources/ApiDemos-debug.apk",
  "deviceName": "EmulatorReyad",
  "platformName": "android",
  "automationName": "UiAutomator2"
} 
 * */
