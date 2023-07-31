import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInstantiationTest {

	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.com/");

		Thread.sleep(10000);

		driver.close();

		
	}

}
