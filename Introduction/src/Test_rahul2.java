import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.google.common.base.Strings;

public class Test_rahul2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		String default_window = driver.getWindowHandle();
		// size of links on the footer page.
		WebElement footer_links = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(
				"the size of links in the footer section is " + footer_links.findElements(By.tagName("a")).size());

		// size of links in first column

		WebElement first_Collom_links = footer_links.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println("links in the first column are " + first_Collom_links.findElements(By.tagName("a")).size());

		// clicking all the links present in the first coll
		// i is starting from 1 because at 0th place link is not a valid onein the web
		// page .
		for (int i = 1; i < first_Collom_links.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			first_Collom_links.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}
		{

		}

	}

}
