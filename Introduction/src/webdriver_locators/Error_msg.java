package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_msg 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234556");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	System.out.println(	driver.findElement(By.xpath("//div[@id='error']")).getText());


	}

}
