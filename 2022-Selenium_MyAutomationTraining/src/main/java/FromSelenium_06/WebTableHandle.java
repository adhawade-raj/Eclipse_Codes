package FromSelenium_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		System.out.println(rowCount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		
		String beforeXPath ="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int rowNum=2; rowNum<=rowCount+1; rowNum++)
		{
			String ActualXpath = beforeXPath + rowNum + afterXpath;
//			System.out.println(ActualXpath);
			String value = driver.findElement(By.xpath(ActualXpath)).getText();
			System.out.println(value);
		}
	}

}
