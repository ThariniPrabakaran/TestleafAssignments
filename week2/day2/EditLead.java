package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();

		WebElement elementWelcome = driver.findElement(By.tagName("h2"));
		String getText = elementWelcome.getText();
		System.out.println(getText);

		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

	//	driver.findElement(By.xpath("//a[@id='ext-gen869']")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		
			
	//	driver.findElement(By.name("firstName")).sendKeys("Tharini");	
		driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Tharini");	
		
		//Find Leads //*[@id="ext-gen334"]
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		Thread.sleep(3000);
		//click on first lead 
		WebElement elementFirstlead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr//a)[1]"));
		elementFirstlead.click();
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().contains("View Lead")){
			System.out.println("View lead page");
		}
		
		//Edit
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		
	 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Qapitol");
	 driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	 
	 WebElement viewLead = driver.findElement(By.id("viewLead_companyName_sp"));		
		System.out.println(viewLead);
		
		driver.close();
		
		
		
		
	}
}
