package week4.day1.classroom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {


	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
		
	ChromeDriver driver = new ChromeDriver() ;
	driver.get("http://Leafground.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
    driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
    driver.findElement(By.xpath("//span[text()='Show']/ancestor::button[1]")).click();
	
    Alert alert = driver.switchTo().alert();
    String text = alert.getText();
    System.out.println(text); 
    alert.accept();
    
    
    driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[2]")).click();
    Alert alert1 = driver.switchTo().alert();
    String text1= alert1.getText();
    System.out.println(text1); 
    alert1.accept();
    
    
    //for sweet alert we can inspect the element.. hence no need to use alert
    driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[3]")).click();
    driver.findElement(By.xpath("//span[text()='Dismiss']/ancestor::button")).click();

    
    //sweet modal 
  driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[4]")).click();
  
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
  
  
	
	 //Alert prompt dialog box
	 driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[5]")).click();
	 Alert alert4 = driver.switchTo().alert(); String text4=
	 alert4.getText(); alert4.sendKeys("Tharini"); alert4.accept();
	 System.out.println(text4);
	 
	 //Sweet Alert
	 driver.findElement(By.xpath("(//span[text()='Delete']/ancestor::button)")).click();
	 driver.findElement(By.xpath("(//span[text()='Yes']/ancestor::button)")).click();
	 
	 //minimize and maximise
	 driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[6]")).click();
	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
	 
	}

}
