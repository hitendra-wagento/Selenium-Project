package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Home_Page {
	 
    private static WebElement element = null;
 
    public static WebElement lnk_SignIN(WebDriver driver){
 
	element = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
 
    return element;
 
    }
 
 	public static WebElement lnk_RegisterMyAccount(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
	 
	    return element;
	 
	    }
 
 	public static WebElement lnk_LogOut(WebDriver driver){
 
    element = driver.findElement(By.id("account_logout"));
 
    return element;
 
    }
 
}
