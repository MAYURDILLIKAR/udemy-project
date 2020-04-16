package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown_spicejet
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("COK");
		driver.findElement(By.linkText("Kochi (COK)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("HYD");
		
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		
		// date selection 
		WebElement Dep_date= driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		Dep_date.click();
		
		/*Select From_F= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		From_F.selectByVisibleText("Hyderabad (HYD)"); 
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date1']")).click();*/
		
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 5);

				}
}

