package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FistTest_Chrome {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
		
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/aman/downloads aman/applications/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		//System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
		//driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/aman/downloads aman/applications/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://template12.iweensoft.com/indexpage.jsp");
		driver.findElement(By.id("username")).sendKeys("Kavitha");
		driver.findElement(By.id("password")).sendKeys("Thanks@1122");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Selenium Webdriver Script in Firfox browser | sucess");

	}

}
