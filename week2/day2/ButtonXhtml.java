package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonXhtml {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
System.out.println(driver.getTitle());

driver.navigate().to("https://www.leafground.com/button.xhtml");


//button is disabled
Boolean elementButton= driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[2]")).isEnabled();
if (elementButton== false) {System.out.println("the button is disabled");}
else System.out.println("the button is enabled");

//getlocation
System.out.println(driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[3]")).getLocation());


//color of the save button
System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).getCssValue("color"));

//height and width

System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize());




	}
}
