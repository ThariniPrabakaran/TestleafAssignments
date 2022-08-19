package week2.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailPractise {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("http://erail.in");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);
		
		//txtStationTo
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("PDY",Keys.TAB);
		
		//chkSelectDateOnly
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		Thread.sleep(1000);
		
		//List<WebElement> elementRows = driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
		List<WebElement> elementRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody//tr"));
		System.out.println(elementRows.size());
		
		for (int i=1;i<=elementRows.size();i++)
		
		{
			for (int j =1;j<=9;j++) {
				
				String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"    ");
			}
			System.out.println();
		}
			
	//	
	
		
		}
}
