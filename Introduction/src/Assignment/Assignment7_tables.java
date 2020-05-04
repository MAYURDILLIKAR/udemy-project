package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_tables
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.xpath("//table[@id='product']//tbody"));
int count=table.findElements(By.tagName("tr")).size();
System.out.println(count);
		for(int i=0; i<count;i++)
		{
			String list=table.findElements(By.tagName("tr")).get(i).getText();
			System.out.println(list);
		}
WebElement collums=driver.findElement(By.xpath("//div[@class='block large-row-spacer']//tr[1]"));
System.out.println(collums.findElements(By.tagName("th")).size());
	}

}
//body//tr[4]