package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif_test
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[contains(@title,'Already a user? Sign in')]")).click();
		driver.findElement(By.cssSelector("input#login1")).clear();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("mayur@rediff.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		System.out.println(driver.findElement(By.cssSelector("div#div_login_error")).getText());
				

		
	}

}
