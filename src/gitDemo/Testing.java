package gitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.rue21.com");
		driver.manage().window().maximize();
		
	}

}
