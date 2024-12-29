package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	public static WebDriver driver;
	public static Actions action;
	public static void maximizewindow () {
		driver.manage().window().maximize();
	}
	public static void attente ( int S) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(S));
	}
}
