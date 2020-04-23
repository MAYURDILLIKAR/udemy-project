package practice;

import java.awt.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hanuman_Chalisa_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.youtube.com/");
		System.out.println(driver.getTitle());
		WebElement Search_box = driver.findElement(By.name("search_query"));
		Search_box.click();
		Search_box.clear();
		Search_box.sendKeys("jai siya ram jai jai hanuman krishna das");
		Search_box.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(
				"//yt-formatted-string[@class='style-scope ytd-video-renderer'][contains(text(),'Baba Hanuman - Krishna Das! Live With Lyrics')]"))
				.click();

		java.util.List<WebElement> Search_item = driver
				.findElements(By.xpath("//*[@id='video-title']/yt-formatted-string"));

		// itarate

		for (int i = 0; i < 20; i++) {
			String name = Search_item.get(i).getText();

			if (name.contains("Baba Hanuman - Krishna Das! Live With Lyrics")) {
				Search_box.click();
				break;
			}

		}
	}

}
