package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.Home_Page;
import pageobjectmodel.Login_Page;


public class POM_TC {
	 
    private static WebDriver driver = null;

  public static void main(String[] args) throws Exception {

	  
	//Create a New Instance of Chrome.
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Hitendra\\Source\\chromedriver\\chromedriver.exe");
	   

		/*WebDriver is and interface
		driver means we creating a reference variable driver of type webdriver.
		using chrome class.*/
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();

	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	   driver.get("http://127.0.0.1/m23/");
	   
	   System.out.println("URL will be loaded");
	   
	   // Use page Object library now

	   Home_Page.lnk_SignIN(driver).click();

	   Login_Page.txtbx_Email(driver);

	   Login_Page.txtbx_Password(driver);
	   
	   Login_Page.btn_LogIn(driver).click();

	   System.out.println(" Login Successfully, now it is the time to Log Off");

	   Home_Page.lnk_LogOut(driver).click(); 

	   driver.quit();

    }

}
