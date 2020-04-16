import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation_Practicepage 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Selinium Dump\\selinium component\\chromedriver_win32");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		WebElement Ch1= driver.findElement(By.id("checkBoxOption1"));
		Ch1.click();
		
		System.out.println(Ch1.isSelected());
		Assert.assertTrue(Ch1.isSelected());
		Thread.sleep(2000);
		Ch1.click();
		
		
		if (Ch1.isSelected());
		{
			System.out.println("check bos is selected");	
		} 
 		{
			System.out.println("check box is not selected");
		}
		
		System.out.println(Ch1.isSelected());
		Assert.assertFalse(Ch1.isSelected());
		// count of number of checkboxes 
		
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
