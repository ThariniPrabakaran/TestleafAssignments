package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTestLogin {

public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
	
ChromeDriver driver = new ChromeDriver() ;
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();

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

WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
elementCreateLead.click();


WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
elementCompanyName.sendKeys("Google");

WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
elementFirstName.sendKeys("Tharini");


//dataSourceId using send keys
WebElement elementSource = driver.findElement(By.name("dataSourceId"));
elementSource.sendKeys("Conference");

//Industry using index
WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dd1 = new Select(elementIndustry);
dd1.selectByIndex(3);

//Ownership using visible text
WebElement elementOwnership = driver.findElement(By.name("ownershipEnumId"));
Select dd2 = new Select(elementOwnership);
dd2.selectByVisibleText("Corporation");

//lastName
WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
elementLastName.sendKeys("Nitin");


//Marketing using value
WebElement elementMarketing = driver.findElement(By.name("marketingCampaignId"));
Select dd3= new Select(elementMarketing);
dd3.selectByValue("CATRQ_CARNDRIVER");


WebElement elementSubmit = driver.findElement(By.name("submitButton"));
elementSubmit.click();

//validating if lead got created 

WebElement elementLead = driver.findElement(By.id("sectionHeaderTitle_leads"));
String getText1 = elementLead.getText();
System.out.println(getText1);


if (getText1.contains("View")) {
	System.out.println("Lead is created");
}
else {
	System.out.println("lead creation failed");
}

//capturing the page title

String title = driver.getTitle();
System.out.println(title);
}

}
