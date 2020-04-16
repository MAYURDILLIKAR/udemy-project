import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicejet_Udamyresponce {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		System.out.println(driver.getTitle());

		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();  
		   
		   

	    driver.findElement(By.cssSelector("a[value='DEL']")).click();

	    System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

	        // Destination

	        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

	        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   

	    System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

	  //    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	      //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']

	
	     WebElement Dep_date= driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		 Dep_date.click();
			
			// check return date is enabled or not 
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			// checking with if else loop
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("test is passed ");
				Assert.assertTrue(true);

			}
			else
			{
				System.out.println("test is failed ");
				Assert.assertTrue(false);
				

			}
			// selection of passengers 
			
			driver.findElement(By.id("divpaxinfo")).click();
			Select Passenger= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			Passenger.selectByValue("4");
			
			// currency selection 	
			Select Currency= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			Currency.selectByIndex(2);
			
			// size of the checkboxes present on the webpage
			
			System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
	
			// search button 
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
}
