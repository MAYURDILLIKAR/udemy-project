package autosuggestive_dropdown;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import Dropdown.Clear_trip;

public class Cleartrip_Autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);

//  checkin the autosugestive dropdown by applying a loop and iteration 

		
		WebElement from = driver.findElement(By.id("FromTag"));
		from.click();
		from.sendKeys("Hyd");
		Thread.sleep(4000);
		from.sendKeys(Keys.ARROW_DOWN);
		
		/*
		while (!from.("Hyderabad, IN - Rajiv Gandhi International (HYD)"))
		{
			from.sendKeys(Keys.ARROW_DOWN);
			
		}
	
	
		from.sendKeys(Keys.ENTER);
	*/
		
		List<WebElement> lists= from.findElements(By.tagName("li"));
		int count=lists.size();
		System.out.println(count);
		while (!from.equals("Hyderabad, IN - Rajiv Gandhi International (HYD)"))
		{
			from.sendKeys(Keys.ARROW_DOWN);
		//String list_names =((WebElement) lists).getText();
		System.out.println("list_names");
	}
		from.sendKeys(Keys.ENTER);
	}

}