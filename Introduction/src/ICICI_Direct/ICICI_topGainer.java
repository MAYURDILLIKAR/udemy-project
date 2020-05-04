package ICICI_Direct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI_topGainer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		System.out.println(driver.getTitle());
		WebElement TopGainer_link = driver.findElement(By.xpath("//div[@id='tblmktstatus']//tr[2]//td[1]//a[1]"));
		TopGainer_link.click();
		Thread.sleep(2000);
		WebElement TopGainer_table = driver.findElement(By.xpath("//table[@id='TABLE_2']"));
			
		List<WebElement> TopGainer_list=TopGainer_table.findElements(By.className("thickbox_Stats"));
		int count= TopGainer_list.size();
		System.out.println("the count is " + count);
		for (int i = 0; i <count; i++) 
		{
			if (i==20)
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//th[contains(@class,'table-page:next')]")).click();
				Thread.sleep(2000);
			}
			//String names= TopGainer_table.findElements(By.className("thickbox_Stats")).get(i).getText();
			String names= TopGainer_table.findElements(By.tagName("tr")).get(i).getText();
			System.out.println("top gainers are" +names);
			if (names.contains("ITC LTD"))
			{
				System.out.println("itc is present in the top gainer list");
			}
			System.out.println(driver.findElement(By.xpath("//div[@id='dvBseTopGain']//tbody//tr[1]")).getText());
		}
	}
}

////div[@id='dvBseTopGain']//tbody//tr[1]

//div[@id='dvBseTopGain']//tr[2]

