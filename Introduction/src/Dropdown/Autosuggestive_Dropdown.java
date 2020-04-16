package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		// from adress search box
		
		driver.findElement(By.id("RoundTrip")).click();
		
		//from adresses search box
		WebElement From_Tag= driver.findElement(By.id("FromTag"));
		From_Tag.clear();
		Thread.sleep(2000);
		From_Tag.sendKeys("hyd");
		Thread.sleep(5000);
		From_Tag.sendKeys(Keys.ENTER);
		System.out.println(From_Tag.getText());
		//to adress search box
		
		WebElement To_Tag= driver.findElement(By.id("ToTag"));
		To_Tag.clear();
		To_Tag.sendKeys("pan");
		Thread.sleep(5000);
		To_Tag.sendKeys(Keys.ARROW_DOWN);
		To_Tag.sendKeys(Keys.ENTER);
		System.out.println(To_Tag.getText());
		
		

	}

}
