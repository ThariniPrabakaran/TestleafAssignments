package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindow {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//click on Open button
		driver.findElement(By.xpath("//span[text()='Open']/ancestor::button")).click();
		
		//capture the windows and converting it to list
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		
		//get title for the parent window
		String parentTitle = driver.getTitle();

		//switching to the second window 
		driver.switchTo().window(list.get(1));
		String secondWindowTitle = driver.getTitle();

		if (parentTitle!=secondWindowTitle) {
			System.out.println("This is a new window with page title: "+secondWindowTitle );
		}
		else 
			System.out.println("Something went wrong");
		
		//switch back to parent window 
		driver.switchTo().window(list.get(0));
		
		//click on Open button
		driver.findElement(By.xpath("//span[text()='Open Multiple']/ancestor::button")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles1);
		
		int numberofWindows = list1.size();
		System.out.println("Total number of windows opened: " +numberofWindows);
		
		//switch back to parent window 
		driver.switchTo().window(list.get(0));
		
		
		//Close Windows
		driver.findElement(By.xpath("//span[text()='Close Windows']/ancestor::button")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandles2);

		int numberofWindows1 = list2.size();
		System.out.println("Total number of windows to close: " +(numberofWindows1-1));
		
		int base = list2.indexOf(0);

		list2.indexOf(1);


		//close all windows
	
		for (int i=1;i<numberofWindows1;i++) {
			driver.switchTo().window(list2.get(i));
			driver.close();

		}
		
		//switch back to parent window 
		driver.switchTo().window(list.get(0));
				
		//Open with delay
		driver.findElement(By.xpath("//span[text()='Open with delay']/ancestor::button")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//      wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Thread.sleep(5000);		
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(windowHandles3);

		driver.switchTo().window(list3.get(1));
		System.out.println(driver.getTitle());
		
		
		
		
		
		
}
}
