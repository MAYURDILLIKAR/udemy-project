package ICICI_Direct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI_topGainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		System.out.println(driver.getTitle());
WebElement TopGainer_link=driver.findElement(By.xpath("//div[@id='tblmktstatus']//tr[2]//td[1]//a[1]"));
TopGainer_link.click();
List<WebElement> TopGainer_table=driver.findElements(By.cssSelector("a[class='thickbox_Stats']"));
int count=TopGainer_table.size();
System.out.println("the count is " + count);
for(int i=0;i<count;i++)
{
	String names=TopGainer_table.get(i).getText();
	System.out.println("top gainers are" + names);
}
	}

}
////div[@id='dvBseTopGain']//tbody//tr[1]