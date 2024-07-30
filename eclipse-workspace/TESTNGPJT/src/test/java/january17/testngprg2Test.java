package january17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngprg2Test {
	WebDriver driver;
 @Test(priority=1)
 void open()
 {
	 WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
 @Test(priority=2)
 void login1()
 {
	 driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
 
 @Test(priority=3)
 void closeApp()
 {
	 driver.quit();
 }
 }
 
 
  

