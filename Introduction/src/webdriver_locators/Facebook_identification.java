package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_identification 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://wwww.facebook.com");
		driver.manage().window();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		if (driver.getTitle().contains("Facebook – log in or sign up")) 
		{
			System.out.println("expected title");
			
		}
		else
		{
			System.out.println("expected title not present");
		}
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("pimpadahemalatha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9989448069");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error_box\"]")).getText());
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		//String title="Facebook – log in or sign up";
		
		if (driver.getTitle().contains("Facebook – log in or sign up")) 
		{
			System.out.println("expected title");
			
		}
		else
		{
			System.out.println("expected title not present");
		}
		System.out.println("test passed ");
		
		

	}

}
