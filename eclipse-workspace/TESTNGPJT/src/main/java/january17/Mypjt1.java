package january17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Mypjt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();


driver.findElement(By.xpath("//a[@class='ico-register']")).click();
driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Sharma");

driver.findElement(By.id("LastName")).sendKeys("hello123");





}
}


