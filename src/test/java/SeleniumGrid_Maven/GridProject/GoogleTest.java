package SeleniumGrid_Maven.GridProject;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException {
		
		 
		ChromeOptions options = new ChromeOptions();			
	    options.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
        caps.setCapability(ChromeOptions.CAPABILITY, options);

		//caps.setPlatform(Platform.WINDOWS);
		//Another way of setting capabilities
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.196:4444").toURL(), caps);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("anjana herkal");
		System.out.println(driver.getTitle());
		driver.close();
	
	}
	

}
