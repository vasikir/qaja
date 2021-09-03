import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class App {
      public static void main(String[] args) throws Exception {
          System.out.println("Hello, World!");
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp.kirnos\\qaja\\github\\qaja\\com.google\\lib\\chromedriver.exe");    
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.google.com");
          Thread.sleep(5000);
          driver.quit();   
      }
  }