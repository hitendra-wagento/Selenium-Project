package pageobjectmodel;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	 
    private static WebElement element = null;

    public static WebElement txtbx_Email(WebDriver driver){

		element = driver.findElement(By.id("email"));
		element.sendKeys("hitendra@wagento.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return element;

		}

	public static WebElement txtbx_Password(WebDriver driver){

		element = driver.findElement(By.id("pass"));
		element.clear();
		element.sendKeys("admin@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return element;
		
		}

	public static WebElement btn_LogIn(WebDriver driver) throws Exception{
		
	    element = driver.findElement(By.id("send2"));
	    Point location = element.getLocation();
	    System.out.println(location.getX());
	    System.out.println(location.getY());
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		//executeScript("window.scrollBy(x-pixels,y-pixels)");
	    js.executeScript("window.scrollBy(0,200)");
	    Robot robot = new Robot();
	    robot.mouseMove(location.getX(),location.getY());
	  
	    Thread.sleep(1000);
	   
	    element.click();
	    
		return element;
		
		}

	

}

