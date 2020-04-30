package moneycontrol_tables;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrol_headerlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		System.out.println(driver.getTitle());
		WebElement header_links = driver.findElement(By.xpath("//div[@class='stickymiddle']"));
		int count = header_links.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
		String links=	header_links.findElements(By.tagName("a")).get(i).getText();
		System.out.println(links);
		String keys= Keys.chord(Keys.CONTROL,Keys.ENTER);
		header_links.findElements(By.tagName("a")).get(i).sendKeys(keys);
	}
		Set<String> handels=driver.getWindowHandles();
		Iterator< String>it=handels.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
