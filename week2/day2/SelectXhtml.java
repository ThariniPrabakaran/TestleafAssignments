package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectXhtml {

	//
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//select tool
WebElement elementTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

Select dd1 = new Select(elementTool);
dd1.selectByVisibleText("Playwright");

//select country //label[contains(@class,'ui-selectonemenu')][1]


driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu')])[1]")).click();
driver.findElement(By.xpath("(//li[contains(@class,'ui-selectonemenu-item')])[5]")).click();
/*
 * WebElement elementCountry = driver.findElement(By.xpath(
 * "(//label[contains(@class,'ui-selectonemenu')])[1]")); Select dd2 = new
 * Select(elementCountry); dd2.selectByVisibleText("USA");
 */
Thread.sleep(3000);
driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu')])[2]")).click();

driver.findElement(By.xpath("(//li[contains(@class,'ui-selectonemenu-item')])[8]")).click();

//choose the course

driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete')]")).click();

driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete')])[4]")).click();


//choose language 
driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu')])[3]")).click();

driver.findElement(By.xpath("(//li[contains(@class,'ui-selectonemenu')])[10]")).click();


//select two 

Thread.sleep(3000);

driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu')])[4]")).click();

driver.findElement(By.xpath("(//li[contains(@class,'ui-selectonemenu')])[19]")).click();














	}
}
