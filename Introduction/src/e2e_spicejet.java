import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e_spicejet {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// check return date is enabled or not 
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		// roundtrip radio button driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
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
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
driver.findElement(By.xpath("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		

	}

}
