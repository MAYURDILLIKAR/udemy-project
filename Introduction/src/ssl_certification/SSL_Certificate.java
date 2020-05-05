package ssl_certification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		ChromeOptions c=new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);

	}

}
