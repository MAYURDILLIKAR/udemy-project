package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayofproducts_Ecommerce
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
// xpath for button is   //button[text()='ADD TO CART']
		// css for product name is h4.product-name
		
		List<WebElement> Product=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < Product.size(); i++) 
		{
			String name =Product.get(i).getText();
			System.out.println(name);
			String[] items = {"Brocoli","Cucumber"};
			List items1= Arrays.asList(name);
			
			if (items1.contains("Cucumber - 1 Kg")) 
			{
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}
		}
	}

}
