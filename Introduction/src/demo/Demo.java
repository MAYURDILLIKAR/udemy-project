package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		
		WebElement Derarture = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		Derarture.click();
		
		
		
		
driver.findElement(By.xpath("//div[@class='DayPicker-Day']//p[contains(text(),'16')]")).click();
	}

}
