package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();

		//click on CRMSFA link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
        //click on  leads link
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		//click on  create lead link
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Amazon");

		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Tharini");

		//lastName
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Nitin");
					
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Tharu");
		
		//departmentName
		WebElement elementDepartName =driver.findElement(By.name("departmentName"));
		elementDepartName.sendKeys("Quality Enigneer");
		
		//createLeadForm_description
		WebElement elementDescription =driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Senior software quality engineer");
		
		//Email
		
		WebElement elementEmail =driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("tharu.20@gmail.com");
		
		//generalStateProvinceGeoId
	    WebElement elementState =driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select dd1 = new Select(elementState);
	    dd1.selectByVisibleText("New York");
	    
	    //create lead button
	    WebElement elementSubmit = driver.findElement(By.name("submitButton"));
	    elementSubmit.click();
	    
		
		WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateLead.click();
		
		WebElement elementCompanyName1 = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName1.clear();
		elementCompanyName1.sendKeys("Fannie Mae");

		WebElement elementFirstName1 = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName1.clear();
		elementFirstName1.sendKeys("Avnitha");
		
		
		 WebElement elementSubmit1 = driver.findElement(By.name("submitButton"));
		 elementSubmit1.click();
		
		 String title = driver.getTitle();
		 System.out.println(title);
		
}
}
