package SeleniumGrid_Maven.GridProject;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Testing {
	
	@Test
	public void HomePageCheck2() throws MalformedURLException, URISyntaxException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("chrome");
		//caps.setPlatform(Platform.WINDOWS);
		
		//Another way of setting capabilities
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.196:4444").toURL(), caps);
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
	
	}
	

}
