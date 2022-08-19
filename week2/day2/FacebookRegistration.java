package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tharini");
		
		driver.findElement(By.name("lastname")).sendKeys("Nitin");
		
		//reg_email__
		
		driver.findElement(By.name("reg_email__")).sendKeys("7022750809");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("QWERTY@123");

WebElement elementDOB =driver.findElement(By.name("birthday_day"));
Select dd1 = new Select(elementDOB);
dd1.selectByVisibleText("25");

WebElement elementMonth =driver.findElement(By.name("birthday_month"));
Select dd2 = new Select(elementMonth);
dd2.selectByIndex(4);
		
WebElement elementYear =driver.findElement(By.name("birthday_year"));
Select dd3 = new Select(elementYear);
dd3.selectByValue("1986");
//
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();





}
}
