package january17;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot scrshot=((TakesScreenshot)driver);
	File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\shesh\\eclipse-workspace\\january17\\target.img");
FileUtils.copyFile(scrfile, trg);
	}

}
