package week2.day2;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInputXhmtl {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		
		
	driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield')][1]")).sendKeys("Tharini");
	
	//Append 
	
	//isdisabled
Boolean isEnabled = driver.findElement(By.xpath("//input[contains(@id,'j_idt88:j_idt93')]")).isEnabled();
	
System.out.println(isEnabled);
if(isEnabled == true)	
{
	System.out.println("The text box is enabled");
}
else
	System.out.println("The text box is disabled");
	
//clear field
driver.findElement(By.xpath("//input[contains(@id,'j_idt88:j_idt95')]")).clear();	

//get text

String getText = driver.findElement(By.xpath("//input[contains(@id,'j_idt88:j_idt97')]")).getAttribute("value");
System.out.println(getText);
	
//enter and tab

 driver.findElement(By.xpath("//input[contains(@id,'j_idt88:j_idt99')]")).sendKeys("Tharu.20@gmail.com",Keys.TAB);
//Type about yourself
 
 driver.findElement(By.xpath("//textarea[contains(@id,'j_idt88:j_idt101')]")).sendKeys("I live in Bangalore");

 
 
 //get title
 driver.findElement(By.xpath("//input[contains(@id,'j_idt106')][1]")).sendKeys(Keys.ENTER);
 
 Thread.sleep(2000); 
 
 String titleOfPage = driver.getTitle();
 System.out.println("the title is " + titleOfPage);
 
 if (driver.getTitle().contains("Error")) {
	 System.out.println("Page is has Error");
 }

 //confirm label position 
 System.out.println(driver.findElement(By.xpath("//input[contains(@id,'j_idt106:thisform')]")).getLocation());

 // type and select thrid value
 
 driver.findElement(By.xpath("(//ul[contains(@class,'ui')])[2]")).sendKeys("Tharini");
 
 
// driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete')]"))
 //
		 driver.findElement(By.xpath("//span[contains(@class,'ui-autocomplete')]")).sendKeys(Keys.ARROW_DOWN);


 
}
}
