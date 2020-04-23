import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		Thread.sleep(3000);
		//add items method
		addItems(driver,itemsNeeded);
		}
	// creating a new method.
		public static  void addItems(WebDriver driver,String[] itemsNeeded)
		{
		int j=0;
		
		// listing out the web element in  array form
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		// applying for loop for iteratation
		
		for(int i=0;i<products.size();i++)
		{
		//Brocolli - 1 Kg
		//Brocolli,    1 kg
		// getting name and splitting them	
		String[] name=products.get(i).getText().split("-");
		//triming the names with trim method
		String formattedName=name[0].trim();
		//format it to get actual vegetable name
		//convert array into array list for easy search
		//  check whether name you extracted is present in arrayList or not-
		List itemsNeededList = Arrays.asList(itemsNeeded);
		if(itemsNeededList.contains(formattedName))
		{
		j++;
		//click on Add to cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		{
		break;
		}
		}
		}
		}



		



		
		
		
		
	}


