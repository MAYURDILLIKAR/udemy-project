package multiple_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Cleartrip 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips"); 
		driver.manage().window().maximize();  			
		
		
		//Switch control from page to frame using frame name
		driver.switchTo().frame("modal_window");

		//Identifying element under frame.
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@name='email']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		
		//Identifying element under modal window frame
		WebElement TripId_Editbox=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripId_Editbox.clear();
		TripId_Editbox.sendKeys("12121221");
		
		//Get Controls back to page from Frame
		driver.switchTo().defaultContent();
		
		//Identifying element under page
		WebElement Flights=driver.findElement(By.xpath("//a[@title='Flights']"));
		Flights.click();
	}



	}


