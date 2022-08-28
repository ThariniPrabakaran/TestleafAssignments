package week4.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement draggableitem = driver.findElement(By.id("draggable"));
		WebElement droppableitem = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(draggableitem, droppableitem).perform();
		
		driver.close();

	}

}
