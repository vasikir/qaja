import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
  
public class App {
      public static void main(String[] args) throws Exception {
          System.out.println("Hello, World!");
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp.kirnos\\qaja\\github\\qaja\\com.google\\lib\\chromedriver.exe");    
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.google.com");
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(scrFile, new File("C:\\Users\\vp.kirnos\\qaja\\github\\qaja\\com.google\\lib\\screenshot.png"));
          Thread.sleep(5000);
          driver.quit();   
      }
  }