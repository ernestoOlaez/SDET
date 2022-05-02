package browserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/alertsWindows");
		 
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();


         //If the XPath doesnt works should try xfullpath

    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")).click();

         ////*[@id="item-0"]
          System.out.println("Ernest!");
         //driver.Close(); 
		 
	}

}
