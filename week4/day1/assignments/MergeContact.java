package week4.day1.assignments;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");

		//click on login button
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		//Click on CRMSFA
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click on contacts
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    
	    //click on merge contacts
	
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

	    //click on the from contact- Widget
	    driver.findElement(By.xpath("(//a[contains(@href,'LookupContacts')])[1]")).click();
	    
	  //handle the new window - going to the second window (0,1 so 1 = second page in the current session)
	    Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
	    Thread.sleep(3000);
		//click on the first contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//switch to the primary window
		driver.switchTo().window(list.get(0));

		   //click on the to contact- Widget
	    driver.findElement(By.xpath("(//a[contains(@href,'LookupContacts')])[2]")).click();
	    
	    //handle the new window
	    Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(1));
		
	  //click on the first contact
	  	driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	
	  	//switch to the primary window
		driver.switchTo().window(list.get(0));
		
		//click on merge contacts button
		
		Thread.sleep(3000);
			
	  	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

	  	 Alert alert = driver.switchTo().alert();
	  	 alert.accept();
	  	 
	  	 
	  	 System.out.println(driver.getTitle());	  		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
