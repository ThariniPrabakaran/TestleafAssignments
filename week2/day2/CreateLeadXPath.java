package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXPath {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		WebElement elementusername = driver.findElement(By.xpath("//input[@id='username']"));
		elementusername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		elementLoginButton.click();
		
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();

		WebElement elementLeads = driver.findElement(By.xpath("//a[text()='Leads']"));;
		elementLeads.click();

		WebElement elementCreateLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));;
		elementCreateLead.click();

        Thread.sleep(3000);
		WebElement elementCompanyName = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		elementCompanyName.sendKeys("Google");

		WebElement elementFirstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		elementFirstName.sendKeys("Tharini");
		
		WebElement elementLastName = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
		elementLastName.sendKeys("Nitin");
		
		WebElement elementSubmit1 = driver.findElement(By.xpath("//input[@name='submitButton']"));
		 elementSubmit1.click();
}

}
