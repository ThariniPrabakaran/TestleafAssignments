package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions builder1 = new Actions(driver);
		
		WebElement elementBrands = driver.findElement(By.xpath("//a[text()='brands']"));
		
		builder1.moveToElement(elementBrands).perform();
		
		//WebElement elementsLOrealParis = driver.findElement(By.xpath("(//div[@class='css-ov2o3v'])/a[6]"));
		
        WebElement elementsLOrealParis = driver.findElement(By.linkText("L'Oreal Paris"));
		builder1.click(elementsLOrealParis).perform();
		
		WebElement elementsortby = driver.findElement(By.xpath("//span[@class='sort-name']"));	
		builder1.click(elementsortby).perform();
		
		WebElement elementCustomerTopRated = driver.findElement(By.xpath("//span[text()='customer top rated']"));
		
		builder1.click(elementCustomerTopRated).perform();
		
		Thread.sleep(1000);
		
		WebElement elementCategory = driver.findElement(By.xpath("//span[text()='Category']"));

		builder1.click(elementCategory).perform();
		
		WebElement elementHair = driver.findElement(By.xpath("//span[text()='Hair']"));

		builder1.click(elementHair).perform();
		

		WebElement elementHairCare = driver.findElement(By.xpath("//span[text()='Hair Care']"));

		builder1.click(elementHairCare).perform();
		
		
		WebElement elementShampoo = driver.findElement(By.xpath("//span[text()='Shampoo']"));

		builder1.click(elementShampoo).perform();
		
		Thread.sleep(1000);
		
		WebElement elementConcern = driver.findElement(By.xpath("//span[text()='Concern']"));

		builder1.click(elementConcern).perform();
		
		WebElement elementColorProtection = driver.findElement(By.xpath("(//span[text()='Color Protection'])/ancestor::label"));

		builder1.click(elementColorProtection).perform();
		
		String filter = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		System.out.println(filter);
		
		Thread.sleep(1000);
		
		WebElement elementLOPCPShampoo = driver.findElement(By.xpath("//a[contains(@href,'/l-oreal-paris-color-protect-shampoo/')]"));
	
		builder1.click(elementLOPCPShampoo).perform();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(list1.get(1));
		
		WebElement elementSize = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dd1 = new Select(elementSize);
		dd1.selectByIndex(0);
		
		String MRPAmount = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
		System.out.println(MRPAmount);
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
//		String GrandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
//		System.out.println("Grandtotal in shopping cart: " +GrandTotal);

		Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	
	driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
	
	String GrandTotal1 = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div/span")).getText();
	System.out.println("Grandtotal in Checkout page: " +GrandTotal1);
	
//	if(GrandTotal1==GrandTotal) {
//		System.out.println("Shopping cart amount and Checkout page amount are same");
	}

	

}
