package wallethub.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fount_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallethub.com/");
		System.out.println(driver.getTitle());

		WebElement text_Heading = driver.findElement(By.cssSelector(
				"main:nth-child(3) div:nth-child(1) div:nth-child(1) section.part:nth-child(4) > h1.heading.extra"));
		System.out.println(text_Heading.getText());
		String fount_size= text_Heading.getCssValue("font-size");
		System.out.println("the header fount size is"+ fount_size);
		
	}

}
