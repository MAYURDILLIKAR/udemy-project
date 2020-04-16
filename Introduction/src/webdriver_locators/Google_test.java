package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_test 
{

	public static void main(String[] args) 
	
{
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("guitar");
		driver.findElement(By.xpath("(//a[contains(@class,'gb_g')])[2]")).click();
		
	}

}
