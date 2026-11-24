import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement veeva = driver.findElement(
                By.cssSelector("#identifierId"));

        Thread.sleep(2000);

        driver.navigate().to("https://maya.adityauniversity.in/");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);
    }
}