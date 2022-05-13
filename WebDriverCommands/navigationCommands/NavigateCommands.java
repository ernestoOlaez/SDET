package navigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/alertsWindows");
		 
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().to("https://demoqa.com");
		 System.out.println("Neto");

	}

}
