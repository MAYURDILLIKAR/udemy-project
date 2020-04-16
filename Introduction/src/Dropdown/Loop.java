package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loop {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).clear();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).sendKeys("aur");
		Select From= new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]/option[5]")));
		From.selectByValue("IXU");
		
		
		
		Select Passenger = new Select((driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))));			
		Passenger.selectByValue("AED");
		Passenger.selectByIndex(3);
		Passenger.selectByVisibleText("Select");
		driver.findElement(By.id("divpaxinfo")).click();
		
			}
}
	


