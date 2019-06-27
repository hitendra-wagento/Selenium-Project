package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOut {

	private static WebElement element = null;

	public static WebElement lnk_welcome(WebDriver driver) throws Exception{

	//element = driver.findElement(By.className("//li[@class='customer-welcome']"));
	element = driver.findElement(By.xpath("//div[@class='customer-menu customer-details-content']//ul[@class='header links']"));
	
		{
		   /*Actions action = new Actions(driver);
		   WebElement SignOut = driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div[2]/ul/li[1]/div/ul/li[4]"));
		   System.out.println("This is the signout");
		   action.moveToElement(SignOut).moveToElement(driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div[2]/ul/li[1]/div/ul/li[4]"))).click().build().perform();*/
			WebElement welcome = driver.findElement(By.className("customer-welcome"));
			System.out.println("Navigation To Customer Welcome Link .......");
			
			Actions act = new Actions(driver);
			System.out.println("Action will be Perform in Customer Welcome Link.......");
			
			act.moveToElement(welcome).build().perform();
			System.out.println("Action will be Perform moveToElement .......");
			
			WebElement signout = driver.findElement(By.xpath("//div[@class='customer-menu customer-details-content']//li[@class='authorization-link']"));
			System.out.println("Navigate to SignOut.......");
			
			signout.click();
			System.out.println("SignOut Link Will Be Click.......");
			
			Thread.sleep(100);
			driver.navigate().refresh();
		}
	   		
	return element;

	}

}


