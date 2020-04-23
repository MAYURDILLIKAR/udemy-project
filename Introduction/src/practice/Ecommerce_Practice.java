package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicitly wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String[] productName = { "Cucumber", "Brocolli" };
		// storing all the items in items

		List<String> addItemList = Arrays.asList(productName); // changing array to list

		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> button = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		System.out.println(items.size());

		String[] itemsArray;
		String item; // for single item
		int j = 0; // comaparing 

		// xpath for add to cart button "//div[@class='product-action']/button"

		for (int i = 0; i < items.size(); i++) {
			itemsArray = items.get(i).getText().split("-");
			item = itemsArray[0].trim();

			if (addItemList.contains(item)) 
			{
				j++;
				button.get(i).click();
			if (j==(productName.length))
			{
				break;
				
			}

			}

		}

	}

}
