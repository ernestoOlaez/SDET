package launchBrowser;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chrome_Launch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   System.out.println("Close sucess!");

	}

}
