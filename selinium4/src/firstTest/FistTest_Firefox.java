package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FistTest_Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Users/aman/selinium automation/geckodriver-v0.29.1-win64/geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://template12.iweensoft.com/indexpage.jsp");
		driver.findElement(By.id("username")).sendKeys("Kavitha");
		driver.findElement(By.id("password")).sendKeys("Thanks@1122");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Selenium Webdriver Script in Firfox browser | sucess");
		
		

	}

}
