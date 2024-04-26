package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
    static WebDriver driver;
    public static WebDriver setUpDriver(String name){
        if(name == "chrome"){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (name == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if (name == "edge") {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else System.out.println("invalid driver name");

        driver.manage().window().maximize();
        driver.get("https://arielkiell.wixsite.com/interview");
        return driver;
    }
}
