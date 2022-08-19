package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxXhtml {
	
	
public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//basics checkbox

driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[1]")).click();

//notification

driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[3]")).click();

//choose your fav

driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[6]")).click();


driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[15]")).click();


driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();

Thread.sleep(3000);


//boolean elementsdisabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')])[3]")).isEnabled();
//(//div[contains(@class,'ui-chkbox')])
Thread.sleep(1000);
boolean elementsdisabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[17]")).isSelected();

System.out.println(elementsdisabled);

if(elementsdisabled==false) {
	System.out.println("The checkbox is disabled"); }




driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu')])[1]")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[8]")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[9]")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[10]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu')])[1]")).click();

}









}
